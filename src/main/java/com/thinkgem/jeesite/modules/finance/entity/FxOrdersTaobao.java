/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.finance.entity;

import com.thinkgem.jeesite.modules.sys.entity.User;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotNull;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * fx_orders_taobaoEntity
 * @author MaoNian
 * @version 2019-04-28
 */
public class FxOrdersTaobao extends DataEntity<FxOrdersTaobao> {
	
	private static final long serialVersionUID = 1L;
	private User user;		// 用户ID
	private Long shopId;		// 店铺ID
	private String tid;		// 淘宝ID
	private String numiid;		// 子订单ID
	private String skuId;		// 库存量单位Id
	private Date createdTime;		// 创建时间
	private String title;		// 标题
	private String brand;		// 品牌
	private String goodsNbr;		// 货号
	private String goodsSize;		// 尺码（未转换尺码）
	private Long goodsCount;		// 数量
	private String goodsPrice;		// 价格
	private String goodsPriceOrg;		// 原始价格
	private String custName;		// 客户名
	private String custAddr;		// 客户地址
	private String custTel;		// 客户电话
	private String emsComp;		// 快递公司
	private String emsPrice;		// 快递价格
	private String remarkBuy;		// 买家评论
	private String remarkSell;		// 卖家评论
	private String remarkColor;		// 评论颜色
	private Date downloadTime;		// 对于淘宝订单：下载时间，对于Excel：导入时间
	private String buyerNick;		// 买家名称
	private String isExport;		// 是否
	private String isFahuo;		// 是否发货
	private String emsId;		// 快递ID
	private String errorMsg;		// 错误信息
	private String channelName;		// 渠道名称
	private String kefuUserName;		// 客服名称
	private String goodsTypeName;		// 商品类别名称
	private String sex;		// 性别
	private String goodsSizeTrans;		// 商品尺码（转换后）
	private String state;		// 0：未下单 1下单
	private String orderRemark;		// 订单备注
	private String origin;		// 订单来源，目前来源 0 excel订单导入 1淘宝订单下载
	private Long batchId;		// 批次号，IMPORT_BATCHID_SEQ
	private Long orderId;		// 主键，导入订单ID.order_id_seq
	private Long provinceId;		// 省份ID
	private String cityName;		// 市
	private Long cityId;		// 市
	private String countryName;		// country_name
	private Long countryId;		// country_id
	private String provinceName;		// province_name
	private String emsCompOri;		// 原始快递
	private String taobaoOrderPrice;		// taobao_order_price
	private String postFee;		// 京东：商品的运费 淘宝：邮费。
	private String orderSumPrice;		// order_sum_price
	private String totalFee;		// 应付金额（商品价格 * 商品数量 + 手工调整金额 - 子订单级订单优惠金额）。精确到2位小数;单位:元。如:200.07，表示:200元7分
	private String adjustFee;		// 手工金额--&gt;双十一天猫会将购物券金额放入此字段，因此不准确，建议废弃
	private String partMjzDiscount;		// 优惠分摊
	private String divideOrderFee;		// 分摊之后的实付金额--&gt;实际收到付款金额
	private String payment;		// 子订单实付金额。精确到2位小数，单位:元。如:200.07，表示:200元7分。子订单的交易计算公式如下：payment = price * num + adjust_fee - discount_fee ；单子订单交易，payment与主订单的payment一致，对于退款成功的子订单，由于主订单的优惠分摊金额，会造成该字段可能不为0.00元。
	private String price;		// 商品价格
	private String discountFee;		// 淘宝：优惠金额总额
	private String logisticsType;		// 物流方式（菜鸟 1，京东2）
	
	public FxOrdersTaobao() {
		super();
	}

	public FxOrdersTaobao(String id){
		super(id);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}
	
