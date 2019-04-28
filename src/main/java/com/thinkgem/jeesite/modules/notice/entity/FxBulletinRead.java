/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.notice.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.thinkgem.jeesite.modules.sys.entity.User;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 读取公告Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxBulletinRead extends DataEntity<FxBulletinRead> {
	
	private static final long serialVersionUID = 1L;
	private String bulletinId;		// bulletin_id
	private Date createTime;		// create_time
	private User user;		// user_id
	
	public FxBulletinRead() {
		super();
	}

	public FxBulletinRead(String id){
		super(id);
	}

	@Length(min=0, max=11, message="bulletin_id长度必须介于 0 和 11 之间")
	public String getBulletinId() {
		return bulletinId;
	}

	public void setBulletinId(String bulletinId) {
		this.bulletinId = bulletinId;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}