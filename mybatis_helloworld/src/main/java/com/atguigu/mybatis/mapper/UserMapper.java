package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {

    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户信息
     * @return 受影响的行数
     */
    int updateUser();

    /**
     * 删除用户信息
     * @return 受影响的行数
     */
    int deleteUser();

    /**
     * 根据id查询用户信息
     * @return 用户信息
     */
    User getUserById();

    /**
     * 查询所有用户的信息
     * @return 返回User集合
     */
    List<User> getAllUser();
}
