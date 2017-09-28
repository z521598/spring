package com.baidu.langshiquan.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/14.
 */
@Aspect
@Component
@EnableAspectJAutoProxy
public class HttpAspect {

    // 切入点
    @Pointcut("execution(* com.baidu.langshiquan.module.home.service.HomeService.getHomeBean(..))")
    public void http() {

    }

    @Before("http()")
    public void before() {
        System.out.println(System.currentTimeMillis());
    }

    @After("http()")
    public void after() {
        System.out.println(System.currentTimeMillis());
    }

    //方法执行的前后调用
    @Around("http()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("begin around");
        Object object = point.proceed();
        System.out.println("end around");
        return object;
    }
}
