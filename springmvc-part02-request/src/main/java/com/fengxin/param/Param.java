package com.fengxin.param;

import com.fengxin.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author FENGXIN
 * @date 2024/8/3
 * @project ssm-springmvc-part
 * @description param参数传递 加上@RequestParam注解 不论请求参数是否==形参名
 **/
@Controller
@RequestMapping("param")
public class Param {
    /**
     * 默认传入的值不能为空 name / value 为请求的参数 可以和形参一样 不一样时形参名失效
     */
    @RequestMapping("data01")
    @ResponseBody
    public String param01(@RequestParam(value = "name") String name,@RequestParam(value = "age") int age){
        System.out.println ("name = " + name + ", age = " + age);
        return "name = " + name + ", age = " + age;
    }
    /**
     * @RequestParam 使用场景：<br>
     *  指定绑定的请求参数名<br>
     *  要求请求参数必须传递 如果不必须传值 建议设置默认值<br>
     *  为请求参数提供默认值<br>
     */
    @RequestMapping("data02")
    @ResponseBody
    public String param02(@RequestParam(value = "account") String username,@RequestParam(value = "age", required = false,defaultValue = "18") int age){
        System.out.println ("username = " + username + ", age = " + age);
        return "username = " + username + ", age = " + age;
    }
    /**
     * 一个key对应多个值，使用集合进行接收
     * /param/data03?key=uu&key=oo
     */
    @GetMapping("data03")
    @ResponseBody
    public String param03(@RequestParam(value = "key") List<String> key){
        System.out.println ("key = " + key);
        return "ok";
    }
    /**
     * 实体接收<br>
     * 创建好需要的实体类 key == 实体类属性名<br>
     */
    @RequestMapping("data04")
    @ResponseBody
    public String param04(User user){
        System.out.println ("user = " + user);
        return "ok";
    }
}
