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
 * @version 2019-04-11
 */
public class SupOrder extends DataEntity<SupOrder> {
	
	private static final long serialVersionUID = 1L;
	private Long orderId;		// 订单编号
	private String apiOrderId;		// API订单编号
	private Long agentId;		// 代理ID
	private Long agentExpressId;		// 快递公司ID
	private Double agentPostFee;		// 代理总邮费
	private String agentPayment;		// 代理实付金额
	private Date agentPayTime;		// 代理付款时间
	private String agentIpAddress;		// 代理IP地址
	private Long channelId;		// 渠道ID
	private String productNo;		// 货号
	private Date channelConfirmTime;		// 渠道确认时间
	private String goodsSize;		// 尺码
	private Double channelPostFee;		// 渠道快递费用
	private String num;		// 数量
	private Date channelSendTime;		// 渠道发货时间
	private String tagPrice;		// 吊牌价
	private String agentAgio;		// 代理折扣
	private Long confirmUserId;		// 审核人
	private Long receiverState;		// 收货人所在省份
	private Long reveiverCity;		// 收货人所在的城市
	private Long reveiverDistrict;		// 收货人的所在地区
	private String receiverName;		// 收货人姓名
	private String channelReceivedFee;		// 渠道实收总金额
	private String receiverMobile;		// 收货人电话
	private String channelAgio;		// 渠道折扣
	private String receiverAddress;		// 收货人地址
	private String expressNo;		// 快递单号
	private String sendNum;		// 渠道实发数量
	private Double agentPrice;//售出价
	private String logisticsCompany;		// 订单发货快递
	private String errMsg;		// 错误信息
	private String customerServiceId;		// 售后编号
	private Double totalFee;		// 订单总价
	private String orderStatus;		// 订单状态
	private Double commissionFee;		// 交易佣金
	private String buyerMessage;		// 买家留言
	private Long shopId;		// 店铺ID
	private String tid;		// 淘宝主订单号
	private Double packageFee;		// 包装费
	private String orderFrom;		// 订单来源
	private String commissionAgio;		// 抽成折扣
	
	public SupOrder() {
		super();
	}

	public SupOrder(String id){
		super(id);
	}

	@NotNull(message="订单编号不能为空")
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	@Length(min=0, max=64, message="API订单编号长度必须介于 0 和 64 之间")
	public String getApiOrderId() {
		return apiOrderId;
	}

	public void setApiOrderId(String apiOrderId) {
		this.apiOrderId = apiOrderId;
	}
	
	@NotNull(message="代理ID不能为空")
	public Long getAgentId() {
		return agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}
	
	@NotNull(message="快递公司ID不能为空")
	public Long getAgentExpressId() {
		return agentExpressId;
	}

	public void setAgentExpressId(Long agentExpressId) {
		this.agentExpressId = agentExpressId;
	}
	
	@NotNull(message="代理总邮费不能为空")
	public Double getAgentPostFee() {
		return agentPostFee;
	}

	public void setAgentPostFee(Double agentPostFee) {
		this.agentPostFee = agentPostFee;
	}
	
	public Double getAgentPrice() {
		return agentPrice;
	}

	public void setAgentPrice(Double agentPrice) {
		this.agentPrice = agentPrice;
	}

	public String getAgentPayment() {
		return agentPayment;
	}

