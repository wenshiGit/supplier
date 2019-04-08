/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.inventory.web;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.alibaba.fastjson.JSONObject;
import com.thinkgem.jeesite.common.config.Global;
import com.thinkgem.jeesite.common.persistence.Page;
import com.thinkgem.jeesite.common.web.BaseController;
import com.thinkgem.jeesite.common.utils.StringUtils;
import com.thinkgem.jeesite.common.utils.excel.ImportExcel;
import com.thinkgem.jeesite.modules.inventory.entity.ImportInvenExcelVo;
import com.thinkgem.jeesite.modules.inventory.entity.SupInventory;
import com.thinkgem.jeesite.modules.inventory.service.SupInventoryService;

/**
 * 库存管理Controller
 * @author ziruisong
 * @version 2019-04-03
 */
@Controller
@RequestMapping(value = "${adminPath}/inventory/supInventory")
public class SupInventoryController extends BaseController {

	@Autowired
	private SupInventoryService supInventoryService;
	
	@ModelAttribute
	public SupInventory get(@RequestParam(required=false) String id) {
		SupInventory entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = supInventoryService.get(id);
		}
		if (entity == null){
			entity = new SupInventory();
		}
		return entity;
	}
	
	@RequiresPermissions("inventory:supInventory:view")
	@RequestMapping(value = {"list", ""})
	public String list(SupInventory supInventory, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<SupInventory> page = supInventoryService.findPage(new Page<SupInventory>(request, response), supInventory);
		
		model.addAttribute("page", page);
		return "modules/inventory/supInventoryList";
	}

	@RequiresPermissions("inventory:supInventory:view")
	@RequestMapping(value = "form")
	public String form(SupInventory supInventory, Model model) {
		model.addAttribute("supInventory", supInventory);
		return "modules/inventory/supInventoryForm";
	}

	@RequiresPermissions("inventory:supInventory:edit")
	@RequestMapping(value = "save")
	public String save(SupInventory supInventory, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, supInventory)){
			return form(supInventory, model);
		}
		supInventoryService.save(supInventory);
		addMessage(redirectAttributes, "保存库存管理成功");
		return "redirect:"+Global.getAdminPath()+"/inventory/supInventory/?repage";
	}
	
	@RequiresPermissions("inventory:supInventory:edit")
	@RequestMapping(value = "delete")
	public String delete(SupInventory supInventory, RedirectAttributes redirectAttributes) {
		supInventoryService.delete(supInventory);
		addMessage(redirectAttributes, "删除库存成功");
		return "redirect:"+Global.getAdminPath()+"/inventory/supInventory/?repage";
	}
	
	/**
	 * 上传库存文件
	 * @return
	 * @time 2019年4月3日
	 * @author ZiruiSong
	 * @Description TODO
	 * @ClassName SupInventoryController.java
	 */
	@ResponseBody
	@RequestMapping(value="uploadInven")
	public JSONObject uploadInven(@RequestParam("inputfile")MultipartFile inputfile ,@RequestParam("channelName")String channelName
			,HttpServletRequest request, ModelMap model){
		JSONObject jObject = new JSONObject();
		
		if(!inputfile.isEmpty()){
			//文件保存在upload
			String filePath = request.getSession().getServletContext().getRealPath("upload");
			logger.info("filePath:"+filePath);
			//文件名
			String fileName = channelName+inputfile.getOriginalFilename();
			File targetFile = new File(filePath,fileName);
			if(!targetFile.exists()){
				targetFile.mkdirs();
			}
			try {
				inputfile.transferTo(targetFile);
				//解析excel
				jObject.put("code", "0");//0 表示文件上传成功
				jObject.put("msg", "ok");
				jObject.put("filePath", targetFile.getAbsoluteFile());
			} catch (IllegalStateException e) {
				e.printStackTrace();
				logger.error("上传失败！"+targetFile.getAbsolutePath());
				jObject.put("msg", "IllegalStateException");
				jObject.put("code", "1");//1表示失败，0表示成功
			} catch (IOException e) {
				e.printStackTrace();
				logger.error("上传失败！"+targetFile.getAbsolutePath());
				jObject.put("msg", "上传失败，IOException");
				jObject.put("code", "1");
			}
		}else{
			jObject.put("msg", "上传的文件为null");
			jObject.put("code", "1");
		}
		return jObject;
	}
	
	/**
	 * 解析excel文件
	 * @return
	 * @time 2019年4月4日
	 * @author ZiruiSong
	 * @Description TODO
	 * @ClassName SupInventoryController.java
	 */
	@ResponseBody
	@RequestMapping(value="parseExcel")
	public JSONObject parseExcel(@RequestParam("filePath")String filePath,HttpServletRequest request){
		List<ImportInvenExcelVo> exccelVoList = new ArrayList<ImportInvenExcelVo>();
		List<Object[]> list = new ArrayList<Object[]>();
		if(null==filePath ||"".equals(filePath)){
			logger.error("文件地址为空！无法解析文件。");
		}
		ImportExcel ie;
		JSONObject jObj = new JSONObject();
		try {
			ie = new ImportExcel(filePath,1);
			for(int i=1;i<ie.getLastDataRowNum();i++){
				ImportInvenExcelVo vo = new ImportInvenExcelVo();
				Row row = ie.getRow(i);
				Object[] obj = new Object[row.getLastCellNum()];
				System.out.println("第"+i+"行:");
				for(int j=0;j<row.getLastCellNum();j++){
					Object val = ie.getCellValue(row, j);
					String strVal = val.toString();
					if(j==0){
						
						vo.setAgentPrice(strVal);
					}
					if(j==1){
						vo.setHuodongPrice(strVal);
					}
					if(j==2){
						vo.setQty(strVal);
					}
					if(j==3){
						vo.setSku(strVal);
					}
					if(j==4){
						vo.setInnerSize(strVal);
					}
					if(j==5){
						vo.setBrandSize(strVal);
					}
					if(j==6){
						vo.setOuSize(strVal);
					}
					if(j==7){
						vo.setBrandName(strVal);
					}
					if(j==8){
						vo.setGender(strVal);
					}
					if(j==9){
						vo.setSeason(strVal);
					}
					if(j==10){
						vo.setCatagroy(strVal);
					}
					if(j==11){
						vo.setTagPrice(strVal);
					}
					if(j==12){
						vo.setWeight(strVal);
					}
					if(j==13){
						vo.setProductNo(strVal);
					}
					if(j==14){
						vo.setStyleNo(strVal);
					}
					if(j==15){
						vo.setColor(strVal);
					}
					obj[j]=val;
					System.out.print(val.toString()+",");
				}
				exccelVoList.add(vo);
				System.out.println();
				list.add(obj);
			}
			jObj.put("code", "0");
			jObj.put("msg", "解析成功！");
			supInventoryService.updateInven(exccelVoList, "106802");
		} catch (InvalidFormatException e) {
			jObj.put("code", "1");
			jObj.put("msg", "解析失败！");
			e.printStackTrace();
		} catch (IOException e) {
			jObj.put("code", "1");
			jObj.put("msg", "解析失败！");
			e.printStackTrace();
		}
		return jObj;
	}
}