package com.goddice.model;

import java.math.BigDecimal;

public class BcDhandleInfo {
    private String dhandlerTid;

    private BigDecimal jackpot;

    private Long firstPrizeNote;

    private Long secondPrizeNote;

    private Long thirdPrizeNote;

    private Long fourPrizeNote;

    private Long fivePrizeNote;

    private Long sixPrizeNote;

    private Long bettingAmount;

    private String remark1;

    private String remark2;

    private String tid;

    private String remark3;

    public String getDhandlerTid() {
        return dhandlerTid;
    }

    public void setDhandlerTid(String dhandlerTid) {
        this.dhandlerTid = dhandlerTid == null ? null : dhandlerTid.trim();
    }

    public BigDecimal getJackpot() {
        return jackpot;
    }

    public void setJackpot(BigDecimal jackpot) {
        this.jackpot = jackpot;
    }

    public Long getFirstPrizeNote() {
        return firstPrizeNote;
    }

    public void setFirstPrizeNote(Long firstPrizeNote) {
        this.firstPrizeNote = firstPrizeNote;
    }

    public Long getSecondPrizeNote() {
        return secondPrizeNote;
    }

    public void setSecondPrizeNote(Long secondPrizeNote) {
        this.secondPrizeNote = secondPrizeNote;
    }

    public Long getThirdPrizeNote() {
        return thirdPrizeNote;
    }

    public void setThirdPrizeNote(Long thirdPrizeNote) {
        this.thirdPrizeNote = thirdPrizeNote;
    }

    public Long getFourPrizeNote() {
        return fourPrizeNote;
    }

    public void setFourPrizeNote(Long fourPrizeNote) {
        this.fourPrizeNote = fourPrizeNote;
    }

    public Long getFivePrizeNote() {
        return fivePrizeNote;
    }

    public void setFivePrizeNote(Long fivePrizeNote) {
        this.fivePrizeNote = fivePrizeNote;
    }

    public Long getSixPrizeNote() {
        return sixPrizeNote;
    }

    public void setSixPrizeNote(Long sixPrizeNote) {
        this.sixPrizeNote = sixPrizeNote;
    }

    public Long getBettingAmount() {
        return bettingAmount;
    }

    public void setBettingAmount(Long bettingAmount) {
        this.bettingAmount = bettingAmount;
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

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }
}