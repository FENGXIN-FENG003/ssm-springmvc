package com.fengxin.cookie;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author FENGXIN
 * @date 2024/8/3
 * @project ssm-springmvc-part
 * @description
 **/
@ResponseBody
@RequestMapping("cookie")
@Controller
public class Cookie {
    /**
     * 获取cookie
     */
    @RequestMapping("data")
    @ResponseBody
    public String getCookie(@CookieValue(value = "cookieName") String cookie){
        System.out.println ("cookie = " + cookie);
        return cookie;
    }
    
    /**
     * 保存cookie
     */
    @GetMapping("save")
    @ResponseBody
    public String save(HttpServletResponse response){
        jakarta.servlet.http.Cookie cookie = new jakarta.servlet.http.Cookie ("cookieName","root");
        response.addCookie (cookie);
        return "ok";
    }
}
