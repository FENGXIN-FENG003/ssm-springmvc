package com.fengxin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @author FENGXIN
 * @date 2024/8/3
 * @project ssm-springmvc-part
 * @description 使用@Bean方式配置handlerMapper和handlerAdapter
 **/
@Configuration
@ComponentScan(basePackages = {"com.fengxin.controller"})
public class MvcConfig {
    @Bean
    public HandlerMapping handlerMapping(){
        return new RequestMappingHandlerMapping ();
    }
    @Bean
    public HandlerAdapter handlerAdapter(){
        return new RequestMappingHandlerAdapter ();
    }
}
