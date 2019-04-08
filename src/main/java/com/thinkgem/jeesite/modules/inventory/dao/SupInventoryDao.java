/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.inventory.dao;

import java.util.List;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.inventory.entity.SupInventory;

/**
 * 库存管理DAO接口
 * @author ziruisong
 * @version 2019-04-03
 */
@MyBatisDao
public interface SupInventoryDao extends CrudDao<SupInventory> {
	public int deleteByChannelId(String channelId);
	//批量插入
	public int batchInsert(List<SupInventory> list);
}