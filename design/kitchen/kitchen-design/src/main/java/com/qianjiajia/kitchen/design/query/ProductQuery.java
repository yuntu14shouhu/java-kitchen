package com.qianjiajia.kitchen.design.query;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qianjiajia.kitchen.common.query.BaseQuery;
import com.qianjiajia.kitchen.design.domain.ProductExample;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 17:30
 * @Description 商品查询对象类
 */
@Data
@ApiModel
public class ProductQuery extends BaseQuery {

    /**
     * 商品id
     */
    @ApiModelProperty("商品id")
    private String id;

    /**
     * 商品类型
     */
    @ApiModelProperty("商品类型")
    private String kinds;

    /**
     * 商品名称
     */
    @ApiModelProperty("商品名称")
    private String productName;

    /**
     * 商品图片
     */
    @ApiModelProperty("商品图片")
    private String productImageUrl;

    /**
     * 图片标识字段
     * 1--主图;0--副图
     */
    @ApiModelProperty("图片标识字段")
    private Integer status;

    /**
     * 商品型号
     */
    @ApiModelProperty("商品型号")
    private String productTypes;

    /**
     * 生产商
     */
    @ApiModelProperty("生产商")
    private String producer;

    /**
     * 产地
     */
    @ApiModelProperty("产地")
    private String address;

    /**
     * 商品描述
     */
    @ApiModelProperty("商品描述")
    private String described;

    /**
     * 生产日期
     */
    @ApiModelProperty("生产日期")
    private Date productionDate;

    /**
     * 价格
     */
    @ApiModelProperty("价格")
    private Double price;

    /**
     * 优惠价格
     */
    @ApiModelProperty("优惠价格")
    private Double discountprice;

    /**
     * 是否优惠
     */
    @ApiModelProperty("是否优惠")
    private Integer isdiscount;

    /**
     * 用餐人数
     */
    @ApiModelProperty("用餐人数")
    private Integer limitNumber;

    /**
     * 套餐种类
     */
    @ApiModelProperty("套餐种类")
    private Integer kindNumber;

    /**
     * 优惠活动开始日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty("优惠活动开始日期")
    private Date startDate;

    /**
     * 优惠活动结束日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @ApiModelProperty("优惠活动结束日期")
    private Date endDate;

    /**
     * 运费
     */
    @ApiModelProperty("运费")
    private Double carriage;

    /**
     * 小类别
     */
    @ApiModelProperty("小类别")
    private String keyClass;

    /**
     * 大类别
     */
    @ApiModelProperty("大类别")
    private String bigKeyClass;

    /**
     * 类别名称
     */
    @ApiModelProperty("类别名称")
    private String keyword;


    public ProductExample build(){
        ProductExample productExample = new ProductExample();
        ProductExample.Criteria criteria = productExample.createCriteria();
        if(!StringUtils.isEmpty(id)){
            criteria.andIdEqualTo(id);
        }
        if(!StringUtils.isEmpty(kinds)){
            criteria.andKindsLike("%" + kinds + "%");
        }
        if(!StringUtils.isEmpty(productName)){
            criteria.andProductNameLike("%" + productName + "%");
        }
        if(!StringUtils.isEmpty(productImageUrl)){
            criteria.andProductImageUrlEqualTo(productImageUrl);
        }
        if(!StringUtils.isEmpty(status)){
            criteria.andStatusEqualTo(status);
        }
        if(!StringUtils.isEmpty(productTypes)){
            criteria.andProductTypesLike("%" + productTypes +"%");
        }
        if(!StringUtils.isEmpty(producer)){
            criteria.andProducerEqualTo(producer);
        }
        if(!StringUtils.isEmpty(address)){
            criteria.andAddressEqualTo(address);
        }
        if(!StringUtils.isEmpty(described)){
            criteria.andDescribedEqualTo(described);
        }
        if(!StringUtils.isEmpty(productionDate)){
            criteria.andProductionDateEqualTo(productionDate);
        }
        if(!StringUtils.isEmpty(price)){
            criteria.andPriceEqualTo(price);
        }
        if(!StringUtils.isEmpty(discountprice)){
            criteria.andDiscountpriceEqualTo(discountprice);
        }
        if(!StringUtils.isEmpty(isdiscount)){
            criteria.andIsdiscountEqualTo(isdiscount);
        }
        if(!StringUtils.isEmpty(limitNumber)){
            criteria.andLimitNumberEqualTo(limitNumber);
        }
        if(!StringUtils.isEmpty(kindNumber)){
            criteria.andKindNumberEqualTo(kindNumber);
        }
        if(!StringUtils.isEmpty(startDate)){
            criteria.andStartDateGreaterThanOrEqualTo(startDate);
        }
        if(!StringUtils.isEmpty(endDate)){
            criteria.andEndDateLessThanOrEqualTo(endDate);
        }
        if(!StringUtils.isEmpty(carriage)){
            criteria.andCarriageEqualTo(carriage);
        }
        if(!StringUtils.isEmpty(keyClass)){
            criteria.andKeyClassEqualTo(keyClass);
        }
        if(!StringUtils.isEmpty(bigKeyClass)){
            criteria.andBigKeyClassEqualTo(bigKeyClass);
        }
        if(!StringUtils.isEmpty(keyword)){
            criteria.andKeyClassEqualTo(keyword);
        }
        return productExample;
    }



}