package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.HcHospital;

public interface HcHospitalMapper {
    int deleteByPrimaryKey(Long nId);

    int insert(HcHospital record);

    int insertSelective(HcHospital record);

    HcHospital selectByPrimaryKey(Long nId);

    int updateByPrimaryKeySelective(HcHospital record);

    int updateByPrimaryKey(HcHospital record);
}