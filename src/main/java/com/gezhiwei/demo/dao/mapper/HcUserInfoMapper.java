package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.HcUserInfo;

public interface HcUserInfoMapper {
    int deleteByPrimaryKey(Long nUserId);

    int insert(HcUserInfo record);

    int insertSelective(HcUserInfo record);

    HcUserInfo selectByPrimaryKey(Long nUserId);

    int updateByPrimaryKeySelective(HcUserInfo record);

    int updateByPrimaryKey(HcUserInfo record);
}