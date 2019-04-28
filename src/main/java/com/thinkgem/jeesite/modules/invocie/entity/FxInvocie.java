/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.invocie.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 发票管理Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxInvocie extends DataEntity<FxInvocie> {
	
	private static final long serialVersionUID = 1L;
	private Long invocieId;		// invocie_id
	private Long applyUserId;		// apply_user_id
	private String applyUserName;		// apply_user_name
	private Date createdTime;		// created_time
	private String custAddr;		// cust_addr
	private String custName;		// cust_name
	private String custTel;		// cust_tel
	private Long emsCompany;		// ems_company
	private String emsCompanyName;		// ems_company_name
	private String emsNbr;		// ems_nbr
	private String emsPrice;		// ems_price
	private String invocieNbr;		// invocie_nbr
	private String invociePlayPrice;		// invocie_play_price
	private String invociePrice;		// invocie_price
	private String invocieState;		// invocie_state
	private String invocieTitle;		// invocie_title
	private String invocieType;		// 发票类型 ，1普票，，2专票
	private String mainOrderId;		// main_order_id
	private String remark;		// remark
	private Date returnEmsTime;		// return_ems_time
	private String invocieTypeTwo;		// 开票类型：1，个人，2企业
	private String invocieTypeThree;		// 寄送类型 ，1邮寄，2电子，3拍照
	private String invocieBank;		// 开户行
	private String downloadAddr;		// download_addr
	
	public FxInvocie() {
		super();
	}

	public FxInvocie(String id){
		super(id);
	}

	@NotNull(message="invocie_id不能为空")
	public Long getInvocieId() {
		return invocieId;
	}

	public void setInvocieId(Long invocieId) {
		this.invocieId = invocieId;
	}
	
	public Long getApplyUserId() {
		return applyUserId;
	}

	public void setApplyUserId(Long applyUserId) {
		this.applyUserId = applyUserId;
	}
	
	@Length(min=0, max=50, message="apply_user_name长度必须介于 0 和 50 之间")
	public String getApplyUserName() {
		return applyUserName;
	}

	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	@Length(min=0, max=50, message="cust_name长度必须介于 0 和 50 之间")
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	@Length(min=0, max=15, message="cust_tel长度必须介于 0 和 15 之间")
	public String getCustTel() {
		return custTel;
	}

	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}
	
	public Long getEmsCompany() {
		return emsCompany;
	}

	public void setEmsCompany(Long emsCompany) {
		this.emsCompany = emsCompany;
	}
	
	@Length(min=0, max=100, message="ems_company_name长度必须介于 0 和 100 之间")
	public String getEmsCompanyName() {
		return emsCompanyName;
	}

	public void setEmsCompanyName(String emsCompanyName) {
		this.emsCompanyName = emsCompanyName;
	}
	
	@Length(min=0, max=50, message="ems_nbr长度必须介于 0 和 50 之间")
	public String getEmsNbr() {
		return emsNbr;
	}

	public void setEmsNbr(String emsNbr) {
		this.emsNbr = emsNbr;
	}
	
	public String getEmsPrice() {
		return emsPrice;
	}

	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}
	
	@Length(min=0, max=100, message="invocie_nbr长度必须介于 0 和 100 之间")
	public String getInvocieNbr() {
		return invocieNbr;
	}

	public void setInvocieNbr(String invocieNbr) {
		this.invocieNbr = invocieNbr;
	}
	
	public String getInvociePlayPrice() {
		return invociePlayPrice;
	}

	public void setInvociePlayPrice(String invociePlayPrice) {
		this.invociePlayPrice = invociePlayPrice;
	}
	
	public String getInvociePrice() {
		return invociePrice;
	}

	public void setInvociePrice(String invociePrice) {
		this.invociePrice = invociePrice;
	}
	
	@Length(min=0, max=1, message="invocie_state长度必须介于 0 和 1 之间")
	public String getInvocieState() {
		return invocieState;
	}

	public void setInvocieState(String invocieState) {
		this.invocieState = invocieState;
	}
	
	@Length(min=0, max=200, message="invocie_title长度必须介于 0 和 200 之间")
	public String getInvocieTitle() {
		return invocieTitle;
	}

	public void setInvocieTitle(String invocieTitle) {
		this.invocieTitle = invocieTitle;
	}
	
	@Length(min=0, max=11, message="发票类型 ，1普票，，2专票长度必须介于 0 和 11 之间")
	public String getInvocieType() {
		return invocieType;
	}

	public void setInvocieType(String invocieType) {
		this.invocieType = invocieType;
	}
	
	@Length(min=0, max=50, message="main_order_id长度必须介于 0 和 50 之间")
	public String getMainOrderId() {
		return mainOrderId;
	}

	public void setMainOrderId(String mainOrderId) {
		this.mainOrderId = mainOrderId;
	}
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getReturnEmsTime() {
		return returnEmsTime;
	}

	public void setReturnEmsTime(Date returnEmsTime) {
		this.returnEmsTime = returnEmsTime;
	}
	
	@Length(min=0, max=11, message="开票类型：1，个人，2企业长度必须介于 0 和 11 之间")
	public String getInvocieTypeTwo() {
		return invocieTypeTwo;
	}

	public void setInvocieTypeTwo(String invocieTypeTwo) {
		this.invocieTypeTwo = invocieTypeTwo;
	}
	
	@Length(min=0, max=11, message="寄送类型 ，1邮寄，2电子，3拍照长度必须介于 0 和 11 之间")
	public String getInvocieTypeThree() {
		return invocieTypeThree;
	}

	public void setInvocieTypeThree(String invocieTypeThree) {
		this.invocieTypeThree = invocieTypeThree;
	}
	
	@Length(min=0, max=300, message="开户行长度必须介于 0 和 300 之间")
	public String getInvocieBank() {
		return invocieBank;
	}

	public void setInvocieBank(String invocieBank) {
		this.invocieBank = invocieBank;
	}
	
	@Length(min=0, max=300, message="download_addr长度必须介于 0 和 300 之间")
	public String getDownloadAddr() {
		return downloadAddr;
	}

	public void setDownloadAddr(String downloadAddr) {
		this.downloadAddr = downloadAddr;
	}
	
}