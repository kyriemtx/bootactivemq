package com.kyrie.recive.service;

import com.kyrie.recive.entity.User;
import com.kyrie.recive.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserSerive
 * @Description
 * @Author tengxiao.ma
 * @Date 2019/10/21 16:13
 **/
@Service
@Slf4j
public class UserSerive {

    @Autowired
    private UserMapper userMapper;

    public User insertUser(User user){
         int result = userMapper.insert(user);
         System.out.println("用户名："+user.getName()+"年龄："+user.getAge());
         return user;
    }



}
