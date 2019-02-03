package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.HcArea;

public interface HcAreaMapper {
    int deleteByPrimaryKey(Long nAreaId);

    int insert(HcArea record);

    int insertSelective(HcArea record);

    HcArea selectByPrimaryKey(Long nAreaId);

    int updateByPrimaryKeySelective(HcArea record);

    int updateByPrimaryKey(HcArea record);
}