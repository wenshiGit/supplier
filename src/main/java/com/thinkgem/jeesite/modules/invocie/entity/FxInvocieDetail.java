/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.invocie.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 发票明细Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxInvocieDetail extends DataEntity<FxInvocieDetail> {
	
	private static final long serialVersionUID = 1L;
	private Long invocieDetailId;		// invocie_detail_id
	private String goodsCount;		// goods_count
	private String goodsNbr;		// goods_nbr
	private String goodsPrice;		// goods_price
	private String goodsSize;		// goods_size
	private String goodsTitle;		// goods_title
	private Long invocieId;		// invocie_id
	private Long orderId;		// order_id
	private String state;		// state
	
	public FxInvocieDetail() {
		super();
	}

	public FxInvocieDetail(String id){
		super(id);
	}

	@NotNull(message="invocie_detail_id不能为空")
	public Long getInvocieDetailId() {
		return invocieDetailId;
	}

	public void setInvocieDetailId(Long invocieDetailId) {
		this.invocieDetailId = invocieDetailId;
	}
	
	@Length(min=0, max=11, message="goods_count长度必须介于 0 和 11 之间")
	public String getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(String goodsCount) {
		this.goodsCount = goodsCount;
	}
	
	@Length(min=0, max=50, message="goods_nbr长度必须介于 0 和 50 之间")
	public String getGoodsNbr() {
		return goodsNbr;
	}

	public void setGoodsNbr(String goodsNbr) {
		this.goodsNbr = goodsNbr;
	}
	
	public String getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	
	@Length(min=0, max=50, message="goods_size长度必须介于 0 和 50 之间")
	public String getGoodsSize() {
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	
	public String getGoodsTitle() {
		return goodsTitle;
	}

	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}
	
	@NotNull(message="invocie_id不能为空")
	public Long getInvocieId() {
		return invocieId;
	}

	public void setInvocieId(Long invocieId) {
		this.invocieId = invocieId;
	}
	
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	@Length(min=0, max=1, message="state长度必须介于 0 和 1 之间")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}