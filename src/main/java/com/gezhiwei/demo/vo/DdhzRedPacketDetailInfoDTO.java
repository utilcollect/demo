package com.gezhiwei.demo.vo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wayne on 2019/1/15.
 */
public class DdhzRedPacketDetailInfoDTO {

    //头像
    private String face;
    //昵称
    private String nickName;
    //文言
    private String content;
    //状态：0-未中奖，1-普通红包，2-锦鲤
    private Integer status;
    //保障期
    private Integer month;
    //价值
    private BigDecimal amount;
    //服务期
    private Integer vipMonth;
    //价值
    private BigDecimal vipAmount;
    //新用户个数
    private Integer newUserCount;
    //预计收益
    private BigDecimal pendingIncome;
    //已领取
    private Integer open;
    //总数
    private Integer total;
    //产生锦鲤个数
    private Integer openVip;
    //锦鲤总个数
    private Integer totalVip;
    //领取详情
    private List<DdhzRedPacketDetailDTO> redPacketDetails = new ArrayList<>();

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getNewUserCount() {
        return newUserCount;
    }

    public void setNewUserCount(Integer newUserCount) {
        this.newUserCount = newUserCount;
    }

    public BigDecimal getPendingIncome() {
        return pendingIncome;
    }

    public void setPendingIncome(BigDecimal pendingIncome) {
        this.pendingIncome = pendingIncome;
    }

    public Integer getOpen() {
        return open;
    }

    public void setOpen(Integer open) {
        this.open = open;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getOpenVip() {
        return openVip;
    }

    public void setOpenVip(Integer openVip) {
        this.openVip = openVip;
    }

    public Integer getTotalVip() {
        return totalVip;
    }

    public void setTotalVip(Integer totalVip) {
        this.totalVip = totalVip;
    }

    public List<DdhzRedPacketDetailDTO> getRedPacketDetails() {
        return redPacketDetails;
    }

    public void setRedPacketDetails(List<DdhzRedPacketDetailDTO> redPacketDetails) {
        this.redPacketDetails = redPacketDetails;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getVipMonth() {
        return vipMonth;
    }

    public void setVipMonth(Integer vipMonth) {
        this.vipMonth = vipMonth;
    }

    public BigDecimal getVipAmount() {
        return vipAmount;
    }

    public void setVipAmount(BigDecimal vipAmount) {
        this.vipAmount = vipAmount;
    }
}
