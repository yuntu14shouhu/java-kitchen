package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.CnAndEn;
import com.qianjiajia.kitchen.design.domain.CnAndEnExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CnAndEnMapper {
    long countByExample(CnAndEnExample example);

    int deleteByExample(CnAndEnExample example);

    int deleteByPrimaryKey(String cnAndEnId);

    int insert(CnAndEn record);

    int insertSelective(CnAndEn record);

    List<CnAndEn> selectByExample(CnAndEnExample example);

    CnAndEn selectByPrimaryKey(String cnAndEnId);

    int updateByExampleSelective(@Param("record") CnAndEn record, @Param("example") CnAndEnExample example);

    int updateByExample(@Param("record") CnAndEn record, @Param("example") CnAndEnExample example);

    int updateByPrimaryKeySelective(CnAndEn record);

    int updateByPrimaryKey(CnAndEn record);

    int save(CnAndEn cnAndEn);

    List<String> allEn();

    List<String> getAllEnName();
}