	@Length(min=0, max=100, message="淘宝ID长度必须介于 0 和 100 之间")
	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}
	
	@Length(min=0, max=100, message="子订单ID长度必须介于 0 和 100 之间")
	public String getNumiid() {
		return numiid;
	}

	public void setNumiid(String numiid) {
		this.numiid = numiid;
	}
	
	@Length(min=0, max=100, message="库存量单位Id长度必须介于 0 和 100 之间")
	public String getSkuId() {
		return skuId;
	}

	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	@Length(min=0, max=200, message="标题长度必须介于 0 和 200 之间")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Length(min=0, max=50, message="品牌长度必须介于 0 和 50 之间")
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Length(min=0, max=50, message="货号长度必须介于 0 和 50 之间")
	public String getGoodsNbr() {
		return goodsNbr;
	}

	public void setGoodsNbr(String goodsNbr) {
		this.goodsNbr = goodsNbr;
	}
	
	@Length(min=0, max=200, message="尺码（未转换尺码）长度必须介于 0 和 200 之间")
	public String getGoodsSize() {
		return goodsSize;
	}

	public void setGoodsSize(String goodsSize) {
		this.goodsSize = goodsSize;
	}
	
	public Long getGoodsCount() {
		return goodsCount;
	}

	public void setGoodsCount(Long goodsCount) {
		this.goodsCount = goodsCount;
	}
	
	public String getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(String goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	
	public String getGoodsPriceOrg() {
		return goodsPriceOrg;
	}

	public void setGoodsPriceOrg(String goodsPriceOrg) {
		this.goodsPriceOrg = goodsPriceOrg;
	}
	
	@Length(min=0, max=100, message="客户名长度必须介于 0 和 100 之间")
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	@Length(min=0, max=512, message="客户地址长度必须介于 0 和 512 之间")
	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	@Length(min=0, max=512, message="客户电话长度必须介于 0 和 512 之间")
	public String getCustTel() {
		return custTel;
	}

	public void setCustTel(String custTel) {
		this.custTel = custTel;
	}
	
	@Length(min=0, max=500, message="快递公司长度必须介于 0 和 500 之间")
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
	
	@Length(min=0, max=4000, message="买家评论长度必须介于 0 和 4000 之间")
	public String getRemarkBuy() {
		return remarkBuy;
	}

	public void setRemarkBuy(String remarkBuy) {
		this.remarkBuy = remarkBuy;
	}
	
	@Length(min=0, max=4000, message="卖家评论长度必须介于 0 和 4000 之间")
	public String getRemarkSell() {
		return remarkSell;
	}

	public void setRemarkSell(String remarkSell) {
		this.remarkSell = remarkSell;
	}
	
	@Length(min=0, max=50, message="评论颜色长度必须介于 0 和 50 之间")
	public String getRemarkColor() {
		return remarkColor;
	}

	public void setRemarkColor(String remarkColor) {
		this.remarkColor = remarkColor;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDownloadTime() {
		return downloadTime;
	}

	public void setDownloadTime(Date downloadTime) {
		this.downloadTime = downloadTime;
	}
	
	@Length(min=0, max=200, message="买家名称长度必须介于 0 和 200 之间")
	public String getBuyerNick() {
		return buyerNick;
	}

	public void setBuyerNick(String buyerNick) {
		this.buyerNick = buyerNick;
	}
	
	@Length(min=1, max=6, message="是否长度必须介于 1 和 6 之间")
	public String getIsExport() {
		return isExport;
	}

	public void setIsExport(String isExport) {
		this.isExport = isExport;
	}
	
	@Length(min=1, max=6, message="是否发货长度必须介于 1 和 6 之间")
	public String getIsFahuo() {
		return isFahuo;
	}

	public void setIsFahuo(String isFahuo) {
		this.isFahuo = isFahuo;
	}
	
	@Length(min=0, max=100, message="快递ID长度必须介于 0 和 100 之间")
	public String getEmsId() {
		return emsId;
	}

	public void setEmsId(String emsId) {
		this.emsId = emsId;
	}
	
	@Length(min=0, max=1000, message="错误信息长度必须介于 0 和 1000 之间")
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	@Length(min=0, max=500, message="渠道名称长度必须介于 0 和 500 之间")
	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}
	
	@Length(min=0, max=150, message="客服名称长度必须介于 0 和 150 之间")
	public String getKefuUserName() {
		return kefuUserName;
	}

	public void setKefuUserName(String kefuUserName) {
		this.kefuUserName = kefuUserName;
	}
	
	@Length(min=0, max=100, message="商品类别名称长度必须介于 0 和 100 之间")
	public String getGoodsTypeName() {
		return goodsTypeName;
	}

	public void setGoodsTypeName(String goodsTypeName) {
		this.goodsTypeName = goodsTypeName;
	}
	
	@Length(min=0, max=200, message="性别长度必须介于 0 和 200 之间")
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Length(min=0, max=200, message="商品尺码（转换后）长度必须介于 0 和 200 之间")
	public String getGoodsSizeTrans() {
		return goodsSizeTrans;
	}

	public void setGoodsSizeTrans(String goodsSizeTrans) {
		this.goodsSizeTrans = goodsSizeTrans;
	}
	
	@Length(min=1, max=6, message="0：未下单 1下单长度必须介于 1 和 6 之间")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Length(min=0, max=4000, message="订单备注长度必须介于 0 和 4000 之间")
	public String getOrderRemark() {
		return orderRemark;
	}

	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}
	
	@Length(min=0, max=6, message="订单来源，目前来源 0 excel订单导入 1淘宝订单下载长度必须介于 0 和 6 之间")
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public Long getBatchId() {
		return batchId;
	}

	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	
	//@order_id_seq不能为空")
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}
	
	@Length(min=0, max=100, message="市长度必须介于 0 和 100 之间")
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	
	@Length(min=0, max=100, message="country_name长度必须介于 0 和 100 之间")
	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}
	
	@Length(min=0, max=500, message="province_name长度必须介于 0 和 500 之间")
	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	
	@Length(min=0, max=500, message="原始快递长度必须介于 0 和 500 之间")
	public String getEmsCompOri() {
		return emsCompOri;
	}

	public void setEmsCompOri(String emsCompOri) {
		this.emsCompOri = emsCompOri;
	}
	
	public String getTaobaoOrderPrice() {
		return taobaoOrderPrice;
	}

	public void setTaobaoOrderPrice(String taobaoOrderPrice) {
		this.taobaoOrderPrice = taobaoOrderPrice;
	}
	
	public String getPostFee() {
		return postFee;
	}

	public void setPostFee(String postFee) {
		this.postFee = postFee;
	}
	
	public String getOrderSumPrice() {
		return orderSumPrice;
	}

	public void setOrderSumPrice(String orderSumPrice) {
		this.orderSumPrice = orderSumPrice;
	}
	
	public String getTotalFee() {
		return totalFee;
	}

	public void setTotalFee(String totalFee) {
		this.totalFee = totalFee;
	}
	
	public String getAdjustFee() {
		return adjustFee;
	}

	public void setAdjustFee(String adjustFee) {
		this.adjustFee = adjustFee;
	}
	
	public String getPartMjzDiscount() {
		return partMjzDiscount;
	}

	public void setPartMjzDiscount(String partMjzDiscount) {
		this.partMjzDiscount = partMjzDiscount;
	}
	
	public String getDivideOrderFee() {
		return divideOrderFee;
	}

	public void setDivideOrderFee(String divideOrderFee) {
		this.divideOrderFee = divideOrderFee;
	}
	
	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	public String getDiscountFee() {
		return discountFee;
	}

	public void setDiscountFee(String discountFee) {
		this.discountFee = discountFee;
	}
	
	@Length(min=0, max=6, message="物流方式（菜鸟 1，京东2）长度必须介于 0 和 6 之间")
	public String getLogisticsType() {
		return logisticsType;
	}

	public void setLogisticsType(String logisticsType) {
		this.logisticsType = logisticsType;
	}
	
}