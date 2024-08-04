package com.fengxin.error;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author FENGXIN
 * @date 2024/8/4
 * @project ssm-springmvc-part
 * @description 声明式 全局处理异常类
 **/
//@ControllerAdvice 返回视图 转发 重定向
@RestControllerAdvice // 全局异常会到这个类进行处理
public class GlobalExceptionHandler {
    /**
     * 该类也需要被扫描<br>
     * 发生异常 -> RestControllerAdvice注解指定异常 -> handler方法<br>
     * 精准处理异常<br>
     */
    @ExceptionHandler(ArithmeticException.class)
    public String arithmeticExceptionHandler(ArithmeticException e){
        return e.getMessage ();
    }
    
    /**
     * 找不到精准异常 -> 寻找父异常
     */
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(Exception e){
        return e.getMessage ();
    }
    
}
