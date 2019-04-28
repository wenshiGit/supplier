/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;
import com.thinkgem.jeesite.modules.sys.entity.User;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 隐藏用户Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxConcealUser extends DataEntity<FxConcealUser> {
	
	private static final long serialVersionUID = 1L;
	private Date createTime;		// create_time
	private Long concealRuleId;		// conceal_rule_id
	private User user;		// user_id
	
	public FxConcealUser() {
		super();
	}

	public FxConcealUser(String id){
		super(id);
	}

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="create_time不能为空")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@NotNull(message="conceal_rule_id不能为空")
	public Long getConcealRuleId() {
		return concealRuleId;
	}

	public void setConcealRuleId(Long concealRuleId) {
		this.concealRuleId = concealRuleId;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}