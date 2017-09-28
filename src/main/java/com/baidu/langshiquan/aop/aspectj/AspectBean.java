package com.baidu.langshiquan.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/14.
 */
@Aspect
@Component
@EnableAspectJAutoProxy
public class AspectBean {

    // 切入点
    @Pointcut("execution(* com.baidu.langshiquan.aop.aspectj..update*(..))")
    public void pointcout() {

    }

    @Before("pointcout()")
    public void before() {
        System.out.println(System.currentTimeMillis());
    }

    @After("pointcout()")
    public void after() {
        System.out.println(System.currentTimeMillis());
    }

    //方法执行的前后调用
    @Around("pointcout()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("begin around");
        Object object = point.proceed();
        System.out.println("end around");
        return object;
    }

}
