/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.customerservice.entity;

import org.hibernate.validator.constraints.Length;
import com.thinkgem.jeesite.modules.sys.entity.User;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 售后留言表售后说明Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxCustomerServiceMsg extends DataEntity<FxCustomerServiceMsg> {
	
	private static final long serialVersionUID = 1L;
	private String logId;		// log_id
	private User user;		// user_id
	private Long serviceId;		// service_id
	private String logDesc;		// log_desc
	private String readState;		// read_state
	private String privateType;		// 0 公共  1私有
	private Date createTime;		// create_time
	
	public FxCustomerServiceMsg() {
		super();
	}

	public FxCustomerServiceMsg(String id){
		super(id);
	}

	@Length(min=1, max=11, message="log_id长度必须介于 1 和 11 之间")
	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	
	@Length(min=0, max=2000, message="log_desc长度必须介于 0 和 2000 之间")
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
	
	@Length(min=1, max=6, message="0 公共  1私有长度必须介于 1 和 6 之间")
	public String getPrivateType() {
		return privateType;
	}

	public void setPrivateType(String privateType) {
		this.privateType = privateType;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}