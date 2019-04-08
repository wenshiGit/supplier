/**
 * 
 */
package com.thinkgem.jeesite.common.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Excel工具类
 * @author ZiruiSong
 * @time 2019年3月31日
 */
public class ExcelUtil {

	/**
	 * 读取excel
	 * @param filePath excel所在的位置
	 * @return workbook对象
	 * @time 2019年3月31日
	 * @author ZiruiSong
	 * @throws IOException 
	 * @Description TODO
	 * @ClassName ExcelUtil.java
	 */
	public static Workbook readExcel(String filePath) throws IOException {
		Workbook wb = null;
		if (filePath == null) {
			return null;
		}
		String extString = filePath.substring(filePath.lastIndexOf("."));
		InputStream is = null;
		try {
			is = new FileInputStream(filePath);
			if (".xls".equals(extString)) {
				return wb = new HSSFWorkbook(is);
			} else if (".xlsx".equals(extString)) {
				return wb = new XSSFWorkbook(is);
			} else {
				return wb = null;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			is.close();
		}
		return wb;
	}
	
	/**
     * 解析Excel
     * @param columns
     * @param filePath
     * @return 返回所有行列的集合
     * @throws IOException
     * @time 2019年4月1日
     * @author ZiruiSong
     * @Description TODO
     * @ClassName SkuCrawlerUtil.java
     */
    public static List<Map<String,String>> parseExcel(String[] columns ,String filePath) throws IOException{
    	if(null == filePath||"".equals(filePath)){
    		return null;
    	}
    	List<Map<String,String>> list = new ArrayList<Map<String,String>>();
    	Row row = null;
    	Workbook wb= ExcelUtil.readExcel(filePath);
    	Sheet sheet = wb.getSheetAt(0);
    	//总行数
    	int rowsTotal = sheet.getPhysicalNumberOfRows();
    	//列数
    	row = sheet.getRow(0);
    	int colNum = row.getPhysicalNumberOfCells();
    	for(int i= 1;i<rowsTotal;i++){
    		Map<String,String> map = new HashMap<String, String>();
    		row = sheet.getRow(i);
    		for(int j = 0;j<colNum;j++){
    			String cellValue = row.getCell(j).toString();
    			map.put(columns[j], cellValue);
    		}
    		list.add(map);
    	}
    	return list;
    }
}
