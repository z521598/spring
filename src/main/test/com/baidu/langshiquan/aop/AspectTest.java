package com.baidu.langshiquan.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.ioc.UnitTestBase;

/**
 * Created by langshiquan on 17/9/28.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class AspectTest extends UnitTestBase{

    public AspectTest() {
        super("spring-aop.xml");
    }

    @Test
    public void testAop() {
        UserService userService = super.getBean("userService");
        userService.updateUser(1l);
        System.out.println("???");
    }
}
