package com.qiccc.weblog.web;

import com.qiccc.weblog.common.domain.dos.UserDO;
import com.qiccc.weblog.common.domain.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
@Slf4j
class WeblogWebApplicationTests {
@Autowired
private UserMapper userMapper;
@Test
void insertTest(){
    UserDO userDO = UserDO.builder()
            .username("qvcc")
            .password("11411")
            .createTime(new Date())
            .updateTime(new Date())
            .isDeleted(false)
            .build();

    userMapper.insert(userDO);
    //userMapper.deleteById(3);
}
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
