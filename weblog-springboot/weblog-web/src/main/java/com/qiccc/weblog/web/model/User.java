package com.qiccc.weblog.web.model;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class User {
    @NotBlank(message = "用户名不能为空")
    private String username;
    @NotNull(message = "性别不能为空")
    private Integer sex;
    @NotNull(message = "年龄不能为空")
    @Min(value = 18,message = "年龄必须大于18")
    @Max(value = 100,message = "年龄必须小于100")
    private Integer age;
    @NotBlank(message = "邮箱不能为空")
    @Email(message = "邮箱格式不正确")
    private String email;

}
