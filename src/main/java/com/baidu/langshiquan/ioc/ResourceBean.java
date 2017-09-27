package com.baidu.langshiquan.ioc;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

/**
 * Created by langshiquan on 17/9/27.
 */
public class ResourceBean implements ApplicationContextAware{
    private ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void resource() throws IOException {
        Resource resource = applicationContext.getResource("classpath:application.properties");
        System.out.println(resource.getFilename());
        System.out.println(resource.contentLength());
    }
}
