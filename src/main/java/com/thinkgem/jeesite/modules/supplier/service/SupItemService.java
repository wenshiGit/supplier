/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.supplier.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.modules.supplier.entity.SupItem;
import com.thinkgem.jeesite.modules.supplier.dao.SupItemDao;

/**
 * 单表生成Service
 * @author ThinkGem
 * @version 2019-04-02
 */
@Service
@Transactional(readOnly = true)
public class SupItemService extends CrudService<SupItemDao, SupItem> {

	public SupItem get(String id) {
		return super.get(id);
	}
	
	public List<SupItem> findList(SupItem supItem) {
		return super.findList(supItem);
	}
	
	public Page<SupItem> findPage(Page<SupItem> page, SupItem supItem) {
		return super.findPage(page, supItem);
	}
	
	@Transactional(readOnly = false)
	public void save(SupItem supItem) {
		super.save(supItem);
	}
	
	@Transactional(readOnly = false)
	public void delete(SupItem supItem) {
		super.delete(supItem);
	}
	
}