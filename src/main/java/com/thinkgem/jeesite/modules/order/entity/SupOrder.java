/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.order.entity;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 订单管理Entity
 * @author ZiruiSong
 * @version 2019-04-08
 */
public class SupOrder extends DataEntity<SupOrder> {
	
	private static final long serialVersionUID = 1L;
	private Long orderId;		// 订单编号
	private String apiOrderId;		// API订单编号
	private Long area;		// 区域ID
	private String areaName;		// 区域
	private String bailiSynchorState;		// 百丽同步状态
	private Long brandId;		// 品牌ID
	private String brandName;		// 品牌名称
	private Long expressId;		// 快递公司ID
	private Date channelConfirmTime;		// 渠道确认时间
	private Double channelPostage;		// 渠道邮费
	private Long channelId;		// 渠道ID
	private String channelName;		// 渠道名称
	private Date channelSendTime;		// 渠道发货时间
	private String channelsBefore;		// 转仓前渠道
	private Long channelsNumBefore;		// 转仓前渠道编号
	private Long checkUserId;		// 审核人
	private String checkUserName;		// 审核人
	private Long cityId;		// 城市编码
	private String cityName;		// 城市
	private Double custPostage;		// 客户邮费
	private String custAddr;		// 买家地址
	private String custName;		// 收货人
	private String custTel;		// 收货电话
	private String customOrderId;		// 自定义单号
	private Double discount;		// 下单折扣
	private String expressComp;		// 快递公司
	private String expressCompOri;		// 原快递公司
	private String trackingNo;		// 快递单号
	private Double postage;		// 快递费用
	private String errMsg;		// 错误信息
	private Long factExpressId;		// 实发快递ID
	private Double factDiscount;		// 实际折扣
	private String factExpressComp;		// 实发快递
	private Double factPostage;		// 实际邮费
	private Long factGoodsCount;		// 实际折扣
	private Long genderId;		// 性别ID
	private String genderName;		// 性别
	private Long goodsCount;		// 数量
	private String productNo;		// 货号
	private Double tagPrice;		// 吊牌价格
	private String innnerSize;		// 内部尺码
	private Long catagroyId;		// 商品类别ID
	private String catagroyName;		// 商品类别
	private String isInvoice;		// 发票申请
	private String isService;		// 售后申请
	private String oid;		// 淘宝子订单号
	private String orderFahuoState;		// 发货状态
	private String orderIp;		// IP地址
	private Long orderParentId;		// 主订单号
	private Double payment;		// 实付金额
	private String orderPricePre;		// 订单预付款
	private String orderState;		// 订单状态
	private Date orderStateTime;		// 状态更新时间
	private Date payTime;		// 付款时间
	private Long agentId;		// 代理ID
	private String agentName;		// 代理名
	private String outProductNo;		// 外部订单号
	private String outSize;		// 外部尺码
	private Double commissionAgio;		// 佣金折扣
	private Double commission;		// 佣金
	private Double postFeeCommission;		// 运费佣金
	private Double postFeeCommissionPre;		// 预付运费佣金
	private Long provinceId;		// 省份编号
	private String provinceName;		// 省份
	private String remark;		// 备注
	private Long seasonId;		// 季节编号
	private String seasonName;		// 季节
	private Long shopId;		// 店铺编号
	private String shopName;		// 店铺
	private String status;		// 状态
	private String tid;		// 淘宝主订单号
	private Double packagePrice;		// 包装费
	private Integer logisticsType;		// 物流方式
	private Date declarationFormDate;		// 报单日期
	private Integer orderSrc;		// 订单来源
	private Double importOverPrice;		// 结算金额
	private String outerIid;		// 商家外部编码
	
	public SupOrder() {
		super();
	}

	public SupOrder(String id){
		super(id);
	}

	@NotNull(message="订单编号不能为空")
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	
	@Length(min=0, max=100, message="API订单编号长度必须介于 0 和 100 之间")
	public String getApiOrderId() {
		return apiOrderId;
	}

	public void setApiOrderId(String apiOrderId) {
		this.apiOrderId = apiOrderId;
	}
	
	public Long getArea() {
		return area;
	}

	public void setArea(Long area) {
		this.area = area;
	}
	
	@Length(min=0, max=200, message="区域长度必须介于 0 和 200 之间")
	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	
	@Length(min=0, max=1, message="百丽同步状态长度必须介于 0 和 1 之间")
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
	
