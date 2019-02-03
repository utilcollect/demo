package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.HcFundReport;

public interface HcFundReportMapper {
    int deleteByPrimaryKey(Long nFundId);

    int insert(HcFundReport record);

    int insertSelective(HcFundReport record);

    HcFundReport selectByPrimaryKey(Long nFundId);

    int updateByPrimaryKeySelective(HcFundReport record);

    int updateByPrimaryKey(HcFundReport record);
}