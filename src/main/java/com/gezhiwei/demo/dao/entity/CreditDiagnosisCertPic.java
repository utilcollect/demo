package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class CreditDiagnosisCertPic {
    private Long nId;

    private Long nFundId;

    private Long nDiagnosisCertId;

    private Integer nPhotoType;

    private String sPath;

    private Integer nStatus;

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

    public Long getnDiagnosisCertId() {
        return nDiagnosisCertId;
    }

    public void setnDiagnosisCertId(Long nDiagnosisCertId) {
        this.nDiagnosisCertId = nDiagnosisCertId;
    }

    public Integer getnPhotoType() {
        return nPhotoType;
    }

    public void setnPhotoType(Integer nPhotoType) {
        this.nPhotoType = nPhotoType;
    }

    public String getsPath() {
        return sPath;
    }

    public void setsPath(String sPath) {
        this.sPath = sPath == null ? null : sPath.trim();
    }

    public Integer getnStatus() {
        return nStatus;
    }

    public void setnStatus(Integer nStatus) {
        this.nStatus = nStatus;
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