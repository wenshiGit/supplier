/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import javax.validation.constraints.NotNull;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 渠道运输Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxChannelCarriage extends DataEntity<FxChannelCarriage> {
	
	private static final long serialVersionUID = 1L;
	private Long channelCarrId;		// channel_carr_id
	private Long carrId;		// carr_id
	private Long channelId;		// channel_id
	private Date createTime;		// create_time
	private Long createUserId;		// create_user_id
	private String isWeightOrCnt;		// 0 按件续费；1 按重续费
	
	public FxChannelCarriage() {
		super();
	}

	public FxChannelCarriage(String id){
		super(id);
	}

	@NotNull(message="channel_carr_id不能为空")
	public Long getChannelCarrId() {
		return channelCarrId;
	}

	public void setChannelCarrId(Long channelCarrId) {
		this.channelCarrId = channelCarrId;
	}
	
	@NotNull(message="carr_id不能为空")
	public Long getCarrId() {
		return carrId;
	}

	public void setCarrId(Long carrId) {
		this.carrId = carrId;
	}
	
	@NotNull(message="channel_id不能为空")
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	
	@Length(min=0, max=11, message="0 按件续费；1 按重续费长度必须介于 0 和 11 之间")
	public String getIsWeightOrCnt() {
		return isWeightOrCnt;
	}

	public void setIsWeightOrCnt(String isWeightOrCnt) {
		this.isWeightOrCnt = isWeightOrCnt;
	}
	
}