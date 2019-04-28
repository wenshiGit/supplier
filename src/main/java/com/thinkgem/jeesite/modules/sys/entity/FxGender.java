/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 性别Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxGender extends DataEntity<FxGender> {
	
	private static final long serialVersionUID = 1L;
	private String genderId;		// gender_id
	private String genderName;		// gender_name
	
	public FxGender() {
		super();
	}

	public FxGender(String id){
		super(id);
	}

	@Length(min=1, max=5, message="gender_id长度必须介于 1 和 5 之间")
	public String getGenderId() {
		return genderId;
	}

	public void setGenderId(String genderId) {
		this.genderId = genderId;
	}
	
	@Length(min=0, max=10, message="gender_name长度必须介于 0 和 10 之间")
	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
	
}