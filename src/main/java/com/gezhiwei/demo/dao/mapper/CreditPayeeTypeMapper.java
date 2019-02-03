package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.CreditPayeeType;

public interface CreditPayeeTypeMapper {
    int deleteByPrimaryKey(Long nFundId);

    int insert(CreditPayeeType record);

    int insertSelective(CreditPayeeType record);

    CreditPayeeType selectByPrimaryKey(Long nFundId);

    int updateByPrimaryKeySelective(CreditPayeeType record);

    int updateByPrimaryKey(CreditPayeeType record);
}