package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class HcFundStatusTime {
    private Integer nId;

    private Integer nFundId;

    private Date dWaitRegistryStartTime;

    private Integer nUrgencyRegistryStatus;

    private Date dUrgencyRegistryTime;

    private Date dWaitForwardStartTime;

    private Integer nUrgencyForwardStatus;

    private Date dUrgencyForwardTime;

    private Date dWaitVerifyStartTime;

    private Integer nUrgencyVerifyStatus;

    private Date dUrgencyVerifyTime;

    private Date dCreateTime;

    private Date dUpdateTime;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Integer getnFundId() {
        return nFundId;
    }

    public void setnFundId(Integer nFundId) {
        this.nFundId = nFundId;
    }

    public Date getdWaitRegistryStartTime() {
        return dWaitRegistryStartTime;
    }

    public void setdWaitRegistryStartTime(Date dWaitRegistryStartTime) {
        this.dWaitRegistryStartTime = dWaitRegistryStartTime;
    }

    public Integer getnUrgencyRegistryStatus() {
        return nUrgencyRegistryStatus;
    }

    public void setnUrgencyRegistryStatus(Integer nUrgencyRegistryStatus) {
        this.nUrgencyRegistryStatus = nUrgencyRegistryStatus;
    }

    public Date getdUrgencyRegistryTime() {
        return dUrgencyRegistryTime;
    }

    public void setdUrgencyRegistryTime(Date dUrgencyRegistryTime) {
        this.dUrgencyRegistryTime = dUrgencyRegistryTime;
    }

    public Date getdWaitForwardStartTime() {
        return dWaitForwardStartTime;
    }

    public void setdWaitForwardStartTime(Date dWaitForwardStartTime) {
        this.dWaitForwardStartTime = dWaitForwardStartTime;
    }

    public Integer getnUrgencyForwardStatus() {
        return nUrgencyForwardStatus;
    }

    public void setnUrgencyForwardStatus(Integer nUrgencyForwardStatus) {
        this.nUrgencyForwardStatus = nUrgencyForwardStatus;
    }

    public Date getdUrgencyForwardTime() {
        return dUrgencyForwardTime;
    }

    public void setdUrgencyForwardTime(Date dUrgencyForwardTime) {
        this.dUrgencyForwardTime = dUrgencyForwardTime;
    }

    public Date getdWaitVerifyStartTime() {
        return dWaitVerifyStartTime;
    }

    public void setdWaitVerifyStartTime(Date dWaitVerifyStartTime) {
        this.dWaitVerifyStartTime = dWaitVerifyStartTime;
    }

    public Integer getnUrgencyVerifyStatus() {
        return nUrgencyVerifyStatus;
    }

    public void setnUrgencyVerifyStatus(Integer nUrgencyVerifyStatus) {
        this.nUrgencyVerifyStatus = nUrgencyVerifyStatus;
    }

    public Date getdUrgencyVerifyTime() {
        return dUrgencyVerifyTime;
    }

    public void setdUrgencyVerifyTime(Date dUrgencyVerifyTime) {
        this.dUrgencyVerifyTime = dUrgencyVerifyTime;
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