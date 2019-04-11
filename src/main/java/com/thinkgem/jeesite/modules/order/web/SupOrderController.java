/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.order.web;

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
import com.thinkgem.jeesite.modules.order.entity.SupOrder;
import com.thinkgem.jeesite.modules.order.service.SupOrderService;

/**
 * 订单管理Controller
 * @author ZiruiSong
 * @version 2019-04-11
 */
@Controller
@RequestMapping(value = "${adminPath}/order/supOrder")
public class SupOrderController extends BaseController {

	@Autowired
	private SupOrderService supOrderService;
	
	@ModelAttribute
	public SupOrder get(@RequestParam(required=false) String id) {
		SupOrder entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = supOrderService.get(id);
		}
		if (entity == null){
			entity = new SupOrder();
		}
		return entity;
	}
	
	@RequiresPermissions("order:supOrder:view")
	@RequestMapping(value = {"list", ""})
	public String list(SupOrder supOrder, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<SupOrder> page = supOrderService.findPage(new Page<SupOrder>(request, response), supOrder); 
		model.addAttribute("page", page);
		return "modules/order/supOrderList";
	}

	@RequiresPermissions("order:supOrder:view")
	@RequestMapping(value = "form")
	public String form(SupOrder supOrder, Model model) {
		model.addAttribute("supOrder", supOrder);
		return "modules/order/supOrderForm";
	}

	@RequiresPermissions("order:supOrder:edit")
	@RequestMapping(value = "save")
	public String save(SupOrder supOrder, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, supOrder)){
			return form(supOrder, model);
		}
		supOrderService.save(supOrder);
		addMessage(redirectAttributes, "保存订单管理成功");
		return "redirect:"+Global.getAdminPath()+"/order/supOrder/?repage";
	}
	
	@RequiresPermissions("order:supOrder:edit")
	@RequestMapping(value = "delete")
	public String delete(SupOrder supOrder, RedirectAttributes redirectAttributes) {
		supOrderService.delete(supOrder);
		addMessage(redirectAttributes, "删除订单管理成功");
		return "redirect:"+Global.getAdminPath()+"/order/supOrder/?repage";
	}

}