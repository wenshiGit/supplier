/**
 * 
 */
package com.thinkgem.jeesite.common.utils;

import java.math.BigDecimal;

/**
 * 折扣计算
 * @author ZiruiSong
 * @time 2019年4月7日
 */
public class AgioUtil {
	/**
	 *折扣计算
	 * @Author ZiruiSong
	 * @Time 2019年2月12日
	 */
	public static BigDecimal invenAgio(Double tagPrice, Double agentPrice) {
		BigDecimal factGoodsPrice = new BigDecimal(0.000);
		if (null != agentPrice && agentPrice != 0.000) {
		    factGoodsPrice = new BigDecimal(agentPrice);
		    factGoodsPrice = factGoodsPrice.setScale(3,BigDecimal.ROUND_HALF_UP);
		} else {
		    return new BigDecimal(1.000);
		}
		BigDecimal tagPriceOfBigDecimal = BigDecimal.valueOf(tagPrice).setScale(2,BigDecimal.ROUND_HALF_UP);
		BigDecimal factDiscount = factGoodsPrice.divide(tagPriceOfBigDecimal, 2, BigDecimal.ROUND_HALF_UP);
		return factDiscount;
	}
}
