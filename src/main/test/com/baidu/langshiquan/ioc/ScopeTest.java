package com.baidu.langshiquan.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import com.baidu.langshiquan.ioc.UnitTestBase;
import com.baidu.langshiquan.ioc.User;

/**
 * Created by langshiquan on 17/9/27.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ScopeTest extends UnitTestBase{

    @Test
    public void testSingle(){
        User user = super.getBean("singleUser");
        System.out.println(user.hashCode());
        User user2 = super.getBean("singleUser");
        System.out.println(user2.hashCode());
    }

    @Test
    public void testPrototype(){
        User user = super.getBean("prototypeUser");
        System.out.println(user.hashCode());
        User user2 = super.getBean("prototypeUser");
        System.out.println(user2.hashCode());
    }

}
