/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 配置表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxCfgShopCode extends DataEntity<FxCfgShopCode> {
	
	private static final long serialVersionUID = 1L;
	private String recordId;		// record_id
	private String code;		// code
	private String codeMemo;		// code_memo
	private String codeName;		// code_name
	private String codeVal;		// code_val
	private String state;		// state
	
	public FxCfgShopCode() {
		super();
	}

	public FxCfgShopCode(String id){
		super(id);
	}

	@Length(min=1, max=11, message="record_id长度必须介于 1 和 11 之间")
	public String getRecordId() {
		return recordId;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	
	@Length(min=1, max=100, message="code长度必须介于 1 和 100 之间")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@Length(min=0, max=100, message="code_memo长度必须介于 0 和 100 之间")
	public String getCodeMemo() {
		return codeMemo;
	}

	public void setCodeMemo(String codeMemo) {
		this.codeMemo = codeMemo;
	}
	
	@Length(min=1, max=100, message="code_name长度必须介于 1 和 100 之间")
	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}
	
	@Length(min=1, max=100, message="code_val长度必须介于 1 和 100 之间")
	public String getCodeVal() {
		return codeVal;
	}

	public void setCodeVal(String codeVal) {
		this.codeVal = codeVal;
	}
	
	@Length(min=0, max=6, message="state长度必须介于 0 和 6 之间")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}