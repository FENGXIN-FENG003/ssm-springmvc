package com.fengxin.config;

import com.fengxin.interceptor.OrderInterceptor;
import com.fengxin.interceptor.UserInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author FENGXIN
 * @date 2024/8/4
 * @project ssm-springmvc-part
 * @description
 **/

@Configuration
@ComponentScan({"com.fengxin.controller"})
// 创建组件handlerAdapter handlerMapping 并给经理Adapter添加json转换器
@EnableWebMvc
// 实现接口WebMvcConfigurer 配置mvc组件 提供各种方法 重写即可使用 不用使用@Bean注解添加组件
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors (InterceptorRegistry registry) {
        // 拦截器执行顺序 先进后出
        // 拦截全部请求
        registry.addInterceptor (new UserInterceptor ());
        // 指定拦截
        registry.addInterceptor (new OrderInterceptor ()).addPathPatterns ("/order/**");
        
    }
}