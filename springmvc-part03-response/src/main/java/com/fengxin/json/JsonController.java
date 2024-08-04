package com.fengxin.json;

import com.fengxin.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FENGXIN
 * @date 2024/8/4
 * @project ssm-springmvc-part
 * @description json数据响应
 **/
// @RestController = @Controller + @ResponseBody
// @ResponseBody 直接返回json数据 不去找返回视图解析器
@RestController
@RequestMapping("json")
public class JsonController {
    /**
     * 1.pom.xml 加入jackson-databind依赖<br>
     * 2.handlerAdapter配置json转化器,配置类需要明确@EnableWebMvc<br>
     * 3.@ResponseBody 直接返回json数据 不去找返回视图解析器<br>
     * 4.响应 前端不请求时任意请求方式都可以<br>
     */
    @GetMapping("data1")
    public User json1(){
        User user = new User ();
        user.setName ("枫");
        user.setAge (18);
        user.setGender ("男");
        // user -> handlerAdapter -> json
        return user;
    }
}
