/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.finance.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * fx_jingdong_billEntity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxJingdongBill extends DataEntity<FxJingdongBill> {
	
	private static final long serialVersionUID = 1L;
	private String orderNumber;		// 订单编号
	private String documentNumber;		// 单据编号
	private String documentType;		// 单据类型: 0 非销售订单  1 订单  2 取消退款单  3 售后服务单
	private String itemNumber;		// 商品编号
	private String itemName;		// 商品名称
	private Date timeOfCost;		// 费用发生时间
	private Date costBillingTime;		// 费用计费时间
	private Date costSettlementTime;		// 费用结算时间
	private String feeItem;		// 费用项: 0，随单送的京豆 1 佣金 2 代收配送费 3 货款 4 短信服务费
	private String sumOfMany;		// 金额
	private String currency;		// 币种 ，默认0 CNY
	private String directionOfRevenueAndExpenditure;		// 收支方向 0 支出 1 收入
	private String purseSettlementNote;		// 钱包结算备注
	private Long shopNumber;		// 店铺号
	private String jingdongStoreNumber;		// 京东门店编号
	private String brandStoreNumber;		// 品牌门店编号
	private String storeName;		// 门店名称
	private Date statementDate;		// 账单日期
	private String backup1;		// 备份字段
	private String stateOfSettlement;		// 结算状态 1：结算完成  0 未结算
	private String importDate;		// 导入这条记录的日期
	
	public FxJingdongBill() {
		super();
	}

	public FxJingdongBill(String id){
		super(id);
	}

	@Length(min=1, max=20, message="订单编号长度必须介于 1 和 20 之间")
	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	@Length(min=1, max=100, message="单据编号长度必须介于 1 和 100 之间")
	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	
	@Length(min=1, max=8, message="单据类型: 0 非销售订单  1 订单  2 取消退款单  3 售后服务单长度必须介于 1 和 8 之间")
	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	
	@Length(min=0, max=20, message="商品编号长度必须介于 0 和 20 之间")
	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	
	@Length(min=0, max=128, message="商品名称长度必须介于 0 和 128 之间")
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTimeOfCost() {
		return timeOfCost;
	}

	public void setTimeOfCost(Date timeOfCost) {
		this.timeOfCost = timeOfCost;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCostBillingTime() {
		return costBillingTime;
	}

	public void setCostBillingTime(Date costBillingTime) {
		this.costBillingTime = costBillingTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCostSettlementTime() {
		return costSettlementTime;
	}

	public void setCostSettlementTime(Date costSettlementTime) {
		this.costSettlementTime = costSettlementTime;
	}
	
	@Length(min=0, max=8, message="费用项: 0，随单送的京豆 1 佣金 2 代收配送费 3 货款 4 短信服务费长度必须介于 0 和 8 之间")
	public String getFeeItem() {
		return feeItem;
	}

	public void setFeeItem(String feeItem) {
		this.feeItem = feeItem;
	}
	
	public String getSumOfMany() {
		return sumOfMany;
	}

	public void setSumOfMany(String sumOfMany) {
		this.sumOfMany = sumOfMany;
	}
	
	@Length(min=0, max=8, message="币种 ，默认0 CNY长度必须介于 0 和 8 之间")
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@Length(min=0, max=2, message="收支方向 0 支出 1 收入长度必须介于 0 和 2 之间")
	public String getDirectionOfRevenueAndExpenditure() {
		return directionOfRevenueAndExpenditure;
	}

	public void setDirectionOfRevenueAndExpenditure(String directionOfRevenueAndExpenditure) {
		this.directionOfRevenueAndExpenditure = directionOfRevenueAndExpenditure;
	}
	
	@Length(min=0, max=255, message="钱包结算备注长度必须介于 0 和 255 之间")
	public String getPurseSettlementNote() {
		return purseSettlementNote;
	}

	public void setPurseSettlementNote(String purseSettlementNote) {
		this.purseSettlementNote = purseSettlementNote;
	}
	
	public Long getShopNumber() {
		return shopNumber;
	}

	public void setShopNumber(Long shopNumber) {
		this.shopNumber = shopNumber;
	}
	
	@Length(min=0, max=30, message="京东门店编号长度必须介于 0 和 30 之间")
	public String getJingdongStoreNumber() {
		return jingdongStoreNumber;
	}

	public void setJingdongStoreNumber(String jingdongStoreNumber) {
		this.jingdongStoreNumber = jingdongStoreNumber;
	}
	
	@Length(min=0, max=30, message="品牌门店编号长度必须介于 0 和 30 之间")
	public String getBrandStoreNumber() {
		return brandStoreNumber;
	}

	public void setBrandStoreNumber(String brandStoreNumber) {
		this.brandStoreNumber = brandStoreNumber;
	}
	
	@Length(min=0, max=100, message="门店名称长度必须介于 0 和 100 之间")
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStatementDate() {
		return statementDate;
	}

	public void setStatementDate(Date statementDate) {
		this.statementDate = statementDate;
	}
	
	@Length(min=0, max=20, message="备份字段长度必须介于 0 和 20 之间")
	public String getBackup1() {
		return backup1;
	}

	public void setBackup1(String backup1) {
		this.backup1 = backup1;
	}
	
	@Length(min=0, max=8, message="结算状态 1：结算完成  0 未结算长度必须介于 0 和 8 之间")
	public String getStateOfSettlement() {
		return stateOfSettlement;
	}

	public void setStateOfSettlement(String stateOfSettlement) {
		this.stateOfSettlement = stateOfSettlement;
	}
	
	@Length(min=0, max=100, message="导入这条记录的日期长度必须介于 0 和 100 之间")
	public String getImportDate() {
		return importDate;
	}

	public void setImportDate(String importDate) {
		this.importDate = importDate;
	}
	
}