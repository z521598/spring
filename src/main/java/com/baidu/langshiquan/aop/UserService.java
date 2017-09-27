package com.baidu.langshiquan.aop;

import org.springframework.stereotype.Component;

import com.baidu.langshiquan.ioc.User;

/**
 * Created by langshiquan on 17/9/28.
 */
@Component
public class UserService {
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
