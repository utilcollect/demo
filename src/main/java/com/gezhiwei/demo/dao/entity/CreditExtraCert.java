package com.gezhiwei.demo.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class CreditExtraCert {
    private Long nId;

    private Long nFundId;

    private Integer nHouseNumber;

    private BigDecimal nHouseTotalValue;

    private Integer nHouseHandleStatus;

    private Integer nCarNumber;

    private BigDecimal nCarTotalValue;

    private Integer nCarHandleStatus;

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

    public Integer getnHouseNumber() {
        return nHouseNumber;
    }

    public void setnHouseNumber(Integer nHouseNumber) {
        this.nHouseNumber = nHouseNumber;
    }

    public BigDecimal getnHouseTotalValue() {
        return nHouseTotalValue;
    }

    public void setnHouseTotalValue(BigDecimal nHouseTotalValue) {
        this.nHouseTotalValue = nHouseTotalValue;
    }

    public Integer getnHouseHandleStatus() {
        return nHouseHandleStatus;
    }

    public void setnHouseHandleStatus(Integer nHouseHandleStatus) {
        this.nHouseHandleStatus = nHouseHandleStatus;
    }

    public Integer getnCarNumber() {
        return nCarNumber;
    }

    public void setnCarNumber(Integer nCarNumber) {
        this.nCarNumber = nCarNumber;
    }

    public BigDecimal getnCarTotalValue() {
        return nCarTotalValue;
    }

    public void setnCarTotalValue(BigDecimal nCarTotalValue) {
        this.nCarTotalValue = nCarTotalValue;
    }

    public Integer getnCarHandleStatus() {
        return nCarHandleStatus;
    }

    public void setnCarHandleStatus(Integer nCarHandleStatus) {
        this.nCarHandleStatus = nCarHandleStatus;
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