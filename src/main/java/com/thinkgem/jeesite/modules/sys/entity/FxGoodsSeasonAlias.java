/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 季节标准别称Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxGoodsSeasonAlias extends DataEntity<FxGoodsSeasonAlias> {
	
	private static final long serialVersionUID = 1L;
	private String goodsSeasonAliasId;		// goods_season_alias_id
	private String seasonId;		// season_id
	private String goodsSeasonAlias;		// goods_season_alias
	
	public FxGoodsSeasonAlias() {
		super();
	}

	public FxGoodsSeasonAlias(String id){
		super(id);
	}

	@Length(min=1, max=5, message="goods_season_alias_id长度必须介于 1 和 5 之间")
	public String getGoodsSeasonAliasId() {
		return goodsSeasonAliasId;
	}

	public void setGoodsSeasonAliasId(String goodsSeasonAliasId) {
		this.goodsSeasonAliasId = goodsSeasonAliasId;
	}
	
	@Length(min=0, max=5, message="season_id长度必须介于 0 和 5 之间")
	public String getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(String seasonId) {
		this.seasonId = seasonId;
	}
	
	@Length(min=0, max=50, message="goods_season_alias长度必须介于 0 和 50 之间")
	public String getGoodsSeasonAlias() {
		return goodsSeasonAlias;
	}

	public void setGoodsSeasonAlias(String goodsSeasonAlias) {
		this.goodsSeasonAlias = goodsSeasonAlias;
	}
	
}