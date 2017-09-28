package com.baidu.langshiquan.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.baidu.langshiquan.aop.aspectj.OrderService2;
import com.baidu.langshiquan.aop.aspectj.UserService2;
import com.baidu.langshiquan.aop.param.OrderService3;
import com.baidu.langshiquan.ioc.UnitTestBase;

/**
 * Created by langshiquan on 17/9/28.
 */
@RunWith(MockitoJUnitRunner.class)
public class ParamAnnoTest extends UnitTestBase {

    public ParamAnnoTest() {
        super("spring-aspectj-param.xml");
    }

    @Test
    public void testLogExec() {
        OrderService3 orderService3 = super.getBean("orderService3");
        orderService3.addOrder(new Order());
        System.out.println("???");
    }
}
