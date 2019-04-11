/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.order.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.order.entity.SupOrder;
import com.thinkgem.jeesite.modules.order.dao.SupOrderDao;

/**
 * 订单管理Service
 * @author ZiruiSong
 * @version 2019-04-11
 */
@Service
@Transactional(readOnly = true)
public class SupOrderService extends CrudService<SupOrderDao, SupOrder> {

	public SupOrder get(String id) {
		return super.get(id);
	}
	
	public List<SupOrder> findList(SupOrder supOrder) {
		return super.findList(supOrder);
	}
	
	public Page<SupOrder> findPage(Page<SupOrder> page, SupOrder supOrder) {
		return super.findPage(page, supOrder);
	}
	
	@Transactional(readOnly = false)
	public void save(SupOrder supOrder) {
		super.save(supOrder);
	}
	
	@Transactional(readOnly = false)
	public void delete(SupOrder supOrder) {
		super.delete(supOrder);
	}
	
}