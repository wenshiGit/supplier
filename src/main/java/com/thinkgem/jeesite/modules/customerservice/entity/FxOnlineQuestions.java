/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.customerservice.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * fx_online_questionsEntity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxOnlineQuestions extends DataEntity<FxOnlineQuestions> {
	
	private static final long serialVersionUID = 1L;
	private String orderId;		// 系统订单号
	private Date questionTime;		// 提问时间
	private String imgUrl;		// 图片url地址
	private String content;		// 消息id拼接成的字符串，关联fx_messages表
	private String status;		// status
	private String questioner;		// 提问人
	private String title;		// 问题标题
	private String replyPeople;		// 回复人
	private Date replyTime;		// 回复时间
	private Date solutionTime;		// solution_time
	private String questionerId;		// 提问人用户id
	private String replyId;		// reply_id
	
	public FxOnlineQuestions() {
		super();
	}

	public FxOnlineQuestions(String id){
		super(id);
	}

	@Length(min=0, max=255, message="系统订单号长度必须介于 0 和 255 之间")
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getQuestionTime() {
		return questionTime;
	}

	public void setQuestionTime(Date questionTime) {
		this.questionTime = questionTime;
	}
	
	@Length(min=0, max=255, message="图片url地址长度必须介于 0 和 255 之间")
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	
	@Length(min=0, max=255, message="消息id拼接成的字符串，关联fx_messages表长度必须介于 0 和 255 之间")
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Length(min=0, max=20, message="status长度必须介于 0 和 20 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Length(min=0, max=255, message="提问人长度必须介于 0 和 255 之间")
	public String getQuestioner() {
		return questioner;
	}

	public void setQuestioner(String questioner) {
		this.questioner = questioner;
	}
	
	@Length(min=0, max=255, message="问题标题长度必须介于 0 和 255 之间")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Length(min=0, max=255, message="回复人长度必须介于 0 和 255 之间")
	public String getReplyPeople() {
		return replyPeople;
	}

	public void setReplyPeople(String replyPeople) {
		this.replyPeople = replyPeople;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getSolutionTime() {
		return solutionTime;
	}

	public void setSolutionTime(Date solutionTime) {
		this.solutionTime = solutionTime;
	}
	
	@Length(min=0, max=11, message="提问人用户id长度必须介于 0 和 11 之间")
	public String getQuestionerId() {
		return questionerId;
	}

	public void setQuestionerId(String questionerId) {
		this.questionerId = questionerId;
	}
	
	@Length(min=0, max=225, message="reply_id长度必须介于 0 和 225 之间")
	public String getReplyId() {
		return replyId;
	}

	public void setReplyId(String replyId) {
		this.replyId = replyId;
	}
	
}