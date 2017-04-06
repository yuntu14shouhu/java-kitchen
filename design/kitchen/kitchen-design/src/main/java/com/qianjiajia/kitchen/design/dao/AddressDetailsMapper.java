package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.AddressDetails;
import com.qianjiajia.kitchen.design.domain.AddressDetailsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressDetailsMapper {
    long countByExample(AddressDetailsExample example);

    int deleteByExample(AddressDetailsExample example);

    int deleteByPrimaryKey(String id);

    int insert(AddressDetails record);

    int insertSelective(AddressDetails record);

    List<AddressDetails> selectByExample(AddressDetailsExample example);

    AddressDetails selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") AddressDetails record, @Param("example") AddressDetailsExample example);

    int updateByExample(@Param("record") AddressDetails record, @Param("example") AddressDetailsExample example);

    int updateByPrimaryKeySelective(AddressDetails record);

    int updateByPrimaryKey(AddressDetails record);


    List<AddressDetails> queryList(String id);

    AddressDetails getById(String id);

    List<String> queryIdList(String id);

    AddressDetails queryAddress(String addressId);
}