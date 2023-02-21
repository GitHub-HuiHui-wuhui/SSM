package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.PUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialSQLMapper {

    /**
     * 通过用户名模糊查询用户信息
     * @param dim 模糊
     * @return 受影响的行数
     */
    List<PUser> getUserByLike(@Param("dim") String dim);

    /**
     * 批量删除
     * @param ids
     */
    void deleteMoreUser(@Param("ids") String ids);

    /**
     * 动态设置表名
     * @param tableName 表名信息
     * @return 受影响的行数
     */
    List<PUser> getUserList(@Param("tableName") String tableName);

    /**
     * 添加用户信息并获取自增的主键
     * @param user 用户信息
     */
    void insertUser(PUser user);
}
