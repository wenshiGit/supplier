/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.distribution.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;
import com.thinkgem.jeesite.modules.sys.entity.Area;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 购物车 表Entity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxShoppingCart extends DataEntity<FxShoppingCart> {
	
	private static final long serialVersionUID = 1L;
	private String orderId;		// order_id
	private String orderState;		// order_state
	private String brandId;		// brand_id
	private String brandName;		// brand_name
	private String goodsNbr;		// goods_nbr
	private String goodsSize;		// goods_size
	private String goodsCount;		// goods_count
	private String goodsPrice;		// goods_price
	private String channelId;		// channel_id
	private String channelName;		// channel_name
	private String channelUserId;		// channel_user_id
	private String channelUserName;		// channel_user_name
	private String discount;		// discount
	private String factDiscount;		// fact_discount
	private String custName;		// cust_name
	private String custAddr;		// cust_addr
	private String custTel;		// cust_tel
	private Date orderTime;		// order_time
	private Date orderStateTime;		// order_state_time
	private String orderUserId;		// order_user_id
	private String orderUserName;		// order_user_name
	private String checkUserId;		// check_user_id
	private String checkUserName;		// check_user_name
	private String carrId;		// carr_id
	private String emsComp;		// ems_comp
	private String emsId;		// ems_id
	private String emsPrice;		// ems_price
	private String remark;		// remark
	private String orderIp;		// order_ip
	private String goodsTypeId;		// goods_type_id
	private String goodsTypeName;		// goods_type_name
	private String orderPricePre;		// order_price_pre
	private String orderPrice;		// order_price
	private String orderFahuoState;		// order_fahuo_state
	private String factGoodsCount;		// fact_goods_count
	private String shopId;		// shop_id
	private String shopName;		// shop_name
	private String tid;		// tid
	private String numiid;		// numiid
	private String provinceName;		// province_name
	private String provinceId;		// province_id
	private String invenId;		// inven_id
	private String platformFreight;		// platform_freight
	private String platformAgio;		// platform_agio
	private String oriNbr;		// ori_nbr
	private String oriSize;		// ori_size
	private String customOrderId;		// custom_order_id
	private Long orderParentId;		// 父ID
	private Long cityId;		// city_id
	private String cityName;		// city_name
	private Area area;		// area_id
	private String areaName;		// area_name
	
	public FxShoppingCart() {
		super();
	}

	public FxShoppingCart(String id){
		super(id);
	}

	@Length(min=1, max=15, message="order_id长度必须介于 1 和 15 之间")
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	@Length(min=0, max=1, message="order_state长度必须介于 0 和 1 之间")
	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	
	@Length(min=0, max=5, message="brand_id长度必须介于 0 和 5 之间")
	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	
	@Length(min=0, max=20, message="brand_name长度必须介于 0 和 20 之间")
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	@Length(min=0, max=50, message="goods_nbr长度必须介于 0 和 50 之间")
	public String getGoodsNbr() {
		return goodsNbr;
	}

	public void setGoodsNbr(String goodsNbr) {
		this.goodsNbr = goodsNbr;
	}
	
	@Length(min=0, max=20, message="goods_size长度必须介于 0 和 20 之间")
	public String getGoodsSize() {
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	
	@Length(min=0, max=15, message="goods_count长度必须介于 0 和 15 之间")
	public String getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(String goodsCount) {
		this.goodsCount = goodsCount;
	}
	
	public String getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	
	@Length(min=0, max=6, message="channel_id长度必须介于 0 和 6 之间")
	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	
	@Length(min=0, max=30, message="channel_name长度必须介于 0 和 30 之间")
	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	@Length(min=0, max=9, message="channel_user_id长度必须介于 0 和 9 之间")
	public String getChannelUserId() {
		return channelUserId;
	}

	public void setChannelUserId(String channelUserId) {
		this.channelUserId = channelUserId;
	}
	
	@Length(min=0, max=30, message="channel_user_name长度必须介于 0 和 30 之间")
	public String getChannelUserName() {
		return channelUserName;
	}

	public void setChannelUserName(String channelUserName) {
		this.channelUserName = channelUserName;
	}
	
	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	public String getFactDiscount() {
		return factDiscount;
	}

	public void setFactDiscount(String factDiscount) {
		this.factDiscount = factDiscount;
	}
	
	@Length(min=0, max=100, message="cust_name长度必须介于 0 和 100 之间")
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	@Length(min=0, max=512, message="cust_addr长度必须介于 0 和 512 之间")
	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	@Length(min=0, max=512, message="cust_tel长度必须介于 0 和 512 之间")
	public String getCustTel() {
		return custTel;
	}

	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="order_time不能为空")
	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message="order_state_time不能为空")
	public Date getOrderStateTime() {
		return orderStateTime;
	}

	public void setOrderStateTime(Date orderStateTime) {
		this.orderStateTime = orderStateTime;
	}
	
	@Length(min=0, max=9, message="order_user_id长度必须介于 0 和 9 之间")
	public String getOrderUserId() {
		return orderUserId;
	}

	public void setOrderUserId(String orderUserId) {
		this.orderUserId = orderUserId;
	}
	
	@Length(min=0, max=50, message="order_user_name长度必须介于 0 和 50 之间")
	public String getOrderUserName() {
		return orderUserName;
	}

	public void setOrderUserName(String orderUserName) {
		this.orderUserName = orderUserName;
	}
	
	@Length(min=0, max=9, message="check_user_id长度必须介于 0 和 9 之间")
	public String getCheckUserId() {
		return checkUserId;
	}

	public void setCheckUserId(String checkUserId) {
		this.checkUserId = checkUserId;
	}
	
	@Length(min=0, max=50, message="check_user_name长度必须介于 0 和 50 之间")
	public String getCheckUserName() {
		return checkUserName;
	}

	public void setCheckUserName(String checkUserName) {
		this.checkUserName = checkUserName;
	}
	
	@Length(min=0, max=5, message="carr_id长度必须介于 0 和 5 之间")
	public String getCarrId() {
		return carrId;
	}

	public void setCarrId(String carrId) {
		this.carrId = carrId;
	}
	
	@Length(min=0, max=50, message="ems_comp长度必须介于 0 和 50 之间")
	public String getEmsComp() {
		return emsComp;
	}

	public void setEmsComp(String emsComp) {
		this.emsComp = emsComp;
	}
	
	@Length(min=0, max=200, message="ems_id长度必须介于 0 和 200 之间")
	public String getEmsId() {
		return emsId;
	}

	public void setEmsId(String emsId) {
		this.emsId = emsId;
	}
	
	public String getEmsPrice() {
		return emsPrice;
	}

	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}
	
	@Length(min=0, max=512, message="remark长度必须介于 0 和 512 之间")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Length(min=0, max=20, message="order_ip长度必须介于 0 和 20 之间")
	public String getOrderIp() {
		return orderIp;
	}

	public void setOrderIp(String orderIp) {
		this.orderIp = orderIp;
	}
	
	@Length(min=0, max=5, message="goods_type_id长度必须介于 0 和 5 之间")
	public String getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}
	
	@Length(min=0, max=50, message="goods_type_name长度必须介于 0 和 50 之间")
	public String getGoodsTypeName() {
		return goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}
	
	public String getOrderPricePre() {
		return orderPricePre;
	}

	public void setOrderPricePre(String orderPricePre) {
		this.orderPricePre = orderPricePre;
	}
	
	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	@Length(min=0, max=1, message="order_fahuo_state长度必须介于 0 和 1 之间")
	public String getOrderFahuoState() {
		return orderFahuoState;
	}

	public void setOrderFahuoState(String orderFahuoState) {
		this.orderFahuoState = orderFahuoState;
	}
	
	@Length(min=0, max=15, message="fact_goods_count长度必须介于 0 和 15 之间")
	public String getFactGoodsCount() {
		return factGoodsCount;
	}

	public void setFactGoodsCount(String factGoodsCount) {
		this.factGoodsCount = factGoodsCount;
	}
	
	@Length(min=0, max=9, message="shop_id长度必须介于 0 和 9 之间")
	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	
	@Length(min=0, max=100, message="shop_name长度必须介于 0 和 100 之间")
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	@Length(min=0, max=100, message="tid长度必须介于 0 和 100 之间")
	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}
	
	@Length(min=0, max=100, message="numiid长度必须介于 0 和 100 之间")
	public String getNumiid() {
		return numiid;
	}

	public void setNumiid(String numiid) {
		this.numiid = numiid;
	}
	
	@Length(min=0, max=100, message="province_name长度必须介于 0 和 100 之间")
	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	
	@Length(min=0, max=8, message="province_id长度必须介于 0 和 8 之间")
	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	
	@Length(min=0, max=8, message="inven_id长度必须介于 0 和 8 之间")
	public String getInvenId() {
		return invenId;
	}

	public void setInvenId(String invenId) {
		this.invenId = invenId;
	}
	
	public String getPlatformFreight() {
		return platformFreight;
	}

	public void setPlatformFreight(String platformFreight) {
		this.platformFreight = platformFreight;
	}
	
	public String getPlatformAgio() {
		return platformAgio;
	}

	public void setPlatformAgio(String platformAgio) {
		this.platformAgio = platformAgio;
	}
	
	@Length(min=0, max=50, message="ori_nbr长度必须介于 0 和 50 之间")
	public String getOriNbr() {
		return oriNbr;
	}

	public void setOriNbr(String oriNbr) {
		this.oriNbr = oriNbr;
	}
	
	@Length(min=0, max=50, message="ori_size长度必须介于 0 和 50 之间")
	public String getOriSize() {
		return oriSize;
	}

	public void setOriSize(String oriSize) {
		this.oriSize = oriSize;
	}
	
	@Length(min=0, max=255, message="custom_order_id长度必须介于 0 和 255 之间")
	public String getCustomOrderId() {
		return customOrderId;
	}

	public void setCustomOrderId(String customOrderId) {
		this.customOrderId = customOrderId;
	}
	
	public Long getOrderParentId() {
		return orderParentId;
	}

	public void setOrderParentId(Long orderParentId) {
		this.orderParentId = orderParentId;
	}
	
	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	
	@Length(min=0, max=50, message="city_name长度必须介于 0 和 50 之间")
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	@Length(min=0, max=50, message="area_name长度必须介于 0 和 50 之间")
	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
}