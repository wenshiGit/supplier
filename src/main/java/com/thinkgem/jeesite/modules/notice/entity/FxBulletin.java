/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.notice.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.thinkgem.jeesite.modules.sys.entity.User;
import javax.validation.constraints.NotNull;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 公告Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxBulletin extends DataEntity<FxBulletin> {
	
	private static final long serialVersionUID = 1L;
	private String infoNbr;		// info_nbr
	private String bulletinContent;		// bulletin_content
	private String bulletinTitle;		// bulletin_title
	private String channelId;		// channel_id
	private Date createTime;		// create_time
	private String fileName;		// file_name
	private String isTop;		// is_top
	private String reName;		// re_name
	private String readState;		// 是否已读，0代表未读，1代表已读
	private String state;		// state
	private String type;		// type
	private User user;		// user_id
	
	public FxBulletin() {
		super();
	}

	public FxBulletin(String id){
		super(id);
	}

	@Length(min=1, max=11, message="info_nbr长度必须介于 1 和 11 之间")
	public String getInfoNbr() {
		return infoNbr;
	}

	public void setInfoNbr(String infoNbr) {
		this.infoNbr = infoNbr;
	}
	
	public String getBulletinContent() {
		return bulletinContent;
	}

	public void setBulletinContent(String bulletinContent) {
		this.bulletinContent = bulletinContent;
	}
	
	@Length(min=0, max=200, message="bulletin_title长度必须介于 0 和 200 之间")
	public String getBulletinTitle() {
		return bulletinTitle;
	}

	public void setBulletinTitle(String bulletinTitle) {
		this.bulletinTitle = bulletinTitle;
	}
	
	@Length(min=0, max=11, message="channel_id长度必须介于 0 和 11 之间")
	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Length(min=0, max=100, message="file_name长度必须介于 0 和 100 之间")
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	@Length(min=1, max=11, message="is_top长度必须介于 1 和 11 之间")
	public String getIsTop() {
		return isTop;
	}

	public void setIsTop(String isTop) {
		this.isTop = isTop;
	}
	
	@Length(min=0, max=100, message="re_name长度必须介于 0 和 100 之间")
	public String getReName() {
		return reName;
	}

	public void setReName(String reName) {
		this.reName = reName;
	}
	
	@Length(min=0, max=6, message="是否已读，0代表未读，1代表已读长度必须介于 0 和 6 之间")
	public String getReadState() {
		return readState;
	}

	public void setReadState(String readState) {
		this.readState = readState;
	}
	
	@Length(min=0, max=6, message="state长度必须介于 0 和 6 之间")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Length(min=0, max=6, message="type长度必须介于 0 和 6 之间")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@NotNull(message="user_id不能为空")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}