package com.gezhiwei.demo.vo.back;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @ClassName: UserPacketGrabDetailVo
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/1/18 9:50
 * @modified By:
 */
public class UserPacketGrabDetailVo {

    private Long userId;

    private String userRealName;

    private String mobile;

    /**
     * 领取时间
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 老用户 新用户 0否1是
     */
    private Integer userStatus = 0;

    /**
     *  1 激活 0 未激活
     */
    private Integer userPlanStatus =1;

    private Long sourceUserId;

    private String sourceUserName;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date redCreateTime;

    public Long getUserId() {
        return userId;
    }

    public UserPacketGrabDetailVo setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public UserPacketGrabDetailVo setUserRealName(String userRealName) {
        this.userRealName = userRealName;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public UserPacketGrabDetailVo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserPacketGrabDetailVo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public UserPacketGrabDetailVo setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
        return this;
    }

    public Integer getUserPlanStatus() {
        return userPlanStatus;
    }

    public UserPacketGrabDetailVo setUserPlanStatus(Integer userPlanStatus) {
        this.userPlanStatus = userPlanStatus;
        return this;
    }

    public Long getSourceUserId() {
        return sourceUserId;
    }

    public UserPacketGrabDetailVo setSourceUserId(Long sourceUserId) {
        this.sourceUserId = sourceUserId;
        return this;
    }

    public String getSourceUserName() {
        return sourceUserName;
    }

    public UserPacketGrabDetailVo setSourceUserName(String sourceUserName) {
        this.sourceUserName = sourceUserName;
        return this;
    }

    public Date getRedCreateTime() {
        return redCreateTime;
    }

    public UserPacketGrabDetailVo setRedCreateTime(Date redCreateTime) {
        this.redCreateTime = redCreateTime;
        return this;
    }
}
