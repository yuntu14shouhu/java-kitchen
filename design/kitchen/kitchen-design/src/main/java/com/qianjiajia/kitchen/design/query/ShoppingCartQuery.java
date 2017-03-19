package com.qianjiajia.kitchen.design.query;

import com.qianjiajia.kitchen.common.query.BaseQuery;
import com.qianjiajia.kitchen.design.domain.ShoppingCartExample;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.util.StringUtils;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 17:55
 * @Description 购物车查询对象类
 */
@Data
@ApiModel
public class ShoppingCartQuery extends BaseQuery {

    /**
     * 购物车id
     */
    @ApiModelProperty("购物车id")
    private String id;

    /**
     * 用户id
     */
    @ApiModelProperty("用户id")
    private String userId;

    /**
     * 商品id
     */
    @ApiModelProperty("商品id")
    private String productId;

    /**
     * 购物车状态
     */
    @ApiModelProperty("购物车状态")
    private Short status;

    /**
     * 商品数量
     */
    @ApiModelProperty("商品数量")
    private Short productNumber;

    public ShoppingCartExample build(){
        ShoppingCartExample shoppingCartExample = new ShoppingCartExample();
        ShoppingCartExample.Criteria criteria = shoppingCartExample.createCriteria();
        if(!StringUtils.isEmpty(id)){
            criteria.andIdEqualTo(id);
        }
        if(!StringUtils.isEmpty(userId)){
            criteria.andUserIdShopEqualTo(userId);
        }
        if(!StringUtils.isEmpty(productId)){
            criteria.andProductIdEqualTo(productId);
        }
        if(!StringUtils.isEmpty(status)){
            criteria.andStatusEqualTo(status);
        }
        if(!StringUtils.isEmpty(productNumber)){
            criteria.andProductNumberEqualTo(productNumber);
        }
        return shoppingCartExample;
    }
}