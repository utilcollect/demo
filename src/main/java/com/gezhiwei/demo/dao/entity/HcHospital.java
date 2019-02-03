package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class HcHospital {
    private Long nId;

    private String sCode;

    private String sLogo;

    private Integer nLevel;

    private String sName;

    private String sPhone;

    private Long nProvinceId;

    private String sProvinceName;

    private Long nCityId;

    private String sCityName;

    private Long nAreaId;

    private String sAreaName;

    private String sAddress;

    private String sLicence;

    private String sComment;

    private Integer nStatus;

    private String sReason;

    private Date dCreateTime;

    private String sCreatedBy;

    private Date dUpdateTime;

    private String sUpdatedBy;

    private Date dApproveTime;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode == null ? null : sCode.trim();
    }

    public String getsLogo() {
        return sLogo;
    }

    public void setsLogo(String sLogo) {
        this.sLogo = sLogo == null ? null : sLogo.trim();
    }

    public Integer getnLevel() {
        return nLevel;
    }

    public void setnLevel(Integer nLevel) {
        this.nLevel = nLevel;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone == null ? null : sPhone.trim();
    }

    public Long getnProvinceId() {
        return nProvinceId;
    }

    public void setnProvinceId(Long nProvinceId) {
        this.nProvinceId = nProvinceId;
    }

    public String getsProvinceName() {
        return sProvinceName;
    }

    public void setsProvinceName(String sProvinceName) {
        this.sProvinceName = sProvinceName == null ? null : sProvinceName.trim();
    }

    public Long getnCityId() {
        return nCityId;
    }

    public void setnCityId(Long nCityId) {
        this.nCityId = nCityId;
    }

    public String getsCityName() {
        return sCityName;
    }

    public void setsCityName(String sCityName) {
        this.sCityName = sCityName == null ? null : sCityName.trim();
    }

    public Long getnAreaId() {
        return nAreaId;
    }

    public void setnAreaId(Long nAreaId) {
        this.nAreaId = nAreaId;
    }

    public String getsAreaName() {
        return sAreaName;
    }

    public void setsAreaName(String sAreaName) {
        this.sAreaName = sAreaName == null ? null : sAreaName.trim();
    }

    public String getsAddress() {
        return sAddress;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress == null ? null : sAddress.trim();
    }

    public String getsLicence() {
        return sLicence;
    }

    public void setsLicence(String sLicence) {
        this.sLicence = sLicence == null ? null : sLicence.trim();
    }

    public String getsComment() {
        return sComment;
    }

    public void setsComment(String sComment) {
        this.sComment = sComment == null ? null : sComment.trim();
    }

    public Integer getnStatus() {
        return nStatus;
    }

    public void setnStatus(Integer nStatus) {
        this.nStatus = nStatus;
    }

    public String getsReason() {
        return sReason;
    }

    public void setsReason(String sReason) {
        this.sReason = sReason == null ? null : sReason.trim();
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

    public Date getdApproveTime() {
        return dApproveTime;
    }

    public void setdApproveTime(Date dApproveTime) {
        this.dApproveTime = dApproveTime;
    }
}