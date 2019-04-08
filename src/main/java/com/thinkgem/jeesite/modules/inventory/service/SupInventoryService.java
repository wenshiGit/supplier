/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.inventory.service;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.service.CrudService;
import com.thinkgem.jeesite.common.utils.AgioUtil;
import com.thinkgem.jeesite.common.utils.IdGen;
import com.thinkgem.jeesite.modules.inventory.entity.ImportInvenExcelVo;
import com.thinkgem.jeesite.modules.inventory.entity.SupInventory;
import com.thinkgem.jeesite.modules.sys.entity.User;
import com.thinkgem.jeesite.modules.sys.utils.UserUtils;
import com.thinkgem.jeesite.modules.inventory.dao.SupInventoryDao;

/**
 * 库存管理Service
 * @author ziruisong
 * @version 2019-04-03
 */
@Service
@Transactional(readOnly = true)
public class SupInventoryService extends CrudService<SupInventoryDao, SupInventory> {

	public SupInventory get(String id) {
		return super.get(id);
	}
	
	public List<SupInventory> findList(SupInventory supInventory) {
		return super.findList(supInventory);
	}
	
	public Page<SupInventory> findPage(Page<SupInventory> page, SupInventory supInventory) {
		return super.findPage(page, supInventory);
	}
	
	@Transactional(readOnly = false)
	public void save(SupInventory supInventory) {
		super.save(supInventory);
	}
	
	@Transactional(readOnly = false)
	public void delete(SupInventory supInventory) {
		super.delete(supInventory);
	}
	/**
	 * 更新库存
	 * @param exccelVoList
	 * @param channelId
	 * @return
	 * @time 2019年4月7日
	 * @author ZiruiSong
	 * @Description TODO
	 * @ClassName SupInventoryService.java
	 */
	@Transactional
	public int updateInven(List<ImportInvenExcelVo> exccelVoList,String channelId){
		List<SupInventory> list = new ArrayList<SupInventory>();
		//首先删除原来的旧库存
		dao.deleteByChannelId(channelId);
		for (ImportInvenExcelVo vo : exccelVoList) {
			SupInventory supInven = new SupInventory();
			
			supInven.setChannelId(channelId);
			supInven.setDistributionRate(100);
			Double tagPrice = Double.valueOf(vo.getTagPrice());
			Double agentPrice = Double.valueOf(vo.getAgentPrice());
			BigDecimal invenAgio =  AgioUtil.invenAgio(tagPrice, agentPrice);
			supInven.setInvenAgio(Double.valueOf(invenAgio+""));//代理折扣
			supInven.setInvenDate(new Timestamp(new Date().getTime()));
			supInven.setInvenDesc(vo.getStyleNo());
			supInven.setInvenModel(vo.getProductNo());
			supInven.setInvenNum(Integer.valueOf(vo.getQty()));
			supInven.setInvenPrice(Double.valueOf(vo.getAgentPrice()));
			supInven.setInvenSize(vo.getOuSize());
			
			supInven.setOriModel(vo.getProductNo());
			supInven.setOriSize(vo.getInnerSize());
			supInven.setRemark("");
			supInven.setInvenState("1");
			supInven.setId(IdGen.uuid());
			User user = UserUtils.getUser();
			if (StringUtils.isNotBlank(user.getId())){
				supInven.setUpdateBy(user);
				supInven.setCreateBy(user);
			}
			supInven.setUpdateTime(new Date());
			supInven.setCreateTime(new Date());
			supInven.setDelFlag("0");
			list.add(supInven);
			if(list.size()%100==0){
				dao.batchInsert(list);
				list.clear();
			}
		}

		//再插入最新库存
		dao.batchInsert(list);
		return -1;
	}
	
	
}