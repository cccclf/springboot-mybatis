package com.chen.mapper;

import com.chen.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示了这是一个mybatis的mapper类：dao
//也可以通过在启动类中使用：@MapperScan("com.chen.mapper")注解扫描
@Mapper
@Repository
public interface UserMapper {

    //查询所有用户
    List<User> queryUserList();
    //根据id查询用户
    User queryUserById(int id);
    //增
    int addUser(User user);
    //删
    int deleteUser(int id);
    //改
    int updateUser(User user);

}
