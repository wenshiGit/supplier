/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 标准货号表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxGoodsNbrStandard extends DataEntity<FxGoodsNbrStandard> {
	
	private static final long serialVersionUID = 1L;
	private String invenModel;		// 货号
	private String goodsId;		// goods_id
	private String dataSource;		// 数据来源
	private String goodsBrandId;		// 品牌ID
	private String goodsBrandName;		// 品牌标准名称
	private String goodsGenderId;		// 性别ID
	private String goodsGenderName;		// 性别标准名称
	private String goodsSeasonId;		// 季节ID
	private String goodsSeasonName;		// 季节标准名称
	private String goodsTypeId;		// 标注类别ID
	private String goodsTypeName;		// 类别标准名称
	private Date importTime;		// 导入excel修改数据时间
	private String importUserId;		// 导入excel修改数据人员
	private String invenBrand;		// 品牌
	private String invenDesc;		// 商品描述
	private String invenGender;		// 性别
	private String invenLength;		// 长度
	private String invenMajorTypes;		// 所属大类（衣服、鞋、配件，匹配多尺码字段）
	private String invenMediumTypes;		// 中分类
	private String invenMonth;		// 月份
	private String invenPrice;		// 商品价格
	private String invenSeason;		// 商品季节
	private String isPerfect;		// 是否完善
	private String series;		// 商品系列
	private Date updateTime;		// update_time
	private String updateUserId;		// 修改数据人员
	private String yunjuProductId;		// 存储接口同步云聚商品id
	private String oriModel;		// 渠道 货号（带杆）
	private String goodsWeight;		// 商品总量 单位KG
	private String categoryName;		// 商品类目
	private String categoryId;		// 类目ID
	
	public FxGoodsNbrStandard() {
		super();
	}

	public FxGoodsNbrStandard(String id){
		super(id);
	}

	@Length(min=1, max=200, message="货号长度必须介于 1 和 200 之间")
	public String getInvenModel() {
		return invenModel;
	}

	public void setInvenModel(String invenModel) {
		this.invenModel = invenModel;
	}
	
	@Length(min=0, max=11, message="goods_id长度必须介于 0 和 11 之间")
	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	
	@Length(min=0, max=200, message="数据来源长度必须介于 0 和 200 之间")
	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}
	
	@Length(min=0, max=11, message="品牌ID长度必须介于 0 和 11 之间")
	public String getGoodsBrandId() {
		return goodsBrandId;
	}

	public void setGoodsBrandId(String goodsBrandId) {
		this.goodsBrandId = goodsBrandId;
	}
	
	@Length(min=0, max=200, message="品牌标准名称长度必须介于 0 和 200 之间")
	public String getGoodsBrandName() {
		return goodsBrandName;
	}

	public void setGoodsBrandName(String goodsBrandName) {
		this.goodsBrandName = goodsBrandName;
	}
	
	@Length(min=0, max=11, message="性别ID长度必须介于 0 和 11 之间")
	public String getGoodsGenderId() {
		return goodsGenderId;
	}

	public void setGoodsGenderId(String goodsGenderId) {
		this.goodsGenderId = goodsGenderId;
	}
	
	@Length(min=0, max=200, message="性别标准名称长度必须介于 0 和 200 之间")
	public String getGoodsGenderName() {
		return goodsGenderName;
	}

	public void setGoodsGenderName(String goodsGenderName) {
		this.goodsGenderName = goodsGenderName;
	}
	
	@Length(min=0, max=11, message="季节ID长度必须介于 0 和 11 之间")
	public String getGoodsSeasonId() {
		return goodsSeasonId;
	}

	public void setGoodsSeasonId(String goodsSeasonId) {
		this.goodsSeasonId = goodsSeasonId;
	}
	
	@Length(min=0, max=200, message="季节标准名称长度必须介于 0 和 200 之间")
	public String getGoodsSeasonName() {
		return goodsSeasonName;
	}

	public void setGoodsSeasonName(String goodsSeasonName) {
		this.goodsSeasonName = goodsSeasonName;
	}
	
	@Length(min=0, max=11, message="标注类别ID长度必须介于 0 和 11 之间")
	public String getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}
	
	@Length(min=0, max=200, message="类别标准名称长度必须介于 0 和 200 之间")
	public String getGoodsTypeName() {
		return goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getImportTime() {
		return importTime;
	}

	public void setImportTime(Date importTime) {
		this.importTime = importTime;
	}
	
	@Length(min=0, max=11, message="导入excel修改数据人员长度必须介于 0 和 11 之间")
	public String getImportUserId() {
		return importUserId;
	}

	public void setImportUserId(String importUserId) {
		this.importUserId = importUserId;
	}
	
	@Length(min=0, max=200, message="品牌长度必须介于 0 和 200 之间")
	public String getInvenBrand() {
		return invenBrand;
	}

	public void setInvenBrand(String invenBrand) {
		this.invenBrand = invenBrand;
	}
	
	public String getInvenDesc() {
		return invenDesc;
	}

	public void setInvenDesc(String invenDesc) {
		this.invenDesc = invenDesc;
	}
	
	@Length(min=0, max=200, message="性别长度必须介于 0 和 200 之间")
	public String getInvenGender() {
		return invenGender;
	}

	public void setInvenGender(String invenGender) {
		this.invenGender = invenGender;
	}
	
	@Length(min=0, max=200, message="长度长度必须介于 0 和 200 之间")
	public String getInvenLength() {
		return invenLength;
	}

	public void setInvenLength(String invenLength) {
		this.invenLength = invenLength;
	}
	
	@Length(min=0, max=200, message="所属大类（衣服、鞋、配件，匹配多尺码字段）长度必须介于 0 和 200 之间")
	public String getInvenMajorTypes() {
		return invenMajorTypes;
	}

	public void setInvenMajorTypes(String invenMajorTypes) {
		this.invenMajorTypes = invenMajorTypes;
	}
	
	@Length(min=0, max=200, message="中分类长度必须介于 0 和 200 之间")
	public String getInvenMediumTypes() {
		return invenMediumTypes;
	}

	public void setInvenMediumTypes(String invenMediumTypes) {
		this.invenMediumTypes = invenMediumTypes;
	}
	
	@Length(min=0, max=200, message="月份长度必须介于 0 和 200 之间")
	public String getInvenMonth() {
		return invenMonth;
	}

	public void setInvenMonth(String invenMonth) {
		this.invenMonth = invenMonth;
	}
	
	public String getInvenPrice() {
		return invenPrice;
	}

	public void setInvenPrice(String invenPrice) {
		this.invenPrice = invenPrice;
	}
	
	@Length(min=0, max=200, message="商品季节长度必须介于 0 和 200 之间")
	public String getInvenSeason() {
		return invenSeason;
	}

	public void setInvenSeason(String invenSeason) {
		this.invenSeason = invenSeason;
	}
	
	@Length(min=0, max=6, message="是否完善长度必须介于 0 和 6 之间")
	public String getIsPerfect() {
		return isPerfect;
	}

	public void setIsPerfect(String isPerfect) {
		this.isPerfect = isPerfect;
	}
	
	@Length(min=0, max=100, message="商品系列长度必须介于 0 和 100 之间")
	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@Length(min=0, max=11, message="修改数据人员长度必须介于 0 和 11 之间")
	public String getUpdateUserId() {
		return updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}
	
	@Length(min=0, max=20, message="存储接口同步云聚商品id长度必须介于 0 和 20 之间")
	public String getYunjuProductId() {
		return yunjuProductId;
	}

	public void setYunjuProductId(String yunjuProductId) {
		this.yunjuProductId = yunjuProductId;
	}
	
	@Length(min=0, max=200, message="渠道 货号（带杆）长度必须介于 0 和 200 之间")
	public String getOriModel() {
		return oriModel;
	}

	public void setOriModel(String oriModel) {
		this.oriModel = oriModel;
	}
	
	public String getGoodsWeight() {
		return goodsWeight;
	}

	public void setGoodsWeight(String goodsWeight) {
		this.goodsWeight = goodsWeight;
	}
	
	@Length(min=0, max=50, message="商品类目长度必须介于 0 和 50 之间")
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Length(min=0, max=11, message="类目ID长度必须介于 0 和 11 之间")
	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
}