package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.CreditPatientCert;

public interface CreditPatientCertMapper {
    int deleteByPrimaryKey(Long nId);

    int insert(CreditPatientCert record);

    int insertSelective(CreditPatientCert record);

    CreditPatientCert selectByPrimaryKey(Long nId);

    int updateByPrimaryKeySelective(CreditPatientCert record);

    int updateByPrimaryKey(CreditPatientCert record);
}