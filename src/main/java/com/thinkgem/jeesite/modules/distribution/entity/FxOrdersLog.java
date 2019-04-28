/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.distribution.entity;

import javax.validation.constraints.NotNull;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 订单日志表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxOrdersLog extends DataEntity<FxOrdersLog> {
	
	private static final long serialVersionUID = 1L;
	private Long logId;		// log_id
	private String content;		// content
	private Date createTime;		// create_time
	private Long optUserId;		// opt_user_id
	private String optUserName;		// opt_user_name
	private Long orderId;		// order_id
	private String logType;		// 1、代理商，2渠道商、3，所有
	private Long restOrderId;		// 订单重做ID
	
	public FxOrdersLog() {
		super();
	}

	public FxOrdersLog(String id){
		super(id);
	}

	@NotNull(message="log_id不能为空")
	public Long getLogId() {
		return logId;
	}

	public void setLogId(Long logId) {
		this.logId = logId;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public Long getOptUserId() {
		return optUserId;
	}

	public void setOptUserId(Long optUserId) {
		this.optUserId = optUserId;
	}
	
	@Length(min=0, max=100, message="opt_user_name长度必须介于 0 和 100 之间")
	public String getOptUserName() {
		return optUserName;
	}

	public void setOptUserName(String optUserName) {
		this.optUserName = optUserName;
	}
	
	@NotNull(message="order_id不能为空")
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	@Length(min=0, max=8, message="1、代理商，2渠道商、3，所有长度必须介于 0 和 8 之间")
	public String getLogType() {
		return logType;
	}

	public void setLogType(String logType) {
		this.logType = logType;
	}
	
	public Long getRestOrderId() {
		return restOrderId;
	}

	public void setRestOrderId(Long restOrderId) {
		this.restOrderId = restOrderId;
	}
	
}