package com.gezhiwei.demo.vo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: EnterRedPackageVo
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/1/14 18:48
 * @modified By:
 */
public class EnterRedPacketVo {

    /**
     * 保障期数
     */
    private Map<String, String> guaranteePeriods;

    /**
     * 锦鲤说明
     */
    private String description;

    /**
     * 优惠券总金额
     */
    private BigDecimal amount;

    /**
     * 优惠券信息
     */
    private List<VoucherSelectorVo> selectorVos;

    public Map<String, String> getGuaranteePeriods() {
        return guaranteePeriods;
    }

    public EnterRedPacketVo setGuaranteePeriods(Map<String, String> guaranteePeriods) {
        this.guaranteePeriods = guaranteePeriods;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public EnterRedPacketVo setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public EnterRedPacketVo setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public List<VoucherSelectorVo> getSelectorVos() {
        return selectorVos;
    }

    public EnterRedPacketVo setSelectorVos(List<VoucherSelectorVo> selectorVos) {
        this.selectorVos = selectorVos;
        return this;
    }
}
