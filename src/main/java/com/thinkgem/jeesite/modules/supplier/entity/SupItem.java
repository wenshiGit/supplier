/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.supplier.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 单表生成Entity
 * @author ThinkGem
 * @version 2019-04-02
 */
public class SupItem extends DataEntity<SupItem> {
	
	private static final long serialVersionUID = 1L;
	private String itemName;		// 商品名称
	private String sku;		// sku
	private String outSku;		// 外部sku
	private String agio;		// 折扣，折扣是根据代理价与吊牌价计算而来
	private String productNo;		// 货号
	private String tagPrice;		// 吊牌价
	private String agentPrice;		// 代理价
	private String ouSize;		// 欧码
	private String brandSize;		// 品牌码
	private String innerSize;		// 内部码，系统使用的尺码
	private String channelId;		// 商品来源渠道编号
	private String channelName;		// 商品来源渠道名称
	private String styleNo;		// 款式介绍
	private String season;		// 所属季节
	private String gender;		// 性别
	private String brandName;		// 品牌名
	private String catagroy;		// 鞋服等类别
	private String color;		// 颜色
	private String weight;		// 商品重量，单位KG
	private String imgUrl;		// 商品预览图片地址
	private String status;		// 商品状态：上架、下架、隐藏等
	private Date launchDate;		// 上市日期
	
	public SupItem() {
		super();
	}

	public SupItem(String id){
		super(id);
	}

	@Length(min=0, max=100, message="商品名称长度必须介于 0 和 100 之间")
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	@Length(min=1, max=64, message="sku长度必须介于 1 和 64 之间")
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
	
	@Length(min=0, max=64, message="外部sku长度必须介于 0 和 64 之间")
	public String getOutSku() {
		return outSku;
	}

	public void setOutSku(String outSku) {
		this.outSku = outSku;
	}
	
	public String getAgio() {
		return agio;
	}

	public void setAgio(String agio) {
		this.agio = agio;
	}
	
	@Length(min=1, max=64, message="货号长度必须介于 1 和 64 之间")
	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	
	public String getTagPrice() {
		return tagPrice;
	}

	public void setTagPrice(String tagPrice) {
		this.tagPrice = tagPrice;
	}
	
	public String getAgentPrice() {
		return agentPrice;
	}

	public void setAgentPrice(String agentPrice) {
		this.agentPrice = agentPrice;
	}
	
	@Length(min=1, max=64, message="欧码长度必须介于 1 和 64 之间")
	public String getOuSize() {
		return ouSize;
	}

	public void setOuSize(String ouSize) {
		this.ouSize = ouSize;
	}
	
	@Length(min=1, max=64, message="品牌码长度必须介于 1 和 64 之间")
	public String getBrandSize() {
		return brandSize;
	}

	public void setBrandSize(String brandSize) {
		this.brandSize = brandSize;
	}
	
	@Length(min=1, max=64, message="内部码，系统使用的尺码长度必须介于 1 和 64 之间")
	public String getInnerSize() {
		return innerSize;
	}

	public void setInnerSize(String innerSize) {
		this.innerSize = innerSize;
	}
	
	@Length(min=1, max=64, message="商品来源渠道编号长度必须介于 1 和 64 之间")
	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	@Length(min=0, max=100, message="商品来源渠道名称长度必须介于 0 和 100 之间")
	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	@Length(min=0, max=100, message="款式介绍长度必须介于 0 和 100 之间")
	public String getStyleNo() {
		return styleNo;
	}

	public void setStyleNo(String styleNo) {
		this.styleNo = styleNo;
	}
	
	@Length(min=0, max=16, message="所属季节长度必须介于 0 和 16 之间")
	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	
	@Length(min=0, max=16, message="性别长度必须介于 0 和 16 之间")
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Length(min=0, max=16, message="品牌名长度必须介于 0 和 16 之间")
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	@Length(min=0, max=16, message="鞋服等类别长度必须介于 0 和 16 之间")
	public String getCatagroy() {
		return catagroy;
	}

	public void setCatagroy(String catagroy) {
		this.catagroy = catagroy;
	}
	
	@Length(min=0, max=16, message="颜色长度必须介于 0 和 16 之间")
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	@Length(min=0, max=255, message="商品预览图片地址长度必须介于 0 和 255 之间")
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	@Length(min=0, max=1, message="商品状态：上架、下架、隐藏等长度必须介于 0 和 1 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}
	
}