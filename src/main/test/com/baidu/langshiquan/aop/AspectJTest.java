package com.baidu.langshiquan.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.baidu.langshiquan.aop.aspectj.OrderService2;
import com.baidu.langshiquan.aop.aspectj.UserService2;
import com.baidu.langshiquan.ioc.UnitTestBase;

/**
 * Created by langshiquan on 17/9/28.
 */
@RunWith(MockitoJUnitRunner.class)
public class AspectJTest extends UnitTestBase{


    public AspectJTest() {
        super("spring-aspectj.xml");
    }

    @Test
    public void testAop() {
        UserService2 userService2 = super.getBean("userService2");
        userService2.updateUser(1l);
        System.out.println("???");
    }

    @Test
    public void testAspectJParam() {
        OrderService2 orderService2 = super.getBean("orderService2");
        orderService2.deleteOrder(1l);
        System.out.println("???");
    }
}
