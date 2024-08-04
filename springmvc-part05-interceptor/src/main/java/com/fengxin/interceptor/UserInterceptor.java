package com.fengxin.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author FENGXIN
 * @date 2024/8/4
 * @project ssm-springmvc-part
 * @description
 **/
public class UserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle (HttpServletRequest request , HttpServletResponse response , Object handler) throws Exception {
        System.out.println ("request = " + request + ", response = " + response + ", handler = " + handler);
        System.out.println ("UserInterceptor.preHandle");
        return true;
    }
    
    @Override
    public void postHandle (HttpServletRequest request , HttpServletResponse response , Object handler , ModelAndView modelAndView) throws Exception {
        System.out.println ("request = " + request + ", response = " + response + ", handler = " + handler + ", modelAndView = " + modelAndView);
        System.out.println ("UserInterceptor.postHandle");
    }
    
    @Override
    public void afterCompletion (HttpServletRequest request , HttpServletResponse response , Object handler , Exception ex) throws Exception {
        System.out.println ("handler = " + handler + ", ex = " + ex);
        System.out.println ("UserInterceptor.afterCompletion");
    }
}
