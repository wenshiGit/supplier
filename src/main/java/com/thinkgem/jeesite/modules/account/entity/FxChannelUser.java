/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.account.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 渠道用户Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxChannelUser extends DataEntity<FxChannelUser> {
	
	private static final long serialVersionUID = 1L;
	private Integer channelId;		// channel_id
	private String agioGoodsType;		// agio_goods_type
	private String agioGender;		// agio_gender
	private String agioSeason;		// agio_season
	private Integer agioBrand;		// agio_brand
	
	public FxChannelUser() {
		super();
	}

	public FxChannelUser(String id){
		super(id);
	}

	@NotNull(message="channel_id不能为空")
	public Integer getChannelId() {
		return channelId;
	}

	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	
	@Length(min=0, max=6, message="agio_goods_type长度必须介于 0 和 6 之间")
	public String getAgioGoodsType() {
		return agioGoodsType;
	}

	public void setAgioGoodsType(String agioGoodsType) {
		this.agioGoodsType = agioGoodsType;
	}
	
	@Length(min=0, max=6, message="agio_gender长度必须介于 0 和 6 之间")
	public String getAgioGender() {
		return agioGender;
	}

	public void setAgioGender(String agioGender) {
		this.agioGender = agioGender;
	}
	
	@Length(min=0, max=6, message="agio_season长度必须介于 0 和 6 之间")
	public String getAgioSeason() {
		return agioSeason;
	}

	public void setAgioSeason(String agioSeason) {
		this.agioSeason = agioSeason;
	}
	
	public Integer getAgioBrand() {
		return agioBrand;
	}

	public void setAgioBrand(Integer agioBrand) {
		this.agioBrand = agioBrand;
	}
	
}