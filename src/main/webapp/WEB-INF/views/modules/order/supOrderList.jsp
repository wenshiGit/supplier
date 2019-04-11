<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>订单管理管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		function page(n,s){
			$("#pageNo").val(n);
			$("#pageSize").val(s);
			$("#searchForm").submit();
        	return false;
        }
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/order/supOrder/">订单管理列表</a></li>
	</ul>
	<form:form id="searchForm" modelAttribute="supOrder" action="${ctx}/order/supOrder/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>订单编号：</label>
				<form:input path="orderId" htmlEscape="false" maxlength="32" class="input-medium"/>
			</li>
			<li><label>货号：</label>
				<form:input path="productNo" htmlEscape="false" maxlength="64" class="input-medium"/>
			</li>
			<li><label>收货人姓名：</label>
				<form:input path="receiverName" htmlEscape="false" maxlength="64" class="input-medium"/>
			</li>
			<li><label>订单状态：</label>
				<form:select path="orderStatus" class="input-medium">
					<form:option value="" label=""/>
					<form:options items="${fns:getDictList('order_status')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
		
			<tr>
				<th>订单编号</th>
				<th>状态</th>
				<th>货号</th>
				<th>尺码</th>
				<th>收货人</th>
				<th>收货手机</th>
				<th>渠道</th>
				<th>吊牌价</th>
				<th>折扣</th>
				<th>售出价</th>
				<th>邮费</th>
				<th>数量</th>
				<th>实发</th>
				<th>快递</th>
				<th>售后状态</th>
				<th>付款时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="supOrder">
			<tr>
				<td>${supOrder.orderId}</td>
				<td>${supOrder.orderStatus}</td>
				<td>${supOrder.productNo}</td>
				<td>${supOrder.goodsSize}</td>
				<td>${supOrder.receiverName}</td>
				<td>${supOrder.receiverMobile}</td>
				<td>${supOrder.channelId}</td>
				<td>${supOrder.tagPrice}</td>
				<td>${supOrder.agentAgio}</td>
				<td>${supOrder.agentPrice}</td>
				<td>${supOrder.agentPostFee}</td>
				<td>${supOrder.num}</td>
				<td>${supOrder.sendNum}</td>
				<td>${supOrder.agentExpressId}</td>
				<td>${supOrder.customerServiceId}</td>
				<td>
					<fmt:formatDate value="${supOrder.agentPayTime}" pattern="yyyy-MM-dd HH:mm:ss"/>
				</td>
				<shiro:hasPermission name="order:supOrder:edit"><td>
    				<a href="#">发货</a>
					<a href="#" >取消</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>