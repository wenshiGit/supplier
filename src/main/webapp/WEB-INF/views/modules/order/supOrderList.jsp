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
		<shiro:hasPermission name="order:supOrder:edit"><li><a href="${ctx}/order/supOrder/form">订单管理添加</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="supOrder" action="${ctx}/order/supOrder/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>订单编号：</label>
				<form:input path="orderId" htmlEscape="false" maxlength="32" class="input-medium"/>
			</li>
			<li><label>收货人姓名：</label>
				<form:input path="receiverName" htmlEscape="false" maxlength="64" class="input-medium"/>
			</li>
			<li><label>订单状态  0:待付款，1:已付款，2:待审核，3:配货中，4:已发货，5:已取消，6:交易完成：</label>
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
				<th>备注</th>
				<shiro:hasPermission name="order:supOrder:edit"><th>操作</th></shiro:hasPermission>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="supOrder">
			<tr>
				<td><a href="${ctx}/order/supOrder/form?id=${supOrder.id}">
					${supOrder.remarks}
				</a></td>
				<shiro:hasPermission name="order:supOrder:edit"><td>
    				<a href="${ctx}/order/supOrder/form?id=${supOrder.id}">修改</a>
					<a href="${ctx}/order/supOrder/delete?id=${supOrder.id}" onclick="return confirmx('确认要删除该订单管理吗？', this.href)">删除</a>
				</td></shiro:hasPermission>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>