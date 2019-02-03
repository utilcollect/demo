package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.HcFundCommit;

public interface HcFundCommitMapper {
    int deleteByPrimaryKey(Long nId);

    int insert(HcFundCommit record);

    int insertSelective(HcFundCommit record);

    HcFundCommit selectByPrimaryKey(Long nId);

    int updateByPrimaryKeySelective(HcFundCommit record);

    int updateByPrimaryKey(HcFundCommit record);
}