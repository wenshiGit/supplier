/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.finance.entity;

import org.hibernate.validator.constraints.Length;
import com.thinkgem.jeesite.modules.sys.entity.User;
import javax.validation.constraints.NotNull;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 账户明细表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxUsersMoneyAccount extends DataEntity<FxUsersMoneyAccount> {
	
	private static final long serialVersionUID = 1L;
	private String addMoney;		// 增加或者减少金额
	private String eventDesc;		// 事件描述
	private String eventType;		// 事件类型
	private Long operId;		// 操作用户
	private Long orderId;		// 订单号
	private String surplusMoney;		// 操作前剩余金额
	private String useMoney;		// 实际需要金额
	private User user;		// 被操作用户
	private String userMoney;		// 用户剩余金额
	
	public FxUsersMoneyAccount() {
		super();
	}

	public FxUsersMoneyAccount(String id){
		super(id);
	}

	public String getAddMoney() {
		return addMoney;
	}

	public void setAddMoney(String addMoney) {
		this.addMoney = addMoney;
	}
	
	public String getEventDesc() {
		return eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}
	
	@Length(min=1, max=6, message="事件类型长度必须介于 1 和 6 之间")
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	
	public Long getOperId() {
		return operId;
	}

	public void setOperId(Long operId) {
		this.operId = operId;
	}
	
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	public String getSurplusMoney() {
		return surplusMoney;
	}

	public void setSurplusMoney(String surplusMoney) {
		this.surplusMoney = surplusMoney;
	}
	
	public String getUseMoney() {
		return useMoney;
	}

	public void setUseMoney(String useMoney) {
		this.useMoney = useMoney;
	}
	
	@NotNull(message="被操作用户不能为空")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getUserMoney() {
		return userMoney;
	}

	public void setUserMoney(String userMoney) {
		this.userMoney = userMoney;
	}
	
}