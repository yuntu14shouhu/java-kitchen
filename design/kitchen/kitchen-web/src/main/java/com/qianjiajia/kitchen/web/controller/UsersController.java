package com.qianjiajia.kitchen.web.controller;

import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.design.domain.Users;
import com.qianjiajia.kitchen.design.service.IUsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 0:06
 * @Description 用户管理控制器
 */
@Api("用户管理控制器")
@RequestMapping("/user")
@Controller
public class UsersController {

    @Autowired
    private IUsersService usersService;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ApiOperation(value = "登陆")
    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public MessageResult login(@RequestBody @ApiParam Users users){
        return MessageResult.getSuccessInstance(usersService.login(users));
    }

    @ApiOperation(value = "根据用户名查询用户")
    @ResponseBody
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public MessageResult queryByUserName(String username){
        logger.info("query"+username);
        Users users = usersService.getByUserName(username);
        return MessageResult.getSuccessInstance(users);
    }

    @ApiOperation(value = "添加用户")
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public MessageResult save(@RequestBody @ApiParam Users users){
        logger.info("save"+users.getId());
        usersService.save(users);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "编辑用户")
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public MessageResult update(@RequestBody Users users){
        logger.info("update"+users.getId());
        usersService.update(users);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "删除用户")
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public MessageResult delete(String id){
        logger.info("delete"+id);
        usersService.delete(id);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "根据用户id查询用户信息")
    @ResponseBody
    @RequestMapping(value = "/queryByUserId",method = RequestMethod.GET)
    public MessageResult queryByUserId(String userId){

        return MessageResult.getSuccessInstance(usersService.queryByUserId(userId));
    }


}