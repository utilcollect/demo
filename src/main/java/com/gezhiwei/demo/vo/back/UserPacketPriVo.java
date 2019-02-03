package com.gezhiwei.demo.vo.back;

import com.alibaba.fastjson.annotation.JSONField;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName: UserPacketPriVo
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/1/17 20:47
 * @modified By:
 */
public class UserPacketPriVo {
    private Long userId;

    private String userRealName;

    private String mobile;

    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Long redPacketId;

    private Integer packetNum;

    private BigDecimal keepAmount;

    private Integer vipHealthNum;

    private BigDecimal totalAmount;

    private BigDecimal payAmount;

    private BigDecimal lessAmount;

    private BigDecimal payBackAmount;

    public Long getUserId() {
        return userId;
    }

    public UserPacketPriVo setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public UserPacketPriVo setUserRealName(String userRealName) {
        this.userRealName = userRealName;
        return this;
    }

    public String getMobile() {
        return mobile;
    }

    public UserPacketPriVo setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public UserPacketPriVo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public Long getRedPacketId() {
        return redPacketId;
    }

    public UserPacketPriVo setRedPacketId(Long redPacketId) {
        this.redPacketId = redPacketId;
        return this;
    }

    public BigDecimal getKeepAmount() {
        return keepAmount;
    }

    public UserPacketPriVo setKeepAmount(BigDecimal keepAmount) {
        this.keepAmount = keepAmount;
        return this;
    }

    public Integer getPacketNum() {
        return packetNum;
    }

    public UserPacketPriVo setPacketNum(Integer packetNum) {
        this.packetNum = packetNum;
        return this;
    }

    public Integer getVipHealthNum() {
        return vipHealthNum;
    }

    public UserPacketPriVo setVipHealthNum(Integer vipHealthNum) {
        this.vipHealthNum = vipHealthNum;
        return this;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public UserPacketPriVo setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
        return this;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public UserPacketPriVo setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
        return this;
    }

    public BigDecimal getLessAmount() {
        return lessAmount;
    }

    public UserPacketPriVo setLessAmount(BigDecimal lessAmount) {
        this.lessAmount = lessAmount;
        return this;
    }

    public BigDecimal getPayBackAmount() {
        return payBackAmount;
    }

    public UserPacketPriVo setPayBackAmount(BigDecimal payBackAmount) {
        this.payBackAmount = payBackAmount;
        return this;
    }
}
