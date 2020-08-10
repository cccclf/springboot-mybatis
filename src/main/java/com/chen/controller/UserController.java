package com.chen.controller;

import com.chen.mapper.UserMapper;
import com.chen.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserMapper userMapper;

    //查询所有用户
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> userList = userMapper.queryUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }

    //根据id查询用户信息
    @GetMapping("/queryUserById")
    public User queryUserById(){
        User user = userMapper.queryUserById(8);
        return user;
    }
    //增加一个用户
    @GetMapping("/addUser")
    public String addUser(){
        userMapper.addUser(new User(8,"赵粤","zzzzzz"));
        return "add success";
    }

    //修改一个用户
    @GetMapping("updateUser")
    public String updateUser(){
        userMapper.updateUser(new User(8,"赵粤","520"));
        return "update success";
    }

    //删除一个用户
    @GetMapping("deleteUser")
    public String deleteUser(){
        userMapper.deleteUser(8);
        return "delete success";
    }
}
