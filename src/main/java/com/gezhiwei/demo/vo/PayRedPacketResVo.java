package com.gezhiwei.demo.vo;

/**
 * @ClassName: PayRedPacketResVo
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/1/23 19:11
 * @modified By:
 */
public class PayRedPacketResVo {

    // 0 微信支付 2 抵扣券支付
    private Integer type;

    private Long redPacketId;

    private DapH5SubPayRes dapH5SubPayRes;

    public Integer getType() {
        return type;
    }

    public PayRedPacketResVo setType(Integer type) {
        this.type = type;
        return this;
    }

    public Long getRedPacketId() {
        return redPacketId;
    }

    public PayRedPacketResVo setRedPacketId(Long redPacketId) {
        this.redPacketId = redPacketId;
        return this;
    }

    public DapH5SubPayRes getDapH5SubPayRes() {
        return dapH5SubPayRes;
    }

    public PayRedPacketResVo setDapH5SubPayRes(DapH5SubPayRes dapH5SubPayRes) {
        this.dapH5SubPayRes = dapH5SubPayRes;
        return this;
    }
}
