package com.fengxin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author FENGXIN
 * @date 2024/8/4
 * @project ssm-springmvc-part
 * @description
 **/
@Configuration
@ComponentScan("com.fengxin.json")
// 创建组件handlerAdapter handlerMapping 并给经理Adapter添加json转换器
@EnableWebMvc
// 实现接口WebMvcConfigurer 配置mvc组件 提供各种方法 重写即可使用 不用使用@Bean注解添加组件
public class MvcConfig implements WebMvcConfigurer {

}
