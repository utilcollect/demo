package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.CreditPayeeSelfCert;

public interface CreditPayeeSelfCertMapper {
    int deleteByPrimaryKey(Long nFundId);

    int insert(CreditPayeeSelfCert record);

    int insertSelective(CreditPayeeSelfCert record);

    CreditPayeeSelfCert selectByPrimaryKey(Long nFundId);

    int updateByPrimaryKeySelective(CreditPayeeSelfCert record);

    int updateByPrimaryKey(CreditPayeeSelfCert record);
}