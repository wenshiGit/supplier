/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.finace.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.finace.entity.FxAlipayAccounting;

/**
 * 支付宝账务DAO接口
 * @author MaoNian
 * @version 2019-04-26
 */
@MyBatisDao
public interface FxAlipayAccountingDao extends CrudDao<FxAlipayAccounting> {
	
}