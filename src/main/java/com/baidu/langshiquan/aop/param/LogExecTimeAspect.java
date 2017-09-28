package com.baidu.langshiquan.aop.param;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.baidu.langshiquan.annotation.LogExecTime;

/**
 * Created by langshiquan on 17/9/28.
 */
@Aspect
@Component
@EnableAspectJAutoProxy
public class LogExecTimeAspect {

    @Pointcut("@annotation(logExecTime)")
    public void logExecanno(LogExecTime logExecTime) {
    }

    @Around("logExecanno(logExecTime)")
    public Object logExecAround(ProceedingJoinPoint joinPoint, LogExecTime logExecTime) throws Throwable {
        System.out.println(logExecTime.value());
        // 获取方法名字
        Signature sig = joinPoint.getSignature();
        MethodSignature msig = null;
        if (!(sig instanceof MethodSignature)) {
            throw new IllegalArgumentException("该注解只能用于方法");
        }
        msig = (MethodSignature) sig;
        Object target = joinPoint.getTarget();
        Method currentMethod = target.getClass().getMethod(msig.getName(), msig.getParameterTypes());

        Long startTime = System.currentTimeMillis(); // 记录开始时间
        // 执行
        Object object = joinPoint.proceed();
        // 记录结束时间
        Long endTime = System.currentTimeMillis();
        // 打印日志
        System.out.println(
                target.getClass() + currentMethod.getName() + " method exec time : " + (endTime - startTime));
        return object;
    }
}
