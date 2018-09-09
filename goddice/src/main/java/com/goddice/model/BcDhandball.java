package com.goddice.model;

import java.util.Date;

public class BcDhandball {
    private String tid;

    private String vNumber;

    private String vPerPosition1;

    private String vPerPosition2;

    private String vPerPosition3;

    private String vPerPosition4;

    private String vPerPosition5;

    private String vPerPosition6;

    private String vSufPosition1;

    private Date dCreateDate;

    private String remark1;

    private String remark2;

    private String remark3;

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getvNumber() {
        return vNumber;
    }

    public void setvNumber(String vNumber) {
        this.vNumber = vNumber == null ? null : vNumber.trim();
    }

    public String getvPerPosition1() {
        return vPerPosition1;
    }

    public void setvPerPosition1(String vPerPosition1) {
        this.vPerPosition1 = vPerPosition1 == null ? null : vPerPosition1.trim();
    }

    public String getvPerPosition2() {
        return vPerPosition2;
    }

    public void setvPerPosition2(String vPerPosition2) {
        this.vPerPosition2 = vPerPosition2 == null ? null : vPerPosition2.trim();
    }

    public String getvPerPosition3() {
        return vPerPosition3;
    }

    public void setvPerPosition3(String vPerPosition3) {
        this.vPerPosition3 = vPerPosition3 == null ? null : vPerPosition3.trim();
    }

    public String getvPerPosition4() {
        return vPerPosition4;
    }

    public void setvPerPosition4(String vPerPosition4) {
        this.vPerPosition4 = vPerPosition4 == null ? null : vPerPosition4.trim();
    }

    public String getvPerPosition5() {
        return vPerPosition5;
    }

    public void setvPerPosition5(String vPerPosition5) {
        this.vPerPosition5 = vPerPosition5 == null ? null : vPerPosition5.trim();
    }

    public String getvPerPosition6() {
        return vPerPosition6;
    }

    public void setvPerPosition6(String vPerPosition6) {
        this.vPerPosition6 = vPerPosition6 == null ? null : vPerPosition6.trim();
    }

    public String getvSufPosition1() {
        return vSufPosition1;
    }

    public void setvSufPosition1(String vSufPosition1) {
        this.vSufPosition1 = vSufPosition1 == null ? null : vSufPosition1.trim();
    }

    public Date getdCreateDate() {
        return dCreateDate;
    }

    public void setdCreateDate(Date dCreateDate) {
        this.dCreateDate = dCreateDate;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }
}