package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class HcArea {
    private Long nAreaId;

    private String sAreaCode;

    private String sAreaName;

    private String sAreaNameAbbr;

    private Integer nLevel;

    private String sCityCode;

    private String sCenter;

    private Long nParentId;

    private Date dCreateTime;

    private String sCreatedBy;

    private Date dUpdateTime;

    private String sUpdatedBy;

    public Long getnAreaId() {
        return nAreaId;
    }

    public void setnAreaId(Long nAreaId) {
        this.nAreaId = nAreaId;
    }

    public String getsAreaCode() {
        return sAreaCode;
    }

    public void setsAreaCode(String sAreaCode) {
        this.sAreaCode = sAreaCode == null ? null : sAreaCode.trim();
    }

    public String getsAreaName() {
        return sAreaName;
    }

    public void setsAreaName(String sAreaName) {
        this.sAreaName = sAreaName == null ? null : sAreaName.trim();
    }

    public String getsAreaNameAbbr() {
        return sAreaNameAbbr;
    }

    public void setsAreaNameAbbr(String sAreaNameAbbr) {
        this.sAreaNameAbbr = sAreaNameAbbr == null ? null : sAreaNameAbbr.trim();
    }

    public Integer getnLevel() {
        return nLevel;
    }

    public void setnLevel(Integer nLevel) {
        this.nLevel = nLevel;
    }

    public String getsCityCode() {
        return sCityCode;
    }

    public void setsCityCode(String sCityCode) {
        this.sCityCode = sCityCode == null ? null : sCityCode.trim();
    }

    public String getsCenter() {
        return sCenter;
    }

    public void setsCenter(String sCenter) {
        this.sCenter = sCenter == null ? null : sCenter.trim();
    }

    public Long getnParentId() {
        return nParentId;
    }

    public void setnParentId(Long nParentId) {
        this.nParentId = nParentId;
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