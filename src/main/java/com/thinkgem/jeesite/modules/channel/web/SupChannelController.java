/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.channel.web;

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
import com.thinkgem.jeesite.modules.channel.entity.SupChannel;
import com.thinkgem.jeesite.modules.channel.service.SupChannelService;

/**
 * 渠道管理Controller
 * @author ZiruiSong
 * @version 2019-04-11
 */
@Controller
@RequestMapping(value = "${adminPath}/channel/supChannel")
public class SupChannelController extends BaseController {

	@Autowired
	private SupChannelService supChannelService;
	
	@ModelAttribute
	public SupChannel get(@RequestParam(required=false) String id) {
		SupChannel entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = supChannelService.get(id);
		}
		if (entity == null){
			entity = new SupChannel();
		}
		return entity;
	}
	
	@RequiresPermissions("channel:supChannel:view")
	@RequestMapping(value = {"list", ""})
	public String list(SupChannel supChannel, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<SupChannel> page = supChannelService.findPage(new Page<SupChannel>(request, response), supChannel); 
		model.addAttribute("page", page);
		return "modules/channel/supChannelList";
	}

	@RequiresPermissions("channel:supChannel:view")
	@RequestMapping(value = "form")
	public String form(SupChannel supChannel, Model model) {
		model.addAttribute("supChannel", supChannel);
		return "modules/channel/supChannelForm";
	}

	@RequiresPermissions("channel:supChannel:edit")
	@RequestMapping(value = "save")
	public String save(SupChannel supChannel, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, supChannel)){
			return form(supChannel, model);
		}
		supChannelService.save(supChannel);
		addMessage(redirectAttributes, "保存渠道管理成功");
		return "redirect:"+Global.getAdminPath()+"/channel/supChannel/?repage";
	}
	
	@RequiresPermissions("channel:supChannel:edit")
	@RequestMapping(value = "delete")
	public String delete(SupChannel supChannel, RedirectAttributes redirectAttributes) {
		supChannelService.delete(supChannel);
		addMessage(redirectAttributes, "删除渠道管理成功");
		return "redirect:"+Global.getAdminPath()+"/channel/supChannel/?repage";
	}

}