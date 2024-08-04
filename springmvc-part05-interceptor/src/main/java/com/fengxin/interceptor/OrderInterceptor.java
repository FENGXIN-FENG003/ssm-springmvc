package com.fengxin.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author FENGXIN
 * @date 2024/8/4
 * @project ssm-springmvc-part
 * @description order拦截器
 **/
// 实现HandlerInterceptor接口
public class OrderInterceptor implements HandlerInterceptor {
    /**
     * handler方法之前拦截 编码格式设置 登录保护 权限处理
     * @param request current HTTP request 请求
     * @param response current HTTP response 响应
     * @param handler chosen handler to execute, for type and/or instance evaluation handler方法
     * @return true 放行 false 拦截
     * @throws Exception 异常对象
     */
    @Override
    public boolean preHandle (HttpServletRequest request , HttpServletResponse response , Object handler) throws Exception {
        System.out.println ("request = " + request + ", response = " + response + ", handler = " + handler);
        System.out.println ("OrderInterceptor.preHandle");
        return true;
    }
    
    /**
     * handler方法结束拦截<br>
     * 结果处理 敏感词汇屏蔽<br>
     */
    @Override
    public void postHandle (HttpServletRequest request , HttpServletResponse response , Object handler , ModelAndView modelAndView) throws Exception {
        System.out.println ("request = " + request + ", response = " + response + ", handler = " + handler + ", modelAndView = " + modelAndView);
        System.out.println ("OrderInterceptor.postHandle");
    }
    
    /**
     * 渲染视图之后执行
     */
    @Override
    public void afterCompletion (HttpServletRequest request , HttpServletResponse response , Object handler , Exception ex) throws Exception {
        System.out.println ("handler = " + handler + ", ex = " + ex);
        System.out.println ("OrderInterceptor.afterCompletion");
    }
}
