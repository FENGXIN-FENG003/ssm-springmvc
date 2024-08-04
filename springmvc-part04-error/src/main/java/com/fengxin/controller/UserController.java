package com.fengxin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FENGXIN
 * @date 2024/8/4
 * @project ssm-springmvc-part
 * @description
 **/
@RestController
@RequestMapping("user")
public class UserController {
    @GetMapping("user1")
    public String data1(){
        String name = null;
        name.length ();
        return "ok";
    }
    @GetMapping("user2")
    public String data2(){
        int i = 1 / 0;
        return "ok";
    }
}
