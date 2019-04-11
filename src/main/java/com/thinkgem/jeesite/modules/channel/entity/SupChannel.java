/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.channel.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 渠道管理Entity
 * @author ZiruiSong
 * @version 2019-04-11
 */
public class SupChannel extends DataEntity<SupChannel> {
	
	private static final long serialVersionUID = 1L;
	private String channelName;		// 渠道名称
	private String cityId;		// 所在城市
	private Double defaultAgio;		// 渠道默认折扣
	private String desc;		// 渠道描述
	private Double commissionAgio;		// 抽成折扣
	private String distributionDesc;		// 配货说明
	private Double accountBalance;		// 账户余额
	private String channelUserId;		// 用户ID
	private String defaultExpress;		// 渠道默认发货快递
	private String deliveryAddress;		// 发货地
	private String status;		// 渠道状态
	
	public SupChannel() {
		super();
	}

	public SupChannel(String id){
		super(id);
	}

	@Length(min=1, max=100, message="渠道名称长度必须介于 1 和 100 之间")
	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	@Length(min=0, max=64, message="所在城市长度必须介于 0 和 64 之间")
	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	
	public Double getDefaultAgio() {
		return defaultAgio;
	}

	public void setDefaultAgio(Double defaultAgio) {
		this.defaultAgio = defaultAgio;
	}
	
	@Length(min=0, max=255, message="渠道描述长度必须介于 0 和 255 之间")
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public Double getCommissionAgio() {
		return commissionAgio;
	}

	public void setCommissionAgio(Double commissionAgio) {
		this.commissionAgio = commissionAgio;
	}
	
	@Length(min=0, max=255, message="配货说明长度必须介于 0 和 255 之间")
	public String getDistributionDesc() {
		return distributionDesc;
	}

	public void setDistributionDesc(String distributionDesc) {
		this.distributionDesc = distributionDesc;
	}
	
	public Double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	@Length(min=0, max=64, message="用户ID长度必须介于 0 和 64 之间")
	public String getChannelUserId() {
		return channelUserId;
	}

	public void setChannelUserId(String channelUserId) {
		this.channelUserId = channelUserId;
	}
	
	@Length(min=0, max=255, message="渠道默认发货快递长度必须介于 0 和 255 之间")
	public String getDefaultExpress() {
		return defaultExpress;
	}

	public void setDefaultExpress(String defaultExpress) {
		this.defaultExpress = defaultExpress;
	}
	
	@Length(min=0, max=255, message="发货地长度必须介于 0 和 255 之间")
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	
	@Length(min=0, max=4, message="渠道状态长度必须介于 0 和 4 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}