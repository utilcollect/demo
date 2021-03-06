package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class CreditPayeeDirectCert {
    private Long nFundId;

    private String sRealName;

    private String sIdCardNo;

    private String sMobile;

    private String sBankCode;

    private String sBankName;

    private String sDepositBank;

    private String sBankAccount;

    private String sIdCardImg;

    private String sHouseHoldImg;

    private String sHouseHoldPatientImg;

    private String sHouseHoldPayeeImg;

    private String sOtherRelationImg;

    private Date dCreateTime;

    private String sCreatedBy;

    private Date dUpdateTime;

    private String sUpdatedBy;

    public Long getnFundId() {
        return nFundId;
    }

    public void setnFundId(Long nFundId) {
        this.nFundId = nFundId;
    }

    public String getsRealName() {
        return sRealName;
    }

    public void setsRealName(String sRealName) {
        this.sRealName = sRealName == null ? null : sRealName.trim();
    }

    public String getsIdCardNo() {
        return sIdCardNo;
    }

    public void setsIdCardNo(String sIdCardNo) {
        this.sIdCardNo = sIdCardNo == null ? null : sIdCardNo.trim();
    }

    public String getsMobile() {
        return sMobile;
    }

    public void setsMobile(String sMobile) {
        this.sMobile = sMobile == null ? null : sMobile.trim();
    }

    public String getsBankCode() {
        return sBankCode;
    }

    public void setsBankCode(String sBankCode) {
        this.sBankCode = sBankCode == null ? null : sBankCode.trim();
    }

    public String getsBankName() {
        return sBankName;
    }

    public void setsBankName(String sBankName) {
        this.sBankName = sBankName == null ? null : sBankName.trim();
    }

    public String getsDepositBank() {
        return sDepositBank;
    }

    public void setsDepositBank(String sDepositBank) {
        this.sDepositBank = sDepositBank == null ? null : sDepositBank.trim();
    }

    public String getsBankAccount() {
        return sBankAccount;
    }

    public void setsBankAccount(String sBankAccount) {
        this.sBankAccount = sBankAccount == null ? null : sBankAccount.trim();
    }

    public String getsIdCardImg() {
        return sIdCardImg;
    }

    public void setsIdCardImg(String sIdCardImg) {
        this.sIdCardImg = sIdCardImg == null ? null : sIdCardImg.trim();
    }

    public String getsHouseHoldImg() {
        return sHouseHoldImg;
    }

    public void setsHouseHoldImg(String sHouseHoldImg) {
        this.sHouseHoldImg = sHouseHoldImg == null ? null : sHouseHoldImg.trim();
    }

    public String getsHouseHoldPatientImg() {
        return sHouseHoldPatientImg;
    }

    public void setsHouseHoldPatientImg(String sHouseHoldPatientImg) {
        this.sHouseHoldPatientImg = sHouseHoldPatientImg == null ? null : sHouseHoldPatientImg.trim();
    }

    public String getsHouseHoldPayeeImg() {
        return sHouseHoldPayeeImg;
    }

    public void setsHouseHoldPayeeImg(String sHouseHoldPayeeImg) {
        this.sHouseHoldPayeeImg = sHouseHoldPayeeImg == null ? null : sHouseHoldPayeeImg.trim();
    }

    public String getsOtherRelationImg() {
        return sOtherRelationImg;
    }

    public void setsOtherRelationImg(String sOtherRelationImg) {
        this.sOtherRelationImg = sOtherRelationImg == null ? null : sOtherRelationImg.trim();
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