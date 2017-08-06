package com.baidu.langshiquan.module.home.web;

import com.baidu.langshiquan.common.PropertisUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Properties;

/**
 * Created by Administrator on 2017/8/4.
 */
@Controller
public class HomeController {
//
//    @Value("#{configProperties[test.demo]}")
//    private String test;

//    @Resource(name = "config")
//    private Properties properties;

    @RequestMapping("")
    @ResponseBody
    public String home() {
//        System.out.println(PropertisUtil.getProperty("test.demo"));

//        return (String) properties.get("test.demo")+":"+test;
        return "0";
    }
}
