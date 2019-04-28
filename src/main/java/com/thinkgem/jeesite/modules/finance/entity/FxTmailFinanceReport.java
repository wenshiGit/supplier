/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.finance.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
//import org.hibernate.validator.constraints.Length(min=0, max=8, message="商品数量;
//import org.hibernate.validator.constraints.Length(min=0, max=100, message="快递公司;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * fx_tmail_finance_reportEntity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxTmailFinanceReport extends DataEntity<FxTmailFinanceReport> {
	
	private static final long serialVersionUID = 1L;
	private Long oid;		// 淘宝子订单号（fx_orders_taobao表中的numiid就是淘宝子订单号）
	private Long sysOid;		// 系统订单号
	private String shopName;		// 订单所属店铺
	private Long shopId;		// 订单所属店铺id
	private Long skuId;		// 淘宝商品skuid
	private Date paytime;		// 淘宝订单付款时间
	private String brand;		// 品牌
	private String goodsNbr;		// 货号
	private String goodsSize;		// 尺码
	private Date sysOrderTime;		// 下单时间
	private Date sysSendTime;		// 渠道（系统）发货时间
	private String num;		// 商品数量(淘宝订单）
	private String price;		// 商品价格(淘宝订单），不包含优惠
	private String payment;		// 买家实付款金额(淘宝订单）
	private String custName;		// 客户姓名
	private String emsComp;		// 快递公司(淘宝订单）
	private String emsPrice;		// 客户支付的快递费用（主要是淘宝订单）
	private String channelName;		// 渠道名称
	private Long channelId;		// 渠道ID
	private String kefuName;		// 客服姓名
	private String discountFee;		// 优惠金额合计（多项优惠累加算出来的金额）
	private String promotionInfo;		// 优惠详细信息
	private String sysOrderPrice;		// 系统订单总金额（包括邮费）
	private String sysPostName;		// 系统快递公司名（渠道所用快递）
	private String sysPostFee;		// 系统快递费(渠道快递费）
	private String profits;		// 利润
	private String tip;		// 提示
	
	public FxTmailFinanceReport() {
		super();
	}

	public FxTmailFinanceReport(String id){
		super(id);
	}

	@NotNull(message="淘宝子订单号（fx_orders_taobao表中的numiid就是淘宝子订单号）不能为空")
	public Long getOid() {
		return oid;
	}

	public void setOid(Long oid) {
		this.oid = oid;
	}
	
	public Long getSysOid() {
		return sysOid;
	}

	public void setSysOid(Long sysOid) {
		this.sysOid = sysOid;
	}
	
	@Length(min=0, max=100, message="订单所属店铺长度必须介于 0 和 100 之间")
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	
	public Long getSkuId() {
		return skuId;
	}

	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPaytime() {
		return paytime;
	}

	public void setPaytime(Date paytime) {
		this.paytime = paytime;
	}
	
	@Length(min=0, max=100, message="品牌长度必须介于 0 和 100 之间")
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Length(min=0, max=100, message="货号长度必须介于 0 和 100 之间")
	public String getGoodsNbr() {
		return goodsNbr;
	}

	public void setGoodsNbr(String goodsNbr) {
		this.goodsNbr = goodsNbr;
	}
	
	@Length(min=0, max=50, message="尺码长度必须介于 0 和 50 之间")
	public String getGoodsSize() {
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getSysOrderTime() {
		return sysOrderTime;
	}

	public void setSysOrderTime(Date sysOrderTime) {
		this.sysOrderTime = sysOrderTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getSysSendTime() {
		return sysSendTime;
	}

	public void setSysSendTime(Date sysSendTime) {
		this.sysSendTime = sysSendTime;
	}
	
	@Length(min=0, max=8, message="商品数量(淘宝订单）长度必须介于 0 和 8 之间")
	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	@Length(min=0, max=100, message="客户姓名长度必须介于 0 和 100 之间")
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	@Length(min=0, max=100, message="快递公司(淘宝订单）长度必须介于 0 和 100 之间")
	public String getEmsComp() {
		return emsComp;
	}

	public void setEmsComp(String emsComp) {
		this.emsComp = emsComp;
	}
	
	public String getEmsPrice() {
		return emsPrice;
	}

	public void setEmsPrice(String emsPrice) {
		this.emsPrice = emsPrice;
	}
	
	@Length(min=0, max=100, message="渠道名称长度必须介于 0 和 100 之间")
	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
	@Length(min=0, max=100, message="客服姓名长度必须介于 0 和 100 之间")
	public String getKefuName() {
		return kefuName;
	}

	public void setKefuName(String kefuName) {
		this.kefuName = kefuName;
	}
	
	public String getDiscountFee() {
		return discountFee;
	}

	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}
	
	@Length(min=0, max=255, message="优惠详细信息长度必须介于 0 和 255 之间")
	public String getPromotionInfo() {
		return promotionInfo;
	}

	public void setPromotionInfo(String promotionInfo) {
		this.promotionInfo = promotionInfo;
	}
	
	public String getSysOrderPrice() {
		return sysOrderPrice;
	}

	public void setSysOrderPrice(String sysOrderPrice) {
		this.sysOrderPrice = sysOrderPrice;
	}
	
	@Length(min=0, max=100, message="系统快递公司名（渠道所用快递）长度必须介于 0 和 100 之间")
	public String getSysPostName() {
		return sysPostName;
	}

	public void setSysPostName(String sysPostName) {
		this.sysPostName = sysPostName;
	}
	
	public String getSysPostFee() {
		return sysPostFee;
	}

	public void setSysPostFee(String sysPostFee) {
		this.sysPostFee = sysPostFee;
	}
	
	public String getProfits() {
		return profits;
	}

	public void setProfits(String profits) {
		this.profits = profits;
	}
	
	@Length(min=0, max=255, message="提示长度必须介于 0 和 255 之间")
	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
}