package com.fengxin.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author FENGXIN
 * @date 2024/8/3
 * @project ssm-springmvc-part
 * 路径 请求方式
 **/
@org.springframework.stereotype.Controller
//类级
@RequestMapping(value = "user",method = RequestMethod.POST)
public class Controller {
    /**
     * 方法级<br>
     * 精准匹配<br>
     * 精准设置访问地址 /user/login user/login<br>
     * 模糊匹配<br>
     *  路径设置为 /user/*<br>
     *  如果想准确匹配两层，那么就写 '/* /*' 以此类推<br>
     *    /* 为单层任意字符串  /user/a  /user/aaa 可以访问此handler<br>
     *  路径设置为 /product/**<br>
     *   /** 为任意层任意字符串  /user/a  /user/aaa 可以访问此handler<br>
     *   /user/a/a 也可以访问<br>
     */
    @RequestMapping("login")
    public String login(){
        return null;
    }
    /**
     * 方法级<br>
     * 设置请求方式<br>
     * method = RequestMethod.POST 可以指定单个或者多个请求方式!<br>
     * 注意:违背请求方式会出现405异常!<br>
     * 还有可以简化的注解（进阶）只能加在方法上！<br>
     * -@GetMapping<br>
     * -@PostMapping<br>
     * -@PutMapping<br>
     * -@DeleteMapping<br>
     * -@PatchMapping<br>
     */
    @RequestMapping(value = "register",method = {RequestMethod.GET,RequestMethod.DELETE})
    @PostMapping
    public String register(){
        return null;
    }
}
