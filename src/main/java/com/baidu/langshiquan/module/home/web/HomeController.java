package com.baidu.langshiquan.module.home.web;

import com.alibaba.fastjson.JSON;
import com.baidu.langshiquan.common.PropertisUtil;
import com.baidu.langshiquan.module.home.bean.HomeBean;
import com.baidu.langshiquan.module.home.service.HomeService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
//    @Value("#{configProperties[test.demo]}")
//    private String test;

//    @Resource(name = "config")
//    private Properties properties;

    @Autowired
    private HomeService homeService;

    @RequestMapping("/info")
    @ResponseBody
    public String home() {
//        System.out.println(PropertisUtil.getProperty("test.demo"));

//        return (String) properties.get("test.demo")+":"+test;
        return "0";
    }

    @RequestMapping("")
    @ResponseBody
    public String homeinfo() {
        HomeBean homeBean = homeService.getHomeBean("12345");
        return JSON.toJSONString(homeBean);
    }
}
