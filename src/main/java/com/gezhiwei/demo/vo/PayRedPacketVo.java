package com.gezhiwei.demo.vo;

/**
 * @ClassName: PayRedPacketVo
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/1/16 14:57
 * @modified By:
 */
public class PayRedPacketVo {

    /**
     * 0 付款成功
     * 1 付款失败
     */
    private Integer status;

    private Long redPacketId;

    public Integer getStatus() {
        return status;
    }

    public PayRedPacketVo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public Long getRedPacketId() {
        return redPacketId;
    }

    public PayRedPacketVo setRedPacketId(Long redPacketId) {
        this.redPacketId = redPacketId;
        return this;
    }
}
