package com.baidu.langshiquan.module.home.web;

import com.alibaba.fastjson.JSON;
import com.baidu.langshiquan.common.PropertisUtil;
import com.baidu.langshiquan.ioc.User;
import com.baidu.langshiquan.module.home.bean.HomeBean;
import com.baidu.langshiquan.module.home.service.HomeService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

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
    public String homeinfo(HttpServletRequest request) {
        ServletContext servletContext = request.getSession().getServletContext();
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext );
        User user = (User) ctx.getBean("oneUser");
        HomeBean homeBean = homeService.getHomeBean("12345");
        return JSON.toJSONString(user);
    }
}
