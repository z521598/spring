package com.baidu.langshiquan.aop.aspectj;

import org.springframework.stereotype.Component;

import com.baidu.langshiquan.aop.Order;

/**
 * Created by langshiquan on 17/9/28.
 */
@Component
public class OrderService2 {
    public boolean updateOrder(Long id) {
        return false;
    }

    public boolean deleteOrder(Long id) {
//        throw new RuntimeException();
        return false;
    }

    public boolean addOrder(Order order) {
        return false;
    }
}
