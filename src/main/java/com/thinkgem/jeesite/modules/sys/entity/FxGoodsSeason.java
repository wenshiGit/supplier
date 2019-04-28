/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 季节标准信息表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxGoodsSeason extends DataEntity<FxGoodsSeason> {
	
	private static final long serialVersionUID = 1L;
	private String seasonId;		// season_id
	private String seasonName;		// season_name
	
	public FxGoodsSeason() {
		super();
	}

	public FxGoodsSeason(String id){
		super(id);
	}

	@Length(min=1, max=5, message="season_id长度必须介于 1 和 5 之间")
	public String getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(String seasonId) {
		this.seasonId = seasonId;
	}
	
	@Length(min=0, max=50, message="season_name长度必须介于 0 和 50 之间")
	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}
	
}