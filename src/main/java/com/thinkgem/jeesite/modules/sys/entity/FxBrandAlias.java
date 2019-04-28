/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 品牌别名Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxBrandAlias extends DataEntity<FxBrandAlias> {
	
	private static final long serialVersionUID = 1L;
	private Long brandId;		// brand_id
	private String brandAlias;		// brand_alias
	private Long brandAliasId;		// brand_alias_id
	
	public FxBrandAlias() {
		super();
	}

	public FxBrandAlias(String id){
		super(id);
	}

	@NotNull(message="brand_id不能为空")
	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	
	@Length(min=0, max=100, message="brand_alias长度必须介于 0 和 100 之间")
	public String getBrandAlias() {
		return brandAlias;
	}

	public void setBrandAlias(String brandAlias) {
		this.brandAlias = brandAlias;
	}
	
	@NotNull(message="brand_alias_id不能为空")
	public Long getBrandAliasId() {
		return brandAliasId;
	}

	public void setBrandAliasId(Long brandAliasId) {
		this.brandAliasId = brandAliasId;
	}
	
}