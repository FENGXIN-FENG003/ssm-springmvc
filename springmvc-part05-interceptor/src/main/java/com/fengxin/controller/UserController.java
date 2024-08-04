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
    @GetMapping("data")
    public String user(){
        return "user";
    }
}
