/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 类别别称Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxGoodsTypeAlias extends DataEntity<FxGoodsTypeAlias> {
	
	private static final long serialVersionUID = 1L;
	private String goodsTypeId;		// goods_type_id
	private String goodsTypeAlias;		// goods_type_alias
	private String goodsTypeAliasId;		// goods_type_alias_id
	
	public FxGoodsTypeAlias() {
		super();
	}

	public FxGoodsTypeAlias(String id){
		super(id);
	}

	@Length(min=0, max=5, message="goods_type_id长度必须介于 0 和 5 之间")
	public String getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}
	
	@Length(min=0, max=50, message="goods_type_alias长度必须介于 0 和 50 之间")
	public String getGoodsTypeAlias() {
		return goodsTypeAlias;
	}

	public void setGoodsTypeAlias(String goodsTypeAlias) {
		this.goodsTypeAlias = goodsTypeAlias;
	}
	
	@Length(min=1, max=5, message="goods_type_alias_id长度必须介于 1 和 5 之间")
	public String getGoodsTypeAliasId() {
		return goodsTypeAliasId;
	}

	public void setGoodsTypeAliasId(String goodsTypeAliasId) {
		this.goodsTypeAliasId = goodsTypeAliasId;
	}
	
}