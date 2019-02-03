package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class HcUserRegister {
    private Long nId;

    private String sMobile;

    private Integer nRole;

    private String sPost;

    private Long nHospitalId;

    private String sInviteName;

    private Integer nInviteType;

    private String sInviteId;

    private Long nWorkerUserId;

    private Long nUserId;

    private Integer nDelete;

    private Date dCreateTime;

    private String sCreatedBy;

    private Date dUpdateTime;

    private String sUpdatedBy;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getsMobile() {
        return sMobile;
    }

    public void setsMobile(String sMobile) {
        this.sMobile = sMobile == null ? null : sMobile.trim();
    }

    public Integer getnRole() {
        return nRole;
    }

    public void setnRole(Integer nRole) {
        this.nRole = nRole;
    }

    public String getsPost() {
        return sPost;
    }

    public void setsPost(String sPost) {
        this.sPost = sPost == null ? null : sPost.trim();
    }

    public Long getnHospitalId() {
        return nHospitalId;
    }

    public void setnHospitalId(Long nHospitalId) {
        this.nHospitalId = nHospitalId;
    }

    public String getsInviteName() {
        return sInviteName;
    }

    public void setsInviteName(String sInviteName) {
        this.sInviteName = sInviteName == null ? null : sInviteName.trim();
    }

    public Integer getnInviteType() {
        return nInviteType;
    }

    public void setnInviteType(Integer nInviteType) {
        this.nInviteType = nInviteType;
    }

    public String getsInviteId() {
        return sInviteId;
    }

    public void setsInviteId(String sInviteId) {
        this.sInviteId = sInviteId == null ? null : sInviteId.trim();
    }

    public Long getnWorkerUserId() {
        return nWorkerUserId;
    }

    public void setnWorkerUserId(Long nWorkerUserId) {
        this.nWorkerUserId = nWorkerUserId;
    }

    public Long getnUserId() {
        return nUserId;
    }

    public void setnUserId(Long nUserId) {
        this.nUserId = nUserId;
    }

    public Integer getnDelete() {
        return nDelete;
    }

    public void setnDelete(Integer nDelete) {
        this.nDelete = nDelete;
    }

    public Date getdCreateTime() {
        return dCreateTime;
    }

    public void setdCreateTime(Date dCreateTime) {
        this.dCreateTime = dCreateTime;
    }

    public String getsCreatedBy() {
        return sCreatedBy;
    }

    public void setsCreatedBy(String sCreatedBy) {
        this.sCreatedBy = sCreatedBy == null ? null : sCreatedBy.trim();
    }

    public Date getdUpdateTime() {
        return dUpdateTime;
    }

    public void setdUpdateTime(Date dUpdateTime) {
        this.dUpdateTime = dUpdateTime;
    }

    public String getsUpdatedBy() {
        return sUpdatedBy;
    }

    public void setsUpdatedBy(String sUpdatedBy) {
        this.sUpdatedBy = sUpdatedBy == null ? null : sUpdatedBy.trim();
    }
}