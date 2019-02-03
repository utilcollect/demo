package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class HcUserLoginRecord {
    private Long nId;

    private Long nUserId;

    private Date dLoginTime;

    private String sCmdName;

    private String sPhoneType;

    private String sOsVersion;

    private String sAppVersion;

    private String sPhoneModel;

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

    public Long getnUserId() {
        return nUserId;
    }

    public void setnUserId(Long nUserId) {
        this.nUserId = nUserId;
    }

    public Date getdLoginTime() {
        return dLoginTime;
    }

    public void setdLoginTime(Date dLoginTime) {
        this.dLoginTime = dLoginTime;
    }

    public String getsCmdName() {
        return sCmdName;
    }

    public void setsCmdName(String sCmdName) {
        this.sCmdName = sCmdName == null ? null : sCmdName.trim();
    }

    public String getsPhoneType() {
        return sPhoneType;
    }

    public void setsPhoneType(String sPhoneType) {
        this.sPhoneType = sPhoneType == null ? null : sPhoneType.trim();
    }

    public String getsOsVersion() {
        return sOsVersion;
    }

    public void setsOsVersion(String sOsVersion) {
        this.sOsVersion = sOsVersion == null ? null : sOsVersion.trim();
    }

    public String getsAppVersion() {
        return sAppVersion;
    }

    public void setsAppVersion(String sAppVersion) {
        this.sAppVersion = sAppVersion == null ? null : sAppVersion.trim();
    }

    public String getsPhoneModel() {
        return sPhoneModel;
    }

    public void setsPhoneModel(String sPhoneModel) {
        this.sPhoneModel = sPhoneModel == null ? null : sPhoneModel.trim();
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