package com.gezhiwei.demo.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * @ClassName: CreateRedPackageVo
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/1/14 19:05
 * @modified By:
 */
public class CreateRedPacketVo {

    private Integer redPackageNum;

    private Integer packageId;

    private Integer vipHealthNum;

    private List<Long> voucherIds;

    private BigDecimal amount;

    private String content;

    public Integer getRedPackageNum() {
        return redPackageNum;
    }

    public CreateRedPacketVo setRedPackageNum(Integer redPackageNum) {
        this.redPackageNum = redPackageNum;
        return this;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public CreateRedPacketVo setPackageId(Integer packageId) {
        this.packageId = packageId;
        return this;
    }

    public Integer getVipHealthNum() {
        return vipHealthNum;
    }

    public CreateRedPacketVo setVipHealthNum(Integer vipHealthNum) {
        this.vipHealthNum = vipHealthNum;
        return this;
    }

    public List<Long> getVoucherIds() {
        return voucherIds;
    }

    public CreateRedPacketVo setVoucherIds(List<Long> voucherIds) {
        this.voucherIds = voucherIds;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public CreateRedPacketVo setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public String getContent() {
        return content;
    }

    public CreateRedPacketVo setContent(String content) {
        this.content = content;
        return this;
    }
}
