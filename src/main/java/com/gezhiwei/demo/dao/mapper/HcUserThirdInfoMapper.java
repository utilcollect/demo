package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.HcUserThirdInfo;

public interface HcUserThirdInfoMapper {
    int deleteByPrimaryKey(Long nId);

    int insert(HcUserThirdInfo record);

    int insertSelective(HcUserThirdInfo record);

    HcUserThirdInfo selectByPrimaryKey(Long nId);

    int updateByPrimaryKeySelective(HcUserThirdInfo record);

    int updateByPrimaryKey(HcUserThirdInfo record);
}