/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.distribution.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 渠道Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxChannels extends DataEntity<FxChannels> {
	
	private static final long serialVersionUID = 1L;
	private Long channelId;		// channel_id
	private String afterSaleAddress;		// 渠道售后地址
	private String afterSaleRate;		// 售后比例
	private String autoToChannelId;		// 自动对该渠道转单
	private String canReceive;		// 1接单，0不接单
	private String channelAgio;		// 渠道默认折扣
	private String channelComments;		// 渠道备注
	private String channelDesc;		// 渠道描述
	private String channelName;		// 渠道名称
	private String channelPlatformAgio;		// 渠道平台抽成折扣
	private String channelPlatformFreight;		// 渠道平台运费抽成
	private String channelStatus;		// 0：删除 1：正常
	private String distributionDesc;		// 配货说明
	private String distributionRate;		// 配货率
	private String distributionRateIsAuto;		// distribution_rate_is_auto
	private String distributionTime;		// 配货时间
	private String exportField;		// 订单导出字段
	private String exportSql;		// 订单导出语句
	private String invenOnOff;		// 1减库存，0不减
	private String orderInvenTotal;		// 交易的订单中的商品总数
	private String receiveTimePoint;		// 当天截单时间
	private String returnAddr;		// 默认退货地址
	private String successInvenTotal;		// 交易成功的商品总数
	private Date unreceiveEndTime;		// 不接单结束时间
	private Date unreceiveStartTime;		// 不接单开始时间
	private Long channelUserId;		// channel_user_id
	private String hidden;		// 1：隐藏 0：不隐藏
	private String openForCommonUsers;		// 是否只针对普通用户开发，对特殊用户隐藏 1是 0 否
	private String isweekendsend;		// isweekendsend
	private String forConsignment;		// for_consignment
	private String channelExpress;		// 渠道发货快递
	private String calculationMethod;		// 配货率计算方式
	private String overTime;		// 截单时间
	private String sendPlace;		// 发货地
	private String sendOverTime;		// 发货时效
	private String afterSaleRation;		// 售后比例
	private String heaveOrNum;		// 运费续重或者续件
	private String groupBuyLimit;		// 团购退货限制
	private String sendModel;		// 发货模式
	private String isAddBox;		// 是否有加固盒
	private String resBrand;		// 品牌限制
	private String resBrandName;		// 品牌限制名称
	private String resGroup;		// 团购限制
	
	public FxChannels() {
		super();
	}

	public FxChannels(String id){
		super(id);
	}

	@NotNull(message="channel_id不能为空")
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
	public String getAfterSaleAddress() {
		return afterSaleAddress;
	}

	public void setAfterSaleAddress(String afterSaleAddress) {
		this.afterSaleAddress = afterSaleAddress;
	}
	
	@Length(min=0, max=100, message="售后比例长度必须介于 0 和 100 之间")
	public String getAfterSaleRate() {
		return afterSaleRate;
	}

	public void setAfterSaleRate(String afterSaleRate) {
		this.afterSaleRate = afterSaleRate;
	}
	
	@Length(min=0, max=128, message="自动对该渠道转单长度必须介于 0 和 128 之间")
	public String getAutoToChannelId() {
		return autoToChannelId;
	}

	public void setAutoToChannelId(String autoToChannelId) {
		this.autoToChannelId = autoToChannelId;
	}
	
	@Length(min=0, max=11, message="1接单，0不接单长度必须介于 0 和 11 之间")
	public String getCanReceive() {
		return canReceive;
	}

	public void setCanReceive(String canReceive) {
		this.canReceive = canReceive;
	}
	
	public String getChannelAgio() {
		return channelAgio;
	}

	public void setChannelAgio(String channelAgio) {
		this.channelAgio = channelAgio;
	}
	
	public String getChannelComments() {
		return channelComments;
	}

	public void setChannelComments(String channelComments) {
		this.channelComments = channelComments;
	}
	
	public String getChannelDesc() {
		return channelDesc;
	}

	public void setChannelDesc(String channelDesc) {
		this.channelDesc = channelDesc;
	}
	
	@Length(min=0, max=30, message="渠道名称长度必须介于 0 和 30 之间")
	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	public String getChannelPlatformAgio() {
		return channelPlatformAgio;
	}

	public void setChannelPlatformAgio(String channelPlatformAgio) {
		this.channelPlatformAgio = channelPlatformAgio;
	}
	
	@Length(min=0, max=11, message="渠道平台运费抽成长度必须介于 0 和 11 之间")
	public String getChannelPlatformFreight() {
		return channelPlatformFreight;
	}

	public void setChannelPlatformFreight(String channelPlatformFreight) {
		this.channelPlatformFreight = channelPlatformFreight;
	}
	
	@Length(min=0, max=11, message="0：删除 1：正常长度必须介于 0 和 11 之间")
	public String getChannelStatus() {
		return channelStatus;
	}

	public void setChannelStatus(String channelStatus) {
		this.channelStatus = channelStatus;
	}
	
	public String getDistributionDesc() {
		return distributionDesc;
	}

	public void setDistributionDesc(String distributionDesc) {
		this.distributionDesc = distributionDesc;
	}
	
	@Length(min=0, max=20, message="配货率长度必须介于 0 和 20 之间")
	public String getDistributionRate() {
		return distributionRate;
	}

	public void setDistributionRate(String distributionRate) {
		this.distributionRate = distributionRate;
	}
	
	@Length(min=0, max=11, message="distribution_rate_is_auto长度必须介于 0 和 11 之间")
	public String getDistributionRateIsAuto() {
		return distributionRateIsAuto;
	}

	public void setDistributionRateIsAuto(String distributionRateIsAuto) {
		this.distributionRateIsAuto = distributionRateIsAuto;
	}
	
	@Length(min=0, max=255, message="配货时间长度必须介于 0 和 255 之间")
	public String getDistributionTime() {
		return distributionTime;
	}

	public void setDistributionTime(String distributionTime) {
		this.distributionTime = distributionTime;
	}
	
	public String getExportField() {
		return exportField;
	}

	public void setExportField(String exportField) {
		this.exportField = exportField;
	}
	
	public String getExportSql() {
		return exportSql;
	}

	public void setExportSql(String exportSql) {
		this.exportSql = exportSql;
	}
	
	@Length(min=1, max=11, message="1减库存，0不减长度必须介于 1 和 11 之间")
	public String getInvenOnOff() {
		return invenOnOff;
	}

	public void setInvenOnOff(String invenOnOff) {
		this.invenOnOff = invenOnOff;
	}
	
	@Length(min=0, max=11, message="交易的订单中的商品总数长度必须介于 0 和 11 之间")
	public String getOrderInvenTotal() {
		return orderInvenTotal;
	}

	public void setOrderInvenTotal(String orderInvenTotal) {
		this.orderInvenTotal = orderInvenTotal;
	}
	
	@Length(min=0, max=100, message="当天截单时间长度必须介于 0 和 100 之间")
	public String getReceiveTimePoint() {
		return receiveTimePoint;
	}

	public void setReceiveTimePoint(String receiveTimePoint) {
		this.receiveTimePoint = receiveTimePoint;
	}
	
	public String getReturnAddr() {
		return returnAddr;
	}

	public void setReturnAddr(String returnAddr) {
		this.returnAddr = returnAddr;
	}
	
	@Length(min=0, max=11, message="交易成功的商品总数长度必须介于 0 和 11 之间")
	public String getSuccessInvenTotal() {
		return successInvenTotal;
	}

	public void setSuccessInvenTotal(String successInvenTotal) {
		this.successInvenTotal = successInvenTotal;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUnreceiveEndTime() {
		return unreceiveEndTime;
	}

	public void setUnreceiveEndTime(Date unreceiveEndTime) {
		this.unreceiveEndTime = unreceiveEndTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUnreceiveStartTime() {
		return unreceiveStartTime;
	}

	public void setUnreceiveStartTime(Date unreceiveStartTime) {
		this.unreceiveStartTime = unreceiveStartTime;
	}
	
	public Long getChannelUserId() {
		return channelUserId;
	}

	public void setChannelUserId(Long channelUserId) {
		this.channelUserId = channelUserId;
	}
	
	@Length(min=0, max=20, message="1：隐藏 0：不隐藏长度必须介于 0 和 20 之间")
	public String getHidden() {
		return hidden;
	}

	public void setHidden(String hidden) {
		this.hidden = hidden;
	}
	
	@Length(min=0, max=20, message="是否只针对普通用户开发，对特殊用户隐藏 1是 0 否长度必须介于 0 和 20 之间")
	public String getOpenForCommonUsers() {
		return openForCommonUsers;
	}

	public void setOpenForCommonUsers(String openForCommonUsers) {
		this.openForCommonUsers = openForCommonUsers;
	}
	
	@Length(min=0, max=20, message="isweekendsend长度必须介于 0 和 20 之间")
	public String getIsweekendsend() {
		return isweekendsend;
	}

	public void setIsweekendsend(String isweekendsend) {
		this.isweekendsend = isweekendsend;
	}
	
	@Length(min=0, max=20, message="for_consignment长度必须介于 0 和 20 之间")
	public String getForConsignment() {
		return forConsignment;
	}

	public void setForConsignment(String forConsignment) {
		this.forConsignment = forConsignment;
	}
	
	@Length(min=0, max=20, message="渠道发货快递长度必须介于 0 和 20 之间")
	public String getChannelExpress() {
		return channelExpress;
	}

	public void setChannelExpress(String channelExpress) {
		this.channelExpress = channelExpress;
	}
	
	@Length(min=0, max=20, message="配货率计算方式长度必须介于 0 和 20 之间")
	public String getCalculationMethod() {
		return calculationMethod;
	}

	public void setCalculationMethod(String calculationMethod) {
		this.calculationMethod = calculationMethod;
	}
	
	@Length(min=0, max=20, message="截单时间长度必须介于 0 和 20 之间")
	public String getOverTime() {
		return overTime;
	}

	public void setOverTime(String overTime) {
		this.overTime = overTime;
	}
	
	@Length(min=0, max=20, message="发货地长度必须介于 0 和 20 之间")
	public String getSendPlace() {
		return sendPlace;
	}

	public void setSendPlace(String sendPlace) {
		this.sendPlace = sendPlace;
	}
	
	@Length(min=0, max=20, message="发货时效长度必须介于 0 和 20 之间")
	public String getSendOverTime() {
		return sendOverTime;
	}

	public void setSendOverTime(String sendOverTime) {
		this.sendOverTime = sendOverTime;
	}
	
	@Length(min=0, max=20, message="售后比例长度必须介于 0 和 20 之间")
	public String getAfterSaleRation() {
		return afterSaleRation;
	}

	public void setAfterSaleRation(String afterSaleRation) {
		this.afterSaleRation = afterSaleRation;
	}
	
	@Length(min=0, max=20, message="运费续重或者续件长度必须介于 0 和 20 之间")
	public String getHeaveOrNum() {
		return heaveOrNum;
	}

	public void setHeaveOrNum(String heaveOrNum) {
		this.heaveOrNum = heaveOrNum;
	}
	
	@Length(min=0, max=20, message="团购退货限制长度必须介于 0 和 20 之间")
	public String getGroupBuyLimit() {
		return groupBuyLimit;
	}

	public void setGroupBuyLimit(String groupBuyLimit) {
		this.groupBuyLimit = groupBuyLimit;
	}
	
	@Length(min=0, max=20, message="发货模式长度必须介于 0 和 20 之间")
	public String getSendModel() {
		return sendModel;
	}

	public void setSendModel(String sendModel) {
		this.sendModel = sendModel;
	}
	
	@Length(min=0, max=20, message="是否有加固盒长度必须介于 0 和 20 之间")
	public String getIsAddBox() {
		return isAddBox;
	}

	public void setIsAddBox(String isAddBox) {
		this.isAddBox = isAddBox;
	}
	
	@Length(min=0, max=200, message="品牌限制长度必须介于 0 和 200 之间")
	public String getResBrand() {
		return resBrand;
	}

	public void setResBrand(String resBrand) {
		this.resBrand = resBrand;
	}
	
	@Length(min=0, max=200, message="品牌限制名称长度必须介于 0 和 200 之间")
	public String getResBrandName() {
		return resBrandName;
	}

	public void setResBrandName(String resBrandName) {
		this.resBrandName = resBrandName;
	}
	
	@Length(min=0, max=11, message="团购限制长度必须介于 0 和 11 之间")
	public String getResGroup() {
		return resGroup;
	}

	public void setResGroup(String resGroup) {
		this.resGroup = resGroup;
	}
	
}