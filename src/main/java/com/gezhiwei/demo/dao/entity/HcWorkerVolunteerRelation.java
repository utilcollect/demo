package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class HcWorkerVolunteerRelation {
    private Long nId;

    private Long nWorkerId;

    private Long nVolunteerId;

    private String sVolunteerName;

    private Integer nStatus;

    private Integer nJoinWay;

    private Long nHospitalId;

    private Date dLeftTime;

    private Date dCreateTime;

    private Date dUpdateTime;

    private String sCreatedBy;

    private String sUpdatedBy;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public Long getnWorkerId() {
        return nWorkerId;
    }

    public void setnWorkerId(Long nWorkerId) {
        this.nWorkerId = nWorkerId;
    }

    public Long getnVolunteerId() {
        return nVolunteerId;
    }

    public void setnVolunteerId(Long nVolunteerId) {
        this.nVolunteerId = nVolunteerId;
    }

    public String getsVolunteerName() {
        return sVolunteerName;
    }

    public void setsVolunteerName(String sVolunteerName) {
        this.sVolunteerName = sVolunteerName == null ? null : sVolunteerName.trim();
    }

    public Integer getnStatus() {
        return nStatus;
    }

    public void setnStatus(Integer nStatus) {
        this.nStatus = nStatus;
    }

    public Integer getnJoinWay() {
        return nJoinWay;
    }

    public void setnJoinWay(Integer nJoinWay) {
        this.nJoinWay = nJoinWay;
    }

    public Long getnHospitalId() {
        return nHospitalId;
    }

    public void setnHospitalId(Long nHospitalId) {
        this.nHospitalId = nHospitalId;
    }

    public Date getdLeftTime() {
        return dLeftTime;
    }

    public void setdLeftTime(Date dLeftTime) {
        this.dLeftTime = dLeftTime;
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
}