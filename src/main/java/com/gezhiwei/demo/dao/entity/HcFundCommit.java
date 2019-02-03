package com.gezhiwei.demo.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class HcFundCommit {
    private Long nId;

    private Long nFundId;

    private String sForWho;

    private String sPatientRealName;

    private String sDiseasesName;

    private Integer nPatientAge;

    private String sPatientAddress;

    private Date dFallIllDate;

    private String sHospitalNameNow;

    private BigDecimal nHadPayMoney;

    private String sCommitNickName;

    private String sCommitRealName;

    private Integer nCompleteStatus;

    private Integer nFundType;

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

    public Long getnFundId() {
        return nFundId;
    }

    public void setnFundId(Long nFundId) {
        this.nFundId = nFundId;
    }

    public String getsForWho() {
        return sForWho;
    }

    public void setsForWho(String sForWho) {
        this.sForWho = sForWho == null ? null : sForWho.trim();
    }

    public String getsPatientRealName() {
        return sPatientRealName;
    }

    public void setsPatientRealName(String sPatientRealName) {
        this.sPatientRealName = sPatientRealName == null ? null : sPatientRealName.trim();
    }

    public String getsDiseasesName() {
        return sDiseasesName;
    }

    public void setsDiseasesName(String sDiseasesName) {
        this.sDiseasesName = sDiseasesName == null ? null : sDiseasesName.trim();
    }

    public Integer getnPatientAge() {
        return nPatientAge;
    }

    public void setnPatientAge(Integer nPatientAge) {
        this.nPatientAge = nPatientAge;
    }

    public String getsPatientAddress() {
        return sPatientAddress;
    }

    public void setsPatientAddress(String sPatientAddress) {
        this.sPatientAddress = sPatientAddress == null ? null : sPatientAddress.trim();
    }

    public Date getdFallIllDate() {
        return dFallIllDate;
    }

    public void setdFallIllDate(Date dFallIllDate) {
        this.dFallIllDate = dFallIllDate;
    }

    public String getsHospitalNameNow() {
        return sHospitalNameNow;
    }

    public void setsHospitalNameNow(String sHospitalNameNow) {
        this.sHospitalNameNow = sHospitalNameNow == null ? null : sHospitalNameNow.trim();
    }

    public BigDecimal getnHadPayMoney() {
        return nHadPayMoney;
    }

    public void setnHadPayMoney(BigDecimal nHadPayMoney) {
        this.nHadPayMoney = nHadPayMoney;
    }

    public String getsCommitNickName() {
        return sCommitNickName;
    }

    public void setsCommitNickName(String sCommitNickName) {
        this.sCommitNickName = sCommitNickName == null ? null : sCommitNickName.trim();
    }

    public String getsCommitRealName() {
        return sCommitRealName;
    }

    public void setsCommitRealName(String sCommitRealName) {
        this.sCommitRealName = sCommitRealName == null ? null : sCommitRealName.trim();
    }

    public Integer getnCompleteStatus() {
        return nCompleteStatus;
    }

    public void setnCompleteStatus(Integer nCompleteStatus) {
        this.nCompleteStatus = nCompleteStatus;
    }

    public Integer getnFundType() {
        return nFundType;
    }

    public void setnFundType(Integer nFundType) {
        this.nFundType = nFundType;
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