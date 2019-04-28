/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.distribution.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * fx_order_finance_importEntity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxOrderFinanceImport extends DataEntity<FxOrderFinanceImport> {
	
	private static final long serialVersionUID = 1L;
	private Long orderId;		// 订单编号
	private String goodsNbr;		// 货号
	private String goodsSize;		// 尺码
	private String importChannelPrice;		// 导入渠道结算金额
	private String importChannelRefund;		// 导入渠道退款金额
	private Date importDate;		// 导入日期
	
	public FxOrderFinanceImport() {
		super();
	}

	public FxOrderFinanceImport(String id){
		super(id);
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	@Length(min=0, max=255, message="货号长度必须介于 0 和 255 之间")
	public String getGoodsNbr() {
		return goodsNbr;
	}

	public void setGoodsNbr(String goodsNbr) {
		this.goodsNbr = goodsNbr;
	}
	
	@Length(min=0, max=100, message="尺码长度必须介于 0 和 100 之间")
	public String getGoodsSize() {
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	
	public String getImportChannelPrice() {
		return importChannelPrice;
	}

	public void setImportChannelPrice(String importChannelPrice) {
		this.importChannelPrice = importChannelPrice;
	}
	
	public String getImportChannelRefund() {
		return importChannelRefund;
	}

	public void setImportChannelRefund(String importChannelRefund) {
		this.importChannelRefund = importChannelRefund;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getImportDate() {
		return importDate;
	}

	public void setImportDate(Date importDate) {
		this.importDate = importDate;
	}
	
}