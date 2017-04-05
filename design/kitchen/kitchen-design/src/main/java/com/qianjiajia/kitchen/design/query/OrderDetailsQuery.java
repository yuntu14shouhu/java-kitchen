package com.qianjiajia.kitchen.design.query;

import com.qianjiajia.kitchen.common.query.BaseQuery;
import com.qianjiajia.kitchen.design.domain.OrderDetailsExample;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-31 13:30
 * @Description 订单详情query
 */
@Data
@ToString
@ApiModel
public class OrderDetailsQuery extends BaseQuery{

    /**
     * 订单详情id
     */
    @ApiModelProperty("订单详情id")
    private String id;

    /**
     * 订单id
     */
    @ApiModelProperty("订单id")
    private String orderId;

    /**
     * 订单商品名称
     */
    @ApiModelProperty("订单商品名称")
    private String orderProductName;

    /**
     * 订单商品图片
     */
    @ApiModelProperty("订单商品图片")
    private String orderProductImageUrl;

    /**
     * 订单商品价格
     */
    @ApiModelProperty("订单商品价格")
    private BigDecimal orderPrice;

    /**
     * 订单商品数量
     */
    @ApiModelProperty("订单商品数量")
    private Short orderProductNumber;

    public OrderDetailsExample build(){
        OrderDetailsExample orderDetailsExample = new OrderDetailsExample();
        OrderDetailsExample.Criteria criteria = orderDetailsExample.createCriteria();

        if(!StringUtils.isEmpty(id)){
            criteria.andIdEqualTo(id);
        }
        if(!StringUtils.isEmpty(orderId)){
            criteria.andOrderIdEqualTo(orderId);
        }
        if(!StringUtils.isEmpty(orderProductName)){
            criteria.andOrderProductNameEqualTo(orderProductName);
        }
        if(!StringUtils.isEmpty(orderProductImageUrl)){
            criteria.andOrderProductImageUrlEqualTo(orderProductImageUrl);
        }
        if(!StringUtils.isEmpty(orderPrice)){
            criteria.andOrderPriceEqualTo(orderPrice);
        }
        if(!StringUtils.isEmpty(orderProductNumber)){
            criteria.andOrderProductNumberEqualTo(orderProductNumber);
        }
        return orderDetailsExample;
    }
}