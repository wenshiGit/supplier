/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 客服安排表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxCustomerServiceArrangement extends DataEntity<FxCustomerServiceArrangement> {
	
	private static final long serialVersionUID = 1L;
	private String name;		// 客服的姓名
	private String accountId;		// 客服关联的账号
	private String weekNumber;		// 周次编号，格式&lsquo;1801&rsquo;，前两位是年份，后两位是该年份的周次
	private String monday;		// 周一
	private String tuesday;		// 周二
	private String wednesday;		// wednesday
	private String thursday;		// 周四
	private String friday;		// 周五
	private String saturday;		// saturday
	private String sunday;		// 周日
	
	public FxCustomerServiceArrangement() {
		super();
	}

	public FxCustomerServiceArrangement(String id){
		super(id);
	}

	@Length(min=0, max=255, message="客服的姓名长度必须介于 0 和 255 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=11, message="客服关联的账号长度必须介于 0 和 11 之间")
	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	
	@Length(min=0, max=11, message="周次编号，格式&lsquo;1801&rsquo;，前两位是年份，后两位是该年份的周次长度必须介于 0 和 11 之间")
	public String getWeekNumber() {
		return weekNumber;
	}

	public void setWeekNumber(String weekNumber) {
		this.weekNumber = weekNumber;
	}
	
	@Length(min=0, max=10, message="周一长度必须介于 0 和 10 之间")
	public String getMonday() {
		return monday;
	}

	public void setMonday(String monday) {
		this.monday = monday;
	}
	
	@Length(min=0, max=10, message="周二长度必须介于 0 和 10 之间")
	public String getTuesday() {
		return tuesday;
	}

	public void setTuesday(String tuesday) {
		this.tuesday = tuesday;
	}
	
	@Length(min=0, max=10, message="wednesday长度必须介于 0 和 10 之间")
	public String getWednesday() {
		return wednesday;
	}

	public void setWednesday(String wednesday) {
		this.wednesday = wednesday;
	}
	
	@Length(min=0, max=10, message="周四长度必须介于 0 和 10 之间")
	public String getThursday() {
		return thursday;
	}

	public void setThursday(String thursday) {
		this.thursday = thursday;
	}
	
	@Length(min=0, max=10, message="周五长度必须介于 0 和 10 之间")
	public String getFriday() {
		return friday;
	}

	public void setFriday(String friday) {
		this.friday = friday;
	}
	
	@Length(min=0, max=10, message="saturday长度必须介于 0 和 10 之间")
	public String getSaturday() {
		return saturday;
	}

	public void setSaturday(String saturday) {
		this.saturday = saturday;
	}
	
	@Length(min=0, max=10, message="周日长度必须介于 0 和 10 之间")
	public String getSunday() {
		return sunday;
	}

	public void setSunday(String sunday) {
		this.sunday = sunday;
	}
	
}