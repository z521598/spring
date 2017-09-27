package com.baidu.langshiquan.ioc.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.baidu.langshiquan.ioc.User;

/**
 * Created by langshiquan on 17/9/27.
 */
@Configuration
@PropertySource("application-pro.properties")
public class PropertisBeanConfig {
    @Value("${test.id}")
    private Long id;

    @Value("${test.name}")
    private String name;

    @Bean
    public User propUser() {
        User user = new User();
        user.setName(name);
        user.setId(id);
        return user;
    }
}
