package com.baidu.langshiquan.aop.param;

import org.springframework.stereotype.Component;

import com.baidu.langshiquan.annotation.LogExecTime;
import com.baidu.langshiquan.aop.Order;

/**
 * Created by langshiquan on 17/9/28.
 */
@Component
public class OrderService3 {
    public boolean updateOrder(Long id) {
        return false;
    }

    public boolean deleteOrder(Long id) {
//        throw new RuntimeException();
        return false;
    }
    @LogExecTime("你好")
    public boolean addOrder(Order order) {
        return false;
    }
}
