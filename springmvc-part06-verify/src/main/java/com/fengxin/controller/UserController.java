package com.fengxin.controller;

import com.fengxin.pojo.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author FENGXIN
 * @date 2024/8/4
 * @project ssm-springmvc-part
 * @description
 **/
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 1.给实体类属性添加注解
     * 2.handler @Validated 实体类 对象
     * 3.param json 注解添加后一样有效果(@RequestBody）
     * @param user 校验参数
     * @param bindingResult 自定义错误信息返回前端 紧跟在待校验的参数后面！
     * @return 返回信息
     */
    @PostMapping("register")
    public Object verify(@Validated @RequestBody User user,BindingResult bindingResult){
        if (bindingResult.hasErrors ()) {
            // 如果有错误 自定义错误信息返回给前端
            Map<String , Object> errorMap = new HashMap<> ();
            System.out.println ("信息错误");
            String string = Objects.requireNonNull (bindingResult.getFieldError ()).toString ();
            errorMap.put ("msg:",string);
            return errorMap;
        }
        // 参数正确
        System.out.println ("参数正确");
        return user;
    }
}
