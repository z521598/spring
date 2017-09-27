package com.baidu.langshiquan.ioc;

import java.io.IOException;

import org.junit.Test;

import com.baidu.langshiquan.ioc.ResourceBean;
import com.baidu.langshiquan.ioc.UnitTestBase;

/**
 * Created by langshiquan on 17/9/27.
 */
public class ResourceBeanTest extends UnitTestBase {

    @Test
    public void testResource() throws IOException {
        ResourceBean resourceBean =super.getBean("resourceBean");
        resourceBean.resource();
    }
}
