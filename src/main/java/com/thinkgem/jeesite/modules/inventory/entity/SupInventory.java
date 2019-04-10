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
 * @version 2019-04-10
 */
public class SupInventory extends DataEntity<SupInventory> {
	
	private static final long serialVersionUID = 1L;
	private String channelId;		// 渠道编号
	private Double invenAgio;		// 库存折扣
	private Date invenDate;		// 库存日期
	private String invenDesc;		// 说明
	private String innerProductNo;		// 商品货号
	private String innerSize;		// 尺码
	private Integer qty;		// 库存数量
	private Double invenPrice;		// 价格
	private String status;		// 状态
	private String standardSize;		// 标准尺码
	private Date createTime;		// 创建时间
	private Date updateTime;		// 更新时间
	
	public SupInventory() {
		super();
	}

	public SupInventory(String id){
		super(id);
	}

	@Length(min=1, max=20, message="渠道编号长度必须介于 1 和 20 之间")
	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
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
	public String getInnerProductNo() {
		return innerProductNo;
	}

	public void setInnerProductNo(String innerProductNo) {
		this.innerProductNo = innerProductNo;
	}
	
	@Length(min=1, max=50, message="尺码长度必须介于 1 和 50 之间")
	public String getInnerSize() {
		return innerSize;
	}

	public void setInnerSize(String innerSize) {
		this.innerSize = innerSize;
	}
	
	
	
	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public Double getInvenPrice() {
		return invenPrice;
	}

	public void setInvenPrice(Double invenPrice) {
		this.invenPrice = invenPrice;
	}
	
	@Length(min=1, max=1, message="状态长度必须介于 1 和 1 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Length(min=0, max=50, message="标准尺码长度必须介于 0 和 50 之间")
	public String getStandardSize() {
		return standardSize;
	}

	public void setStandardSize(String standardSize) {
		this.standardSize = standardSize;
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
	@NotNull(message="更新时间不能为空")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}