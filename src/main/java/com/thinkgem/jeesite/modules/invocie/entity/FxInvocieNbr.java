/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.invocie.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 税务登记号Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxInvocieNbr extends DataEntity<FxInvocieNbr> {
	
	private static final long serialVersionUID = 1L;
	private String invocieNbr;		// 税务登记号
	private String invocieBrank;		// 开户行
	private String picOneUrl;		// 营业执照
	private String picTwoUrl;		// pic_two_url
	
	public FxInvocieNbr() {
		super();
	}

	public FxInvocieNbr(String id){
		super(id);
	}

	@Length(min=1, max=50, message="税务登记号长度必须介于 1 和 50 之间")
	public String getInvocieNbr() {
		return invocieNbr;
	}

	public void setInvocieNbr(String invocieNbr) {
		this.invocieNbr = invocieNbr;
	}
	
	@Length(min=0, max=300, message="开户行长度必须介于 0 和 300 之间")
	public String getInvocieBrank() {
		return invocieBrank;
	}

	public void setInvocieBrank(String invocieBrank) {
		this.invocieBrank = invocieBrank;
	}
	
	@Length(min=0, max=500, message="营业执照长度必须介于 0 和 500 之间")
	public String getPicOneUrl() {
		return picOneUrl;
	}

	public void setPicOneUrl(String picOneUrl) {
		this.picOneUrl = picOneUrl;
	}
	
	@Length(min=0, max=500, message="pic_two_url长度必须介于 0 和 500 之间")
	public String getPicTwoUrl() {
		return picTwoUrl;
	}

	public void setPicTwoUrl(String picTwoUrl) {
		this.picTwoUrl = picTwoUrl;
	}
	
}