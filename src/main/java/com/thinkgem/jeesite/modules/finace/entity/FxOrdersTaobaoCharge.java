/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.finace.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.thinkgem.jeesite.modules.sys.entity.User;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 淘宝账号充值Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxOrdersTaobaoCharge extends DataEntity<FxOrdersTaobaoCharge> {
	
	private static final long serialVersionUID = 1L;
	private String buyerNick;		// 充值帐号
	private String tid;		// 交易ID（淘宝订单编号）
	private String title;		// 淘宝订单标题
	private String tradeMoney;		// 交易金额（也就是充值的金额）
	private Date tradeTime;		// 交易创建时间
	private Date payTime;		// 付款时间
	private Date downloadTime;		// 下载时间
	private String status;		// 交易状态
	private Date sendGoodsDate;		// 发货时间
	private Date chargeDate;		// 充值时间
	private String chargeStatus;		// 0：待充值 1：充值成功 2：充值失败
	private String chargeStatusDesc;		// 充值失败的原因/备注
	private User user;		// 用户id
	
	public FxOrdersTaobaoCharge() {
		super();
	}

	public FxOrdersTaobaoCharge(String id){
		super(id);
	}

	@Length(min=0, max=200, message="充值帐号长度必须介于 0 和 200 之间")
	public String getBuyerNick() {
		return buyerNick;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	
	@Length(min=0, max=200, message="交易ID（淘宝订单编号）长度必须介于 0 和 200 之间")
	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}
	
	@Length(min=0, max=200, message="淘宝订单标题长度必须介于 0 和 200 之间")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTradeMoney() {
		return tradeMoney;
	}

	public void setTradeMoney(String tradeMoney) {
		this.tradeMoney = tradeMoney;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTradeTime() {
		return tradeTime;
	}

	public void setTradeTime(Date tradeTime) {
		this.tradeTime = tradeTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDownloadTime() {
		return downloadTime;
	}

	public void setDownloadTime(Date downloadTime) {
		this.downloadTime = downloadTime;
	}
	
	@Length(min=0, max=100, message="交易状态长度必须介于 0 和 100 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getSendGoodsDate() {
		return sendGoodsDate;
	}

	public void setSendGoodsDate(Date sendGoodsDate) {
		this.sendGoodsDate = sendGoodsDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getChargeDate() {
		return chargeDate;
	}

	public void setChargeDate(Date chargeDate) {
		this.chargeDate = chargeDate;
	}
	
	@Length(min=0, max=2, message="0：待充值 1：充值成功 2：充值失败长度必须介于 0 和 2 之间")
	public String getChargeStatus() {
		return chargeStatus;
	}

	public void setChargeStatus(String chargeStatus) {
		this.chargeStatus = chargeStatus;
	}
	
	@Length(min=0, max=100, message="充值失败的原因/备注长度必须介于 0 和 100 之间")
	public String getChargeStatusDesc() {
		return chargeStatusDesc;
	}

	public void setChargeStatusDesc(String chargeStatusDesc) {
		this.chargeStatusDesc = chargeStatusDesc;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}