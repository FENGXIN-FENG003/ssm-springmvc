package com.fengxin.api;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author FENGXIN
 * @date 2024/8/4
 * @project ssm-springmvc-part
 * @description 原生api对象获取
 **/
@RequestMapping("api")
@ResponseBody
public class Api {
    /**
     * 获取请求或者响应对象,或者会话等,可以直接在形参列表传入,并且不分先后顺序!
     */
    @RequestMapping("api")
    public String api(HttpServletRequest request){
        String method = request.getMethod ();
        System.out.println ("header = " + method);
        return "api";
    }
}
