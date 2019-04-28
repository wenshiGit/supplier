/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.finance.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.finance.entity.FxTbBills;

/**
 * fx_tb_billsDAO接口
 * @author MaoNian
 * @version 2019-04-28
 */
@MyBatisDao
public interface FxTbBillsDao extends CrudDao<FxTbBills> {
	
}