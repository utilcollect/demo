package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.CreditPayeeDirectCert;

public interface CreditPayeeDirectCertMapper {
    int deleteByPrimaryKey(Long nFundId);

    int insert(CreditPayeeDirectCert record);

    int insertSelective(CreditPayeeDirectCert record);

    CreditPayeeDirectCert selectByPrimaryKey(Long nFundId);

    int updateByPrimaryKeySelective(CreditPayeeDirectCert record);

    int updateByPrimaryKey(CreditPayeeDirectCert record);
}