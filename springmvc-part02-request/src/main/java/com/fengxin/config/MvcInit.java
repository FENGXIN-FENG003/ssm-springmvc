package com.fengxin.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author FENGXIN
 * @date 2024/8/3
 * @project ssm-springmvc-part
 * @description
 **/
public class MvcInit extends AbstractAnnotationConfigDispatcherServletInitializer {
    
    @Override
    protected Class<?>[] getRootConfigClasses () {
        return new Class[0];
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses () {
        return new Class[]{MvcConfig.class};
    }
    
    @Override
    protected String[] getServletMappings () {
        return new String[]{"/"};
    }
}
