<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>订单管理</title>
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
		<li class="active"><a href="${ctx}/order/supOrder/">待处理订单</a></li>
		<shiro:hasPermission name="order:supOrder:edit"><li><a href="${ctx}/order/supOrder/form">订单添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="supOrder" action="${ctx}/order/supOrder/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>订单编号：</label>
				<form:input path="orderId" htmlEscape="false" maxlength="20" class="input-medium"/>
			</li>
			<li><label>收货人：</label>
				<form:input path="custName" htmlEscape="false" maxlength="100" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>状态</th>
				<th>订单编号</th>
				<th>货号</th>
				<th>内部码</th>
				<th>外部码</th>
				<th>数量</th>
				<th>吊牌价</th>
				<th>代理价</th>
				<th>下单折扣</th>
				<th>收货人</th>
				<th>物流方式</th>
				<th>快递</th>
				<th>快递单号</th>
				<th>运费</th>
				<th>备注</th>
				<th>代理编号</th>
				<th>代理ID</th>
			</tr>
			<%-- <tr>
				<shiro:hasPermission name="order:supOrder:edit"><th>操作</th></shiro:hasPermission>
			</tr> --%>
		</thead>
		<tbody>
			<c:forEach items="${page.list}" var="supOrder">
				<tr>
					<td>${supOrder.orderState}</td>
					<td>${supOrder.orderId}</td>
					<td>${supOrder.productNo}</td>
					<td>${supOrder.innnerSize}</td>
					<td>${supOrder.outSize}</td>
					<td>${supOrder.goodsCount}</td>
					<td>${supOrder.tagPrice}</td>
					<td>${supOrder.payment}</td>
					<td>${supOrder.discount}</td>
					<td>${supOrder.custName}</td>
					<td>${supOrder.logisticsType}</td>
					<td>${supOrder.expressComp}</td>
					<td>${supOrder.trackingNo}</td>
					<td>${supOrder.postage}</td>
					<td>${supOrder.remark}</td>
					<td>${supOrder.agentId}</td>
					<td>${supOrder.agentName}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>