	@Length(min=0, max=20, message="品牌名称长度必须介于 0 和 20 之间")
	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public Long getExpressId() {
		return expressId;
	}

	public void setExpressId(Long expressId) {
		this.expressId = expressId;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getChannelConfirmTime() {
		return channelConfirmTime;
	}

	public void setChannelConfirmTime(Date channelConfirmTime) {
		this.channelConfirmTime = channelConfirmTime;
	}
	
	public Double getChannelPostage() {
		return channelPostage;
	}

	public void setChannelPostage(Double channelPostage) {
		this.channelPostage = channelPostage;
	}
	
	public Long getChannelId() {
		return channelId;
	}

	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}
	
	@Length(min=0, max=30, message="渠道名称长度必须介于 0 和 30 之间")
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
	
	@Length(min=0, max=100, message="转仓前渠道长度必须介于 0 和 100 之间")
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
	
	@Length(min=0, max=50, message="审核人长度必须介于 0 和 50 之间")
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
	
	@Length(min=0, max=100, message="城市长度必须介于 0 和 100 之间")
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public Double getCustPostage() {
		return custPostage;
	}

	public void setCustPostage(Double custPostage) {
		this.custPostage = custPostage;
	}
	
	public String getCustAddr() {
		return custAddr;
	}

	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	
	@Length(min=0, max=100, message="收货人长度必须介于 0 和 100 之间")
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
	
	@Length(min=0, max=100, message="自定义单号长度必须介于 0 和 100 之间")
	public String getCustomOrderId() {
		return customOrderId;
	}

