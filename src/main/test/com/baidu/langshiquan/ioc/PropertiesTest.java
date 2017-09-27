package com.baidu.langshiquan.ioc;

import org.junit.Test;

import com.baidu.langshiquan.ioc.UnitTestBase;
import com.baidu.langshiquan.ioc.User;

/**
 * Created by langshiquan on 17/9/27.
 */
public class PropertiesTest extends UnitTestBase {

    public PropertiesTest() {
        super("spring-properties.xml");
    }

    @Test
    public void testXmlProperties() {
        User user = super.getBean("propertiesUser");
        System.out.println(user);
    }

    @Test
    public void testAnnoProperties() {
        User user = super.getBean("propUser");
        System.out.println(user);

    }
}
