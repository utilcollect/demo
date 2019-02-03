package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.CreditPayeeMateCert;

public interface CreditPayeeMateCertMapper {
    int deleteByPrimaryKey(Long nFundId);

    int insert(CreditPayeeMateCert record);

    int insertSelective(CreditPayeeMateCert record);

    CreditPayeeMateCert selectByPrimaryKey(Long nFundId);

    int updateByPrimaryKeySelective(CreditPayeeMateCert record);

    int updateByPrimaryKey(CreditPayeeMateCert record);
}