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
@RequestMapping("order")
public class OrderController {
    @GetMapping("data")
    public String order1(){
        return "order";
    }
}
