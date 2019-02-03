package com.gezhiwei.demo.vo;

import java.math.BigDecimal;

/**
 * @ClassName: VoucherSelectorVo
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/1/15 14:50
 * @modified By:
 */
public class VoucherSelectorVo {

    private Long id;

    private BigDecimal amount;

    public VoucherSelectorVo(Long id, BigDecimal voucherAmount) {
        this.id = id;
        this.amount = voucherAmount;
    }

    public Long getId() {
        return id;
    }

    public VoucherSelectorVo setId(Long id) {
        this.id = id;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public VoucherSelectorVo setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }
}
