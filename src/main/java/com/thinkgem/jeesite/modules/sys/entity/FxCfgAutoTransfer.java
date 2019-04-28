/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 自动转换配置Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxCfgAutoTransfer extends DataEntity<FxCfgAutoTransfer> {
	
	private static final long serialVersionUID = 1L;
	private String channelId;		// channel_id
	private String ruleName;		// rule_name
	private String ruleValue;		// rule_value
	
	public FxCfgAutoTransfer() {
		super();
	}

	public FxCfgAutoTransfer(String id){
		super(id);
	}

	@Length(min=1, max=11, message="channel_id长度必须介于 1 和 11 之间")
	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	@Length(min=1, max=40, message="rule_name长度必须介于 1 和 40 之间")
	public String getRuleName() {
		return ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
	}
	
	@Length(min=0, max=11, message="rule_value长度必须介于 0 和 11 之间")
	public String getRuleValue() {
		return ruleValue;
	}

	public void setRuleValue(String ruleValue) {
		this.ruleValue = ruleValue;
	}
	
}