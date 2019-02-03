package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.CreditPayeeOrgCert;

public interface CreditPayeeOrgCertMapper {
    int deleteByPrimaryKey(Long nFundId);

    int insert(CreditPayeeOrgCert record);

    int insertSelective(CreditPayeeOrgCert record);

    CreditPayeeOrgCert selectByPrimaryKey(Long nFundId);

    int updateByPrimaryKeySelective(CreditPayeeOrgCert record);

    int updateByPrimaryKey(CreditPayeeOrgCert record);
}