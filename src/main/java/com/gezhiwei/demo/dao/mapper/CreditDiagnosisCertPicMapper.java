package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.CreditDiagnosisCertPic;

public interface CreditDiagnosisCertPicMapper {
    int deleteByPrimaryKey(Long nId);

    int insert(CreditDiagnosisCertPic record);

    int insertSelective(CreditDiagnosisCertPic record);

    CreditDiagnosisCertPic selectByPrimaryKey(Long nId);

    int updateByPrimaryKeySelective(CreditDiagnosisCertPic record);

    int updateByPrimaryKey(CreditDiagnosisCertPic record);
}