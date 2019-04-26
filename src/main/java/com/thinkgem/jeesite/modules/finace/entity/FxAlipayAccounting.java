/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.finace.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
//import org.hibernate.validator.constraints.Length(min=0, max=255, message="支付宝交易号;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 支付宝账务Entity
 * @author MaoNian
 * @version 2019-04-26
 */
public class FxAlipayAccounting extends DataEntity<FxAlipayAccounting> {
	
	private static final long serialVersionUID = 1L;
	private Date timeOfEntry;		// 记账时间
	private String alipayTradeNumber;		// 支付宝交易号(暂不提供)
	private String alipaySerialNumber;		// 支付宝流水号
	private String merchantOrderNumber;		// 支付宝商户订单号
	private String accountType;		// 账务类型 '0' 代扣款 '1' 交易 '2' 服务费 '3' 交易退款 '4' 交易分账
	private String income;		// 收入
	private String expenditure;		// 支出
	private String accountBalance;		// 账户余额
	private String serviceCharge;		// 服务费
	private String channelOfPayment;		// 支付渠道，请查system_enum表
	private String contractProducts;		// 签约产品
	private String reciprocalAccount;		// 对方账户
	private String reciprocalName;		// 对方名称
	private String bankOrderNumber;		// 银行订单号
	private String tradeName;		// 商品名称
	private Date importDate;		// 同步日期，即从接口下载到本地数据库中的日期
	
	public FxAlipayAccounting() {
		super();
	}

	public FxAlipayAccounting(String id){
		super(id);
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTimeOfEntry() {
		return timeOfEntry;
	}

	public void setTimeOfEntry(Date timeOfEntry) {
		this.timeOfEntry = timeOfEntry;
	}
	
	@Length(min=0, max=255, message="支付宝交易号(暂不提供)长度必须介于 0 和 255 之间")
	public String getAlipayTradeNumber() {
		return alipayTradeNumber;
	}

	public void setAlipayTradeNumber(String alipayTradeNumber) {
		this.alipayTradeNumber = alipayTradeNumber;
	}
	
	@Length(min=0, max=255, message="支付宝流水号长度必须介于 0 和 255 之间")
	public String getAlipaySerialNumber() {
		return alipaySerialNumber;
	}

	public void setAlipaySerialNumber(String alipaySerialNumber) {
		this.alipaySerialNumber = alipaySerialNumber;
	}
	
	@Length(min=0, max=255, message="支付宝商户订单号长度必须介于 0 和 255 之间")
	public String getMerchantOrderNumber() {
		return merchantOrderNumber;
	}

	public void setMerchantOrderNumber(String merchantOrderNumber) {
		this.merchantOrderNumber = merchantOrderNumber;
	}
	
	@Length(min=0, max=2, message="账务类型 '0' 代扣款 '1' 交易 '2' 服务费 '3' 交易退款 '4' 交易分账长度必须介于 0 和 2 之间")
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getIncome() {
		return income;
	}

	public void setIncome(String income) {
		this.income = income;
	}
	
	public String getExpenditure() {
		return expenditure;
	}

	public void setExpenditure(String expenditure) {
		this.expenditure = expenditure;
	}
	
	public String getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public String getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(String serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	
	@Length(min=0, max=2, message="支付渠道，请查system_enum表长度必须介于 0 和 2 之间")
	public String getChannelOfPayment() {
		return channelOfPayment;
	}

	public void setChannelOfPayment(String channelOfPayment) {
		this.channelOfPayment = channelOfPayment;
	}
	
	@Length(min=0, max=2, message="签约产品长度必须介于 0 和 2 之间")
	public String getContractProducts() {
		return contractProducts;
	}

	public void setContractProducts(String contractProducts) {
		this.contractProducts = contractProducts;
	}
	
	@Length(min=0, max=100, message="对方账户长度必须介于 0 和 100 之间")
	public String getReciprocalAccount() {
		return reciprocalAccount;
	}

	public void setReciprocalAccount(String reciprocalAccount) {
		this.reciprocalAccount = reciprocalAccount;
	}
	
	@Length(min=0, max=100, message="对方名称长度必须介于 0 和 100 之间")
	public String getReciprocalName() {
		return reciprocalName;
	}

	public void setReciprocalName(String reciprocalName) {
		this.reciprocalName = reciprocalName;
	}
	
	@Length(min=0, max=100, message="银行订单号长度必须介于 0 和 100 之间")
	public String getBankOrderNumber() {
		return bankOrderNumber;
	}

	public void setBankOrderNumber(String bankOrderNumber) {
		this.bankOrderNumber = bankOrderNumber;
	}
	
	@Length(min=0, max=255, message="商品名称长度必须介于 0 和 255 之间")
	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getImportDate() {
		return importDate;
	}

	public void setImportDate(Date importDate) {
		this.importDate = importDate;
	}
	
}