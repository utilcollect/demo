package com.gezhiwei.demo;

import com.gezhiwei.demo.config.JedisClusterFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * @ClassName: RedisClear
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2018/12/19 14:06
 * @modified By:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisClear {

    private static final List<String> KEY_LIST = new ArrayList<>();

    static {
        KEY_LIST.add("ddhz:user:new:id");
        KEY_LIST.add("ddhz:incr:red:packet:id");
        KEY_LIST.add("ddc:user:new:id");
        KEY_LIST.add("gezhiwei:new:user");
    }

    @Autowired
    private JedisClusterFactory redisCluster;


    @Test
    public void addTestKey() {
        redisCluster.incr("gezhiwei:new:user");
        int i = 10;
        for (int i1 = 0; i1 < i; i1++) {
            redisCluster.set("gezhiwei:new:nuser:" + i1, String.valueOf(i1));
        }
    }


    @Test
    public void clearFullALl() {
        TreeSet<String> all = redisCluster.keysAll("gezhiwei:*");

        for (String key : all) {
            if (KEY_LIST.contains(key)) {
                continue;
            }
            System.out.println(key);
            redisCluster.del(key);
        }
    }

    @Test
    public void clearALl() {
        TreeSet<String> all = redisCluster.keysAll("hc:*");
        all.forEach(System.out::println);
        all.forEach(a -> redisCluster.del(a));
    }

    @Test
    public void clearUserInfo() {
        TreeSet<String> strings = redisCluster.keysAll("user:info:userid");
        for (String string : strings) {
            redisCluster.del(string);
        }
        System.out.println("ok");

    }

    @Test
    public void clearFundStatistics1() {
        TreeSet<String> strings = redisCluster.keysAll("hc:fund:statistics:volunteer:count:*");
        for (String string : strings) {
            redisCluster.del(string);
        }
    }

    @Test
    public void clearFundStatistics2() {
        TreeSet<String> strings = redisCluster.keysAll("hc:fund:statistics:work:count:*");
        for (String string : strings) {
            redisCluster.del(string);
        }
    }

    @Test
    public void clearFundStatistics3() {
        TreeSet<String> strings = redisCluster.keysAll("hc:fund:statistics:manager:count:*");
        for (String string : strings) {
            redisCluster.del(string);
        }
    }

    @Test
    public void test() {
        String hget = redisCluster.hget("hc:user:info:userid", "13");
        System.out.println(hget);
    }

    @Test
    public void testClearListR() {
        String key = "gezhiwei:list:test";
        redisCluster.del(key);
    }

    @Test
    public void testRedisOne() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("0");
        list.add("1");
        list.add("0");
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("9");
        String key = "gezhiwei:list:test";
        redisCluster.lpush(key, list);
    }

    @Test
    public void testPOp() {
        String key = "gezhiwei:list:test";
        String lpop = redisCluster.rpop(key);
        System.out.println(lpop);
    }

    @Test
    public void testPO1p() {
        String key = "gezhiwei:list:test";
        String lpop = "a";
        while (!StringUtils.isEmpty(lpop)) {
            lpop = redisCluster.rpop(key);
            System.out.println(lpop);
        }
    }

    @Test
    public void testPO2p() {
        String key = "gezhiwei:list:test";
        String lpop = "a";
        lpop = redisCluster.rpop(key);
        System.out.println(lpop);
    }

    @Test
    public void testExsit() {
        String key = "gezhiwei:list:test";
        if (redisCluster.exists(key)) {
            System.out.println("cunzai");
        } else {
            System.out.println("not cunzai");
        }
    }

    @Test
    public void testlrange() {
        int redPacketId = 21;
        String key = String.format("ddhz:red:packet:grab:%s", redPacketId);
        List<String> lrange = redisCluster.lrange(key, 0, 1000);
        System.out.println(lrange);

    }

    @Test
    public void testlrange1() {
        int redPacketId = 21;
        String key = String.format("gezhiwei:list:test", redPacketId);
        List<String> lrange = redisCluster.lrange(key, 0, -1);
        Long llen = redisCluster.llen(key);
        System.out.println("cahgdu " + llen);

        for (String s : lrange) {
            System.out.println(s);
        }
        System.out.println(lrange);

    }

    @Test
    public void tewst3() {
        int userId = 0;
        Long i = 1000000L;
        for (int aLong = 0; aLong < i; aLong++) {
            String key = String.format("ddhz:order:user:voucher:by:user:id:%s", aLong);
            redisCluster.del(key);

        }
    }
}
