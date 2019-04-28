/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.account.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 渠道折扣配置Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxCfgChannelAgio extends DataEntity<FxCfgChannelAgio> {
	
	private static final long serialVersionUID = 1L;
	private Long channelId;		// channel_id
	private Long brandId;		// brand_id
	private String realAgio;		// real_agio
	private Long genderId;		// gender_id
	private Long seasonId;		// season_id
	private Long goodsTypeId;		// goods_type_id
	private Date createTime;		// create_time
	private Date modifyTime;		// modify_time
	private String state;		// state
	private String proxySelfAgio;		// proxy_self_agio
	
	public FxCfgChannelAgio() {
		super();
	}

	public FxCfgChannelAgio(String id){
		super(id);
	}

	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	
	public String getRealAgio() {
		return realAgio;
	}

	public void setRealAgio(String realAgio) {
		this.realAgio = realAgio;
	}
	
	public Long getGenderId() {
		return genderId;
	}

	public void setGenderId(Long genderId) {
		this.genderId = genderId;
	}
	
	public Long getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(Long seasonId) {
		this.seasonId = seasonId;
	}
	
	public Long getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(Long goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
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
	
	@Length(min=0, max=6, message="state长度必须介于 0 和 6 之间")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getProxySelfAgio() {
		return proxySelfAgio;
	}

	public void setProxySelfAgio(String proxySelfAgio) {
		this.proxySelfAgio = proxySelfAgio;
	}
	
}