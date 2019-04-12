<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>渠道管理</title>
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
		<li class="active"><a href="${ctx}/channel/supChannel/">渠道列表</a></li>
		<shiro:hasPermission name="channel:supChannel:edit"><li><a href="${ctx}/channel/supChannel/form">添加渠道</a></li></shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="supChannel" action="${ctx}/channel/supChannel/" method="post" class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}"/>
		<input id="pageSize" name="pageSize" type="hidden" value="${page.pageSize}"/>
		<ul class="ul-form">
			<li><label>渠道名称：</label>
				<form:input path="channelName" htmlEscape="false" maxlength="100" class="input-medium"/>
			</li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary" type="submit" value="查询"/></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}"/>
	<table id="contentTable" class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>渠道名称</th>
				<th>所在城市</th>
				<th>默认折扣</th>
				<th>描述</th>
				<th>抽成折扣</th>
				<th>配货说明</th>
				<th>账户余额</th>
				<th>默认发货快递</th>
				<th>发货地</th>
				<th>状态</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${page.list}" var="supChannel">
			<tr>
				<td>${supChannel.channelName}</td>
				<td>${supChannel.remarks}</td>
				<td>
    				<a href="${ctx}/channel/supChannel/form?id=${supChannel.id}">修改</a>
					<a href="${ctx}/channel/supChannel/delete?id=${supChannel.id}" onclick="return confirmx('确认要删除该渠道管理吗？', this.href)">删除</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
</body>
</html>