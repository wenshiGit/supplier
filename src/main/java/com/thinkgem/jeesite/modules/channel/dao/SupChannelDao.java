/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.channel.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.channel.entity.SupChannel;

/**
 * 渠道管理DAO接口
 * @author ZiruiSong
 * @version 2019-04-11
 */
@MyBatisDao
public interface SupChannelDao extends CrudDao<SupChannel> {
	
}