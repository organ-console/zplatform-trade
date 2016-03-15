package com.zlebank.zplatform.trade.model;
// default package
// Generated 2015-12-28 9:41:05 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * TRiskTradeLog generated by hbm2java
 */
@Entity
@Table(name = "T_RISK_TRADE_LOG")
public class RiskTradeLogModel implements java.io.Serializable {

    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 6539994898165412971L;
    private long tid;
    private Integer riskTradeType;
    private String txnseqno;
    private String orderno;
    private String merchno;
    private String merchname;
    private String submerchno;
    private String summerchname;
    private String memberid;
    private Long amount;
    private String pan;
    private String inpan;
    private Integer tradeRiskLevel;
    private String cardIssuerCode;
    private String cardIssuerName;
    private String acqInistCode;
    private String acqInistName;
    private String acqdatetime;
    private String busicode;
    private String busitype;
    private String rescode;
    private String resinfo;
    private String strategy;

    public RiskTradeLogModel() {
    }

    public RiskTradeLogModel(long tid) {
        this.tid = tid;
    }
    public RiskTradeLogModel(long tid, Integer riskTradeType, String txnseqno,
            String orderno, String merchno, String merchname,
            String submerchno, String summerchname, String memberid,
            Long amount, String pan, String inpan, Integer tradeRiskLevel,
            String cardIssuerCode, String cardIssuerName, String acqInistCode,
            String acqInistName, String acqdatetime, String busicode,
            String busiPackCode, String rescode, String resinfo) {
        this.tid = tid;
        this.riskTradeType = riskTradeType;
        this.txnseqno = txnseqno;
        this.orderno = orderno;
        this.merchno = merchno;
        this.merchname = merchname;
        this.submerchno = submerchno;
        this.summerchname = summerchname;
        this.memberid = memberid;
        this.amount = amount;
        this.pan = pan;
        this.inpan = inpan;
        this.tradeRiskLevel = tradeRiskLevel;
        this.cardIssuerCode = cardIssuerCode;
        this.cardIssuerName = cardIssuerName;
        this.acqInistCode = acqInistCode;
        this.acqInistName = acqInistName;
        this.acqdatetime = acqdatetime;
        this.busicode = busicode;
        this.busitype = busiPackCode;
        this.rescode = rescode;
        this.resinfo = resinfo;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_risk_trade_id") 
    @SequenceGenerator(name="seq_risk_trade_id",sequenceName="SEQ_T_RISK_TRADE_LOG",allocationSize=1)
    @Column(name = "TID", unique = true, nullable = false, precision = 12, scale = 0)
    public long getTid() {
        return this.tid;
    }

    public void setTid(long tid) {
        this.tid = tid;
    }

    @Column(name = "RISK_TRADE_TYPE", precision = 2, scale = 0)
    public Integer getRiskTradeType() {
        return this.riskTradeType;
    }

    public void setRiskTradeType(Integer riskTradeType) {
        this.riskTradeType = riskTradeType;
    }

    @Column(name = "TXNSEQNO", length = 16)
    public String getTxnseqno() {
        return this.txnseqno;
    }

    public void setTxnseqno(String txnseqno) {
        this.txnseqno = txnseqno;
    }

    @Column(name = "ORDERNO", length = 32)
    public String getOrderno() {
        return this.orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

    @Column(name = "MERCHNO", length = 15)
    public String getMerchno() {
        return this.merchno;
    }

    public void setMerchno(String merchno) {
        this.merchno = merchno;
    }

    @Column(name = "MERCHNAME", length = 64)
    public String getMerchname() {
        return this.merchname;
    }

    public void setMerchname(String merchname) {
        this.merchname = merchname;
    }

    @Column(name = "SUBMERCHNO", length = 15)
    public String getSubmerchno() {
        return this.submerchno;
    }

    public void setSubmerchno(String submerchno) {
        this.submerchno = submerchno;
    }

    @Column(name = "SUMMERCHNAME", length = 64)
    public String getSummerchname() {
        return this.summerchname;
    }

    public void setSummerchname(String summerchname) {
        this.summerchname = summerchname;
    }

    @Column(name = "MEMBERID", length = 15)
    public String getMemberid() {
        return this.memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    @Column(name = "AMOUNT", precision = 12, scale = 0)
    public Long getAmount() {
        return this.amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Column(name = "PAN", length = 20)
    public String getPan() {
        return this.pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    @Column(name = "INPAN", length = 20)
    public String getInpan() {
        return this.inpan;
    }

    public void setInpan(String inpan) {
        this.inpan = inpan;
    }

    @Column(name = "TRADE_RISK_LEVEL", precision = 1, scale = 0)
    public Integer getTradeRiskLevel() {
        return this.tradeRiskLevel;
    }

    public void setTradeRiskLevel(Integer tradeRiskLevel) {
        this.tradeRiskLevel = tradeRiskLevel;
    }

    @Column(name = "CARD_ISSUER_CODE", length = 11)
    public String getCardIssuerCode() {
        return this.cardIssuerCode;
    }

    public void setCardIssuerCode(String cardIssuerCode) {
        this.cardIssuerCode = cardIssuerCode;
    }

    @Column(name = "CARD_ISSUER_NAME", length = 64)
    public String getCardIssuerName() {
        return this.cardIssuerName;
    }

    public void setCardIssuerName(String cardIssuerName) {
        this.cardIssuerName = cardIssuerName;
    }

    @Column(name = "ACQ_INIST_CODE", length = 11)
    public String getAcqInistCode() {
        return this.acqInistCode;
    }

    public void setAcqInistCode(String acqInistCode) {
        this.acqInistCode = acqInistCode;
    }

    @Column(name = "ACQ_INIST_NAME", length = 64)
    public String getAcqInistName() {
        return this.acqInistName;
    }

    public void setAcqInistName(String acqInistName) {
        this.acqInistName = acqInistName;
    }

    @Column(name = "ACQDATETIME", length = 14)
    public String getAcqdatetime() {
        return this.acqdatetime;
    }

    public void setAcqdatetime(String acqdatetime) {
        this.acqdatetime = acqdatetime;
    }

    @Column(name = "BUSICODE", length = 4)
    public String getBusicode() {
        return this.busicode;
    }

    public void setBusicode(String busicode) {
        this.busicode = busicode;
    }

    
    

    @Column(name = "RESCODE", length = 4)
    public String getRescode() {
        return this.rescode;
    }
    
    public void setRescode(String rescode) {
        this.rescode = rescode;
    }
    
    @Column(name = "BUSITYPE", length = 8)
    public String getBusitype() {
        return busitype;
    }

    public void setBusitype(String busitype) {
        this.busitype = busitype;
    }

    @Column(name = "RESINFO", length = 200)
    public String getResinfo() {
        return this.resinfo;
    }

    public void setResinfo(String resinfo) {
        this.resinfo = resinfo;
    }
    @Column(name = "STRATEGY")
    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
    
    

}
