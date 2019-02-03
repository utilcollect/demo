package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.HcUserLoginRecord;

public interface HcUserLoginRecordMapper {
    int deleteByPrimaryKey(Long nId);

    int insert(HcUserLoginRecord record);

    int insertSelective(HcUserLoginRecord record);

    HcUserLoginRecord selectByPrimaryKey(Long nId);

    int updateByPrimaryKeySelective(HcUserLoginRecord record);

    int updateByPrimaryKey(HcUserLoginRecord record);
}