package com.fengxin.attr;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author FENGXIN
 * @date 2024/8/4
 * @project ssm-springmvc-part
 * @description 共享域对象操作
 **/
@Controller
@RequestMapping("attr")
@ResponseBody
public class Attr {
    /**
     * ServletContext加入到了ioc 用全局变量 注入
     */
    @Autowired
    ServletContext servletContext;
    /**
     * Request级别属性共享域
     * 原生
     */
    @RequestMapping("request01")
    public String r1(HttpServletRequest request){
        request.setAttribute ("key","value");
        return "r1";
    }
    
    /**
     * 在形参位置声明Model类型变量，用于存储模型数据
     * 我们将数据存入模型，SpringMVC 会帮我们把模型数据存入请求域
     * 存入请求域这个动作也被称为暴露到请求域
     */
    @RequestMapping("request02")
    public String r2(Model model){
        model.addAttribute ("key","value");
        return "r2";
    }
    @RequestMapping("request03")
    public String r3(ModelMap modelMap){
        modelMap.addAttribute ("key","value");
        return "r3";
    }
    @RequestMapping("request04")
    public String r4(Map<String, Object> map){
        map.put ("key","value");
        return "r4";
    }
    /**
     * Session级别属性共享域
     */
    @RequestMapping("session")
    public String s(HttpSession session){
        session.setAttribute ("key","value");
        return "session";
    }
    /**
     * Application级别属性共享域
     */
    @RequestMapping("servletcontext")
    public String a(ServletContext context){
        context.setAttribute ("key","value");
        return "servletcontext";
    }
}
