package com.baidu.langshiquan.module.home.service;

import com.baidu.langshiquan.module.home.bean.HomeBean;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/14.
 */
@Service
public class HomeServiceImpl implements HomeService {
    public HomeBean getHomeBean(String name) {
        HomeBean homeBean = new HomeBean(name);

        return homeBean;
    }
}
