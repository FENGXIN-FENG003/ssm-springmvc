package com.fengxin.json;

import com.fengxin.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author FENGXIN
 * @date 2024/8/3
 * @project ssm-springmvc-part
 * @description json参数传递
 **/
@Controller
@ResponseBody
@RequestMapping("json")
public class JsonBody {
    /**
     * 使用json传递请求体时：<br>
     * 1.pom.xml 加入jackson-databind依赖<br>
     * 2.handlerAdapter配置json转化器,配置类需要明确@EnableWebMvc<br>
     * 3.参数添加@RequestBody 将 JSON 数据转换为 Java 对象 需要定义一个用于接收 JSON 数据的 Java 类<br>
     * 4.使用PostMapping请求
     */
    @ResponseBody
    @RequestMapping("person")
    public String json(@RequestBody Person person){
        System.out.println ("person = " + person);
        return person.toString ();
    }
}
