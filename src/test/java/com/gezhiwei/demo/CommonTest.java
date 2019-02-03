package com.gezhiwei.demo;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName: CommonTest
 * @Author: 葛志伟(赛事)
 * @Description:
 * @Date: 2019/1/3 19:09
 * @modified By:
 */
public class CommonTest {

    private static final int ONE_WEEK = 7;

    private static final int EIGHT_WEEKS = 8 * ONE_WEEK;

    @Test
    public void test() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2018);
        calendar.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 28);
        Date t1 = calendar.getTime();
        calendar.add(Calendar.DAY_OF_WEEK, EIGHT_WEEKS);
        Date t2 = calendar.getTime();
        System.out.println(sf.format(t1));
        System.out.println(sf.format(t2));
    }

    @Test
    public void test2(){
        String sql = "select dup.n_plan_id as planId," +
                "dp.s_name as planName," +
                "sum(case where dup.n_status =1 then 1 else 0 end) as  waitPeople," +
                "sum(case where dup.n_status =2 then 1 else 0 end) as  effiectivePeople," +
                "sum(case where dup.n_status =3 then 1 else 0 end) as  gracePeople," +
                "sum(case where dup.n_quit_reason_type =3 then 1 else 0 end) as  achievePeople," +
                "sum(case where dup.n_status =4 then 1 else 0 end) as  exitPeople," +
                "sum(dup.n_qtt_gold) as qttGold " +
                " from ddhz_user_plan dup " +
                "left join ddhz_plan dp on dp.n_id = dup.n_plan_id " +
                "where dup.s_source = 'qtt'";
        System.out.println(sql);
    }


}
