package com.sunyi.cloud.service;

import com.sunyi.cloud.mapper.UserMapper;
import com.sunyi.cloud.pojo.entity.User;
import com.sunyi.cloud.util.ResponseUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.UUID;

@Service
@Transactional
@Slf4j
public class UserService {

    @Resource
    UserMapper userMapper;

    public Object addUser(User user) {
        user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        log.info(user.toString());
        user.setIsDelete((byte) 0);
        int flag = userMapper.insert(user);
        if (flag == 0)
            return ResponseUtil.fail(505, "插入数据失败！");
        return ResponseUtil.ok("插入用户成功！");
    }
}
