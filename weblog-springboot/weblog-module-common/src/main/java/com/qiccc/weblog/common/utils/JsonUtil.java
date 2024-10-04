package com.qiccc.weblog.common.utils;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.weaver.ast.Var;

/**
 * @author: qiccc
 * @url: www.qiccc.com
 * @description: JSON 工具类
 **/
@Slf4j
public class JsonUtil {

    private static final ObjectMapper INSTANCE = new ObjectMapper();
    public static String toJsonString(Object obj) {
        try {
            return INSTANCE.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            return obj.toString();
        }
    }

}
