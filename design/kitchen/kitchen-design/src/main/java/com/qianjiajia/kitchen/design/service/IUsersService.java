package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.design.domain.Users;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 23:18
 */
public interface IUsersService {

    /**
     * 添加用户
     */
    Users save(Users users);

    /**
     * 验证密码是否正确
     */
    Users verifyPassword(String username,String password);

    /**
     * 修改用户密码
     * 修改之前先验证一下旧密码是否正确
     */
    void changePassword(String userId,String newPassword);

    /**
     * 查询指定的用户
     */
    Users get(String userId);

    /**
     * 删除指定的用户
     */
    void delete(String id);

    /**
     * 编辑指定的用户
     */
    void update(Users users);

    /**
     * 通过用户名查找用户
     */
    Users getByUserName(String username);

    /**
     * 修改用户状态
     */
//    void updateUsersStatus(String userId,Integer status);

    /**
     * 获取全部用户
     */
    List<Users> getAll();


}
