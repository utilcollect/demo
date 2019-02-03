package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.HcFund;
import com.gezhiwei.demo.dao.entity.HcFundWithBLOBs;

public interface HcFundMapper {
    int deleteByPrimaryKey(Long nId);

    int insert(HcFundWithBLOBs record);

    int insertSelective(HcFundWithBLOBs record);

    HcFundWithBLOBs selectByPrimaryKey(Long nId);

    int updateByPrimaryKeySelective(HcFundWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HcFundWithBLOBs record);

    int updateByPrimaryKey(HcFund record);
}