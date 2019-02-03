package com.gezhiwei.demo.vo;

/**
 * @ClassName: GrabRedPacketVo
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/1/22 15:06
 * @modified By:
 */
public class GrabRedPacketVo {

    // 0 未抢到 或者 过期  1 抢到红包 2 抢到锦鲤 3已经抢过
    private Integer status;

    private DdhzRedPacketDetailInfoDTO ddhzRedPacketDetailInfoDTO;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DdhzRedPacketDetailInfoDTO getDdhzRedPacketDetailInfoDTO() {
        return ddhzRedPacketDetailInfoDTO;
    }

    public void setDdhzRedPacketDetailInfoDTO(DdhzRedPacketDetailInfoDTO ddhzRedPacketDetailInfoDTO) {
        this.ddhzRedPacketDetailInfoDTO = ddhzRedPacketDetailInfoDTO;
    }
}
