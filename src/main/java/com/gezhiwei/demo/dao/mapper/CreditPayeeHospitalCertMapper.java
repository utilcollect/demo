package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.CreditPayeeHospitalCert;

public interface CreditPayeeHospitalCertMapper {
    int deleteByPrimaryKey(Long nFundId);

    int insert(CreditPayeeHospitalCert record);

    int insertSelective(CreditPayeeHospitalCert record);

    CreditPayeeHospitalCert selectByPrimaryKey(Long nFundId);

    int updateByPrimaryKeySelective(CreditPayeeHospitalCert record);

    int updateByPrimaryKey(CreditPayeeHospitalCert record);
}