/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.channel.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.channel.entity.SupChannel;
import com.thinkgem.jeesite.modules.channel.dao.SupChannelDao;

/**
 * 渠道管理Service
 * @author ZiruiSong
 * @version 2019-04-11
 */
@Service
@Transactional(readOnly = true)
public class SupChannelService extends CrudService<SupChannelDao, SupChannel> {

	public SupChannel get(String id) {
		return super.get(id);
	}
	
	public List<SupChannel> findList(SupChannel supChannel) {
		return super.findList(supChannel);
	}
	
	public Page<SupChannel> findPage(Page<SupChannel> page, SupChannel supChannel) {
		return super.findPage(page, supChannel);
	}
	
	@Transactional(readOnly = false)
	public void save(SupChannel supChannel) {
		super.save(supChannel);
	}
	
	@Transactional(readOnly = false)
	public void delete(SupChannel supChannel) {
		super.delete(supChannel);
	}
	
}