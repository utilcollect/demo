package com.gezhiwei.demo.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class HcFundReport {
    private Long nFundId;

    private Date dReportTime;

    private Date dFundCreateTime;

    private Integer nForwardCount;

    private BigDecimal nAmount;

    private String sCreatedBy;

    private String sUpdatedBy;

    private Date dCreateTime;

    private Date dUpdateTime;

    public Long getnFundId() {
        return nFundId;
    }

    public void setnFundId(Long nFundId) {
        this.nFundId = nFundId;
    }

    public Date getdReportTime() {
        return dReportTime;
    }

    public void setdReportTime(Date dReportTime) {
        this.dReportTime = dReportTime;
    }

    public Date getdFundCreateTime() {
        return dFundCreateTime;
    }

    public void setdFundCreateTime(Date dFundCreateTime) {
        this.dFundCreateTime = dFundCreateTime;
    }

    public Integer getnForwardCount() {
        return nForwardCount;
    }

    public void setnForwardCount(Integer nForwardCount) {
        this.nForwardCount = nForwardCount;
    }

    public BigDecimal getnAmount() {
        return nAmount;
    }

    public void setnAmount(BigDecimal nAmount) {
        this.nAmount = nAmount;
    }

    public String getsCreatedBy() {
        return sCreatedBy;
    }

    public void setsCreatedBy(String sCreatedBy) {
        this.sCreatedBy = sCreatedBy == null ? null : sCreatedBy.trim();
    }

    public String getsUpdatedBy() {
        return sUpdatedBy;
    }

    public void setsUpdatedBy(String sUpdatedBy) {
        this.sUpdatedBy = sUpdatedBy == null ? null : sUpdatedBy.trim();
    }

    public Date getdCreateTime() {
        return dCreateTime;
    }

    public void setdCreateTime(Date dCreateTime) {
        this.dCreateTime = dCreateTime;
    }

    public Date getdUpdateTime() {
        return dUpdateTime;
    }

    public void setdUpdateTime(Date dUpdateTime) {
        this.dUpdateTime = dUpdateTime;
    }
}