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
 * fx_tb_billsEntity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxTbBills extends DataEntity<FxTbBills> {
	
	private static final long serialVersionUID = 1L;
	private Long bid;		// 账单编号
	private Long accountId;		// 官网术语：科目编号
	private String tradeId;		// 交易订单编号
	private String orderId;		// 交易子订单编号
	private Long shopId;		// 店铺id
	private Long totalAmount;		// 交易金额
	private Long amount;		// 账单金额,退款时返回的是负数
	private Date bookTime;		// 记账时间
	private Date bizTime;		// 业务时间,订单交易完成的时间
	private Date payTime;		// 支付时间,收取佣金时支付宝的扣款时间
	private String alipayMail;		// 支付宝账户名称
	private String objAlipayMail;		// 目标支付宝账户名称
	private String alipayOutno;		// 支付宝商户订单号
	private String alipayNotice;		// 支付宝备注
	private String status;		// 0-未支付,1-支付成功,2-支付失败
	private Date gmtCreate;		// 创建时间
	private String gmtModified;		// 修改时间
	private String numiid;		// 所属商品编号
	private String alipayId;		// 支付宝账户编号
	private String alipayNo;		// 支付宝交易号,暂不提供
	
	public FxTbBills() {
		super();
	}

	public FxTbBills(String id){
		super(id);
	}

	@NotNull(message="账单编号不能为空")
	public Long getBid() {
		return bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}
	
	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	
	@Length(min=0, max=100, message="交易订单编号长度必须介于 0 和 100 之间")
	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	
	@Length(min=0, max=100, message="交易子订单编号长度必须介于 0 和 100 之间")
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	
	public Long getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Long totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getBookTime() {
		return bookTime;
	}

	public void setBookTime(Date bookTime) {
		this.bookTime = bookTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getBizTime() {
		return bizTime;
	}

	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	
	@Length(min=0, max=100, message="支付宝账户名称长度必须介于 0 和 100 之间")
	public String getAlipayMail() {
		return alipayMail;
	}

	public void setAlipayMail(String alipayMail) {
		this.alipayMail = alipayMail;
	}
	
	@Length(min=0, max=100, message="目标支付宝账户名称长度必须介于 0 和 100 之间")
	public String getObjAlipayMail() {
		return objAlipayMail;
	}

	public void setObjAlipayMail(String objAlipayMail) {
		this.objAlipayMail = objAlipayMail;
	}
	
	@Length(min=0, max=100, message="支付宝商户订单号长度必须介于 0 和 100 之间")
	public String getAlipayOutno() {
		return alipayOutno;
	}

	public void setAlipayOutno(String alipayOutno) {
		this.alipayOutno = alipayOutno;
	}
	
	@Length(min=0, max=100, message="支付宝备注长度必须介于 0 和 100 之间")
	public String getAlipayNotice() {
		return alipayNotice;
	}

	public void setAlipayNotice(String alipayNotice) {
		this.alipayNotice = alipayNotice;
	}
	
	@Length(min=0, max=11, message="0-未支付,1-支付成功,2-支付失败长度必须介于 0 和 11 之间")
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
	
	@Length(min=0, max=100, message="修改时间长度必须介于 0 和 100 之间")
	public String getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}
	
	@Length(min=0, max=100, message="所属商品编号长度必须介于 0 和 100 之间")
	public String getNumiid() {
		return numiid;
	}

	public void setNumiid(String numiid) {
		this.numiid = numiid;
	}
	
	@Length(min=0, max=100, message="支付宝账户编号长度必须介于 0 和 100 之间")
	public String getAlipayId() {
		return alipayId;
	}

	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}
	
	@Length(min=0, max=100, message="支付宝交易号,暂不提供长度必须介于 0 和 100 之间")
	public String getAlipayNo() {
		return alipayNo;
	}

	public void setAlipayNo(String alipayNo) {
		this.alipayNo = alipayNo;
	}
	
}