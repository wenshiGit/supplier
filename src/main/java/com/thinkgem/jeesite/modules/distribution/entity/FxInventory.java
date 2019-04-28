/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.distribution.entity;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 库存表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxInventory extends DataEntity<FxInventory> {
	
	private static final long serialVersionUID = 1L;
	private String invenId;		// 库存ID
	private Long channelId;		// 渠道ID
	private String distributionRate;		// 配货率
	private String invenAgio;		// 库存折扣
	private Date invenDate;		// 库存日期
	private String invenDesc;		// 渠道说明
	private String invenModel;		// 商品货号
	private String invenNum;		// 库存数量
	private String invenPrice;		// 库存价格
	private String invenSize;		// 渠道尺码
	private String invenState;		// 更新时间
	private String oriSize;		// 原始尺码
	private String oriModel;		// 原始货号
	private String standardSize;		// 标准尺码
	private String yunjuProductId;		// 云聚ID
	
	public FxInventory() {
		super();
	}

	public FxInventory(String id){
		super(id);
	}

	@Length(min=1, max=11, message="库存ID长度必须介于 1 和 11 之间")
	public String getInvenId() {
		return invenId;
	}

	public void setInvenId(String invenId) {
		this.invenId = invenId;
	}
	
	@NotNull(message="渠道ID不能为空")
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
	@Length(min=0, max=11, message="配货率长度必须介于 0 和 11 之间")
	public String getDistributionRate() {
		return distributionRate;
	}

	public void setDistributionRate(String distributionRate) {
		this.distributionRate = distributionRate;
	}
	
	public String getInvenAgio() {
		return invenAgio;
	}

	public void setInvenAgio(String invenAgio) {
		this.invenAgio = invenAgio;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="库存日期不能为空")
	public Date getInvenDate() {
		return invenDate;
	}

	public void setInvenDate(Date invenDate) {
		this.invenDate = invenDate;
	}
	
	public String getInvenDesc() {
		return invenDesc;
	}

	public void setInvenDesc(String invenDesc) {
		this.invenDesc = invenDesc;
	}
	
	@Length(min=1, max=50, message="商品货号长度必须介于 1 和 50 之间")
	public String getInvenModel() {
		return invenModel;
	}

	public void setInvenModel(String invenModel) {
		this.invenModel = invenModel;
	}
	
	@Length(min=0, max=11, message="库存数量长度必须介于 0 和 11 之间")
	public String getInvenNum() {
		return invenNum;
	}

	public void setInvenNum(String invenNum) {
		this.invenNum = invenNum;
	}
	
	public String getInvenPrice() {
		return invenPrice;
	}

	public void setInvenPrice(String invenPrice) {
		this.invenPrice = invenPrice;
	}
	
	@Length(min=1, max=50, message="渠道尺码长度必须介于 1 和 50 之间")
	public String getInvenSize() {
		return invenSize;
	}

	public void setInvenSize(String invenSize) {
		this.invenSize = invenSize;
	}
	
	@Length(min=1, max=1, message="更新时间长度必须介于 1 和 1 之间")
	public String getInvenState() {
		return invenState;
	}

	public void setInvenState(String invenState) {
		this.invenState = invenState;
	}
	
	@Length(min=0, max=50, message="原始尺码长度必须介于 0 和 50 之间")
	public String getOriSize() {
		return oriSize;
	}

	public void setOriSize(String oriSize) {
		this.oriSize = oriSize;
	}
	
	@Length(min=0, max=50, message="原始货号长度必须介于 0 和 50 之间")
	public String getOriModel() {
		return oriModel;
	}

	public void setOriModel(String oriModel) {
		this.oriModel = oriModel;
	}
	
	@Length(min=0, max=50, message="标准尺码长度必须介于 0 和 50 之间")
	public String getStandardSize() {
		return standardSize;
	}

	public void setStandardSize(String standardSize) {
		this.standardSize = standardSize;
	}
	
	@Length(min=0, max=20, message="云聚ID长度必须介于 0 和 20 之间")
	public String getYunjuProductId() {
		return yunjuProductId;
	}

	public void setYunjuProductId(String yunjuProductId) {
		this.yunjuProductId = yunjuProductId;
	}
	
}