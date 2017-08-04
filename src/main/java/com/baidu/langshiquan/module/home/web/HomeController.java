package com.baidu.langshiquan.module.home.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/8/4.
 */
@Controller
public class HomeController {

    @RequestMapping("")
    @ResponseBody
    public String home() {
        return "Hello";
    }
}
