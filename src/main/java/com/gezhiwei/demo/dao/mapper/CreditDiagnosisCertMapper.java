package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.CreditDiagnosisCert;

public interface CreditDiagnosisCertMapper {
    int deleteByPrimaryKey(Long nId);

    int insert(CreditDiagnosisCert record);

    int insertSelective(CreditDiagnosisCert record);

    CreditDiagnosisCert selectByPrimaryKey(Long nId);

    int updateByPrimaryKeySelective(CreditDiagnosisCert record);

    int updateByPrimaryKey(CreditDiagnosisCert record);
}