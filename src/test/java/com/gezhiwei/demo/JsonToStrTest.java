package com.gezhiwei.demo;

import com.alibaba.fastjson.JSONObject;
import com.gezhiwei.demo.vo.*;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: JsonToStrTest
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/1/22 16:18
 * @modified By:
 */
public class JsonToStrTest {


    @Test
    public void test1() {
        CreateRedPacketVo createRedPacketVo = new CreateRedPacketVo();
        createRedPacketVo.setRedPackageNum(10);
        createRedPacketVo.setPackageId(3);
        createRedPacketVo.setVipHealthNum(5);
        createRedPacketVo.setVoucherIds(new ArrayList<>());
        createRedPacketVo.setAmount(BigDecimal.ZERO);
        createRedPacketVo.setContent("测试红包发起");
        System.out.println(JSONObject.toJSONString(createRedPacketVo));
    }

    @Test
    public void test2() {
        DapH5SubPayRes dapH5SubPayRes = new DapH5SubPayRes();
        dapH5SubPayRes.setNotifyUrl("http://asdf");
        dapH5SubPayRes.setSignType("");
        dapH5SubPayRes.setAppId("asdfasdf");
        dapH5SubPayRes.setTimeStamp(String.valueOf(System.currentTimeMillis()));
        dapH5SubPayRes.setNonceStr("123");
        dapH5SubPayRes.setPackageStr("1234");
        dapH5SubPayRes.setPaySign("1234");

        System.out.println(JSONObject.toJSONString(dapH5SubPayRes));
    }

    @Test
    public void test3() {
        PayRedPacketResVo payRedPacketResVo = new PayRedPacketResVo();
        payRedPacketResVo.setType(1);
        payRedPacketResVo.setRedPacketId(1L);
        DapH5SubPayRes dapH5SubPayRes = new DapH5SubPayRes();
        dapH5SubPayRes.setNotifyUrl("http://asdf");
        dapH5SubPayRes.setSignType("");
        dapH5SubPayRes.setAppId("asdfasdf");
        dapH5SubPayRes.setTimeStamp(String.valueOf(System.currentTimeMillis()));
        dapH5SubPayRes.setNonceStr("123");
        dapH5SubPayRes.setPackageStr("1234");
        dapH5SubPayRes.setPaySign("1234");
        payRedPacketResVo.setDapH5SubPayRes(dapH5SubPayRes);

        System.out.println(JSONObject.toJSONString(payRedPacketResVo));
    }

    @Test
    public  void test4(){
        PayRedPacketVo payRedPacketVo = new PayRedPacketVo();
        payRedPacketVo.setRedPacketId(1L);
        payRedPacketVo.setStatus(1);
        System.out.println(JSONObject.toJSONString(payRedPacketVo));
    }

    @Test
    public  void test5(){
        GrabRedPacketVo payRedPacketVo  = new GrabRedPacketVo();
        payRedPacketVo.setStatus(0);

        DdhzRedPacketDetailInfoDTO dto = new DdhzRedPacketDetailInfoDTO();
        dto.setFace("http://asdf");
        dto.setNickName("asdf");
        dto.setContent("asdfasddf");
        dto.setNewUserCount(12);
        dto.setPendingIncome(BigDecimal.TEN);
        dto.setOpen(2134);
        dto.setTotal(1234);
        dto.setOpenVip(124);
        dto.setTotalVip(124);
        List<DdhzRedPacketDetailDTO> value = new ArrayList<>();
        DdhzRedPacketDetailDTO ea = new DdhzRedPacketDetailDTO();
        ea.setRedPacketId(435L);
        ea.setUserName("asdf");
        ea.setFace("http://asdf");
        ea.setNewUser(1);
        ea.setVipHealth(3245);
        ea.setStatus(2345);
        ea.setCreateTime(new Date());
        value.add(ea);
        dto.setRedPacketDetails(value);
        dto.setStatus(0);
        dto.setMonth(234);
        dto.setAmount(BigDecimal.TEN);
        dto.setVipMonth(2314);
        dto.setVipAmount(BigDecimal.TEN);

        payRedPacketVo.setDdhzRedPacketDetailInfoDTO(dto);

        System.out.println(JSONObject.toJSONString(payRedPacketVo));
    }
}
