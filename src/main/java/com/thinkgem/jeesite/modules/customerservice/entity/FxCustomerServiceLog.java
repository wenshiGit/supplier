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
 * 售后日志Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxCustomerServiceLog extends DataEntity<FxCustomerServiceLog> {
	
	private static final long serialVersionUID = 1L;
	private String logId;		// log_id
	private Date createTime;		// create_time
	private String logDesc;		// log_desc
	private String readState;		// read_state
	private Long serviceId;		// service_id
	private String serviceState;		// service_state
	private User user;		// user_id
	
	public FxCustomerServiceLog() {
		super();
	}

	public FxCustomerServiceLog(String id){
		super(id);
	}

	@Length(min=1, max=11, message="log_id长度必须介于 1 和 11 之间")
	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Length(min=0, max=800, message="log_desc长度必须介于 0 和 800 之间")
	public String getLogDesc() {
		return logDesc;
	}

	public void setLogDesc(String logDesc) {
		this.logDesc = logDesc;
	}
	
	@Length(min=0, max=11, message="read_state长度必须介于 0 和 11 之间")
	public String getReadState() {
		return readState;
	}

	public void setReadState(String readState) {
		this.readState = readState;
	}
	
	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	
	@Length(min=0, max=6, message="service_state长度必须介于 0 和 6 之间")
	public String getServiceState() {
		return serviceState;
	}

	public void setServiceState(String serviceState) {
		this.serviceState = serviceState;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}