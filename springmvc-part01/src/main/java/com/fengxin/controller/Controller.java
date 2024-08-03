package com.fengxin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author FENGXIN
 * @date 2024/8/3
 * @project ssm-springmvc-part
 **/
@org.springframework.stereotype.Controller
public class Controller {
    // handler
    /**
     * handler就是controller内部的具体方法
     * @RequestMapping("/springmvc/hello") 就是用来向handlerMapping中注册的方法注解!
     * @ResponseBody 代表向浏览器直接返回数据!
     */
    @RequestMapping("springmvc/hello")
    @ResponseBody
    public String hello(){
        System.out.println ("Hello Controller!");
        return "Hello SpringMvc!";
    }
}
