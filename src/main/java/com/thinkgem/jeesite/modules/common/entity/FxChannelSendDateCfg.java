/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.common.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 渠道不发货配置表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxChannelSendDateCfg extends DataEntity<FxChannelSendDateCfg> {
	
	private static final long serialVersionUID = 1L;
	private Long channelId;		// channel_id
	private String noSendSigns;		// 全年不发货标记串 1发货  0不发货
	private Date createTime;		// 创建时间
	private Date modifyTime;		// modify_time
	private String offset;		// 偏移量：表示一年的第几天开始统计  从0开始偏移
	private String year;		// 偏移量的基准年份
	
	public FxChannelSendDateCfg() {
		super();
	}

	public FxChannelSendDateCfg(String id){
		super(id);
	}

	@NotNull(message="channel_id不能为空")
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
	@Length(min=0, max=500, message="全年不发货标记串 1发货  0不发货长度必须介于 0 和 500 之间")
	public String getNoSendSigns() {
		return noSendSigns;
	}

	public void setNoSendSigns(String noSendSigns) {
		this.noSendSigns = noSendSigns;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	
	@Length(min=0, max=11, message="偏移量：表示一年的第几天开始统计  从0开始偏移长度必须介于 0 和 11 之间")
	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}
	
	@Length(min=0, max=11, message="偏移量的基准年份长度必须介于 0 和 11 之间")
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
}