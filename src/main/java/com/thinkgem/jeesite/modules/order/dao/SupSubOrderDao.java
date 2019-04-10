/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.order.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.order.entity.SupSubOrder;

/**
 * 订单管理DAO接口
 * @author ZiruiSong
 * @version 2019-04-10
 */
@MyBatisDao
public interface SupSubOrderDao extends CrudDao<SupSubOrder> {
	
}