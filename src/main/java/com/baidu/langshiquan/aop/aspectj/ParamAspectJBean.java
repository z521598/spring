package com.baidu.langshiquan.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by langshiquan on 17/9/28.
 */
@Aspect
@Component
@EnableAspectJAutoProxy
public class ParamAspectJBean {

    @Pointcut(value = "execution(* com.baidu.langshiquan.aop.aspectj.OrderService2.*(..))")
    public void paramPointcut() {

    }

    @AfterThrowing(pointcut = "paramPointcut()", throwing = "e")
    public void afterThrowing(RuntimeException e) {
        System.out.println("error:");
        e.printStackTrace();
    }

    @Around("paramPointcut()")
    public Object ParamAround(ProceedingJoinPoint point) throws Throwable {
        System.out.println("begin around");
        Object object = point.proceed();
        Object[] objects = point.getArgs();
        for (Object obj : objects) {
            System.out.println(obj.toString());
        }
        System.out.println(object);
        System.out.println("end around");
        return object;
    }
}
