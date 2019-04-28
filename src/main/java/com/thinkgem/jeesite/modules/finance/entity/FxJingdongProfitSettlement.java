/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.finance.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * fx_jingdong_profit_settlementEntity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxJingdongProfitSettlement extends DataEntity<FxJingdongProfitSettlement> {
	
	private static final long serialVersionUID = 1L;
	private Long ourSystemOrderNo;		// 自家系统中订单号
	private Date ourSystemOrderTime;		// 自家系统订单时间
	private Date orderTime;		// 账单日期
	private Long shopId;		// 店铺ID
	private String orderNumber;		// 订单编号
	private String documentCode;		// 单据编码
	private String loanIncome;		// 货款 收入
	private String jingdouIncome;		// 京豆收入
	private String distributionCostsIncome;		// 配送费收入
	private String commissionIncome;		// 佣金收入
	private String premiumIncome;		// 保险费收入
	private String otherIncome;		// 其他收入
	private String subtotalIncome;		// subtotal_income
	private String loanAfterSale;		// 货款售后
	private String jingdouAfterSale;		// 京豆 售后
	private String distributionCostsAfterSale;		// 配送费售后
	private String commissionAfterSale;		// 佣金售后
	private String subtotalAfterSale;		// 小计售后
	private String amountProcured;		// 采购金额
	private String expressFee;		// 快递费
	private String refunds;		// 退款额
	private String profit;		// 利润
	private Date importDate;		// 导入日期
	
	public FxJingdongProfitSettlement() {
		super();
	}

	public FxJingdongProfitSettlement(String id){
		super(id);
	}

	public Long getOurSystemOrderNo() {
		return ourSystemOrderNo;
	}

	public void setOurSystemOrderNo(Long ourSystemOrderNo) {
		this.ourSystemOrderNo = ourSystemOrderNo;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getOurSystemOrderTime() {
		return ourSystemOrderTime;
	}

	public void setOurSystemOrderTime(Date ourSystemOrderTime) {
		this.ourSystemOrderTime = ourSystemOrderTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	
	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	
	@Length(min=0, max=20, message="订单编号长度必须介于 0 和 20 之间")
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	@Length(min=0, max=255, message="单据编码长度必须介于 0 和 255 之间")
	public String getDocumentCode() {
		return documentCode;
	}

	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}
	
	public String getLoanIncome() {
		return loanIncome;
	}

	public void setLoanIncome(String loanIncome) {
		this.loanIncome = loanIncome;
	}
	
	public String getJingdouIncome() {
		return jingdouIncome;
	}

	public void setJingdouIncome(String jingdouIncome) {
		this.jingdouIncome = jingdouIncome;
	}
	
	public String getDistributionCostsIncome() {
		return distributionCostsIncome;
	}

	public void setDistributionCostsIncome(String distributionCostsIncome) {
		this.distributionCostsIncome = distributionCostsIncome;
	}
	
	public String getCommissionIncome() {
		return commissionIncome;
	}

	public void setCommissionIncome(String commissionIncome) {
		this.commissionIncome = commissionIncome;
	}
	
	public String getPremiumIncome() {
		return premiumIncome;
	}

	public void setPremiumIncome(String premiumIncome) {
		this.premiumIncome = premiumIncome;
	}
	
	public String getOtherIncome() {
		return otherIncome;
	}

	public void setOtherIncome(String otherIncome) {
		this.otherIncome = otherIncome;
	}
	
	public String getSubtotalIncome() {
		return subtotalIncome;
	}

	public void setSubtotalIncome(String subtotalIncome) {
		this.subtotalIncome = subtotalIncome;
	}
	
	public String getLoanAfterSale() {
		return loanAfterSale;
	}

	public void setLoanAfterSale(String loanAfterSale) {
		this.loanAfterSale = loanAfterSale;
	}
	
	public String getJingdouAfterSale() {
		return jingdouAfterSale;
	}

	public void setJingdouAfterSale(String jingdouAfterSale) {
		this.jingdouAfterSale = jingdouAfterSale;
	}
	
	public String getDistributionCostsAfterSale() {
		return distributionCostsAfterSale;
	}

	public void setDistributionCostsAfterSale(String distributionCostsAfterSale) {
		this.distributionCostsAfterSale = distributionCostsAfterSale;
	}
	
	public String getCommissionAfterSale() {
		return commissionAfterSale;
	}

	public void setCommissionAfterSale(String commissionAfterSale) {
		this.commissionAfterSale = commissionAfterSale;
	}
	
	public String getSubtotalAfterSale() {
		return subtotalAfterSale;
	}

	public void setSubtotalAfterSale(String subtotalAfterSale) {
		this.subtotalAfterSale = subtotalAfterSale;
	}
	
	public String getAmountProcured() {
		return amountProcured;
	}

	public void setAmountProcured(String amountProcured) {
		this.amountProcured = amountProcured;
	}
	
	public String getExpressFee() {
		return expressFee;
	}

	public void setExpressFee(String expressFee) {
		this.expressFee = expressFee;
	}
	
	public String getRefunds() {
		return refunds;
	}

	public void setRefunds(String refunds) {
		this.refunds = refunds;
	}
	
	public String getProfit() {
		return profit;
	}

	public void setProfit(String profit) {
		this.profit = profit;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getImportDate() {
		return importDate;
	}

	public void setImportDate(Date importDate) {
		this.importDate = importDate;
	}
	
}