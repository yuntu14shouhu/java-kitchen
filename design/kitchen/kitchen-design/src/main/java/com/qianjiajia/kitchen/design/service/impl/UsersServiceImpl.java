package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.exception.ApiException;
import com.qianjiajia.kitchen.common.exception.ApiExceptionCode;
import com.qianjiajia.kitchen.common.utils.PasswordUtil;
import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.UsersMapper;
import com.qianjiajia.kitchen.design.domain.Users;
import com.qianjiajia.kitchen.design.domain.UsersExample;
import com.qianjiajia.kitchen.design.service.IUsersService;
import com.qianjiajia.kitchen.design.utils.UserLoginUtils;
import org.apache.shiro.crypto.hash.Sha512Hash;
import org.apache.shiro.util.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-03-01 9:34
 * @Description 用户
 */
@Service
public class UsersServiceImpl implements IUsersService{

    @Autowired
    private UsersMapper usersMapper;

    private static final String salt = "kitchen";

//    @javax.annotation.Resource(name = "redisTemplate")
//    private ValueOperations<String,LocalDomain> valueOperations;
//
//    @javax.annotation.Resource(name = "redisTemplate")
//    private SetOperations<String,String> setOperations;

    @Override
    public Users save(Users users) {
        users.setId(UUIDUtil.getUUID());
        if(StringUtils.isEmpty(users.getPassword())){
            throw new ApiException(ApiExceptionCode.UNKNOWN_EXCEPTION,"密码不能为空");
        }
        String password = new Sha512Hash(users.getPassword(),salt).toHex();
        users.setPassword(password);
        users.setSalt(salt);
        users.setCreateTime(new Date());
        usersMapper.insert(users);
        return users;
    }

    @Override
    public Users verifyPassword(String username, String password) {
        Users users = this.getByUserName(username);
        if(users != null){
            String pwd = new Sha512Hash(password,users.getSalt()).toHex();
            if(pwd.equals(users.getPassword())){
                users.setPassword(null);
                users.setSalt(null);
                return users;//登陆成功
            }
        }
        throw new ApiException(ApiExceptionCode.LOGIN_FAILURE,"用户名或密码错误");
    }

    @Override
    @Transactional
    public void changePassword(String userId, String newPassword) {
        Users users = usersMapper.selectByPrimaryKey(userId);
        String salt = PasswordUtil.salt();
        String password = PasswordUtil.password(newPassword,salt);
        users.setSalt(salt);
        users.setPassword(password);
        if(usersMapper.updateByPrimaryKey(users) !=1 ){
            throw new ApiException(ApiExceptionCode.USER_NOT_EXIST,"用户不存在");
        }
    }

    @Override
    public Users get(String userId) {
        return usersMapper.selectByPrimaryKey(userId).removePassword();
    }

    @Override
    @Transactional
    public void delete(String id) {
        if(usersMapper.deleteByPrimaryKey(id) != 1){
            throw new ApiException(ApiExceptionCode.USER_NOT_EXIST,"用户不存在");
        }
        usersMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public void update(Users users) {

        Users users1 = UserLoginUtils.currentUser;

        users.setUserName(users1.getUserName());//不允许修改
        users.setStatus(users1.getStatus());//不允许修改
        users.setSalt(users1.getSalt());//不允许修改
        users.setPassword(users1.getPassword());//不允许修改
        users.setCreateTime(users1.getCreateTime());//不允许修改
        users.setId(users1.getId());//不允许修改
        usersMapper.update(users);
    }





//        if(usersMapper.updateByPrimaryKeySelective(users) != 1){
//            throw new ApiException(ApiExceptionCode.USER_NOT_EXIST,"用户不存在");
//        }
//        this.updateLoginUserInfo(this.get(users.getId()));//更新用户在redis中的缓存



    /**
     * 更新正在登录用户的状态
     */
//    private void updateLoginUserInfo(Users users) {
//        if(users == null){
//            return;
//        }
//        String mapstr = "map" + users.getId();//获取用户登陆了那些token
//        Set<String> members = setOperations.members(mapstr);
//        if(members != null){
//            members.forEach(item -> {
//                if(ContextUtils.getLocalDomain().getToken().equals(item)){
//                    //如果是当前登陆用户
//                    ContextUtils.getLocalDomain().setUsers(users.removePassword());
//                }else{
//                    LocalDomain domain = valueOperations.get(item);//获取该token登陆的id
//                    if(domain != null){
//                        domain.setUsers(users.removePassword());//设置新的用户信息
//                        valueOperations.set(item,domain);//放在redis中
//                    }
//                }
//            });
//        }
//    }

    @Override
    public Users getByUserName(String username) {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andUserNameEqualTo(username);
        List<Users> users = usersMapper.selectByExample(usersExample);
        if(CollectionUtils.isEmpty(users)){
            return null;
        }
        return users.get(0);
    }

//    @Override
//    @Transactional
//    public void updateUsersStatus(String userId, Integer status) {
//        Users users = new Users();
//        users.setStatus(status.shortValue());
//        UsersExample usersExample = new UsersExample();
//        usersExample.createCriteria().andIdEqualTo(userId);
//        if(usersMapper.updateByExampleSelective(users,usersExample) != 1){
//            throw new ApiException(ApiExceptionCode.USER_NOT_EXIST,"用户不存在");
//        }
//
//    }

    @Override
    public List<Users> getAll() {
        return usersMapper.selectAll();
    }


    @Override
    public boolean login(Users users) {
        users.setPassword(new Sha512Hash(users.getPassword(),salt).toHex());
        Users curUser = usersMapper.login(users);
        if(curUser != null ){
            UserLoginUtils.currentUser = curUser;
            return true;
        }
        return false;
    }

    @Override
    public Users queryByUserId() {
        Users users = UserLoginUtils.currentUser;
        return usersMapper.queryByUserId(users.getId());
    }


}