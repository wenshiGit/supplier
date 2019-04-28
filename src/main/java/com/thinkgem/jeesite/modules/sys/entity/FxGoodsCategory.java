/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 商品类目表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxGoodsCategory extends DataEntity<FxGoodsCategory> {
	
	private static final long serialVersionUID = 1L;
	private String categoryId;		// 类目ID
	private String categoryName;		// 类目名称
	private String state;		// 状态 1可用 ，0删除
	private String weight;		// 类目对应重量
	private String remark;		// 备注
	
	public FxGoodsCategory() {
		super();
	}

	public FxGoodsCategory(String id){
		super(id);
	}

	@Length(min=1, max=11, message="类目ID长度必须介于 1 和 11 之间")
	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
	@Length(min=0, max=50, message="类目名称长度必须介于 0 和 50 之间")
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Length(min=0, max=1, message="状态 1可用 ，0删除长度必须介于 0 和 1 之间")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	@Length(min=0, max=500, message="备注长度必须介于 0 和 500 之间")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}