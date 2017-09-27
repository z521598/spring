package com.baidu.langshiquan.ioc;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

/**
 * Created by langshiquan on 17/9/27.
 */
// 完成对Spring配置文件的加载和销毁
public class UnitTestBase {
    private ClassPathXmlApplicationContext context;
    private String springXmlPath;

    public UnitTestBase() {
    }

    public UnitTestBase(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    public String getSpringXmlPath() {
        return springXmlPath;
    }

    public void setSpringXmlPath(String springXmlPath) {
        this.springXmlPath = springXmlPath;
    }

    @SuppressWarnings("unchecked")
    // 初始化容器
    @Before
    public void before() {
        if (StringUtils.isEmpty(springXmlPath)) {
            springXmlPath = "classpath*:spring-*.xml";
        }

        context = new ClassPathXmlApplicationContext(springXmlPath.split("[,\\s]+"));
        context.start();
    }

    // 销毁容器
    @After
    public void after() {
        context.destroy();
    }

    public <T extends Object> T getBean(String beanId) {
        return (T) context.getBean(beanId);
    }

    public <T extends Object> T getBean(Class<T> tClass) {
        return (T) context.getBean(tClass);
    }
}
