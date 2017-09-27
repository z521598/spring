package com.baidu.langshiquan.ioc;

import org.junit.Test;

import com.baidu.langshiquan.ioc.LifeCycleBean;
import com.baidu.langshiquan.ioc.UnitTestBase;

/**
 * Created by langshiquan on 17/9/27.
 */
public class LifeCycleTest extends UnitTestBase {
    @Test
    public void testLifeCycle() {
        super.getBean("simpleBean");
    }

    @Test
    public void testAware(){
        LifeCycleBean lifeCycleBean = super.getBean("lifeCycleBean");
        System.out.println(lifeCycleBean);
    }
}
