// default package
// Generated 2016-3-11 13:50:27 by Hibernate Tools 4.0.0
package com.zlebank.zplatform.trade.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TTranBatch generated by hbm2java
 */
@Entity
@Table(name = "T_TRAN_BATCH")
public class TTranBatchModel implements java.io.Serializable {

	private long tid;
	private Long totalCount;
	private Long totalAmt;
	private Long approveCount;
	private Long approveAmt;
	private Long refuseCount;
	private Long refuseAmt;
	private String status;
	private Date applyTime;
	private Date approveFinishTime;
	private String busiType;
	private Long busiBatchId;
	private Date finishTime;
	private Long waitApproveCount;
	private Long waitApproveAmt;
	private String tranBatchNo;

	public TTranBatchModel() {
	}

	public TTranBatchModel(long tid) {
		this.tid = tid;
	}

	public TTranBatchModel(long tid, Long totalCount, Long totalAmt,
			Long approveCount, Long approveAmt, Long refuseCount,
			Long refuseAmt, String status, Date applyTime,
			Date approveFinishTime, String busiType, Long busiBatchId,
			Date finishTime, Long waitApproveCount, Long waitApproveAmt,
			String tranBatchNo) {
		this.tid = tid;
		this.totalCount = totalCount;
		this.totalAmt = totalAmt;
		this.approveCount = approveCount;
		this.approveAmt = approveAmt;
		this.refuseCount = refuseCount;
		this.refuseAmt = refuseAmt;
		this.status = status;
		this.applyTime = applyTime;
		this.approveFinishTime = approveFinishTime;
		this.busiType = busiType;
		this.busiBatchId = busiBatchId;
		this.finishTime = finishTime;
		this.waitApproveCount = waitApproveCount;
		this.waitApproveAmt = waitApproveAmt;
		this.tranBatchNo = tranBatchNo;
	}

	@Id
	@Column(name = "TID", unique = true, nullable = false, precision = 12, scale = 0)
	public long getTid() {
		return this.tid;
	}

	public void setTid(long tid) {
		this.tid = tid;
	}

	@Column(name = "TOTAL_COUNT", precision = 12, scale = 0)
	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	@Column(name = "TOTAL_AMT", precision = 12, scale = 0)
	public Long getTotalAmt() {
		return this.totalAmt;
	}

	public void setTotalAmt(Long totalAmt) {
		this.totalAmt = totalAmt;
	}

	@Column(name = "APPROVE_COUNT", precision = 12, scale = 0)
	public Long getApproveCount() {
		return this.approveCount;
	}

	public void setApproveCount(Long approveCount) {
		this.approveCount = approveCount;
	}

	@Column(name = "APPROVE_AMT", precision = 12, scale = 0)
	public Long getApproveAmt() {
		return this.approveAmt;
	}

	public void setApproveAmt(Long approveAmt) {
		this.approveAmt = approveAmt;
	}

	@Column(name = "REFUSE_COUNT", precision = 12, scale = 0)
	public Long getRefuseCount() {
		return this.refuseCount;
	}

	public void setRefuseCount(Long refuseCount) {
		this.refuseCount = refuseCount;
	}

	@Column(name = "REFUSE_AMT", precision = 12, scale = 0)
	public Long getRefuseAmt() {
		return this.refuseAmt;
	}

	public void setRefuseAmt(Long refuseAmt) {
		this.refuseAmt = refuseAmt;
	}

	@Column(name = "STATUS", length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "APPLY_TIME", length = 7)
	public Date getApplyTime() {
		return this.applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "APPROVE_FINISH_TIME", length = 7)
	public Date getApproveFinishTime() {
		return this.approveFinishTime;
	}

	public void setApproveFinishTime(Date approveFinishTime) {
		this.approveFinishTime = approveFinishTime;
	}

	@Column(name = "BUSI_TYPE", length = 2)
	public String getBusiType() {
		return this.busiType;
	}

	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	@Column(name = "BUSI_BATCH_ID", precision = 12, scale = 0)
	public Long getBusiBatchId() {
		return this.busiBatchId;
	}

	public void setBusiBatchId(Long busiBatchId) {
		this.busiBatchId = busiBatchId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "FINISH_TIME", length = 7)
	public Date getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	@Column(name = "WAIT_APPROVE_COUNT", precision = 12, scale = 0)
	public Long getWaitApproveCount() {
		return this.waitApproveCount;
	}

	public void setWaitApproveCount(Long waitApproveCount) {
		this.waitApproveCount = waitApproveCount;
	}

	@Column(name = "WAIT_APPROVE_AMT", precision = 12, scale = 0)
	public Long getWaitApproveAmt() {
		return this.waitApproveAmt;
	}

	public void setWaitApproveAmt(Long waitApproveAmt) {
		this.waitApproveAmt = waitApproveAmt;
	}

	@Column(name = "TRAN_BATCH_NO", length = 24)
	public String getTranBatchNo() {
		return this.tranBatchNo;
	}

	public void setTranBatchNo(String tranBatchNo) {
		this.tranBatchNo = tranBatchNo;
	}

}
