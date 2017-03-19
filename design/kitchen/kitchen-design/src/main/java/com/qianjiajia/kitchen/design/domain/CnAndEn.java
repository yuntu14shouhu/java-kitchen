package com.qianjiajia.kitchen.design.domain;

public class CnAndEn {
    private String cnAndEnId;

    private String bigKeyClassEn;

    private String bigKeyClassCn;

    public String getCnAndEnId() {
        return cnAndEnId;
    }

    public void setCnAndEnId(String cnAndEnId) {
        this.cnAndEnId = cnAndEnId == null ? null : cnAndEnId.trim();
    }

    public String getBigKeyClassEn() {
        return bigKeyClassEn;
    }

    public void setBigKeyClassEn(String bigKeyClassEn) {
        this.bigKeyClassEn = bigKeyClassEn == null ? null : bigKeyClassEn.trim();
    }

    public String getBigKeyClassCn() {
        return bigKeyClassCn;
    }

    public void setBigKeyClassCn(String bigKeyClassCn) {
        this.bigKeyClassCn = bigKeyClassCn == null ? null : bigKeyClassCn.trim();
    }
}