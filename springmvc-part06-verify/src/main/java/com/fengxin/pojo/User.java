package com.fengxin.pojo;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.util.Date;

/**
 * @author FENGXIN
 * @date 2024/8/4
 * @project ssm-springmvc-part
 * @description 设置校验注解
 **/
@Data
public class User {
    @Size(min = 3,max = 6)
    private String name;
    @Min (10)
    private Integer age;
    @Size(min = 6)
    private String password;
    @Email
    private String email;
    @Past
    private Date birthday;
}
