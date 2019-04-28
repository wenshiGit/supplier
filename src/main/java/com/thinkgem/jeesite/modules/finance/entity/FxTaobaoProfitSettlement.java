/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.finance.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * fx_taobao_profit_settlementEntity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxTaobaoProfitSettlement extends DataEntity<FxTaobaoProfitSettlement> {
	
	private static final long serialVersionUID = 1L;
	private String ourSystemOrderNo;		// 云分销订单号
	private Long shopId;		// 店铺ID
	private Date ourSystemOrderTime;		// 自家系统下单时间
	private Date orderTime;		// 账单最后出现日期
	private String taobaoOrderNo;		// 淘宝订单号
	private String alipayTradeNo;		// 支付宝交易号
	private String serviceFee;		// 花呗支付服务费
	private String loanIncome;		// 交易收入
	private String donationOfTrade;		// 公益宝贝捐款
	private String distributionCosts;		// 快递费
	private String tmailCommission;		// 天猫佣金（类目）
	private String integralWithhold;		// 代扣返点积分
	private String seoCommissionFee;		// 淘宝客佣金代扣款
	private String otherFee;		// 其它
	private String subtotalIncome;		// 收入小计
	private String creditcardPayServiceFee;		// 信用卡支付服务费
	private String afterSaleRefund;		// 售后退款
	private String commissionReturngive;		// 佣金退回
	private String freightRisk;		// 运费险
	private String pointReturngive;		// 积分退回
	private String subtotalExpenditure;		// 支出小计
	private String amountProcured;		// 采购金额
	private String expressFee;		// 快递费
	private String channelRefunds;		// 渠道退款额
	private String profit;		// 利润
	private Date importDate;		// 账单日期
	
	public FxTaobaoProfitSettlement() {
		super();
	}

	public FxTaobaoProfitSettlement(String id){
		super(id);
	}

	@Length(min=0, max=255, message="云分销订单号长度必须介于 0 和 255 之间")
	public String getOurSystemOrderNo() {
		return ourSystemOrderNo;
	}

	public void setOurSystemOrderNo(String ourSystemOrderNo) {
		this.ourSystemOrderNo = ourSystemOrderNo;
	}
	
	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
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
	
	@Length(min=0, max=100, message="淘宝订单号长度必须介于 0 和 100 之间")
	public String getTaobaoOrderNo() {
		return taobaoOrderNo;
	}

	public void setTaobaoOrderNo(String taobaoOrderNo) {
		this.taobaoOrderNo = taobaoOrderNo;
	}
	
	@Length(min=0, max=255, message="支付宝交易号长度必须介于 0 和 255 之间")
	public String getAlipayTradeNo() {
		return alipayTradeNo;
	}

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	
	public String getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}
	
	public String getLoanIncome() {
		return loanIncome;
	}

	public void setLoanIncome(String loanIncome) {
		this.loanIncome = loanIncome;
	}
	
	public String getDonationOfTrade() {
		return donationOfTrade;
	}

	public void setDonationOfTrade(String donationOfTrade) {
		this.donationOfTrade = donationOfTrade;
	}
	
	public String getDistributionCosts() {
		return distributionCosts;
	}

	public void setDistributionCosts(String distributionCosts) {
		this.distributionCosts = distributionCosts;
	}
	
	public String getTmailCommission() {
		return tmailCommission;
	}

	public void setTmailCommission(String tmailCommission) {
		this.tmailCommission = tmailCommission;
	}
	
	public String getIntegralWithhold() {
		return integralWithhold;
	}

	public void setIntegralWithhold(String integralWithhold) {
		this.integralWithhold = integralWithhold;
	}
	
	public String getSeoCommissionFee() {
		return seoCommissionFee;
	}

	public void setSeoCommissionFee(String seoCommissionFee) {
		this.seoCommissionFee = seoCommissionFee;
	}
	
	public String getOtherFee() {
		return otherFee;
	}

	public void setOtherFee(String otherFee) {
		this.otherFee = otherFee;
	}
	
	public String getSubtotalIncome() {
		return subtotalIncome;
	}

	public void setSubtotalIncome(String subtotalIncome) {
		this.subtotalIncome = subtotalIncome;
	}
	
	public String getCreditcardPayServiceFee() {
		return creditcardPayServiceFee;
	}

	public void setCreditcardPayServiceFee(String creditcardPayServiceFee) {
		this.creditcardPayServiceFee = creditcardPayServiceFee;
	}
	
	public String getAfterSaleRefund() {
		return afterSaleRefund;
	}

	public void setAfterSaleRefund(String afterSaleRefund) {
		this.afterSaleRefund = afterSaleRefund;
	}
	
	public String getCommissionReturngive() {
		return commissionReturngive;
	}

	public void setCommissionReturngive(String commissionReturngive) {
		this.commissionReturngive = commissionReturngive;
	}
	
	public String getFreightRisk() {
		return freightRisk;
	}

	public void setFreightRisk(String freightRisk) {
		this.freightRisk = freightRisk;
	}
	
	public String getPointReturngive() {
		return pointReturngive;
	}

	public void setPointReturngive(String pointReturngive) {
		this.pointReturngive = pointReturngive;
	}
	
	public String getSubtotalExpenditure() {
		return subtotalExpenditure;
	}

	public void setSubtotalExpenditure(String subtotalExpenditure) {
		this.subtotalExpenditure = subtotalExpenditure;
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
	
	public String getChannelRefunds() {
		return channelRefunds;
	}

	public void setChannelRefunds(String channelRefunds) {
		this.channelRefunds = channelRefunds;
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