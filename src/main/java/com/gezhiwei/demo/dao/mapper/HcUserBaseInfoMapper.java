package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.HcUserBaseInfo;

public interface HcUserBaseInfoMapper {
    int deleteByPrimaryKey(Long nUserId);

    int insert(HcUserBaseInfo record);

    int insertSelective(HcUserBaseInfo record);

    HcUserBaseInfo selectByPrimaryKey(Long nUserId);

    int updateByPrimaryKeySelective(HcUserBaseInfo record);

    int updateByPrimaryKey(HcUserBaseInfo record);
}