package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class HcUserThirdInfo {
    private Long nId;

    private Long nUserId;

    private String sThirdId;

    private String sThirdName;

    private String sRegisterType;

    private Integer nIsAppAccount;

    private Date dRegisterTime;

    private Date dCreateTime;

    private String sCreatedBy;

    private Date dUpdateTime;

    private String sUpdatedBy;

    private String sSysCode;

    private String sThirdGroupId;

    private Integer nThdPartConcern;

    private String sChannelCategory;

    private String sChannelSubCategory;

    private Integer sChannelType;

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

    public String getsThirdId() {
        return sThirdId;
    }

    public void setsThirdId(String sThirdId) {
        this.sThirdId = sThirdId == null ? null : sThirdId.trim();
    }

    public String getsThirdName() {
        return sThirdName;
    }

    public void setsThirdName(String sThirdName) {
        this.sThirdName = sThirdName == null ? null : sThirdName.trim();
    }

    public String getsRegisterType() {
        return sRegisterType;
    }

    public void setsRegisterType(String sRegisterType) {
        this.sRegisterType = sRegisterType == null ? null : sRegisterType.trim();
    }

    public Integer getnIsAppAccount() {
        return nIsAppAccount;
    }

    public void setnIsAppAccount(Integer nIsAppAccount) {
        this.nIsAppAccount = nIsAppAccount;
    }

    public Date getdRegisterTime() {
        return dRegisterTime;
    }

    public void setdRegisterTime(Date dRegisterTime) {
        this.dRegisterTime = dRegisterTime;
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

    public String getsSysCode() {
        return sSysCode;
    }

    public void setsSysCode(String sSysCode) {
        this.sSysCode = sSysCode == null ? null : sSysCode.trim();
    }

    public String getsThirdGroupId() {
        return sThirdGroupId;
    }

    public void setsThirdGroupId(String sThirdGroupId) {
        this.sThirdGroupId = sThirdGroupId == null ? null : sThirdGroupId.trim();
    }

    public Integer getnThdPartConcern() {
        return nThdPartConcern;
    }

    public void setnThdPartConcern(Integer nThdPartConcern) {
        this.nThdPartConcern = nThdPartConcern;
    }

    public String getsChannelCategory() {
        return sChannelCategory;
    }

    public void setsChannelCategory(String sChannelCategory) {
        this.sChannelCategory = sChannelCategory == null ? null : sChannelCategory.trim();
    }

    public String getsChannelSubCategory() {
        return sChannelSubCategory;
    }

    public void setsChannelSubCategory(String sChannelSubCategory) {
        this.sChannelSubCategory = sChannelSubCategory == null ? null : sChannelSubCategory.trim();
    }

    public Integer getsChannelType() {
        return sChannelType;
    }

    public void setsChannelType(Integer sChannelType) {
        this.sChannelType = sChannelType;
    }
}