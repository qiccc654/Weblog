package com.qiccc.weblog.web.controller;


import com.qiccc.weblog.common.aspect.ApiOperationLog;
import com.qiccc.weblog.web.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
@Slf4j
public class TestController {
    @PostMapping("/test")
    @ApiOperationLog(description = "测试接口")
    public ResponseEntity<String> test(@RequestBody @Validated User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            String errorMsg = bindingResult.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .collect(Collectors.joining(", "));

            return ResponseEntity.badRequest().body(errorMsg);
        }
        return ResponseEntity.ok("参数没有任何问题");
    }
}
