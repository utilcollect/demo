package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class CreditPayeeOrgCert {
    private Long nFundId;

    private String sOrgName;

    private String sOrgMobile;

    private String sBankCode;

    private String sBankName;

    private String sDepositBank;

    private String sBankAccount;

    private String sQuailifyImg;

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

    public String getsOrgName() {
        return sOrgName;
    }

    public void setsOrgName(String sOrgName) {
        this.sOrgName = sOrgName == null ? null : sOrgName.trim();
    }

    public String getsOrgMobile() {
        return sOrgMobile;
    }

    public void setsOrgMobile(String sOrgMobile) {
        this.sOrgMobile = sOrgMobile == null ? null : sOrgMobile.trim();
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

    public String getsQuailifyImg() {
        return sQuailifyImg;
    }

    public void setsQuailifyImg(String sQuailifyImg) {
        this.sQuailifyImg = sQuailifyImg == null ? null : sQuailifyImg.trim();
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