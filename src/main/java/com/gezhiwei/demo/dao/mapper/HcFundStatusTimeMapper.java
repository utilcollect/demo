package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.HcFundStatusTime;

public interface HcFundStatusTimeMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(HcFundStatusTime record);

    int insertSelective(HcFundStatusTime record);

    HcFundStatusTime selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(HcFundStatusTime record);

    int updateByPrimaryKey(HcFundStatusTime record);
}