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
 * 渠道库存隐藏关系Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxChannelInventoryConcealRelation extends DataEntity<FxChannelInventoryConcealRelation> {
	
	private static final long serialVersionUID = 1L;
	private Long concealRuleId;		// conceal_rule_id
	private String concealState;		// conceal_state
	private Date createTime;		// create_time
	private String invenModel;		// inven_model
	private String ruleType;		// rule_type
	private Long channelId;		// channel_id
	
	public FxChannelInventoryConcealRelation() {
		super();
	}

	public FxChannelInventoryConcealRelation(String id){
		super(id);
	}

	@NotNull(message="conceal_rule_id不能为空")
	public Long getConcealRuleId() {
		return concealRuleId;
	}

	public void setConcealRuleId(Long concealRuleId) {
		this.concealRuleId = concealRuleId;
	}
	
	@Length(min=0, max=6, message="conceal_state长度必须介于 0 和 6 之间")
	public String getConcealState() {
		return concealState;
	}

	public void setConcealState(String concealState) {
		this.concealState = concealState;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="create_time不能为空")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Length(min=0, max=255, message="inven_model长度必须介于 0 和 255 之间")
	public String getInvenModel() {
		return invenModel;
	}

	public void setInvenModel(String invenModel) {
		this.invenModel = invenModel;
	}
	
	@Length(min=0, max=6, message="rule_type长度必须介于 0 和 6 之间")
	public String getRuleType() {
		return ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
	}
	
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
}