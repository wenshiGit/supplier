/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.order.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 订单管理Entity
 * @author ZiruiSong
 * @version 2019-04-10
 */
public class SupSubOrder extends DataEntity<SupSubOrder> {
	
	private static final long serialVersionUID = 1L;
	private SupOrder pId;		// 主订单编号 父类
	private Long bid;		// 品牌ID
	private String numIid;		// 商品数字ID
	private String outerSkuId;		// 外部自定义的sku
	private String productNo;		// 货号
	private String innerSize;		// 内部尺码
	private String outerSize;		// 外部尺码
	private Double tagPrice;		// 吊牌价
	private Double agentPrice;		// 代理价
	private Double agentAgio;		// 代理折扣
	private String agentExpectNum;		// 期望发货数量
	private Double agentPayment;		// 代理实付款
	private Double channelPrice;		// 渠道价格
	private Double channelAgio;		// 渠道折扣
	private String channelSendNum;		// 渠道实发数量
	private String commissionFee;		// 佣金
	private Double channelReceivedFee;		// 渠道收取金额
	private Date createTime;		// 创建时间
	private Date updateTime;		// 修改时间
	
	public SupSubOrder() {
		super();
	}

	public SupSubOrder(String id){
		super(id);
	}

	public SupSubOrder(SupOrder pId){
		this.pId = pId;
	}

	@NotNull(message="主订单编号不能为空")
	public SupOrder getPId() {
		return pId;
	}

	public void setPId(SupOrder pId) {
		this.pId = pId;
	}
	
	@NotNull(message="品牌ID不能为空")
	public Long getBid() {
		return bid;
	}

	public void setBid(Long bid) {
		this.bid = bid;
	}
	
	@Length(min=1, max=128, message="商品数字ID长度必须介于 1 和 128 之间")
	public String getNumIid() {
		return numIid;
	}

	public void setNumIid(String numIid) {
		this.numIid = numIid;
	}
	
	@Length(min=0, max=128, message="外部自定义的sku长度必须介于 0 和 128 之间")
	public String getOuterSkuId() {
		return outerSkuId;
	}

	public void setOuterSkuId(String outerSkuId) {
		this.outerSkuId = outerSkuId;
	}
	
	@Length(min=1, max=64, message="货号长度必须介于 1 和 64 之间")
	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	
	@Length(min=1, max=32, message="内部尺码长度必须介于 1 和 32 之间")
	public String getInnerSize() {
		return innerSize;
	}

	public void setInnerSize(String innerSize) {
		this.innerSize = innerSize;
	}
	
	@Length(min=0, max=32, message="外部尺码长度必须介于 0 和 32 之间")
	public String getOuterSize() {
		return outerSize;
	}

	public void setOuterSize(String outerSize) {
		this.outerSize = outerSize;
	}
	
	@NotNull(message="吊牌价不能为空")
	public Double getTagPrice() {
		return tagPrice;
	}

	public void setTagPrice(Double tagPrice) {
		this.tagPrice = tagPrice;
	}
	
	@NotNull(message="代理价不能为空")
	public Double getAgentPrice() {
		return agentPrice;
	}

	public void setAgentPrice(Double agentPrice) {
		this.agentPrice = agentPrice;
	}
	
	@NotNull(message="代理折扣不能为空")
	public Double getAgentAgio() {
		return agentAgio;
	}

	public void setAgentAgio(Double agentAgio) {
		this.agentAgio = agentAgio;
	}
	
	@Length(min=1, max=8, message="期望发货数量长度必须介于 1 和 8 之间")
	public String getAgentExpectNum() {
		return agentExpectNum;
	}

	public void setAgentExpectNum(String agentExpectNum) {
		this.agentExpectNum = agentExpectNum;
	}
	
	@NotNull(message="代理实付款不能为空")
	public Double getAgentPayment() {
		return agentPayment;
	}

	public void setAgentPayment(Double agentPayment) {
		this.agentPayment = agentPayment;
	}
	
	@NotNull(message="渠道价格不能为空")
	public Double getChannelPrice() {
		return channelPrice;
	}

	public void setChannelPrice(Double channelPrice) {
		this.channelPrice = channelPrice;
	}
	
	@NotNull(message="渠道折扣不能为空")
	public Double getChannelAgio() {
		return channelAgio;
	}

	public void setChannelAgio(Double channelAgio) {
		this.channelAgio = channelAgio;
	}
	
	@Length(min=0, max=8, message="渠道实发数量长度必须介于 0 和 8 之间")
	public String getChannelSendNum() {
		return channelSendNum;
	}

	public void setChannelSendNum(String channelSendNum) {
		this.channelSendNum = channelSendNum;
	}
	
	@Length(min=0, max=255, message="佣金长度必须介于 0 和 255 之间")
	public String getCommissionFee() {
		return commissionFee;
	}

	public void setCommissionFee(String commissionFee) {
		this.commissionFee = commissionFee;
	}
	
	public Double getChannelReceivedFee() {
		return channelReceivedFee;
	}

	public void setChannelReceivedFee(Double channelReceivedFee) {
		this.channelReceivedFee = channelReceivedFee;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="创建时间不能为空")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}