/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 快递状态Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxChannelCarrNotDeliver extends DataEntity<FxChannelCarrNotDeliver> {
	
	private static final long serialVersionUID = 1L;
	private Long cfgId;		// cfg_id
	private String cfgType;		// cfg_type
	private Long cityId;		// city_id
	private Date createTime;		// create_time
	private Long provinceId;		// province_id
	private Long carrId;		// carr_id
	private Long channelId;		// channel_id
	
	public FxChannelCarrNotDeliver() {
		super();
	}

	public FxChannelCarrNotDeliver(String id){
		super(id);
	}

	@NotNull(message="cfg_id不能为空")
	public Long getCfgId() {
		return cfgId;
	}

	public void setCfgId(Long cfgId) {
		this.cfgId = cfgId;
	}
	
	@Length(min=1, max=6, message="cfg_type长度必须介于 1 和 6 之间")
	public String getCfgType() {
		return cfgType;
	}

	public void setCfgType(String cfgType) {
		this.cfgType = cfgType;
	}
	
	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}
	
	public Long getCarrId() {
		return carrId;
	}

	public void setCarrId(Long carrId) {
		this.carrId = carrId;
	}
	
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
}