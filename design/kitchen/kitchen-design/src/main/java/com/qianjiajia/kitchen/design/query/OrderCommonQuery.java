package com.qianjiajia.kitchen.design.query;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qianjiajia.kitchen.common.query.BaseQuery;
import com.qianjiajia.kitchen.design.domain.OrderCommonExample;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-31 10:43
 * @Description 订单查询对象
 */
@Data
@ApiModel
@ToString
public class OrderCommonQuery extends BaseQuery{

    /**
     * 订单id
     */
    @ApiModelProperty("订单id")
    private String id;

    /**
     * 订单收货人姓名
     */
    @ApiModelProperty("订单收货人姓名")
    private String orderConsigneeName;

    /**
     * 订单收货人电话
     */
    @ApiModelProperty("订单收货人电话")
    private String orderConsigneePhone;

    /**
     * 订单收货人地址
     */
    @ApiModelProperty("订单收货人地址")
    private String orderConsigneeAddress;

    /**
     * 订单运费
     */
    @ApiModelProperty("订单运费")
    private BigDecimal orderCarriage;

    /**
     * 订单状态
     */
    @ApiModelProperty("订单状态")
    private Short orderStatus;

    /**
     * 下单时间
     */
    @ApiModelProperty("下单时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date orderCreateDate;

    /**
     * 订单编号
     */
    @ApiModelProperty("订单编号")
    private String orderRef;

    /**
     * 实际支付
     */
    @ApiModelProperty("实际支付")
    private BigDecimal orderActualPayment;

    /**
     * 合计
     */
    @ApiModelProperty("合计")
    private BigDecimal orderTotalPayment;

    public OrderCommonExample build(){
        OrderCommonExample ordersExample = new OrderCommonExample();
        OrderCommonExample.Criteria criteria = ordersExample.createCriteria();
        if(!StringUtils.isEmpty(id)){
            criteria.andIdEqualTo(id);
        }
        if(!StringUtils.isEmpty(orderConsigneeName)){
            criteria.andOrderConsigneeNameEqualTo(orderConsigneeName);
        }
        if(!StringUtils.isEmpty(orderConsigneePhone)){
            criteria.andOrderConsigneePhoneEqualTo(orderConsigneePhone);
        }
        if(!StringUtils.isEmpty(orderConsigneeAddress)){
            criteria.andOrderConsigneeAddressEqualTo(orderConsigneeAddress);
        }
        if(!StringUtils.isEmpty(orderCarriage)){
            criteria.andOrderCarriageEqualTo(orderCarriage);
        }
        if(!StringUtils.isEmpty(orderStatus)){
            criteria.andOrderStatusEqualTo(orderStatus);
        }
        if(!StringUtils.isEmpty(orderCreateDate)){
            criteria.andOrderCreateDateEqualTo(orderCreateDate);
        }
        if(!StringUtils.isEmpty(orderRef)){
            criteria.andOrderRefEqualTo(orderRef);
        }
        if(!StringUtils.isEmpty(orderActualPayment)){
            criteria.andOrderActualPaymentEqualTo(orderActualPayment);
        }
        if(!StringUtils.isEmpty(orderTotalPayment)){
            criteria.andOrderTotalPaymentEqualTo(orderTotalPayment);
        }
        return ordersExample;
    }

}