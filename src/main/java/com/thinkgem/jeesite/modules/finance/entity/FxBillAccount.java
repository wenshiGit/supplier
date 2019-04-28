/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.finance.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 账单Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxBillAccount extends DataEntity<FxBillAccount> {
	
	private static final long serialVersionUID = 1L;
	private Long accountId;		// 费用科目编号
	private String accountName;		// 费用科目名称
	private String accountCode;		// 费用科目编码
	private String accountType;		// 费用科目类型:1-虚拟账户 2-交易 3-交易佣金 4-服务费 5-天猫积分 6-其他
	private String relatedOrder;		// 是否订单相关:0-订单无关 1-订单相关
	private String status;		// 状态:0-不可用 1-可用
	private Date gmtCreate;		// 创建时间
	private Date gmtModified;		// 修改时间
	
	public FxBillAccount() {
		super();
	}

	public FxBillAccount(String id){
		super(id);
	}

	@NotNull(message="费用科目编号不能为空")
	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	
	@Length(min=0, max=100, message="费用科目名称长度必须介于 0 和 100 之间")
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	@Length(min=0, max=100, message="费用科目编码长度必须介于 0 和 100 之间")
	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}
	
	@Length(min=0, max=10, message="费用科目类型:1-虚拟账户 2-交易 3-交易佣金 4-服务费 5-天猫积分 6-其他长度必须介于 0 和 10 之间")
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	@Length(min=0, max=10, message="是否订单相关:0-订单无关 1-订单相关长度必须介于 0 和 10 之间")
	public String getRelatedOrder() {
		return relatedOrder;
	}

	public void setRelatedOrder(String relatedOrder) {
		this.relatedOrder = relatedOrder;
	}
	
	@Length(min=0, max=10, message="状态:0-不可用 1-可用长度必须介于 0 和 10 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	
}