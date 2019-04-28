/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 客服列表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxCfgHeaderInfo extends DataEntity<FxCfgHeaderInfo> {
	
	private static final long serialVersionUID = 1L;
	private String headerId;		// header_id
	private String content;		// content
	private String headerType;		// header_type
	private String qqNbr;		// qq_nbr
	private String state;		// state
	private String styleId;		// style_id
	private String targetUser;		// target_user
	
	public FxCfgHeaderInfo() {
		super();
	}

	public FxCfgHeaderInfo(String id){
		super(id);
	}

	@Length(min=1, max=11, message="header_id长度必须介于 1 和 11 之间")
	public String getHeaderId() {
		return headerId;
	}

	public void setHeaderId(String headerId) {
		this.headerId = headerId;
	}
	
	@Length(min=0, max=200, message="content长度必须介于 0 和 200 之间")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Length(min=0, max=11, message="header_type长度必须介于 0 和 11 之间")
	public String getHeaderType() {
		return headerType;
	}

	public void setHeaderType(String headerType) {
		this.headerType = headerType;
	}
	
	@Length(min=1, max=15, message="qq_nbr长度必须介于 1 和 15 之间")
	public String getQqNbr() {
		return qqNbr;
	}

	public void setQqNbr(String qqNbr) {
		this.qqNbr = qqNbr;
	}
	
	@Length(min=0, max=6, message="state长度必须介于 0 和 6 之间")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Length(min=0, max=11, message="style_id长度必须介于 0 和 11 之间")
	public String getStyleId() {
		return styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
	}
	
	@Length(min=0, max=11, message="target_user长度必须介于 0 和 11 之间")
	public String getTargetUser() {
		return targetUser;
	}

	public void setTargetUser(String targetUser) {
		this.targetUser = targetUser;
	}
	
}