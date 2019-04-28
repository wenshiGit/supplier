/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotNull;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * fx_goods_size_infoEntity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxGoodsSizeInfo extends DataEntity<FxGoodsSizeInfo> {
	
	private static final long serialVersionUID = 1L;
	private String brandId;		// 品牌ID
	private String brandName;		// 品牌名称
	private String goodsSize;		// 尺码
	private String goodsSizeName;		// 尺码名称
	private Long goodsTypeId;		// 类型id
	private String goodsType;		// 尺码类型（鞋、衣服、配件）
	private String orderId;		// 排序ID
	private String series;		// 品牌系列
	private String sex;		// 性别（男、女、中性）
	private String sexId;		// 性别ID
	private String standardGoodsSize;		// 标准尺码
	private Long brandSizeId;		// 品牌成套尺码ID（尺码中该值相同表示同属一套尺码）
	
	public FxGoodsSizeInfo() {
		super();
	}

	public FxGoodsSizeInfo(String id){
		super(id);
	}

	@Length(min=1, max=11, message="品牌ID长度必须介于 1 和 11 之间")
	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	
	@Length(min=0, max=100, message="品牌名称长度必须介于 0 和 100 之间")
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	@Length(min=1, max=100, message="尺码长度必须介于 1 和 100 之间")
	public String getGoodsSize() {
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	
	@Length(min=1, max=100, message="尺码名称长度必须介于 1 和 100 之间")
	public String getGoodsSizeName() {
		return goodsSizeName;
	}

	public void setGoodsSizeName(String goodsSizeName) {
		this.goodsSizeName = goodsSizeName;
	}
	
	@NotNull(message="类型id不能为空")
	public Long getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(Long goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}
	
	@Length(min=1, max=10, message="尺码类型（鞋、衣服、配件）长度必须介于 1 和 10 之间")
	public String getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	
	@Length(min=0, max=11, message="排序ID长度必须介于 0 和 11 之间")
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	@Length(min=1, max=100, message="品牌系列长度必须介于 1 和 100 之间")
	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}
	
	@Length(min=0, max=10, message="性别（男、女、中性）长度必须介于 0 和 10 之间")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Length(min=1, max=11, message="性别ID长度必须介于 1 和 11 之间")
	public String getSexId() {
		return sexId;
	}

	public void setSexId(String sexId) {
		this.sexId = sexId;
	}
	
	@Length(min=1, max=100, message="标准尺码长度必须介于 1 和 100 之间")
	public String getStandardGoodsSize() {
		return standardGoodsSize;
	}

	public void setStandardGoodsSize(String standardGoodsSize) {
		this.standardGoodsSize = standardGoodsSize;
	}
	
	@NotNull(message="品牌成套尺码ID（尺码中该值相同表示同属一套尺码）不能为空")
	public Long getBrandSizeId() {
		return brandSizeId;
	}

	public void setBrandSizeId(Long brandSizeId) {
		this.brandSizeId = brandSizeId;
	}
	
}