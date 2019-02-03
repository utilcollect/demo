package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class CreditPatientCert {
    private Long nId;

    private Long nFundId;

    private String sRealName;

    private Integer nCardType;

    private String sIdCardNo;

    private String sPatientCardPhoto;

    private String sIdCardFront;

    private String sIdCardBack;

    private Integer nPayMedicalInsurance;

    private Integer nBuyMajorIllnessInsurance;

    private Integer nCompleteStatus;

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

    public String getsRealName() {
        return sRealName;
    }

    public void setsRealName(String sRealName) {
        this.sRealName = sRealName == null ? null : sRealName.trim();
    }

    public Integer getnCardType() {
        return nCardType;
    }

    public void setnCardType(Integer nCardType) {
        this.nCardType = nCardType;
    }

    public String getsIdCardNo() {
        return sIdCardNo;
    }

    public void setsIdCardNo(String sIdCardNo) {
        this.sIdCardNo = sIdCardNo == null ? null : sIdCardNo.trim();
    }

    public String getsPatientCardPhoto() {
        return sPatientCardPhoto;
    }

    public void setsPatientCardPhoto(String sPatientCardPhoto) {
        this.sPatientCardPhoto = sPatientCardPhoto == null ? null : sPatientCardPhoto.trim();
    }

    public String getsIdCardFront() {
        return sIdCardFront;
    }

    public void setsIdCardFront(String sIdCardFront) {
        this.sIdCardFront = sIdCardFront == null ? null : sIdCardFront.trim();
    }

    public String getsIdCardBack() {
        return sIdCardBack;
    }

    public void setsIdCardBack(String sIdCardBack) {
        this.sIdCardBack = sIdCardBack == null ? null : sIdCardBack.trim();
    }

    public Integer getnPayMedicalInsurance() {
        return nPayMedicalInsurance;
    }

    public void setnPayMedicalInsurance(Integer nPayMedicalInsurance) {
        this.nPayMedicalInsurance = nPayMedicalInsurance;
    }

    public Integer getnBuyMajorIllnessInsurance() {
        return nBuyMajorIllnessInsurance;
    }

    public void setnBuyMajorIllnessInsurance(Integer nBuyMajorIllnessInsurance) {
        this.nBuyMajorIllnessInsurance = nBuyMajorIllnessInsurance;
    }

    public Integer getnCompleteStatus() {
        return nCompleteStatus;
    }

    public void setnCompleteStatus(Integer nCompleteStatus) {
        this.nCompleteStatus = nCompleteStatus;
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