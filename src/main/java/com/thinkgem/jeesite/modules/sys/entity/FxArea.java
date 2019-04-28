/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import com.thinkgem.jeesite.modules.sys.entity.Area;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 区域Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxArea extends DataEntity<FxArea> {
	
	private static final long serialVersionUID = 1L;
	private Area area;		// 地区id
	private String areaName;		// 地区名称
	private String areaNameAlias;		// 地区别名
	private String areaType;		// 地区类型（2：省份 3：地级市 4：县区）
	private String parentAreaId;		// 上级地区ID
	private String zip;		// 邮政编码
	
	public FxArea() {
		super();
	}

	public FxArea(String id){
		super(id);
	}

	@NotNull(message="地区id不能为空")
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	@Length(min=1, max=200, message="地区名称长度必须介于 1 和 200 之间")
	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	@Length(min=0, max=200, message="地区别名长度必须介于 0 和 200 之间")
	public String getAreaNameAlias() {
		return areaNameAlias;
	}

	public void setAreaNameAlias(String areaNameAlias) {
		this.areaNameAlias = areaNameAlias;
	}
	
	@Length(min=0, max=11, message="地区类型（2：省份 3：地级市 4：县区）长度必须介于 0 和 11 之间")
	public String getAreaType() {
		return areaType;
	}

	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}
	
	@Length(min=0, max=11, message="上级地区ID长度必须介于 0 和 11 之间")
	public String getParentAreaId() {
		return parentAreaId;
	}

	public void setParentAreaId(String parentAreaId) {
		this.parentAreaId = parentAreaId;
	}
	
	@Length(min=0, max=11, message="邮政编码长度必须介于 0 和 11 之间")
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
}