/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.customerservice.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.thinkgem.jeesite.modules.sys.entity.User;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 售后表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxCustomerService extends DataEntity<FxCustomerService> {
	
	private static final long serialVersionUID = 1L;
	private String serviceId;		// service_id
	private String backgoodscount;		// 客户申请退货数量
	private String channelReturnCount;		// 渠道收货数量
	private String channelReturnMoney;		// channel_return_money
	private Date channelReturnDate;		// 渠道退款日期
	private String emsComp;		// 快递
	private String emsId;		// 退货时的快递单号
	private String errorRemark;		// error_remark
	private Long logId;		// log_id
	private String orderId;		// 订单ID
	private String returnAddr;		// 退货地址
	private Date returnEmsTime;		// 订单签收时间
	private String returnEmsRemark;		// 签收说明
	private String returnMoney;		// 退款金额
	private String returnEmsMoney;		// 退款运费
	private String returnedmoney;		// 客户申请退款金额
	private String sendCount;		// 实际发货数量
	private Date serviceCrtTime;		// 售后服务申请时间
	private Date serviceModifyTime;		// 售后服务修改时间
	private String serviceName;		// 问题名称
	private String serviceRemark;		// service_remark
	private String serviceReturnState;		// 是否需要退货1表示退货，0表示不退货，默认退货
	private String serviceState;		// 售后状态
	private String serviceType;		// 售后类型
	private User user;		// 申请售后人员
	private String returnPlatformDeduct;		// 退货提成
	private String serviceCrtMonNo;		// 用户申请售后月份
	
	public FxCustomerService() {
		super();
	}

	public FxCustomerService(String id){
		super(id);
	}

	@Length(min=1, max=11, message="service_id长度必须介于 1 和 11 之间")
	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	
	@Length(min=0, max=11, message="客户申请退货数量长度必须介于 0 和 11 之间")
	public String getBackgoodscount() {
		return backgoodscount;
	}

	public void setBackgoodscount(String backgoodscount) {
		this.backgoodscount = backgoodscount;
	}
	
	@Length(min=0, max=11, message="渠道收货数量长度必须介于 0 和 11 之间")
	public String getChannelReturnCount() {
		return channelReturnCount;
	}

	public void setChannelReturnCount(String channelReturnCount) {
		this.channelReturnCount = channelReturnCount;
	}
	
	public String getChannelReturnMoney() {
		return channelReturnMoney;
	}

	public void setChannelReturnMoney(String channelReturnMoney) {
		this.channelReturnMoney = channelReturnMoney;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getChannelReturnDate() {
		return channelReturnDate;
	}

	public void setChannelReturnDate(Date channelReturnDate) {
		this.channelReturnDate = channelReturnDate;
	}
	
	@Length(min=0, max=50, message="快递长度必须介于 0 和 50 之间")
	public String getEmsComp() {
		return emsComp;
	}

	public void setEmsComp(String emsComp) {
		this.emsComp = emsComp;
	}
	
	@Length(min=0, max=50, message="退货时的快递单号长度必须介于 0 和 50 之间")
	public String getEmsId() {
		return emsId;
	}

	public void setEmsId(String emsId) {
		this.emsId = emsId;
	}
	
	public String getErrorRemark() {
		return errorRemark;
	}

	public void setErrorRemark(String errorRemark) {
		this.errorRemark = errorRemark;
	}
	
	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}
	
	@Length(min=0, max=20, message="订单ID长度必须介于 0 和 20 之间")
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	@Length(min=0, max=500, message="退货地址长度必须介于 0 和 500 之间")
	public String getReturnAddr() {
		return returnAddr;
	}

	public void setReturnAddr(String returnAddr) {
		this.returnAddr = returnAddr;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getReturnEmsTime() {
		return returnEmsTime;
	}

	public void setReturnEmsTime(Date returnEmsTime) {
		this.returnEmsTime = returnEmsTime;
	}
	
	@Length(min=0, max=200, message="签收说明长度必须介于 0 和 200 之间")
	public String getReturnEmsRemark() {
		return returnEmsRemark;
	}

	public void setReturnEmsRemark(String returnEmsRemark) {
		this.returnEmsRemark = returnEmsRemark;
	}
	
	public String getReturnMoney() {
		return returnMoney;
	}

	public void setReturnMoney(String returnMoney) {
		this.returnMoney = returnMoney;
	}
	
	public String getReturnEmsMoney() {
		return returnEmsMoney;
	}

	public void setReturnEmsMoney(String returnEmsMoney) {
		this.returnEmsMoney = returnEmsMoney;
	}
	
	public String getReturnedmoney() {
		return returnedmoney;
	}

	public void setReturnedmoney(String returnedmoney) {
		this.returnedmoney = returnedmoney;
	}
	
	@Length(min=0, max=11, message="实际发货数量长度必须介于 0 和 11 之间")
	public String getSendCount() {
		return sendCount;
	}

	public void setSendCount(String sendCount) {
		this.sendCount = sendCount;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getServiceCrtTime() {
		return serviceCrtTime;
	}

	public void setServiceCrtTime(Date serviceCrtTime) {
		this.serviceCrtTime = serviceCrtTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getServiceModifyTime() {
		return serviceModifyTime;
	}

	public void setServiceModifyTime(Date serviceModifyTime) {
		this.serviceModifyTime = serviceModifyTime;
	}
	
	@Length(min=0, max=6, message="问题名称长度必须介于 0 和 6 之间")
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	
	public String getServiceRemark() {
		return serviceRemark;
	}

	public void setServiceRemark(String serviceRemark) {
		this.serviceRemark = serviceRemark;
	}
	
	@Length(min=1, max=6, message="是否需要退货1表示退货，0表示不退货，默认退货长度必须介于 1 和 6 之间")
	public String getServiceReturnState() {
		return serviceReturnState;
	}

	public void setServiceReturnState(String serviceReturnState) {
		this.serviceReturnState = serviceReturnState;
	}
	
	@Length(min=1, max=6, message="售后状态长度必须介于 1 和 6 之间")
	public String getServiceState() {
		return serviceState;
	}

	public void setServiceState(String serviceState) {
		this.serviceState = serviceState;
	}
	
	@Length(min=0, max=6, message="售后类型长度必须介于 0 和 6 之间")
	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String getReturnPlatformDeduct() {
		return returnPlatformDeduct;
	}

	public void setReturnPlatformDeduct(String returnPlatformDeduct) {
		this.returnPlatformDeduct = returnPlatformDeduct;
	}
	
	@Length(min=0, max=11, message="用户申请售后月份长度必须介于 0 和 11 之间")
	public String getServiceCrtMonNo() {
		return serviceCrtMonNo;
	}

	public void setServiceCrtMonNo(String serviceCrtMonNo) {
		this.serviceCrtMonNo = serviceCrtMonNo;
	}
	
}