package com.gezhiwei.demo.dao.mapper;

import com.gezhiwei.demo.dao.entity.HcWorkerVolunteerRelation;

public interface HcWorkerVolunteerRelationMapper {
    int deleteByPrimaryKey(Long nId);

    int insert(HcWorkerVolunteerRelation record);

    int insertSelective(HcWorkerVolunteerRelation record);

    HcWorkerVolunteerRelation selectByPrimaryKey(Long nId);

    int updateByPrimaryKeySelective(HcWorkerVolunteerRelation record);

    int updateByPrimaryKey(HcWorkerVolunteerRelation record);
}