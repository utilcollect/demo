package com.gezhiwei.demo.dao.entity;

import java.util.Date;

public class CreditDiagnosisCert {
    private Long nId;

    private Long nFundId;

    private String sDiseases;

    private String sHospitalName;

    private String sProvinceName;

    private String sCityName;

    private String sHospitalAddr;

    private Integer nDiagnose;

    private String sDiagnosisCertPic;

    private String sOtherImages;

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

    public String getsDiseases() {
        return sDiseases;
    }

    public void setsDiseases(String sDiseases) {
        this.sDiseases = sDiseases == null ? null : sDiseases.trim();
    }

    public String getsHospitalName() {
        return sHospitalName;
    }

    public void setsHospitalName(String sHospitalName) {
        this.sHospitalName = sHospitalName == null ? null : sHospitalName.trim();
    }

    public String getsProvinceName() {
        return sProvinceName;
    }

    public void setsProvinceName(String sProvinceName) {
        this.sProvinceName = sProvinceName == null ? null : sProvinceName.trim();
    }

    public String getsCityName() {
        return sCityName;
    }

    public void setsCityName(String sCityName) {
        this.sCityName = sCityName == null ? null : sCityName.trim();
    }

    public String getsHospitalAddr() {
        return sHospitalAddr;
    }

    public void setsHospitalAddr(String sHospitalAddr) {
        this.sHospitalAddr = sHospitalAddr == null ? null : sHospitalAddr.trim();
    }

    public Integer getnDiagnose() {
        return nDiagnose;
    }

    public void setnDiagnose(Integer nDiagnose) {
        this.nDiagnose = nDiagnose;
    }

    public String getsDiagnosisCertPic() {
        return sDiagnosisCertPic;
    }

    public void setsDiagnosisCertPic(String sDiagnosisCertPic) {
        this.sDiagnosisCertPic = sDiagnosisCertPic == null ? null : sDiagnosisCertPic.trim();
    }

    public String getsOtherImages() {
        return sOtherImages;
    }

    public void setsOtherImages(String sOtherImages) {
        this.sOtherImages = sOtherImages == null ? null : sOtherImages.trim();
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