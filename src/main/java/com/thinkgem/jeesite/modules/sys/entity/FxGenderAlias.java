/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 性别别名Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxGenderAlias extends DataEntity<FxGenderAlias> {
	
	private static final long serialVersionUID = 1L;
	private String genderAliasId;		// gender_alias_id
	private String genderId;		// gender_id
	private String genderAlias;		// gender_alias
	
	public FxGenderAlias() {
		super();
	}

	public FxGenderAlias(String id){
		super(id);
	}

	@Length(min=0, max=5, message="gender_alias_id长度必须介于 0 和 5 之间")
	public String getGenderAliasId() {
		return genderAliasId;
	}

	public void setGenderAliasId(String genderAliasId) {
		this.genderAliasId = genderAliasId;
	}
	
	@Length(min=0, max=5, message="gender_id长度必须介于 0 和 5 之间")
	public String getGenderId() {
		return genderId;
	}

	public void setGenderId(String genderId) {
		this.genderId = genderId;
	}
	
	@Length(min=0, max=50, message="gender_alias长度必须介于 0 和 50 之间")
	public String getGenderAlias() {
		return genderAlias;
	}

	public void setGenderAlias(String genderAlias) {
		this.genderAlias = genderAlias;
	}
	
}