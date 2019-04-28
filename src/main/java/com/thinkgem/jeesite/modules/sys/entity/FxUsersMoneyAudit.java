/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 提现审核表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxUsersMoneyAudit extends DataEntity<FxUsersMoneyAudit> {
	
	private static final long serialVersionUID = 1L;
	private Long withdrawalsId;		// withdrawals_id
	private String withdrawalsMoney;		// 提现金额
	private String withdrawalsUserId;		// 代理ID
	private String withdrawalsUserName;		// 申请人姓名
	private Date withdrawalsAddDate;		// 提现日期
	private Date withdrawalsModifyDate;		// withdrawals_modify_date
	private String withdrawalsState;		// 提现状态 0 未审核  1已提现   2 取消
	private String withdrawalsModifyUserId;		// 审核人ID
	private String withdrawalsModifyUserName;		// 审核人姓名
	private String withdrawalsDesc;		// 提现说明
	private String withdrawalsFactMoney;		// 实际提现金额
	private String withdrawalsOrderNum;		// 订单号
	private String withdrawalsTborderState;		// 订单状态
	private String withdrawalsUrl;		// 提现地址
	private String withdrawalsRemark;		// 审核备注
	private String payNo;		// 支付宝账号
	private String payName;		// 支付宝姓名
	
	public FxUsersMoneyAudit() {
		super();
	}

	public FxUsersMoneyAudit(String id){
		super(id);
	}

	@NotNull(message="withdrawals_id不能为空")
	public Long getWithdrawalsId() {
		return withdrawalsId;
	}

	public void setWithdrawalsId(Long withdrawalsId) {
		this.withdrawalsId = withdrawalsId;
	}
	
	public String getWithdrawalsMoney() {
		return withdrawalsMoney;
	}

	public void setWithdrawalsMoney(String withdrawalsMoney) {
		this.withdrawalsMoney = withdrawalsMoney;
	}
	
	@Length(min=1, max=11, message="代理ID长度必须介于 1 和 11 之间")
	public String getWithdrawalsUserId() {
		return withdrawalsUserId;
	}

	public void setWithdrawalsUserId(String withdrawalsUserId) {
		this.withdrawalsUserId = withdrawalsUserId;
	}
	
	@Length(min=1, max=20, message="申请人姓名长度必须介于 1 和 20 之间")
	public String getWithdrawalsUserName() {
		return withdrawalsUserName;
	}

	public void setWithdrawalsUserName(String withdrawalsUserName) {
		this.withdrawalsUserName = withdrawalsUserName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getWithdrawalsAddDate() {
		return withdrawalsAddDate;
	}

	public void setWithdrawalsAddDate(Date withdrawalsAddDate) {
		this.withdrawalsAddDate = withdrawalsAddDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getWithdrawalsModifyDate() {
		return withdrawalsModifyDate;
	}

	public void setWithdrawalsModifyDate(Date withdrawalsModifyDate) {
		this.withdrawalsModifyDate = withdrawalsModifyDate;
	}
	
	@Length(min=1, max=4, message="提现状态 0 未审核  1已提现   2 取消长度必须介于 1 和 4 之间")
	public String getWithdrawalsState() {
		return withdrawalsState;
	}

	public void setWithdrawalsState(String withdrawalsState) {
		this.withdrawalsState = withdrawalsState;
	}
	
	@Length(min=0, max=11, message="审核人ID长度必须介于 0 和 11 之间")
	public String getWithdrawalsModifyUserId() {
		return withdrawalsModifyUserId;
	}

	public void setWithdrawalsModifyUserId(String withdrawalsModifyUserId) {
		this.withdrawalsModifyUserId = withdrawalsModifyUserId;
	}
	
	@Length(min=0, max=20, message="审核人姓名长度必须介于 0 和 20 之间")
	public String getWithdrawalsModifyUserName() {
		return withdrawalsModifyUserName;
	}

	public void setWithdrawalsModifyUserName(String withdrawalsModifyUserName) {
		this.withdrawalsModifyUserName = withdrawalsModifyUserName;
	}
	
	@Length(min=0, max=249, message="提现说明长度必须介于 0 和 249 之间")
	public String getWithdrawalsDesc() {
		return withdrawalsDesc;
	}

	public void setWithdrawalsDesc(String withdrawalsDesc) {
		this.withdrawalsDesc = withdrawalsDesc;
	}
	
	public String getWithdrawalsFactMoney() {
		return withdrawalsFactMoney;
	}

	public void setWithdrawalsFactMoney(String withdrawalsFactMoney) {
		this.withdrawalsFactMoney = withdrawalsFactMoney;
	}
	
	@Length(min=0, max=100, message="订单号长度必须介于 0 和 100 之间")
	public String getWithdrawalsOrderNum() {
		return withdrawalsOrderNum;
	}

	public void setWithdrawalsOrderNum(String withdrawalsOrderNum) {
		this.withdrawalsOrderNum = withdrawalsOrderNum;
	}
	
	@Length(min=0, max=249, message="订单状态长度必须介于 0 和 249 之间")
	public String getWithdrawalsTborderState() {
		return withdrawalsTborderState;
	}

	public void setWithdrawalsTborderState(String withdrawalsTborderState) {
		this.withdrawalsTborderState = withdrawalsTborderState;
	}
	
	public String getWithdrawalsUrl() {
		return withdrawalsUrl;
	}

	public void setWithdrawalsUrl(String withdrawalsUrl) {
		this.withdrawalsUrl = withdrawalsUrl;
	}
	
	@Length(min=0, max=249, message="审核备注长度必须介于 0 和 249 之间")
	public String getWithdrawalsRemark() {
		return withdrawalsRemark;
	}

	public void setWithdrawalsRemark(String withdrawalsRemark) {
		this.withdrawalsRemark = withdrawalsRemark;
	}
	
	@Length(min=0, max=50, message="支付宝账号长度必须介于 0 和 50 之间")
	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}
	
	@Length(min=0, max=20, message="支付宝姓名长度必须介于 0 和 20 之间")
	public String getPayName() {
		return payName;
	}

	public void setPayName(String payName) {
		this.payName = payName;
	}
	
}