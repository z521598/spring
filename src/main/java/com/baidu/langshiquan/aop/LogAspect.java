package com.baidu.langshiquan.aop;

import org.aspectj.lang.JoinPoint;

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
}
