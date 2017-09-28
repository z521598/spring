package com.baidu.langshiquan.aop.aspectj;

import org.springframework.stereotype.Component;

import com.baidu.langshiquan.ioc.User;

/**
 * Created by langshiquan on 17/9/28.
 */
@Component
public class UserService2 {
    public  boolean updateUser(Long id) {
        return false;
    }

    public boolean deleteUser(Long id) {
        return false;
    }

    public boolean addUser(User user) {
        return false;
    }

}
