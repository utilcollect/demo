package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.HcUserRegister;

public interface HcUserRegisterMapper {
    int deleteByPrimaryKey(Long nId);

    int insert(HcUserRegister record);

    int insertSelective(HcUserRegister record);

    HcUserRegister selectByPrimaryKey(Long nId);

    int updateByPrimaryKeySelective(HcUserRegister record);

    int updateByPrimaryKey(HcUserRegister record);
}