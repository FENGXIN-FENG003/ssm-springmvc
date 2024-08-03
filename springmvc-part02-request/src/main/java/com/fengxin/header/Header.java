package com.fengxin.header;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author FENGXIN
 * @date 2024/8/3
 * @project ssm-springmvc-part
 * @description 获取请求头
 **/
@RequestMapping("header")
@ResponseBody
@Controller
public class Header {
    @RequestMapping("data1")
    public String header1(@RequestHeader("Host") String host){
        System.out.println ("host = " + host);
        return "Host = " + host;
    }
    @RequestMapping("data2")
    public String header2(@RequestHeader("Accept-Encoding") String acceptEncoding){
        System.out.println ("acceptEncoding = " + acceptEncoding);
        return "acceptEncoding = " + acceptEncoding;
    }
}
