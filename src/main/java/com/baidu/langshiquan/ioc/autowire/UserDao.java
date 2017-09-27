package com.baidu.langshiquan.ioc.autowire;

import com.baidu.langshiquan.ioc.User;

/**
 * Created by langshiquan on 17/9/27.
 */
public class UserDao {

    public void save(User user) {
        System.out.println(user.toString() + "has saved");
    }
}
