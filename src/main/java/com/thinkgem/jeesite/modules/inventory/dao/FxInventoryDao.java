/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.inventory.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.inventory.entity.FxInventory;

/**
 * 库存DAO接口
 * @author ZiruiSong
 * @version 2019-04-15
 */
@MyBatisDao
public interface FxInventoryDao extends CrudDao<FxInventory> {
	
	public int importDataToTable(String channelId,String impType) ;
	
	public int importDataByAdd(String channelId) ;
	
	public void deleteDataToTemp(String channelId) ;
	
	public void deleteDataToFxInventory(String channelId) ;
}