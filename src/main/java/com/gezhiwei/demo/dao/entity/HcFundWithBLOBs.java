package com.gezhiwei.demo.dao.entity;

public class HcFundWithBLOBs extends HcFund {
    private String sDescription;

    private String sImg;

    public String getsDescription() {
        return sDescription;
    }

    public void setsDescription(String sDescription) {
        this.sDescription = sDescription == null ? null : sDescription.trim();
    }

    public String getsImg() {
        return sImg;
    }

    public void setsImg(String sImg) {
        this.sImg = sImg == null ? null : sImg.trim();
    }
}