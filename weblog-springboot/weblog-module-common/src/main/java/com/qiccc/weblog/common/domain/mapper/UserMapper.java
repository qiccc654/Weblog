package com.qiccc.weblog.common.domain.mapper;



import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qiccc.weblog.common.domain.dos.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


/**
 * @author: qiccc
 * @url: www.qiccc.com
 * @description: TODO
 **/
public interface UserMapper extends BaseMapper<UserDO> {
    default UserDO findByUsername(String username) {
        LambdaQueryWrapper<UserDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(UserDO::getUsername, username);
        return selectOne(wrapper);
    }
}
