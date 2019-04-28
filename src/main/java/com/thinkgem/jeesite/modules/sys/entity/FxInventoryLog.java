/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 库存导入日志Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxInventoryLog extends DataEntity<FxInventoryLog> {
	
	private static final long serialVersionUID = 1L;
	private Long channelId;		// 这个渠道的ID
	private String channelName;		// 这个渠道的名字
	private String importWay;		// 导入方式：1 增量 2全量    默认是增量
	private Long updateCounts;		// 本次库存更新条数或本次导入条数
	private Long afterUpdateCounts;		// 导入后该渠道的库存条数
	private Long thisUpdateInvenTotal;		// 本次更新库存总数
	private Long afterUpdateAllInvenTotal;		// 这个渠道的更新后的库存总数
	private Date logTime;		// 统计时间、日志发生时间，导入时间
	private String operator;		// 操作人，导入库存的人员
	
	public FxInventoryLog() {
		super();
	}

	public FxInventoryLog(String id){
		super(id);
	}

	@NotNull(message="这个渠道的ID不能为空")
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
	@Length(min=0, max=30, message="这个渠道的名字长度必须介于 0 和 30 之间")
	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	@Length(min=0, max=10, message="导入方式：1 增量 2全量    默认是增量长度必须介于 0 和 10 之间")
	public String getImportWay() {
		return importWay;
	}

	public void setImportWay(String importWay) {
		this.importWay = importWay;
	}
	
	public Long getUpdateCounts() {
		return updateCounts;
	}

	public void setUpdateCounts(Long updateCounts) {
		this.updateCounts = updateCounts;
	}
	
	public Long getAfterUpdateCounts() {
		return afterUpdateCounts;
	}

	public void setAfterUpdateCounts(Long afterUpdateCounts) {
		this.afterUpdateCounts = afterUpdateCounts;
	}
	
	public Long getThisUpdateInvenTotal() {
		return thisUpdateInvenTotal;
	}

	public void setThisUpdateInvenTotal(Long thisUpdateInvenTotal) {
		this.thisUpdateInvenTotal = thisUpdateInvenTotal;
	}
	
	public Long getAfterUpdateAllInvenTotal() {
		return afterUpdateAllInvenTotal;
	}

	public void setAfterUpdateAllInvenTotal(Long afterUpdateAllInvenTotal) {
		this.afterUpdateAllInvenTotal = afterUpdateAllInvenTotal;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getLogTime() {
		return logTime;
	}

	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}
	
	@Length(min=0, max=100, message="操作人，导入库存的人员长度必须介于 0 和 100 之间")
	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}
	
}