	public void setCustomOrderId(String customOrderId) {
		this.customOrderId = customOrderId;
	}
	
	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}
	
	@Length(min=0, max=50, message="快递公司长度必须介于 0 和 50 之间")
	public String getExpressComp() {
		return expressComp;
	}

	public void setExpressComp(String expressComp) {
		this.expressComp = expressComp;
	}
	
	public String getExpressCompOri() {
		return expressCompOri;
	}

	public void setExpressCompOri(String expressCompOri) {
		this.expressCompOri = expressCompOri;
	}
	
	@Length(min=0, max=50, message="快递单号长度必须介于 0 和 50 之间")
	public String getTrackingNo() {
		return trackingNo;
	}

	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}
	
	@NotNull(message="快递费用不能为空")
	public Double getPostage() {
		return postage;
	}

	public void setPostage(Double postage) {
		this.postage = postage;
	}
	
	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	
	public Long getFactExpressId() {
		return factExpressId;
	}

	public void setFactExpressId(Long factExpressId) {
		this.factExpressId = factExpressId;
	}
	
	public Double getFactDiscount() {
		return factDiscount;
	}

	public void setFactDiscount(Double factDiscount) {
		this.factDiscount = factDiscount;
	}
	
	@Length(min=0, max=200, message="实发快递长度必须介于 0 和 200 之间")
	public String getFactExpressComp() {
		return factExpressComp;
	}

	public void setFactExpressComp(String factExpressComp) {
		this.factExpressComp = factExpressComp;
	}
	
	public Double getFactPostage() {
		return factPostage;
	}

	public void setFactPostage(Double factPostage) {
		this.factPostage = factPostage;
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
	
	@Length(min=0, max=20, message="性别长度必须介于 0 和 20 之间")
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
	
	@Length(min=0, max=50, message="货号长度必须介于 0 和 50 之间")
	public String getProductNo() {
		return productNo;
	}

	public void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	
	public Double getTagPrice() {
		return tagPrice;
	}

	public void setTagPrice(Double tagPrice) {
		this.tagPrice = tagPrice;
	}
	
	@Length(min=0, max=20, message="内部尺码长度必须介于 0 和 20 之间")
	public String getInnnerSize() {
		return innnerSize;
	}

	public void setInnnerSize(String innnerSize) {
		this.innnerSize = innnerSize;
	}
	
	public Long getCatagroyId() {
		return catagroyId;
	}

	public void setCatagroyId(Long catagroyId) {
		this.catagroyId = catagroyId;
	}
	
	@Length(min=0, max=100, message="商品类别长度必须介于 0 和 100 之间")
	public String getCatagroyName() {
		return catagroyName;
	}

	public void setCatagroyName(String catagroyName) {
		this.catagroyName = catagroyName;
	}
	
	@Length(min=0, max=1, message="发票申请长度必须介于 0 和 1 之间")
	public String getIsInvoice() {
		return isInvoice;
	}

	public void setIsInvoice(String isInvoice) {
		this.isInvoice = isInvoice;
	}
	
	@Length(min=0, max=1, message="售后申请长度必须介于 0 和 1 之间")
	public String getIsService() {
		return isService;
	}

	public void setIsService(String isService) {
		this.isService = isService;
	}
	
	@Length(min=0, max=100, message="淘宝子订单号长度必须介于 0 和 100 之间")
	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}
	
	@Length(min=0, max=1, message="发货状态长度必须介于 0 和 1 之间")
	public String getOrderFahuoState() {
		return orderFahuoState;
	}

	public void setOrderFahuoState(String orderFahuoState) {
		this.orderFahuoState = orderFahuoState;
	}
	
	@Length(min=0, max=20, message="IP地址长度必须介于 0 和 20 之间")
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
	
	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}
	
	public String getOrderPricePre() {
		return orderPricePre;
	}

	public void setOrderPricePre(String orderPricePre) {
		this.orderPricePre = orderPricePre;
	}
	
	@Length(min=0, max=1, message="订单状态长度必须介于 0 和 1 之间")
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
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPayTime() {
		return payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	
	public Long getAgentId() {
		return agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
	}
	
	@Length(min=0, max=50, message="代理名长度必须介于 0 和 50 之间")
	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	
	@Length(min=0, max=50, message="外部订单号长度必须介于 0 和 50 之间")
	public String getOutProductNo() {
		return outProductNo;
	}

	public void setOutProductNo(String outProductNo) {
		this.outProductNo = outProductNo;
	}
	
	@Length(min=0, max=50, message="外部尺码长度必须介于 0 和 50 之间")
	public String getOutSize() {
		return outSize;
	}

	public void setOutSize(String outSize) {
		this.outSize = outSize;
	}
	
	@NotNull(message="佣金折扣不能为空")
	public Double getCommissionAgio() {
		return commissionAgio;
	}

	public void setCommissionAgio(Double commissionAgio) {
		this.commissionAgio = commissionAgio;
	}
	
	@NotNull(message="佣金不能为空")
	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}
	
	@NotNull(message="运费佣金不能为空")
	public Double getPostFeeCommission() {
		return postFeeCommission;
	}

	public void setPostFeeCommission(Double postFeeCommission) {
		this.postFeeCommission = postFeeCommission;
	}
	
	@NotNull(message="预付运费佣金不能为空")
	public Double getPostFeeCommissionPre() {
		return postFeeCommissionPre;
	}

	public void setPostFeeCommissionPre(Double postFeeCommissionPre) {
		this.postFeeCommissionPre = postFeeCommissionPre;
	}
	
	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}
	
	@Length(min=0, max=100, message="省份长度必须介于 0 和 100 之间")
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
	
	@Length(min=0, max=100, message="季节长度必须介于 0 和 100 之间")
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
	
	@Length(min=0, max=100, message="店铺长度必须介于 0 和 100 之间")
	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
	@Length(min=0, max=10, message="状态长度必须介于 0 和 10 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Length(min=0, max=100, message="淘宝主订单号长度必须介于 0 和 100 之间")
	public String getTid() {
		return tid;
	}

	public void setTid(String tid) {
		this.tid = tid;
	}
	
	@NotNull(message="包装费不能为空")
	public Double getPackagePrice() {
		return packagePrice;
	}

	public void setPackagePrice(Double packagePrice) {
		this.packagePrice = packagePrice;
	}
	
	public Integer getLogisticsType() {
		return logisticsType;
	}

	public void setLogisticsType(Integer logisticsType) {
		this.logisticsType = logisticsType;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getDeclarationFormDate() {
		return declarationFormDate;
	}

	public void setDeclarationFormDate(Date declarationFormDate) {
		this.declarationFormDate = declarationFormDate;
	}
	
	public Integer getOrderSrc() {
		return orderSrc;
	}

	public void setOrderSrc(Integer orderSrc) {
		this.orderSrc = orderSrc;
	}
	
	public Double getImportOverPrice() {
		return importOverPrice;
	}

	public void setImportOverPrice(Double importOverPrice) {
		this.importOverPrice = importOverPrice;
	}
	
	@Length(min=0, max=30, message="商家外部编码长度必须介于 0 和 30 之间")
	public String getOuterIid() {
		return outerIid;
	}

	public void setOuterIid(String outerIid) {
		this.outerIid = outerIid;
	}
	
}