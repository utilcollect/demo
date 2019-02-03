package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.CreditExtraCert;

public interface CreditExtraCertMapper {
    int deleteByPrimaryKey(Long nId);

    int insert(CreditExtraCert record);

    int insertSelective(CreditExtraCert record);

    CreditExtraCert selectByPrimaryKey(Long nId);

    int updateByPrimaryKeySelective(CreditExtraCert record);

    int updateByPrimaryKey(CreditExtraCert record);
}