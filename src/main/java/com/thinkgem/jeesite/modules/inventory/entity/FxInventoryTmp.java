/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.inventory.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 库存Entity
 * @author ZiruiSong
 * @version 2019-04-15
 */
public class FxInventoryTmp extends DataEntity<FxInventoryTmp> {
	
	private static final long serialVersionUID = 1L;
	private Long invenId;		// inven_id
	private String channelId;		// channel_id
	private String distributionRate;		// distribution_rate
	private String invenAgio;		// inven_agio
	private Date invenDate;		// inven_date
	private String invenDesc;		// inven_desc
	private String invenModel;		// inven_model
	private String invenNum;		// inven_num
	private String invenPrice;		// inven_price
	private String invenSize;		// inven_size
	private String invenState;		// inven_state
	private String oriModel;		// ori_model
	private String standardSize;		// standard_size
	private String yunjuProductId;		// yunju_product_id
	private String oriSize;		// ori_size
	
	public FxInventoryTmp() {
		super();
	}

	public FxInventoryTmp(String id){
		super(id);
	}

	@NotNull(message="inven_id不能为空")
	public Long getInvenId() {
		return invenId;
	}

	public void setInvenId(Long invenId) {
		this.invenId = invenId;
	}
	
	@Length(min=1, max=11, message="channel_id长度必须介于 1 和 11 之间")
	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	@Length(min=0, max=11, message="distribution_rate长度必须介于 0 和 11 之间")
	public String getDistributionRate() {
		return distributionRate;
	}

	public void setDistributionRate(String distributionRate) {
		this.distributionRate = distributionRate;
	}
	
	public String getInvenAgio() {
		return invenAgio;
	}

	public void setInvenAgio(String invenAgio) {
		this.invenAgio = invenAgio;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="inven_date不能为空")
	public Date getInvenDate() {
		return invenDate;
	}

	public void setInvenDate(Date invenDate) {
		this.invenDate = invenDate;
	}
	
	public String getInvenDesc() {
		return invenDesc;
	}

	public void setInvenDesc(String invenDesc) {
		this.invenDesc = invenDesc;
	}
	
	@Length(min=1, max=50, message="inven_model长度必须介于 1 和 50 之间")
	public String getInvenModel() {
		return invenModel;
	}

	public void setInvenModel(String invenModel) {
		this.invenModel = invenModel;
	}
	
	@Length(min=1, max=11, message="inven_num长度必须介于 1 和 11 之间")
	public String getInvenNum() {
		return invenNum;
	}

	public void setInvenNum(String invenNum) {
		this.invenNum = invenNum;
	}
	
	public String getInvenPrice() {
		return invenPrice;
	}

	public void setInvenPrice(String invenPrice) {
		this.invenPrice = invenPrice;
	}
	
	@Length(min=1, max=50, message="inven_size长度必须介于 1 和 50 之间")
	public String getInvenSize() {
		return invenSize;
	}

	public void setInvenSize(String invenSize) {
		this.invenSize = invenSize;
	}
	
	@Length(min=0, max=1, message="inven_state长度必须介于 0 和 1 之间")
	public String getInvenState() {
		return invenState;
	}

	public void setInvenState(String invenState) {
		this.invenState = invenState;
	}
	
	@Length(min=0, max=50, message="ori_model长度必须介于 0 和 50 之间")
	public String getOriModel() {
		return oriModel;
	}

	public void setOriModel(String oriModel) {
		this.oriModel = oriModel;
	}
	
	@Length(min=0, max=50, message="standard_size长度必须介于 0 和 50 之间")
	public String getStandardSize() {
		return standardSize;
	}

	public void setStandardSize(String standardSize) {
		this.standardSize = standardSize;
	}
	
	@Length(min=0, max=20, message="yunju_product_id长度必须介于 0 和 20 之间")
	public String getYunjuProductId() {
		return yunjuProductId;
	}

	public void setYunjuProductId(String yunjuProductId) {
		this.yunjuProductId = yunjuProductId;
	}
	
	@Length(min=0, max=50, message="ori_size长度必须介于 0 和 50 之间")
	public String getOriSize() {
		return oriSize;
	}

	public void setOriSize(String oriSize) {
		this.oriSize = oriSize;
	}
	
}