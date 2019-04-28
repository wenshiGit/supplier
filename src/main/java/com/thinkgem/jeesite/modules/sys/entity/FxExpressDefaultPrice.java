/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;
import com.thinkgem.jeesite.modules.sys.entity.Area;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 快递默认价格Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxExpressDefaultPrice extends DataEntity<FxExpressDefaultPrice> {
	
	private static final long serialVersionUID = 1L;
	private String expressName;		// 快递公司名称
	private Long expressId;		// 快递公司id
	private Area area;		// 所属区域id
	private String firstPrice;		// 区域首重价格
	private String addPrice;		// 区域续重价格
	
	public FxExpressDefaultPrice() {
		super();
	}

	public FxExpressDefaultPrice(String id){
		super(id);
	}

	@Length(min=0, max=255, message="快递公司名称长度必须介于 0 和 255 之间")
	public String getExpressName() {
		return expressName;
	}

	public void setExpressName(String expressName) {
		this.expressName = expressName;
	}
	
	public Long getExpressId() {
		return expressId;
	}

	public void setExpressId(Long expressId) {
		this.expressId = expressId;
	}
	
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	public String getFirstPrice() {
		return firstPrice;
	}

	public void setFirstPrice(String firstPrice) {
		this.firstPrice = firstPrice;
	}
	
	public String getAddPrice() {
		return addPrice;
	}

	public void setAddPrice(String addPrice) {
		this.addPrice = addPrice;
	}
	
}