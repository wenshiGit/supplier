/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 快递Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxCarriage extends DataEntity<FxCarriage> {
	
	private static final long serialVersionUID = 1L;
	private Long carrId;		// carr_id
	private String carrDesc;		// carr_desc
	private Long carrIdJd;		// carr_id_jd
	private String carrIdTaobao;		// carr_id_taobao
	private String carrName;		// 快递名称
	private Date createTime;		// create_time
	private String orderCnt;		// order_cnt
	private String carrPrice;		// carr_price
	private String carrPriceAdd;		// carr_price_add
	
	public FxCarriage() {
		super();
	}

	public FxCarriage(String id){
		super(id);
	}

	@NotNull(message="carr_id不能为空")
	public Long getCarrId() {
		return carrId;
	}

	public void setCarrId(Long carrId) {
		this.carrId = carrId;
	}
	
	public String getCarrDesc() {
		return carrDesc;
	}

	public void setCarrDesc(String carrDesc) {
		this.carrDesc = carrDesc;
	}
	
	public Long getCarrIdJd() {
		return carrIdJd;
	}

	public void setCarrIdJd(Long carrIdJd) {
		this.carrIdJd = carrIdJd;
	}
	
	@Length(min=0, max=50, message="carr_id_taobao长度必须介于 0 和 50 之间")
	public String getCarrIdTaobao() {
		return carrIdTaobao;
	}

	public void setCarrIdTaobao(String carrIdTaobao) {
		this.carrIdTaobao = carrIdTaobao;
	}
	
	@Length(min=0, max=50, message="快递名称长度必须介于 0 和 50 之间")
	public String getCarrName() {
		return carrName;
	}

	public void setCarrName(String carrName) {
		this.carrName = carrName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Length(min=0, max=11, message="order_cnt长度必须介于 0 和 11 之间")
	public String getOrderCnt() {
		return orderCnt;
	}

	public void setOrderCnt(String orderCnt) {
		this.orderCnt = orderCnt;
	}
	
	public String getCarrPrice() {
		return carrPrice;
	}

	public void setCarrPrice(String carrPrice) {
		this.carrPrice = carrPrice;
	}
	
	public String getCarrPriceAdd() {
		return carrPriceAdd;
	}

	public void setCarrPriceAdd(String carrPriceAdd) {
		this.carrPriceAdd = carrPriceAdd;
	}
	
}