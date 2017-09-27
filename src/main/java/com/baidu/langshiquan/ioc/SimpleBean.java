package com.baidu.langshiquan.ioc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by langshiquan on 17/9/27.
 */
public class SimpleBean implements InitializingBean, DisposableBean {

    // xml形式
    public void init() {
        System.out.println("初始化");
    }

    // 实现接口方式
    public void afterPropertiesSet() throws Exception {
        System.out.println("初始化impl");
    }

    public void destroy() throws Exception {
        System.out.println("销毁");
    }

}
