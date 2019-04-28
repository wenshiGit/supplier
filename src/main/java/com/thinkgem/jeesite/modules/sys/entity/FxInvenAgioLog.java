/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 折扣日志Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxInvenAgioLog extends DataEntity<FxInvenAgioLog> {
	
	private static final long serialVersionUID = 1L;
	private String logId;		// log_id
	private String invenModel;		// inven_model
	private String channelId;		// channel_id
	private String invenAgio;		// inven_agio
	private Date createdTime;		// created_time
	private String state;		// state
	private String importPerson;		// import_person
	private String costAgio;		// cost_agio
	
	public FxInvenAgioLog() {
		super();
	}

	public FxInvenAgioLog(String id){
		super(id);
	}

	@Length(min=1, max=20, message="log_id长度必须介于 1 和 20 之间")
	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}
	
	@Length(min=1, max=200, message="inven_model长度必须介于 1 和 200 之间")
	public String getInvenModel() {
		return invenModel;
	}

	public void setInvenModel(String invenModel) {
		this.invenModel = invenModel;
	}
	
	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	public String getInvenAgio() {
		return invenAgio;
	}

	public void setInvenAgio(String invenAgio) {
		this.invenAgio = invenAgio;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="created_time不能为空")
	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	@Length(min=0, max=2, message="state长度必须介于 0 和 2 之间")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Length(min=0, max=50, message="import_person长度必须介于 0 和 50 之间")
	public String getImportPerson() {
		return importPerson;
	}

	public void setImportPerson(String importPerson) {
		this.importPerson = importPerson;
	}
	
	public String getCostAgio() {
		return costAgio;
	}

	public void setCostAgio(String costAgio) {
		this.costAgio = costAgio;
	}
	
}