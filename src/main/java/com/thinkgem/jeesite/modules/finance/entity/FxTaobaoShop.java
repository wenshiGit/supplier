/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.finance.entity;

import javax.validation.constraints.NotNull;
import com.thinkgem.jeesite.modules.sys.entity.User;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 淘宝店铺信息同步表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxTaobaoShop extends DataEntity<FxTaobaoShop> {
	
	private static final long serialVersionUID = 1L;
	private Long shopId;		// 店铺id
	private User user;		// 用户id
	private String shopName;		// 店铺名称
	private String appKey;		// app_key
	private String appSecret;		// app_secret
	private String sessionKey;		// session_key
	private Date loginTime;		// 登录时间
	private Date createTime;		// 创建时间
	private String taobaoNickname;		// 淘宝用户名
	private Date expireTime;		// 登录超时时间
	private String state;		// 状态 0：删除 1：正常
	private Date lastDownloadTime;		// 上次下载时间
	private String shopType;		// 1:淘宝  2:京东
	private String refundAddrId;		// 退货地址ID
	private Long upUserId;		// 上级主管id
	
	public FxTaobaoShop() {
		super();
	}

	public FxTaobaoShop(String id){
		super(id);
	}

	@NotNull(message="店铺id不能为空")
	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	@Length(min=0, max=200, message="店铺名称长度必须介于 0 和 200 之间")
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	@Length(min=0, max=100, message="app_key长度必须介于 0 和 100 之间")
	public String getAppKey() {
		return appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	
	@Length(min=0, max=200, message="app_secret长度必须介于 0 和 200 之间")
	public String getAppSecret() {
		return appSecret;
	}

	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	
	@Length(min=0, max=200, message="session_key长度必须介于 0 和 200 之间")
	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Length(min=0, max=100, message="淘宝用户名长度必须介于 0 和 100 之间")
	public String getTaobaoNickname() {
		return taobaoNickname;
	}

	public void setTaobaoNickname(String taobaoNickname) {
		this.taobaoNickname = taobaoNickname;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
	
	@Length(min=0, max=6, message="状态 0：删除 1：正常长度必须介于 0 和 6 之间")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getLastDownloadTime() {
		return lastDownloadTime;
	}

	public void setLastDownloadTime(Date lastDownloadTime) {
		this.lastDownloadTime = lastDownloadTime;
	}
	
	@Length(min=0, max=6, message="1:淘宝  2:京东长度必须介于 0 和 6 之间")
	public String getShopType() {
		return shopType;
	}

	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	
	@Length(min=0, max=11, message="退货地址ID长度必须介于 0 和 11 之间")
	public String getRefundAddrId() {
		return refundAddrId;
	}

	public void setRefundAddrId(String refundAddrId) {
		this.refundAddrId = refundAddrId;
	}
	
	public Long getUpUserId() {
		return upUserId;
	}

	public void setUpUserId(Long upUserId) {
		this.upUserId = upUserId;
	}
	
}