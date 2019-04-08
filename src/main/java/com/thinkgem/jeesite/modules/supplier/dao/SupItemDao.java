/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.supplier.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.supplier.entity.SupItem;

/**
 * 单表生成DAO接口
 * @author ThinkGem
 * @version 2019-04-02
 */
@MyBatisDao
public interface SupItemDao extends CrudDao<SupItem> {
	
}