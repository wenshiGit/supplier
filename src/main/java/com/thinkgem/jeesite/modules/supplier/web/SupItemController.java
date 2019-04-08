/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.supplier.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.modules.supplier.entity.SupItem;
import com.thinkgem.jeesite.modules.supplier.service.SupItemService;

/**
 * 单表生成Controller
 * @author ThinkGem
 * @version 2019-04-02
 */
@Controller
@RequestMapping(value = "${adminPath}/supplier/supItem")
public class SupItemController extends BaseController {

	@Autowired
	private SupItemService supItemService;
	
	@ModelAttribute
	public SupItem get(@RequestParam(required=false) String id) {
		SupItem entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = supItemService.get(id);
		}
		if (entity == null){
			entity = new SupItem();
		}
		return entity;
	}
	
	@RequiresPermissions("supplier:supItem:view")
	@RequestMapping(value = {"list", ""})
	public String list(SupItem supItem, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<SupItem> page = supItemService.findPage(new Page<SupItem>(request, response), supItem); 
		model.addAttribute("page", page);
		return "jeesite/supplier/supItemList";
	}

	@RequiresPermissions("supplier:supItem:view")
	@RequestMapping(value = "form")
	public String form(SupItem supItem, Model model) {
		model.addAttribute("supItem", supItem);
		return "jeesite/supplier/supItemForm";
	}

	@RequiresPermissions("supplier:supItem:edit")
	@RequestMapping(value = "save")
	public String save(SupItem supItem, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, supItem)){
			return form(supItem, model);
		}
		supItemService.save(supItem);
		addMessage(redirectAttributes, "保存单表成功");
		return "redirect:"+Global.getAdminPath()+"/supplier/supItem/?repage";
	}
	
	@RequiresPermissions("supplier:supItem:edit")
	@RequestMapping(value = "delete")
	public String delete(SupItem supItem, RedirectAttributes redirectAttributes) {
		supItemService.delete(supItem);
		addMessage(redirectAttributes, "删除单表成功");
		return "redirect:"+Global.getAdminPath()+"/supplier/supItem/?repage";
	}

}