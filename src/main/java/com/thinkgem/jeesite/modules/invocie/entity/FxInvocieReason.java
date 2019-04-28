/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.invocie.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 发票退回原因Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxInvocieReason extends DataEntity<FxInvocieReason> {
	
	private static final long serialVersionUID = 1L;
	private Long invocieId;		// invocie_id
	private String context;		// context
	private Date createTime;		// create_time
	private Long optUserId;		// opt_user_id
	
	public FxInvocieReason() {
		super();
	}

	public FxInvocieReason(String id){
		super(id);
	}

	@NotNull(message="invocie_id不能为空")
	public Long getInvocieId() {
		return invocieId;
	}

	public void setInvocieId(Long invocieId) {
		this.invocieId = invocieId;
	}
	
	@Length(min=1, max=500, message="context长度必须介于 1 和 500 之间")
	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@NotNull(message="opt_user_id不能为空")
	public Long getOptUserId() {
		return optUserId;
	}

	public void setOptUserId(Long optUserId) {
		this.optUserId = optUserId;
	}
	
}