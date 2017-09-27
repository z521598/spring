package com.baidu.langshiquan.ioc.autowire;

import com.baidu.langshiquan.ioc.User;

/**
 * Created by langshiquan on 17/9/27.
 */
public class UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user) {
        userDao.save(user);
    }

}
