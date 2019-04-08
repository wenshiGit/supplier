<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
<title>库存管理</title>
<meta name="decorator" content="default" />
<script type="text/javascript" src="${ctxStatic}/jquery/jquery-1.8.3.js"></script>
<!-- jquery form -->
<script type="text/javascript" src="${ctxStatic}/jquery/jquery.form.js"></script>
<script type="text/javascript">
	$(document).ready(function() {});
	function page(n, s) {
		$("#pageNo").val(n);
		$("#pageSize").val(s);
		$("#searchForm").submit();
		return false;
	}

	function submitUploadForm() {
		var options  = {
			url:'${ctx}/inventory/supInventory/uploadInven',
			type:'post',
			//clearForm:true,
			success:function(data){
				if(data.code == "0"){
					var url = data.filePath;
					alert("上传成功!将要解析excel文件。");
					parseExcel(url);
				}else{
					var message = data.msg;
					alert(message);
				}
			}
		}; 
		$("#uploadForm").ajaxSubmit(options);
	}
	
	
	function parseExcel(path){
		$.ajax({
			url:'${ctx}/inventory/supInventory/parseExcel',
			type:'post',
			data:{
				filePath:path
			},
			success:function(data){
				if(data.code=='0'){
					alert('解析成功！');
				}
				else if(data.code=='1'){
					alert('解析失败！');
				}
			}
		});
	}
</script>

</head>
<body>
	<ul class="nav nav-tabs">
		<li class="active"><a href="${ctx}/inventory/supInventory/">库存管理</a></li>
		<shiro:hasPermission name="inventory:supInventory:edit">
			<li><a href="${ctx}/inventory/supInventory/form">库存管理添加</a></li>
		</shiro:hasPermission>
	</ul>
	<form:form id="searchForm" modelAttribute="supInventory"
		action="${ctx}/inventory/supInventory/" method="post"
		class="breadcrumb form-search">
		<input id="pageNo" name="pageNo" type="hidden" value="${page.pageNo}" />
		<input id="pageSize" name="pageSize" type="hidden"
			value="${page.pageSize}" />
		<ul class="ul-form">
			<li><label>货号：</label> <form:input path="invenModel"
					htmlEscape="false" maxlength="50" class="input-medium" /></li>
			<li class="btns"><input id="btnSubmit" class="btn btn-primary"
				type="submit" value="查询" /></li>
			<li class="btns"><input id="uploadInvenBtn"
				class="btn btn-primary" type="button" data-toggle="modal"
				data-target="#uploadModal" value="更新库存" /></li>
			<li class="clearfix"></li>
		</ul>
	</form:form>
	<sys:message content="${message}" />
	<table id="contentTable"
		class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>货号</th>
				<th>尺码</th>
				<th>数量</th>
				<th>代理价</th>
				<th>折扣</th>
				<th>所属渠道</th>
				<th>配货率</th>
				<th>更新时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${page.list}" var="supInventory">
				<tr>
					<td>${supInventory.invenModel}</td>
					<td>${supInventory.invenSize}</td>
					<td>${supInventory.invenNum}</td>
					<td>${supInventory.invenPrice}</td>
					<td>${supInventory.invenAgio}</td>
					<td>${supInventory.channelId}</td>
					<td>${supInventory.distributionRate}%</td>
					<td><fmt:formatDate value="${supInventory.updateTime}" pattern="yyyy/MM/dd HH:mm:ss" /></td>
					<td><a href="${ctx}/inventory/supInventory/form?id=${supInventory.id}">加入购物车</a>
					<%-- <a href="${ctx}/inventory/supInventory/delete?id=${supInventory.id}"
							onclick="return confirmx('确认要删除该库存管理吗？', this.href)">删除</a> --%>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="pagination">${page}</div>
	<div class="modal fade" id="uploadModal" tabindex="-1" role="dialog" aria-labelledby="uploadModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
				<h5>上传库存文件</h5>
				</div>
				<div class="modal-body">
				<form role="form" id="uploadForm" name="uploadForm" action="" enctype="multipart/form-data">
					<div class="form-group">
					  <label for="name">渠道名称：</label>
					  <input type="text" class="form-control" id="channelName" name="channelName" placeholder="请输入名称">
					</div>
					<div class="form-group">
					  <label for="inputfile">选择文件：</label>
					  <input type="file" name="inputfile"  id="inputfile"  />
					</div>
					<input type="button"  value="提交" onclick="submitUploadForm()" class="btn btn-primary" />
					<input type="button" class="btn btn-default" data-dismiss="modal" value="关闭">
				</form>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal -->
	</div>
</body>
</html>