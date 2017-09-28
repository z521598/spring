package com.baidu.langshiquan.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by langshiquan on 17/9/28.
 */
public class LogAspect {

    public void before() {
        System.out.println("???? before update");
    }

    public void afterRuturn() {
        System.out.println("???? afterRuturn update");
    }

    public void after(JoinPoint joinPoint) throws Throwable {
    }

    public Object around(ProceedingJoinPoint joinPoint, Long id) {
        Object object = null;
        System.out.println("before");
        try {
            object = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("id:" + id);
        return object;
    }
}
