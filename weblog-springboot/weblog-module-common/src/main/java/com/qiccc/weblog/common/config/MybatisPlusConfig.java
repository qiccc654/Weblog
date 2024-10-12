package com.qiccc.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: qiccc
 * @url: www.qiccc.com
 * @description: Mybatis Plus 配置文件
 **/
@Configuration
@MapperScan("com.qiccc.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}
