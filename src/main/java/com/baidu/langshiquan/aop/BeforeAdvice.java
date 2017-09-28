package com.baidu.langshiquan.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * Created by langshiquan on 17/9/28.
 */
public class BeforeAdvice implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("before " + method.getName() + " " + o.getClass().getName());
    }
}