	public void setAgentPayment(String agentPayment) {
		this.agentPayment = agentPayment;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getAgentPayTime() {
		return agentPayTime;
	}

	public void setAgentPayTime(Date agentPayTime) {
		this.agentPayTime = agentPayTime;
	}
	
	@Length(min=0, max=32, message="代理IP地址长度必须介于 0 和 32 之间")
	public String getAgentIpAddress() {
		return agentIpAddress;
	}

	public void setAgentIpAddress(String agentIpAddress) {
		this.agentIpAddress = agentIpAddress;
	}
	
	@NotNull(message="渠道ID不能为空")
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
	@Length(min=0, max=64, message="货号长度必须介于 0 和 64 之间")
	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getChannelConfirmTime() {
		return channelConfirmTime;
	}

	public void setChannelConfirmTime(Date channelConfirmTime) {
		this.channelConfirmTime = channelConfirmTime;
	}
	
	@Length(min=0, max=64, message="尺码长度必须介于 0 和 64 之间")
	public String getGoodsSize() {
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	
	public Double getChannelPostFee() {
		return channelPostFee;
	}

	public void setChannelPostFee(Double channelPostFee) {
		this.channelPostFee = channelPostFee;
	}
	
	@Length(min=0, max=11, message="数量长度必须介于 0 和 11 之间")
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getChannelSendTime() {
		return channelSendTime;
	}

	public void setChannelSendTime(Date channelSendTime) {
		this.channelSendTime = channelSendTime;
	}
	
	public String getTagPrice() {
		return tagPrice;
	}

	public void setTagPrice(String tagPrice) {
		this.tagPrice = tagPrice;
	}
	
	public String getAgentAgio() {
		return agentAgio;
	}

	public void setAgentAgio(String agentAgio) {
		this.agentAgio = agentAgio;
	}
	
	public Long getConfirmUserId() {
		return confirmUserId;
	}

	public void setConfirmUserId(Long confirmUserId) {
		this.confirmUserId = confirmUserId;
	}
	
	@NotNull(message="收货人所在省份不能为空")
	public Long getReceiverState() {
		return receiverState;
	}

	public void setReceiverState(Long receiverState) {
		this.receiverState = receiverState;
	}
	
	@NotNull(message="收货人所在的城市不能为空")
	public Long getReveiverCity() {
		return reveiverCity;
	}

	public void setReveiverCity(Long reveiverCity) {
		this.reveiverCity = reveiverCity;
	}
	
	@NotNull(message="收货人的所在地区不能为空")
	public Long getReveiverDistrict() {
		return reveiverDistrict;
	}

	public void setReveiverDistrict(Long reveiverDistrict) {
		this.reveiverDistrict = reveiverDistrict;
	}
	
	@Length(min=1, max=64, message="收货人姓名长度必须介于 1 和 64 之间")
	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}
	
	public String getChannelReceivedFee() {
		return channelReceivedFee;
	}

	public void setChannelReceivedFee(String channelReceivedFee) {
		this.channelReceivedFee = channelReceivedFee;
	}
	
	@Length(min=1, max=64, message="收货人电话长度必须介于 1 和 64 之间")
	public String getReceiverMobile() {
		return receiverMobile;
	}

	public void setReceiverMobile(String receiverMobile) {
		this.receiverMobile = receiverMobile;
	}
	
	public String getChannelAgio() {
		return channelAgio;
	}

	public void setChannelAgio(String channelAgio) {
		this.channelAgio = channelAgio;
	}
	
	@Length(min=1, max=128, message="收货人地址长度必须介于 1 和 128 之间")
	public String getReceiverAddress() {
		return receiverAddress;
	}

	public void setReceiverAddress(String receiverAddress) {
		this.receiverAddress = receiverAddress;
	}
	
	@Length(min=0, max=128, message="快递单号长度必须介于 0 和 128 之间")
	public String getExpressNo() {
		return expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}
	
	@Length(min=0, max=11, message="渠道实发数量长度必须介于 0 和 11 之间")
	public String getSendNum() {
		return sendNum;
	}

	public void setSendNum(String sendNum) {
		this.sendNum = sendNum;
	}
	
	@Length(min=0, max=64, message="订单发货快递长度必须介于 0 和 64 之间")
	public String getLogisticsCompany() {
		return logisticsCompany;
	}

	public void setLogisticsCompany(String logisticsCompany) {
		this.logisticsCompany = logisticsCompany;
	}
	
	@Length(min=0, max=128, message="错误信息长度必须介于 0 和 128 之间")
	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	@Length(min=0, max=64, message="售后编号长度必须介于 0 和 64 之间")
	public String getCustomerServiceId() {
		return customerServiceId;
	}

	public void setCustomerServiceId(String customerServiceId) {
		this.customerServiceId = customerServiceId;
	}
	
	@NotNull(message="订单总价不能为空")
	public Double getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(Double totalFee) {
		this.totalFee = totalFee;
	}
	
	@Length(min=1, max=2, message="订单状态长度必须介于 1 和 2 之间")
	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	@NotNull(message="交易佣金不能为空")
	public Double getCommissionFee() {
		return commissionFee;
	}

	public void setCommissionFee(Double commissionFee) {
		this.commissionFee = commissionFee;
	}
	
	public String getBuyerMessage() {
		return buyerMessage;
	}

	public void setBuyerMessage(String buyerMessage) {
		this.buyerMessage = buyerMessage;
	}
	
	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	
	@Length(min=0, max=128, message="淘宝主订单号长度必须介于 0 和 128 之间")
	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}
	
	@NotNull(message="包装费不能为空")
	public Double getPackageFee() {
		return packageFee;
	}

	public void setPackageFee(Double packageFee) {
		this.packageFee = packageFee;
	}
	
	@Length(min=1, max=1, message="订单来源长度必须介于 1 和 1 之间")
	public String getOrderFrom() {
		return orderFrom;
	}

	public void setOrderFrom(String orderFrom) {
		this.orderFrom = orderFrom;
	}
	
	public String getCommissionAgio() {
		return commissionAgio;
	}

	public void setCommissionAgio(String commissionAgio) {
		this.commissionAgio = commissionAgio;
	}
	
}