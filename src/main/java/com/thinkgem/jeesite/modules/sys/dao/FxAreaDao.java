/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.sys.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.sys.entity.FxArea;

/**
 * 区域DAO接口
 * @author MaoNian
 * @version 2019-04-28
 */
@MyBatisDao
public interface FxAreaDao extends CrudDao<FxArea> {
	
}