package com.gezhiwei.demo.vo;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by Wayne on 2019/1/15.
 */
public class DdhzRedPacketDetailDTO {

    //红包ID
    private Long redPacketId;
    //用户昵称
    private String userName;
    //头像
    private String face;
    //是否新注册用户:0-否,1-是
    private Integer newUser;
    //是否锦鲤:0-否,1-是
    private Integer vipHealth;
    //是否激活
    private Integer status;
    //创建时间
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date createTime;

    public Long getRedPacketId() {
        return redPacketId;
    }

    public void setRedPacketId(Long redPacketId) {
        this.redPacketId = redPacketId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public Integer getNewUser() {
        return newUser;
    }

    public void setNewUser(Integer newUser) {
        this.newUser = newUser;
    }

    public Integer getVipHealth() {
        return vipHealth;
    }

    public void setVipHealth(Integer vipHealth) {
        this.vipHealth = vipHealth;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
