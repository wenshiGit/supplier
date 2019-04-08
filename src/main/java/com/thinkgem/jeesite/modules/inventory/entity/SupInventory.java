/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.inventory.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 库存管理Entity
 * @author ziruisong
 * @version 2019-04-07
 */
public class SupInventory extends DataEntity<SupInventory> {
	
	private static final long serialVersionUID = 1L;
	private String channelId;		// 渠道ID
	private Integer distributionRate;		// 配货率
	private Double invenAgio;		// 库存折扣
	private Date invenDate;		// 库存日期
	private String invenDesc;		// 渠道说明
	private String invenModel;		// 商品货号
	private Integer invenNum;		// 库存数量
	private Double invenPrice;		// 库存价格
	private String invenSize;		// 渠道尺码
	private String invenState;		// 状态
	private String oriSize;		// 原始尺码
	private String oriModel;		// 原始货号
	private String standardSize;		// 标准尺码
	private String yunjuProductId;		// 云聚商品编号
	private Date createTime;		// 创建时间
	private Date updateTime;		// 更新时间
	private String remark;		// 备注
	
	public SupInventory() {
		super();
	}

	public SupInventory(String id){
		super(id);
	}

	@Length(min=1, max=20, message="渠道ID长度必须介于 1 和 20 之间")
	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	public Integer getDistributionRate() {
		return distributionRate;
	}

	public void setDistributionRate(Integer distributionRate) {
		this.distributionRate = distributionRate;
	}
	
	public Double getInvenAgio() {
		return invenAgio;
	}

	public void setInvenAgio(Double invenAgio) {
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
	
	public Integer getInvenNum() {
		return invenNum;
	}

	public void setInvenNum(Integer invenNum) {
		this.invenNum = invenNum;
	}
	
	public Double getInvenPrice() {
		return invenPrice;
	}

	public void setInvenPrice(Double invenPrice) {
		this.invenPrice = invenPrice;
	}
	
	@Length(min=1, max=50, message="渠道尺码长度必须介于 1 和 50 之间")
	public String getInvenSize() {
		return invenSize;
	}

	public void setInvenSize(String invenSize) {
		this.invenSize = invenSize;
	}
	
	@Length(min=1, max=1, message="状态长度必须介于 1 和 1 之间")
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
	
	@Length(min=0, max=20, message="云聚商品编号长度必须介于 0 和 20 之间")
	public String getYunjuProductId() {
		return yunjuProductId;
	}

	public void setYunjuProductId(String yunjuProductId) {
		this.yunjuProductId = yunjuProductId;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="创建时间不能为空")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@Length(min=0, max=255, message="备注长度必须介于 0 和 255 之间")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}