/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import javax.validation.constraints.NotNull;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 快递运输价格Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxChannelCarriagePrice extends DataEntity<FxChannelCarriagePrice> {
	
	private static final long serialVersionUID = 1L;
	private String firstWeight;		// 首重的重量，单位kg
	private String addWeight;		// 续重的重量，单位kg
	private String carrPriceFirst;		// 首件或者首重的价格
	private String carrPriceAdd;		// 续件或者续重的价格
	private Long provinceId;		// 省份
	private Long carrId;		// 快递
	private Long channelId;		// 渠道
	private Date createTime;		// create_time
	
	public FxChannelCarriagePrice() {
		super();
	}

	public FxChannelCarriagePrice(String id){
		super(id);
	}

	public String getFirstWeight() {
		return firstWeight;
	}

	public void setFirstWeight(String firstWeight) {
		this.firstWeight = firstWeight;
	}
	
	public String getAddWeight() {
		return addWeight;
	}

	public void setAddWeight(String addWeight) {
		this.addWeight = addWeight;
	}
	
	public String getCarrPriceFirst() {
		return carrPriceFirst;
	}

	public void setCarrPriceFirst(String carrPriceFirst) {
		this.carrPriceFirst = carrPriceFirst;
	}
	
	public String getCarrPriceAdd() {
		return carrPriceAdd;
	}

	public void setCarrPriceAdd(String carrPriceAdd) {
		this.carrPriceAdd = carrPriceAdd;
	}
	
	@NotNull(message="省份不能为空")
	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}
	
	@NotNull(message="快递不能为空")
	public Long getCarrId() {
		return carrId;
	}

	public void setCarrId(Long carrId) {
		this.carrId = carrId;
	}
	
	@NotNull(message="渠道不能为空")
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="create_time不能为空")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}