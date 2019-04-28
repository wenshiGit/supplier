/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.distribution.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import com.thinkgem.jeesite.modules.sys.entity.Area;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * fx_orders_historyEntity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxOrdersHistory extends DataEntity<FxOrdersHistory> {
	
	private static final long serialVersionUID = 1L;
	private Long orderId;		// order_id
	private String apiOrderId;		// api_order_id
	private Area area;		// area_id
	private String areaName;		// area_name
	private String bailiSynchorState;		// baili_synchor_state
	private Long brandId;		// brand_id
	private String brandName;		// brand_name
	private Long carrId;		// carr_id
	private Date channelConfirmTime;		// channel_confirm_time
	private String channelEmsPrice;		// channel_ems_price
	private Long channelId;		// channel_id
	private String channelName;		// channel_name
	private Date channelSendTime;		// channel_send_time
	private String channelsBefore;		// channels_before
	private Long channelsNumBefore;		// channels_num_before
	private Long checkUserId;		// check_user_id
	private String checkUserName;		// check_user_name
	private Long cityId;		// city_id
	private String cityName;		// city_name
	private String custAddr;		// cust_addr
	private String custName;		// cust_name
	private String custTel;		// cust_tel
	private String customOrderId;		// custom_order_id
	private String discount;		// discount
	private String emsComp;		// ems_comp
	private String emsCompOri;		// ems_comp_ori
	private String emsNbr;		// ems_nbr
	private String emsPrice;		// ems_price
	private String errMsg;		// err_msg
	private Long factCarrId;		// fact_carr_id
	private String factDiscount;		// fact_discount
	private String factEmsComp;		// fact_ems_comp
	private String factEmsPrice;		// fact_ems_price
	private Long factGoodsCount;		// fact_goods_count
	private Long genderId;		// gender_id
	private String genderName;		// gender_name
	private Long goodsCount;		// goods_count
	private String goodsNbr;		// goods_nbr
	private String goodsPrice;		// goods_price
	private String goodsSize;		// goods_size
	private Long goodsTypeId;		// goods_type_id
	private String goodsTypeName;		// goods_type_name
	private String isInvoice;		// is_invoice
	private String isService;		// is_service
	private String numiid;		// numiid
	private String orderFahuoState;		// order_fahuo_state
	private String orderIp;		// order_ip
	private Long orderParentId;		// order_parent_id
	private String orderPrice;		// order_price
	private String orderPricePre;		// order_price_pre
	private String orderState;		// order_state
	private Date orderStateTime;		// order_state_time
	private String orderSubNos;		// order_sub_nos
	private Date orderTime;		// order_time
	private Long orderUserId;		// order_user_id
	private String orderUserName;		// order_user_name
	private String oriNbr;		// ori_nbr
	private String oriSize;		// ori_size
	private Long platformAgio;		// platform_agio
	private String platformDeduct;		// platform_deduct
	private Long platformFreight;		// platform_freight
	private Long platformFreightPre;		// platform_freight_pre
	private Long provinceId;		// province_id
	private String provinceName;		// province_name
	private String remark;		// remark
	private Long seasonId;		// season_id
	private String seasonName;		// season_name
	private Long shopId;		// shop_id
	private String shopName;		// shop_name
	private String status;		// status
	private String tid;		// tid
	private String packagePrice;		// 包装费
	
	public FxOrdersHistory() {
		super();
	}

	public FxOrdersHistory(String id){
		super(id);
	}

	@NotNull(message="order_id不能为空")
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	@Length(min=0, max=255, message="api_order_id长度必须介于 0 和 255 之间")
	public String getApiOrderId() {
		return apiOrderId;
	}

	public void setApiOrderId(String apiOrderId) {
		this.apiOrderId = apiOrderId;
	}
	
	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}
	
	@Length(min=0, max=200, message="area_name长度必须介于 0 和 200 之间")
	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	@Length(min=0, max=1, message="baili_synchor_state长度必须介于 0 和 1 之间")
	public String getBailiSynchorState() {
		return bailiSynchorState;
	}

	public void setBailiSynchorState(String bailiSynchorState) {
		this.bailiSynchorState = bailiSynchorState;
	}
	
	public Long getBrandId() {
		return brandId;
	}

	public void setBrandId(Long brandId) {
		this.brandId = brandId;
	}
	
	@Length(min=0, max=20, message="brand_name长度必须介于 0 和 20 之间")
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public Long getCarrId() {
		return carrId;
	}

	public void setCarrId(Long carrId) {
		this.carrId = carrId;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getChannelConfirmTime() {
		return channelConfirmTime;
	}

	public void setChannelConfirmTime(Date channelConfirmTime) {
		this.channelConfirmTime = channelConfirmTime;
	}
	
	public String getChannelEmsPrice() {
		return channelEmsPrice;
	}

	public void setChannelEmsPrice(String channelEmsPrice) {
		this.channelEmsPrice = channelEmsPrice;
	}
	
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
	@Length(min=0, max=30, message="channel_name长度必须介于 0 和 30 之间")
	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getChannelSendTime() {
		return channelSendTime;
	}

	public void setChannelSendTime(Date channelSendTime) {
		this.channelSendTime = channelSendTime;
	}
	
	@Length(min=0, max=100, message="channels_before长度必须介于 0 和 100 之间")
	public String getChannelsBefore() {
		return channelsBefore;
	}

	public void setChannelsBefore(String channelsBefore) {
		this.channelsBefore = channelsBefore;
	}
	
	public Long getChannelsNumBefore() {
		return channelsNumBefore;
	}

	public void setChannelsNumBefore(Long channelsNumBefore) {
		this.channelsNumBefore = channelsNumBefore;
	}
	
	public Long getCheckUserId() {
		return checkUserId;
	}

	public void setCheckUserId(Long checkUserId) {
		this.checkUserId = checkUserId;
	}
	
	@Length(min=0, max=50, message="check_user_name长度必须介于 0 和 50 之间")
	public String getCheckUserName() {
		return checkUserName;
	}

	public void setCheckUserName(String checkUserName) {
		this.checkUserName = checkUserName;
	}
	
	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	
	@Length(min=0, max=100, message="city_name长度必须介于 0 和 100 之间")
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	@Length(min=0, max=100, message="cust_name长度必须介于 0 和 100 之间")
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public String getCustTel() {
		return custTel;
	}

	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}
	
	@Length(min=0, max=255, message="custom_order_id长度必须介于 0 和 255 之间")
	public String getCustomOrderId() {
		return customOrderId;
	}

	public void setCustomOrderId(String customOrderId) {
		this.customOrderId = customOrderId;
	}
	
	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}
	
	@Length(min=0, max=50, message="ems_comp长度必须介于 0 和 50 之间")
	public String getEmsComp() {
		return emsComp;
	}

	public void setEmsComp(String emsComp) {
		this.emsComp = emsComp;
	}
	
	public String getEmsCompOri() {
		return emsCompOri;
	}

	public void setEmsCompOri(String emsCompOri) {
		this.emsCompOri = emsCompOri;
	}
	
	@Length(min=0, max=50, message="ems_nbr长度必须介于 0 和 50 之间")
	public String getEmsNbr() {
		return emsNbr;
	}

	public void setEmsNbr(String emsNbr) {
		this.emsNbr = emsNbr;
	}
	
	public String getEmsPrice() {
		return emsPrice;
	}

	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}
	
	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	public Long getFactCarrId() {
		return factCarrId;
	}

	public void setFactCarrId(Long factCarrId) {
		this.factCarrId = factCarrId;
	}
	
	public String getFactDiscount() {
		return factDiscount;
	}

	public void setFactDiscount(String factDiscount) {
		this.factDiscount = factDiscount;
	}
	
	@Length(min=0, max=100, message="fact_ems_comp长度必须介于 0 和 100 之间")
	public String getFactEmsComp() {
		return factEmsComp;
	}

	public void setFactEmsComp(String factEmsComp) {
		this.factEmsComp = factEmsComp;
	}
	
	public String getFactEmsPrice() {
		return factEmsPrice;
	}

	public void setFactEmsPrice(String factEmsPrice) {
		this.factEmsPrice = factEmsPrice;
	}
	
	public Long getFactGoodsCount() {
		return factGoodsCount;
	}

	public void setFactGoodsCount(Long factGoodsCount) {
		this.factGoodsCount = factGoodsCount;
	}
	
	public Long getGenderId() {
		return genderId;
	}

	public void setGenderId(Long genderId) {
		this.genderId = genderId;
	}
	
	@Length(min=0, max=20, message="gender_name长度必须介于 0 和 20 之间")
	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}
	
	public Long getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(Long goodsCount) {
		this.goodsCount = goodsCount;
	}
	
	@Length(min=0, max=50, message="goods_nbr长度必须介于 0 和 50 之间")
	public String getGoodsNbr() {
		return goodsNbr;
	}

	public void setGoodsNbr(String goodsNbr) {
		this.goodsNbr = goodsNbr;
	}
	
	public String getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	
	@Length(min=0, max=20, message="goods_size长度必须介于 0 和 20 之间")
	public String getGoodsSize() {
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	
	public Long getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(Long goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}
	
	@Length(min=0, max=100, message="goods_type_name长度必须介于 0 和 100 之间")
	public String getGoodsTypeName() {
		return goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}
	
	@Length(min=0, max=1, message="is_invoice长度必须介于 0 和 1 之间")
	public String getIsInvoice() {
		return isInvoice;
	}

	public void setIsInvoice(String isInvoice) {
		this.isInvoice = isInvoice;
	}
	
	@Length(min=0, max=1, message="is_service长度必须介于 0 和 1 之间")
	public String getIsService() {
		return isService;
	}

	public void setIsService(String isService) {
		this.isService = isService;
	}
	
	@Length(min=0, max=100, message="numiid长度必须介于 0 和 100 之间")
	public String getNumiid() {
		return numiid;
	}

	public void setNumiid(String numiid) {
		this.numiid = numiid;
	}
	
	@Length(min=0, max=1, message="order_fahuo_state长度必须介于 0 和 1 之间")
	public String getOrderFahuoState() {
		return orderFahuoState;
	}

	public void setOrderFahuoState(String orderFahuoState) {
		this.orderFahuoState = orderFahuoState;
	}
	
	@Length(min=0, max=20, message="order_ip长度必须介于 0 和 20 之间")
	public String getOrderIp() {
		return orderIp;
	}

	public void setOrderIp(String orderIp) {
		this.orderIp = orderIp;
	}
	
	public Long getOrderParentId() {
		return orderParentId;
	}

	public void setOrderParentId(Long orderParentId) {
		this.orderParentId = orderParentId;
	}
	
	public String getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	public String getOrderPricePre() {
		return orderPricePre;
	}

	public void setOrderPricePre(String orderPricePre) {
		this.orderPricePre = orderPricePre;
	}
	
	@Length(min=0, max=1, message="order_state长度必须介于 0 和 1 之间")
	public String getOrderState() {
		return orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getOrderStateTime() {
		return orderStateTime;
	}

	public void setOrderStateTime(Date orderStateTime) {
		this.orderStateTime = orderStateTime;
	}
	
	@Length(min=0, max=50, message="order_sub_nos长度必须介于 0 和 50 之间")
	public String getOrderSubNos() {
		return orderSubNos;
	}

	public void setOrderSubNos(String orderSubNos) {
		this.orderSubNos = orderSubNos;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	
	public Long getOrderUserId() {
		return orderUserId;
	}

	public void setOrderUserId(Long orderUserId) {
		this.orderUserId = orderUserId;
	}
	
	@Length(min=0, max=50, message="order_user_name长度必须介于 0 和 50 之间")
	public String getOrderUserName() {
		return orderUserName;
	}

	public void setOrderUserName(String orderUserName) {
		this.orderUserName = orderUserName;
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
	
	public Long getPlatformAgio() {
		return platformAgio;
	}

	public void setPlatformAgio(Long platformAgio) {
		this.platformAgio = platformAgio;
	}
	
	public String getPlatformDeduct() {
		return platformDeduct;
	}

	public void setPlatformDeduct(String platformDeduct) {
		this.platformDeduct = platformDeduct;
	}
	
	public Long getPlatformFreight() {
		return platformFreight;
	}

	public void setPlatformFreight(Long platformFreight) {
		this.platformFreight = platformFreight;
	}
	
	public Long getPlatformFreightPre() {
		return platformFreightPre;
	}

	public void setPlatformFreightPre(Long platformFreightPre) {
		this.platformFreightPre = platformFreightPre;
	}
	
	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}
	
	@Length(min=0, max=100, message="province_name长度必须介于 0 和 100 之间")
	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public Long getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(Long seasonId) {
		this.seasonId = seasonId;
	}
	
	@Length(min=0, max=100, message="season_name长度必须介于 0 和 100 之间")
	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}
	
	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	
	@Length(min=0, max=100, message="shop_name长度必须介于 0 和 100 之间")
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	@Length(min=0, max=10, message="status长度必须介于 0 和 10 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Length(min=0, max=100, message="tid长度必须介于 0 和 100 之间")
	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}
	
	public String getPackagePrice() {
		return packagePrice;
	}

	public void setPackagePrice(String packagePrice) {
		this.packagePrice = packagePrice;
	}
	
}