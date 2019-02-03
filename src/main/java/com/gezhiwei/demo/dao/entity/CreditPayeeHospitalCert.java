package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class CreditPayeeHospitalCert {
    private Long nFundId;

    private String sHosptialNo;

    private String sDepartNo;

    private String sBedNo;

    private String sBankAccountName;

    private String sBankCode;

    private String sBankName;

    private String sDepositBank;

    private String sBankAccount;

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

    public String getsHosptialNo() {
        return sHosptialNo;
    }

    public void setsHosptialNo(String sHosptialNo) {
        this.sHosptialNo = sHosptialNo == null ? null : sHosptialNo.trim();
    }

    public String getsDepartNo() {
        return sDepartNo;
    }

    public void setsDepartNo(String sDepartNo) {
        this.sDepartNo = sDepartNo == null ? null : sDepartNo.trim();
    }

    public String getsBedNo() {
        return sBedNo;
    }

    public void setsBedNo(String sBedNo) {
        this.sBedNo = sBedNo == null ? null : sBedNo.trim();
    }

    public String getsBankAccountName() {
        return sBankAccountName;
    }

    public void setsBankAccountName(String sBankAccountName) {
        this.sBankAccountName = sBankAccountName == null ? null : sBankAccountName.trim();
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