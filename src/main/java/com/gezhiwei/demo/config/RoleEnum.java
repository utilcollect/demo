package com.gezhiwei.demo.config;

/**
 * 角色枚举类
 */
public enum RoleEnum {

    NO_ROLE(0, "未设置"),
    COMMUNITY_WORKER_MANAGER(1, "社工管理员"),
    COMMUNITY_WORKER(2, "社工"),
    VOLUNTEER(3, "志愿者"),
    HOSPITAL_LEADER(4, "医院领导"),
    ORGANIZATION(5, "机构");

    private Integer code;
    private String desc;

    RoleEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
