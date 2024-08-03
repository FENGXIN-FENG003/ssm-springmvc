package com.fengxin.pathdyn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author FENGXIN
 * @date 2024/8/3
 * @project ssm-springmvc-part
 * @description 路径传参
 **/
@Controller
@RequestMapping("path")
@ResponseBody
public class PathDyn {
    
    /**
     * 动态路径传参<br>
     * 动态路径设置 @RequestMapping("{account}/{password}")<br>
     * 形参添加注解@PathVariable<br>
     */
    @RequestMapping("{account}/{password}")
    public String path(@PathVariable(value = "account") String account,@PathVariable(value = "password") String password){
        System.out.println ("account = " + account + ", password = " + password);
        return "account = " + account + ", password = " + password;
    }
}
