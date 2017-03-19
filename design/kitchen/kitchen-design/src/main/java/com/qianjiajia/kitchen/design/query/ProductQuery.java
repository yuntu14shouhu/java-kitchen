package com.qianjiajia.kitchen.design.query;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.qianjiajia.kitchen.common.query.BaseQuery;
import com.qianjiajia.kitchen.design.domain.ProductExample;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;

import java.math.BigDecimal;
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
    private Short status;

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
    private BigDecimal price;

    /**
     * 优惠价格
     */
    @ApiModelProperty("优惠价格")
    private BigDecimal discountPrice;

    /**
     * 上架日期
     */
    @ApiModelProperty("上架日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date putawayDate;

    /**
     * 是否团购
     */
    @ApiModelProperty("是否团购")
    private Short isGroupBuy;

    /**
     * 团购价格
     */
    @ApiModelProperty("团购价格")
    private BigDecimal groupBuyPrice;

    /**
     * 团购人数
     */
    @ApiModelProperty("团购人数")
    private Integer groupBuyPersonNumber;

    /**
     * 团购开始日期
     */
    @ApiModelProperty("团购开始日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date startGroupBuyDate;

    /**
     * 团购结束日期
     */
    @ApiModelProperty("团购结束日期")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date endGroupBuyDate;

    /**
     * 是否优惠
     */
    @ApiModelProperty("是否优惠")
    private Short isDiscount;

    /**
     * 用餐人数
     */
    @ApiModelProperty("用餐人数")
    private Integer limitNumber;

    /**
     * 套餐种类
     */
    @ApiModelProperty("套餐种类")
    private Short kindNumber;

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
    private BigDecimal carriage;

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
        if(!StringUtils.isEmpty(discountPrice)){
            criteria.andDiscountPriceEqualTo(discountPrice);
        }
        if(!StringUtils.isEmpty(isDiscount)){
            criteria.andIsDiscountEqualTo(isDiscount);
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
        if(!StringUtils.isEmpty(putawayDate)){
            criteria.andPutawayDateEqualTo(putawayDate);
        }
        if(!StringUtils.isEmpty(isGroupBuy)){
            criteria.andIsGroupBuyEqualTo(isGroupBuy);
        }
        if(!StringUtils.isEmpty(groupBuyPersonNumber)){
            criteria.andGroupBuyPersonNumberEqualTo(groupBuyPersonNumber);
        }
        if(!StringUtils.isEmpty(groupBuyPrice)){
            criteria.andGroupBuyPriceEqualTo(groupBuyPrice);
        }
        if(!StringUtils.isEmpty(startGroupBuyDate)){
            criteria.andStartGroupBuyDateEqualTo(startGroupBuyDate);
        }
        if(!StringUtils.isEmpty(endGroupBuyDate)){
            criteria.andEndGroupBuyDateEqualTo(endGroupBuyDate);
        }
        return productExample;
    }

    @Override
    public String toString() {
        return "ProductQuery{" +
                "id='" + id + '\'' +
                ", kinds='" + kinds + '\'' +
                ", productName='" + productName + '\'' +
                ", productImageUrl='" + productImageUrl + '\'' +
                ", status=" + status +
                ", productTypes='" + productTypes + '\'' +
                ", producer='" + producer + '\'' +
                ", address='" + address + '\'' +
                ", described='" + described + '\'' +
                ", productionDate=" + productionDate +
                ", price=" + price +
                ", discountPrice=" + discountPrice +
                ", putawayDate=" + putawayDate +
                ", isGroupBuy=" + isGroupBuy +
                ", groupBuyPrice=" + groupBuyPrice +
                ", groupBuyPersonNumber=" + groupBuyPersonNumber +
                ", startGroupBuyDate=" + startGroupBuyDate +
                ", endGroupBuyDate=" + endGroupBuyDate +
                ", isDiscount=" + isDiscount +
                ", limitNumber=" + limitNumber +
                ", kindNumber=" + kindNumber +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", carriage=" + carriage +
                ", keyClass='" + keyClass + '\'' +
                ", bigKeyClass='" + bigKeyClass + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductQuery)) return false;

        ProductQuery ProductQuery = (ProductQuery) o;

        if (id != null ? !id.equals(ProductQuery.id) : ProductQuery.id != null) return false;
        if (putawayDate != null ? !putawayDate.equals(ProductQuery.putawayDate) : ProductQuery.putawayDate != null) return false;
        if (kinds != null ? !kinds.equals(ProductQuery.kinds) : ProductQuery.kinds != null) return false;
        if (productName != null ? !productName.equals(ProductQuery.productName) : ProductQuery.productName != null) return false;
        if (productImageUrl != null ? !productImageUrl.equals(ProductQuery.productImageUrl) : ProductQuery.productImageUrl != null)
            return false;
        if (status != null ? !status.equals(ProductQuery.status) : ProductQuery.status != null) return false;
        if (productTypes != null ? !productTypes.equals(ProductQuery.productTypes) : ProductQuery.productTypes != null) return false;
        if (producer != null ? !producer.equals(ProductQuery.producer) : ProductQuery.producer != null) return false;
        if (address != null ? !address.equals(ProductQuery.address) : ProductQuery.address != null) return false;
        if (described != null ? !described.equals(ProductQuery.described) : ProductQuery.described != null) return false;
        if (productionDate != null ? !productionDate.equals(ProductQuery.productionDate) : ProductQuery.productionDate != null)
            return false;
        if (price != null ? !price.equals(ProductQuery.price) : ProductQuery.price != null) return false;
        if (discountPrice != null ? !discountPrice.equals(ProductQuery.discountPrice) : ProductQuery.discountPrice != null)
            return false;
        if (isDiscount != null ? !isDiscount.equals(ProductQuery.isDiscount) : ProductQuery.isDiscount != null) return false;
        if (limitNumber != null ? !limitNumber.equals(ProductQuery.limitNumber) : ProductQuery.limitNumber != null) return false;
        if (kindNumber != null ? !kindNumber.equals(ProductQuery.kindNumber) : ProductQuery.kindNumber != null) return false;
        if (startDate != null ? !startDate.equals(ProductQuery.startDate) : ProductQuery.startDate != null) return false;
        if (endDate != null ? !endDate.equals(ProductQuery.endDate) : ProductQuery.endDate != null) return false;
        if (carriage != null ? !carriage.equals(ProductQuery.carriage) : ProductQuery.carriage != null) return false;
        if (isGroupBuy != null ? !isGroupBuy.equals(ProductQuery.isGroupBuy) : ProductQuery.isGroupBuy != null) return false;
        if (groupBuyPrice != null ? !groupBuyPrice.equals(ProductQuery.groupBuyPrice) : ProductQuery.groupBuyPrice != null)
            return false;
        if (groupBuyPersonNumber != null ? !groupBuyPersonNumber.equals(ProductQuery.groupBuyPersonNumber) : ProductQuery.groupBuyPersonNumber != null)
            return false;
        if (startGroupBuyDate != null ? !startGroupBuyDate.equals(ProductQuery.startGroupBuyDate) : ProductQuery.startGroupBuyDate != null)
            return false;
        if (endGroupBuyDate != null ? !endGroupBuyDate.equals(ProductQuery.endGroupBuyDate) : ProductQuery.endGroupBuyDate != null)
            return false;
        if (keyClass != null ? !keyClass.equals(ProductQuery.keyClass) : ProductQuery.keyClass != null) return false;
        if (bigKeyClass != null ? !bigKeyClass.equals(ProductQuery.bigKeyClass) : ProductQuery.bigKeyClass != null) return false;
        return keyword != null ? keyword.equals(ProductQuery.keyword) : ProductQuery.keyword == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (putawayDate != null ? putawayDate.hashCode() : 0);
        result = 31 * result + (kinds != null ? kinds.hashCode() : 0);
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productImageUrl != null ? productImageUrl.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (productTypes != null ? productTypes.hashCode() : 0);
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (described != null ? described.hashCode() : 0);
        result = 31 * result + (productionDate != null ? productionDate.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (discountPrice != null ? discountPrice.hashCode() : 0);
        result = 31 * result + (isDiscount != null ? isDiscount.hashCode() : 0);
        result = 31 * result + (limitNumber != null ? limitNumber.hashCode() : 0);
        result = 31 * result + (kindNumber != null ? kindNumber.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        result = 31 * result + (carriage != null ? carriage.hashCode() : 0);
        result = 31 * result + (isGroupBuy != null ? isGroupBuy.hashCode() : 0);
        result = 31 * result + (groupBuyPrice != null ? groupBuyPrice.hashCode() : 0);
        result = 31 * result + (groupBuyPersonNumber != null ? groupBuyPersonNumber.hashCode() : 0);
        result = 31 * result + (startGroupBuyDate != null ? startGroupBuyDate.hashCode() : 0);
        result = 31 * result + (endGroupBuyDate != null ? endGroupBuyDate.hashCode() : 0);
        result = 31 * result + (keyClass != null ? keyClass.hashCode() : 0);
        result = 31 * result + (bigKeyClass != null ? bigKeyClass.hashCode() : 0);
        result = 31 * result + (keyword != null ? keyword.hashCode() : 0);
        return result;
    }

}