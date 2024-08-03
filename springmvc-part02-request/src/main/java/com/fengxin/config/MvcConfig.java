package com.fengxin.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author FENGXIN
 * @date 2024/8/3
 * @project ssm-springmvc-part
 * @description
 **/
@Configuration
// @EnableWebMvc 给经理Adapter添加json转换器
// 创建 RequestMappingHandlerMapping RequestMappingHandlerAdapter
@EnableWebMvc
@ComponentScan(basePackages = {"com.fengxin.param","com.fengxin.pathdyn","com.fengxin.json","com.fengxin.cookie","com.fengxin.header"})
public class MvcConfig {
}
