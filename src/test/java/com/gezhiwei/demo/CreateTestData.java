package com.gezhiwei.demo;

import com.gezhiwei.demo.config.RoleEnum;
import com.gezhiwei.demo.dao.entity.HcUserBaseInfo;
import com.gezhiwei.demo.dao.entity.HcUserInfo;
import com.gezhiwei.demo.dao.entity.HcUserRegister;
import com.gezhiwei.demo.dao.entity.HcWorkerVolunteerRelation;
import com.gezhiwei.demo.dao.mapper.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @ClassName: CreateTestData
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2018/12/19 10:56
 * @modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CreateTestData {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private HcUserInfoMapper hcUserInfoMapper;
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private HcUserBaseInfoMapper hcUserBaseInfoMapper;
    @Autowired
    private HcUserThirdInfoMapper hcUserThirdInfoMapper;
    @Autowired
    private HcWorkerVolunteerRelationMapper hcWorkerVolunteerRelationMapper;
    @Autowired
    private HcUserRegisterMapper hcUserRegisterMapper;


    @Test
    public void addVolunteer(){
        HcUserRegister hcUserRegister = new HcUserRegister();
        hcUserRegister.setsMobile("17751232735");
        hcUserRegister.setnRole(RoleEnum.VOLUNTEER.getCode());
        hcUserRegister.setnHospitalId(8L);
        hcUserRegister.setsInviteName("admin");
        hcUserRegister.setnInviteType(1);
        hcUserRegister.setsInviteId("000");
        hcUserRegister.setnUserId(103L);
        hcUserRegister.setnWorkerUserId(102L);
        hcUserRegister.setdCreateTime(new Date());
        hcUserRegister.setdUpdateTime(new Date());
        hcUserRegister.setnDelete(0);
        hcUserRegisterMapper.insert(hcUserRegister);

        HcUserInfo hcUserInfo = new HcUserInfo();
        hcUserInfo.setnUserId(103L);
        hcUserInfo.setsLoginName("createData");
        hcUserInfo.setsMobileNumber("17751232735");
        hcUserInfo.setsThdPartId("SZFQW543");
        hcUserInfo.setnStatus(1);
        hcUserInfo.setdCreateTime(new Date());
        hcUserInfo.setdUpdateTime(new Date());
        hcUserInfo.setnHospitalId(8L);
        hcUserInfo.setnRole(RoleEnum.VOLUNTEER.getCode());
        hcUserInfoMapper.insert(hcUserInfo);

        HcUserBaseInfo hcUserBaseInfo = new HcUserBaseInfo();
        hcUserBaseInfo.setnUserId(103L);
        hcUserBaseInfo.setsLoginName(hcUserInfo.getsLoginName());
        hcUserBaseInfo.setsMobileNumber(hcUserInfo.getsMobileNumber());
        hcUserBaseInfo.setsThdPartId(hcUserInfo.getsThdPartId());
        hcUserBaseInfo.setsNickName("贾宝玉三代");
        hcUserBaseInfo.setsRealName("贾政儿子2");
        hcUserBaseInfo.setsIdcardNumber("320556258219");
        hcUserBaseInfo.setnStatus(hcUserInfo.getnStatus());
        hcUserBaseInfo.setsFaceUrl("http://baidu.com");
        hcUserBaseInfo.setdLastLoginTime(new Date());
        hcUserBaseInfo.setnSex(1);
        hcUserBaseInfo.setdCreateTime(new Date());
        hcUserBaseInfo.setdUpdateTime(new Date());
        hcUserBaseInfoMapper.insert(hcUserBaseInfo);

        HcWorkerVolunteerRelation hcWorkerVolunteerRelation = new HcWorkerVolunteerRelation();
        hcWorkerVolunteerRelation.setnWorkerId(102L);
        hcWorkerVolunteerRelation.setnVolunteerId(103L);
        hcWorkerVolunteerRelation.setsVolunteerName("贾政儿子2");
        hcWorkerVolunteerRelation.setnStatus(1);
        hcWorkerVolunteerRelation.setnJoinWay(1);
        hcWorkerVolunteerRelation.setnHospitalId(8L);
        hcWorkerVolunteerRelation.setdCreateTime(new Date());
        hcWorkerVolunteerRelation.setdUpdateTime(new Date());
        hcWorkerVolunteerRelationMapper.insert(hcWorkerVolunteerRelation);


    }


    @Test
    public void addWorker() {
        HcUserRegister hcUserRegister = new HcUserRegister();
        hcUserRegister.setsMobile("17751232734");
        hcUserRegister.setnRole(RoleEnum.COMMUNITY_WORKER.getCode());
        hcUserRegister.setnHospitalId(8L);
        hcUserRegister.setsInviteName("admin");
        hcUserRegister.setnInviteType(1);
        hcUserRegister.setsInviteId("000");
        hcUserRegister.setnUserId(101L);
        hcUserRegister.setdCreateTime(new Date());
        hcUserRegister.setdUpdateTime(new Date());
        hcUserRegister.setnDelete(0);
        hcUserRegisterMapper.insert(hcUserRegister);

        HcUserInfo hcUserInfo = new HcUserInfo();
        hcUserInfo.setnUserId(101L);
        hcUserInfo.setsLoginName("createData");
        hcUserInfo.setsMobileNumber("17751232734");
        hcUserInfo.setsThdPartId("SZFQW543");
        hcUserInfo.setnStatus(1);
        hcUserInfo.setdCreateTime(new Date());
        hcUserInfo.setdUpdateTime(new Date());
        hcUserInfo.setnHospitalId(8L);
        hcUserInfo.setnRole(RoleEnum.COMMUNITY_WORKER.getCode());
        hcUserInfoMapper.insert(hcUserInfo);

        HcUserBaseInfo hcUserBaseInfo = new HcUserBaseInfo();
        hcUserBaseInfo.setnUserId(101L);
        hcUserBaseInfo.setsLoginName(hcUserInfo.getsLoginName());
        hcUserBaseInfo.setsMobileNumber(hcUserInfo.getsMobileNumber());
        hcUserBaseInfo.setsThdPartId(hcUserInfo.getsThdPartId());
        hcUserBaseInfo.setsNickName("贾宝玉二带");
        hcUserBaseInfo.setsRealName("贾政儿子1");
        hcUserBaseInfo.setsIdcardNumber("320556258214、5");
        hcUserBaseInfo.setnStatus(hcUserInfo.getnStatus());
        hcUserBaseInfo.setsFaceUrl("http://baidu.com");
        hcUserBaseInfo.setdLastLoginTime(new Date());
        hcUserBaseInfo.setnSex(1);
        hcUserBaseInfo.setdCreateTime(new Date());
        hcUserBaseInfo.setdUpdateTime(new Date());
        hcUserBaseInfoMapper.insert(hcUserBaseInfo);
    }

    @Test
    public void addWorkerManager() {
        HcUserRegister hcUserRegister = new HcUserRegister();
        hcUserRegister.setsMobile("17751232733");
        hcUserRegister.setnRole(RoleEnum.COMMUNITY_WORKER_MANAGER.getCode());
        hcUserRegister.setsPost("院长");
        hcUserRegister.setnHospitalId(8L);
        hcUserRegister.setsInviteName("admin");
        hcUserRegister.setnInviteType(1);
        hcUserRegister.setsInviteId("000");
        hcUserRegister.setnUserId(100L);
        hcUserRegister.setdCreateTime(new Date());
        hcUserRegister.setdUpdateTime(new Date());
        hcUserRegister.setnDelete(0);
        hcUserRegisterMapper.insert(hcUserRegister);

        HcUserInfo hcUserInfo = new HcUserInfo();
        hcUserInfo.setnUserId(100L);
        hcUserInfo.setsLoginName("createData");
        hcUserInfo.setsMobileNumber("17751232733");
        hcUserInfo.setsThdPartId("SZFQW543");
        hcUserInfo.setnStatus(1);
        hcUserInfo.setdCreateTime(new Date());
        hcUserInfo.setdUpdateTime(new Date());
        hcUserInfo.setnHospitalId(8L);
        hcUserInfo.setnRole(RoleEnum.COMMUNITY_WORKER_MANAGER.getCode());
        hcUserInfo.setsPost("院长");
        hcUserInfoMapper.insert(hcUserInfo);

        HcUserBaseInfo hcUserBaseInfo = new HcUserBaseInfo();
        hcUserBaseInfo.setnUserId(100L);
        hcUserBaseInfo.setsLoginName(hcUserInfo.getsLoginName());
        hcUserBaseInfo.setsMobileNumber(hcUserInfo.getsMobileNumber());
        hcUserBaseInfo.setsThdPartId(hcUserInfo.getsThdPartId());
        hcUserBaseInfo.setsNickName("贾宝玉");
        hcUserBaseInfo.setsRealName("贾政");
        hcUserBaseInfo.setsIdcardNumber("3205562582144");
        hcUserBaseInfo.setnStatus(hcUserInfo.getnStatus());
        hcUserBaseInfo.setsFaceUrl("http://baidu.com");
        hcUserBaseInfo.setdLastLoginTime(new Date());
        hcUserBaseInfo.setnSex(1);
        hcUserBaseInfo.setdCreateTime(new Date());
        hcUserBaseInfo.setdUpdateTime(new Date());
        hcUserBaseInfoMapper.insert(hcUserBaseInfo);


    }

}

