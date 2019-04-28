/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * fx_transfer_channel_configEntity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxTransferChannelConfig extends DataEntity<FxTransferChannelConfig> {
	
	private static final long serialVersionUID = 1L;
	private Long transferChannelId;		// 转仓渠道ID
	private String transferChannelName;		// 转仓渠道名称
	private String state;		// 1为可用，0为禁用，-1为删除
	private String orderSeq;		// 排序字段
	private String differAgio;		// 差多少折扣的可以转仓
	
	public FxTransferChannelConfig() {
		super();
	}

	public FxTransferChannelConfig(String id){
		super(id);
	}

	public Long getTransferChannelId() {
		return transferChannelId;
	}

	public void setTransferChannelId(Long transferChannelId) {
		this.transferChannelId = transferChannelId;
	}
	
	@Length(min=0, max=200, message="转仓渠道名称长度必须介于 0 和 200 之间")
	public String getTransferChannelName() {
		return transferChannelName;
	}

	public void setTransferChannelName(String transferChannelName) {
		this.transferChannelName = transferChannelName;
	}
	
	@Length(min=0, max=6, message="1为可用，0为禁用，-1为删除长度必须介于 0 和 6 之间")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Length(min=0, max=6, message="排序字段长度必须介于 0 和 6 之间")
	public String getOrderSeq() {
		return orderSeq;
	}

	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}
	
	public String getDifferAgio() {
		return differAgio;
	}

	public void setDifferAgio(String differAgio) {
		this.differAgio = differAgio;
	}
	
}