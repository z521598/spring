package com.baidu.langshiquan.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.ioc.UnitTestBase;
import com.baidu.langshiquan.ioc.annotation.AnnoBean;

/**
 * Created by langshiquan on 17/9/27.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AnnoScanTest extends UnitTestBase{

    public AnnoScanTest() {
        super("spring-anno.xml");
    }

    @Test
    public void testAnnoScopeAndBeanName() {
        AnnoBean annoBean = super.getBean("anno");
        annoBean.hello();
        AnnoBean annoBean2 = super.getBean("anno");
        annoBean2.hello();


    }
}
