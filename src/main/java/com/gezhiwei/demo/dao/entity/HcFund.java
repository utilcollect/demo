package com.gezhiwei.demo.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class HcFund {
    private Long nId;

    private String sUuid;

    private Long nWorkerId;

    private Long nHospitalId;

    private Long nUserId;

    private String sNickName;

    private String sFaceUrl;

    private String sMobileNumber;

    private String sMobileNumberPatient;

    private String sMobileNumberDirect;

    private BigDecimal nTargetMoney;

    private String sTitle;

    private BigDecimal nSumMoney;

    private Long nNumberOfDonations;

    private BigDecimal nWithdrawMoney;

    private Date dExpireTime;

    private Date dObjectOverTime;

    private Long nForwardNumber;

    private Long nUploadNumber;

    private Integer nFirstDonationTag;

    private Integer sChannelType;

    private String sChannelCategory;

    private String sChannelSubCategory;

    private Date dCreateTime;

    private Date dSubmitTime;

    private Date dLaunchTime;

    private Date dVerifyTime;

    private String sCreatedBy;

    private Date dUpdateTime;

    private String sUpdatedBy;

    private String sStarRemark;

    private Integer nStarId;

    private String sStarCreatedBy;

    private Date dStarUpdateTime;

    private Integer nCompleteStatus;

    private Integer nFundStatus;

    private String sVolunteerRemark;

    private String sFailReason;

    private String sLaunchFailReason;

    private Integer nDelete;

    public Long getnId() {
        return nId;
    }

    public void setnId(Long nId) {
        this.nId = nId;
    }

    public String getsUuid() {
        return sUuid;
    }

    public void setsUuid(String sUuid) {
        this.sUuid = sUuid == null ? null : sUuid.trim();
    }

    public Long getnWorkerId() {
        return nWorkerId;
    }

    public void setnWorkerId(Long nWorkerId) {
        this.nWorkerId = nWorkerId;
    }

    public Long getnHospitalId() {
        return nHospitalId;
    }

    public void setnHospitalId(Long nHospitalId) {
        this.nHospitalId = nHospitalId;
    }

    public Long getnUserId() {
        return nUserId;
    }

    public void setnUserId(Long nUserId) {
        this.nUserId = nUserId;
    }

    public String getsNickName() {
        return sNickName;
    }

    public void setsNickName(String sNickName) {
        this.sNickName = sNickName == null ? null : sNickName.trim();
    }

    public String getsFaceUrl() {
        return sFaceUrl;
    }

    public void setsFaceUrl(String sFaceUrl) {
        this.sFaceUrl = sFaceUrl == null ? null : sFaceUrl.trim();
    }

    public String getsMobileNumber() {
        return sMobileNumber;
    }

    public void setsMobileNumber(String sMobileNumber) {
        this.sMobileNumber = sMobileNumber == null ? null : sMobileNumber.trim();
    }

    public String getsMobileNumberPatient() {
        return sMobileNumberPatient;
    }

    public void setsMobileNumberPatient(String sMobileNumberPatient) {
        this.sMobileNumberPatient = sMobileNumberPatient == null ? null : sMobileNumberPatient.trim();
    }

    public String getsMobileNumberDirect() {
        return sMobileNumberDirect;
    }

    public void setsMobileNumberDirect(String sMobileNumberDirect) {
        this.sMobileNumberDirect = sMobileNumberDirect == null ? null : sMobileNumberDirect.trim();
    }

    public BigDecimal getnTargetMoney() {
        return nTargetMoney;
    }

    public void setnTargetMoney(BigDecimal nTargetMoney) {
        this.nTargetMoney = nTargetMoney;
    }

    public String getsTitle() {
        return sTitle;
    }

    public void setsTitle(String sTitle) {
        this.sTitle = sTitle == null ? null : sTitle.trim();
    }

    public BigDecimal getnSumMoney() {
        return nSumMoney;
    }

    public void setnSumMoney(BigDecimal nSumMoney) {
        this.nSumMoney = nSumMoney;
    }

    public Long getnNumberOfDonations() {
        return nNumberOfDonations;
    }

    public void setnNumberOfDonations(Long nNumberOfDonations) {
        this.nNumberOfDonations = nNumberOfDonations;
    }

    public BigDecimal getnWithdrawMoney() {
        return nWithdrawMoney;
    }

    public void setnWithdrawMoney(BigDecimal nWithdrawMoney) {
        this.nWithdrawMoney = nWithdrawMoney;
    }

    public Date getdExpireTime() {
        return dExpireTime;
    }

    public void setdExpireTime(Date dExpireTime) {
        this.dExpireTime = dExpireTime;
    }

    public Date getdObjectOverTime() {
        return dObjectOverTime;
    }

    public void setdObjectOverTime(Date dObjectOverTime) {
        this.dObjectOverTime = dObjectOverTime;
    }

    public Long getnForwardNumber() {
        return nForwardNumber;
    }

    public void setnForwardNumber(Long nForwardNumber) {
        this.nForwardNumber = nForwardNumber;
    }

    public Long getnUploadNumber() {
        return nUploadNumber;
    }

    public void setnUploadNumber(Long nUploadNumber) {
        this.nUploadNumber = nUploadNumber;
    }

    public Integer getnFirstDonationTag() {
        return nFirstDonationTag;
    }

    public void setnFirstDonationTag(Integer nFirstDonationTag) {
        this.nFirstDonationTag = nFirstDonationTag;
    }

    public Integer getsChannelType() {
        return sChannelType;
    }

    public void setsChannelType(Integer sChannelType) {
        this.sChannelType = sChannelType;
    }

    public String getsChannelCategory() {
        return sChannelCategory;
    }

    public void setsChannelCategory(String sChannelCategory) {
        this.sChannelCategory = sChannelCategory == null ? null : sChannelCategory.trim();
    }

    public String getsChannelSubCategory() {
        return sChannelSubCategory;
    }

    public void setsChannelSubCategory(String sChannelSubCategory) {
        this.sChannelSubCategory = sChannelSubCategory == null ? null : sChannelSubCategory.trim();
    }

    public Date getdCreateTime() {
        return dCreateTime;
    }

    public void setdCreateTime(Date dCreateTime) {
        this.dCreateTime = dCreateTime;
    }

    public Date getdSubmitTime() {
        return dSubmitTime;
    }

    public void setdSubmitTime(Date dSubmitTime) {
        this.dSubmitTime = dSubmitTime;
    }

    public Date getdLaunchTime() {
        return dLaunchTime;
    }

    public void setdLaunchTime(Date dLaunchTime) {
        this.dLaunchTime = dLaunchTime;
    }

    public Date getdVerifyTime() {
        return dVerifyTime;
    }

    public void setdVerifyTime(Date dVerifyTime) {
        this.dVerifyTime = dVerifyTime;
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

    public String getsStarRemark() {
        return sStarRemark;
    }

    public void setsStarRemark(String sStarRemark) {
        this.sStarRemark = sStarRemark == null ? null : sStarRemark.trim();
    }

    public Integer getnStarId() {
        return nStarId;
    }

    public void setnStarId(Integer nStarId) {
        this.nStarId = nStarId;
    }

    public String getsStarCreatedBy() {
        return sStarCreatedBy;
    }

    public void setsStarCreatedBy(String sStarCreatedBy) {
        this.sStarCreatedBy = sStarCreatedBy == null ? null : sStarCreatedBy.trim();
    }

    public Date getdStarUpdateTime() {
        return dStarUpdateTime;
    }

    public void setdStarUpdateTime(Date dStarUpdateTime) {
        this.dStarUpdateTime = dStarUpdateTime;
    }

    public Integer getnCompleteStatus() {
        return nCompleteStatus;
    }

    public void setnCompleteStatus(Integer nCompleteStatus) {
        this.nCompleteStatus = nCompleteStatus;
    }

    public Integer getnFundStatus() {
        return nFundStatus;
    }

    public void setnFundStatus(Integer nFundStatus) {
        this.nFundStatus = nFundStatus;
    }

    public String getsVolunteerRemark() {
        return sVolunteerRemark;
    }

    public void setsVolunteerRemark(String sVolunteerRemark) {
        this.sVolunteerRemark = sVolunteerRemark == null ? null : sVolunteerRemark.trim();
    }

    public String getsFailReason() {
        return sFailReason;
    }

    public void setsFailReason(String sFailReason) {
        this.sFailReason = sFailReason == null ? null : sFailReason.trim();
    }

    public String getsLaunchFailReason() {
        return sLaunchFailReason;
    }

    public void setsLaunchFailReason(String sLaunchFailReason) {
        this.sLaunchFailReason = sLaunchFailReason == null ? null : sLaunchFailReason.trim();
    }

    public Integer getnDelete() {
        return nDelete;
    }

    public void setnDelete(Integer nDelete) {
        this.nDelete = nDelete;
    }
}