package com.baidu.langshiquan.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by langshiquan on 17/9/27.
 */
public class LifeCycleBean implements ApplicationContextAware, BeanNameAware {

    private String beanName;

    // 获取上下文
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        //        System.out.println(applicationContext.getBean(beanName));
    }

    // 获取bean的id
    public void setBeanName(String s) {
        this.beanName = s;
    }
}
