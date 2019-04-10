/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.order.entity.SupOrder;
import com.thinkgem.jeesite.modules.order.dao.SupOrderDao;
import com.thinkgem.jeesite.modules.order.entity.SupSubOrder;
import com.thinkgem.jeesite.modules.order.dao.SupSubOrderDao;

/**
 * 订单管理Service
 * @author ZiruiSong
 * @version 2019-04-10
 */
@Service
@Transactional(readOnly = true)
public class SupOrderService extends CrudService<SupOrderDao, SupOrder> {

	@Autowired
	private SupSubOrderDao supSubOrderDao;
	
	public SupOrder get(String id) {
		SupOrder supOrder = super.get(id);
		supOrder.setSupSubOrderList(supSubOrderDao.findList(new SupSubOrder(supOrder)));
		return supOrder;
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
		for (SupSubOrder supSubOrder : supOrder.getSupSubOrderList()){
			if (supSubOrder.getId() == null){
				continue;
			}
			if (SupSubOrder.DEL_FLAG_NORMAL.equals(supSubOrder.getDelFlag())){
				if (StringUtils.isBlank(supSubOrder.getId())){
					supSubOrder.setPId(supOrder);
					supSubOrder.preInsert();
					supSubOrderDao.insert(supSubOrder);
				}else{
					supSubOrder.preUpdate();
					supSubOrderDao.update(supSubOrder);
				}
			}else{
				supSubOrderDao.delete(supSubOrder);
			}
		}
	}
	
	@Transactional(readOnly = false)
	public void delete(SupOrder supOrder) {
		super.delete(supOrder);
		supSubOrderDao.delete(new SupSubOrder(supOrder));
	}
	
}