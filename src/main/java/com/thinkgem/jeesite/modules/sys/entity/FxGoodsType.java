/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 标准类别Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxGoodsType extends DataEntity<FxGoodsType> {
	
	private static final long serialVersionUID = 1L;
	private String goodsTypeId;		// goods_type_id
	private String goodsTypeName;		// goods_type_name
	
	public FxGoodsType() {
		super();
	}

	public FxGoodsType(String id){
		super(id);
	}

	@Length(min=1, max=5, message="goods_type_id长度必须介于 1 和 5 之间")
	public String getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}
	
	@Length(min=0, max=20, message="goods_type_name长度必须介于 0 和 20 之间")
	public String getGoodsTypeName() {
		return goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}
	
}