package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.ProAndShop;
import com.qianjiajia.kitchen.design.domain.ProAndShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProAndShopMapper {
    long countByExample(ProAndShopExample example);

    int deleteByExample(ProAndShopExample example);

    int deleteByPrimaryKey(String id);

    int insert(ProAndShop record);

    int insertSelective(ProAndShop record);

    List<ProAndShop> selectByExample(ProAndShopExample example);

    ProAndShop selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ProAndShop record, @Param("example") ProAndShopExample example);

    int updateByExample(@Param("record") ProAndShop record, @Param("example") ProAndShopExample example);

    int updateByPrimaryKeySelective(ProAndShop record);

    int updateByPrimaryKey(ProAndShop record);

    List<String> queryByShopId(String shopId);

    void saveProductType(ProAndShop proAndShop);

    void updateProductNumber(ProAndShop proAndShop);

    List<String> queryShopIds();

    void saveShop(ProAndShop proAndShop);

    int getNumber(String s);
}