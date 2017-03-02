package com.qianjiajia.kitchen.design.query;

import com.qianjiajia.kitchen.common.query.BaseQuery;
import com.qianjiajia.kitchen.design.domain.UsersExample;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.StringUtils;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 17:26
 * @Description 用户查询类
 */
@Data
@ApiModel
public class UsersQuery extends BaseQuery {

    /**
     * 用户id
     */
    @ApiModelProperty("用户id")
    private String id;

    /**
     * 用户姓名
     */
    @ApiModelProperty("用户姓名")
    private String userName;

    /**
     * 用户密码
     */
    @ApiModelProperty("用户密码")
    private String password;

    /**
     * 昵称
     */
    @ApiModelProperty("昵称")
    private String nickName;

    /**
     * 用户状态
     */
    @ApiModelProperty("用户状态")
    private Integer status;

    /**
     * 用户性别
     */
    @ApiModelProperty("用户性别")
    private String sex;

    /**
     * 用户年龄
     */
    @ApiModelProperty("用户年龄")
    private Integer age;

    /**
     * 备注信息
     */
    @ApiModelProperty("备注信息")
    private String remark;

    /**
     * 联系方式
     */
    @ApiModelProperty("联系方式")
    private String contacts;

    public UsersExample bulid(){
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        if(!StringUtils.isEmpty(id)){
            criteria.andIdEqualTo(id);
        }
        if(!StringUtils.isEmpty(userName)){
            criteria.andUserNameEqualTo(userName);
        }
        if(!StringUtils.isEmpty(password)){
            criteria.andPasswordEqualTo(password);
        }
        if(!StringUtils.isEmpty(nickName)){
            criteria.andNickNameEqualTo(nickName);
        }
        if(!StringUtils.isEmpty(status)){
            criteria.andStatusEqualTo(status);
        }
        if(!StringUtils.isEmpty(sex)){
            criteria.andSexEqualTo(sex);
        }
        if(!StringUtils.isEmpty(age)){
            criteria.andAgeEqualTo(age);
        }
        if(!StringUtils.isEmpty(remark)){
            criteria.andRemarkEqualTo(remark);
        }
        if(!StringUtils.isEmpty(contacts)){
            criteria.andContactsEqualTo(contacts);
        }
        return usersExample;
    }
}