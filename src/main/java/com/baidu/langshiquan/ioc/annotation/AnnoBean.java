package com.baidu.langshiquan.ioc.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by langshiquan on 17/9/27.
 */
// 指定作用域
@Scope("prototype")
// 指定bean的id
@Component("anno")
public class AnnoBean {

    @Autowired
    ApplicationContext applicationContext;

    public void hello() {
        System.out.println(this.hashCode() + "hello,component");
        System.out.println(applicationContext.toString());
    }
}
