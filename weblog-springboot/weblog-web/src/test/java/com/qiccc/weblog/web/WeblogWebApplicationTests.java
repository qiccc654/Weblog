package com.qiccc.weblog.web;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void testLog(){
        log.info("info log");
        log.warn("Warn Log");
        log.error("Error Log");

        String author = "qiccc";
        log.info(" 作者 :{}",author);
    }

}
