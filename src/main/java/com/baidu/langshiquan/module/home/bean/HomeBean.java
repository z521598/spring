package com.baidu.langshiquan.module.home.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/12.
 */
public class HomeBean{
    private String name;
    private Date time = new Date();

    public HomeBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
    public String getO() {
        return "0";
    }
}
