<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/WEB-INF/views/include/taglib.jsp"%>
<html>
<head>
	<title>订单管理管理</title>
	<meta name="decorator" content="default"/>
	<script type="text/javascript">
		$(document).ready(function() {
			//$("#name").focus();
			$("#inputForm").validate({
				submitHandler: function(form){
					loading('正在提交，请稍等...');
					form.submit();
				},
				errorContainer: "#messageBox",
				errorPlacement: function(error, element) {
					$("#messageBox").text("输入有误，请先更正。");
					if (element.is(":checkbox")||element.is(":radio")||element.parent().is(".input-append")){
						error.appendTo(element.parent().parent());
					} else {
						error.insertAfter(element);
					}
				}
			});
		});
		function addRow(list, idx, tpl, row){
			$(list).append(Mustache.render(tpl, {
				idx: idx, delBtn: true, row: row
			}));
			$(list+idx).find("select").each(function(){
				$(this).val($(this).attr("data-value"));
			});
			$(list+idx).find("input[type='checkbox'], input[type='radio']").each(function(){
				var ss = $(this).attr("data-value").split(',');
				for (var i=0; i<ss.length; i++){
					if($(this).val() == ss[i]){
						$(this).attr("checked","checked");
					}
				}
			});
		}
		function delRow(obj, prefix){
			var id = $(prefix+"_id");
			var delFlag = $(prefix+"_delFlag");
			if (id.val() == ""){
				$(obj).parent().parent().remove();
			}else if(delFlag.val() == "0"){
				delFlag.val("1");
				$(obj).html("&divide;").attr("title", "撤销删除");
				$(obj).parent().parent().addClass("error");
			}else if(delFlag.val() == "1"){
				delFlag.val("0");
				$(obj).html("&times;").attr("title", "删除");
				$(obj).parent().parent().removeClass("error");
			}
		}
	</script>
</head>
<body>
	<ul class="nav nav-tabs">
		<li><a href="${ctx}/order/supOrder/">订单管理列表</a></li>
		<li class="active"><a href="${ctx}/order/supOrder/form?id=${supOrder.id}">订单管理<shiro:hasPermission name="order:supOrder:edit">${not empty supOrder.id?'修改':'添加'}</shiro:hasPermission><shiro:lacksPermission name="order:supOrder:edit">查看</shiro:lacksPermission></a></li>
	</ul><br/>
	<form:form id="inputForm" modelAttribute="supOrder" action="${ctx}/order/supOrder/save" method="post" class="form-horizontal">
		<form:hidden path="id"/>
		<sys:message content="${message}"/>		
		<div class="control-group">
			<label class="control-label">订单编号：</label>
			<div class="controls">
				<form:input path="orderId" htmlEscape="false" maxlength="32" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">API订单编号：</label>
			<div class="controls">
				<form:input path="apiOrderId" htmlEscape="false" maxlength="64" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">代理ID：</label>
			<div class="controls">
				<form:input path="agentId" htmlEscape="false" maxlength="16" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">快递公司ID：</label>
			<div class="controls">
				<form:input path="agentExpressId" htmlEscape="false" maxlength="16" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">代理总邮费：</label>
			<div class="controls">
				<form:input path="agentPostFee" htmlEscape="false" class="input-xlarge required number"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">代理实付总金额：</label>
			<div class="controls">
				<form:input path="agentTotalFee" htmlEscape="false" class="input-xlarge required number"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">代理付款时间：</label>
			<div class="controls">
				<input name="agentPayTime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${supOrder.agentPayTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">代理IP地址：</label>
			<div class="controls">
				<form:input path="agentIpAddress" htmlEscape="false" maxlength="32" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">渠道ID：</label>
			<div class="controls">
				<form:input path="channelId" htmlEscape="false" maxlength="32" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">渠道确认时间：</label>
			<div class="controls">
				<input name="channelConfirmTime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${supOrder.channelConfirmTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">渠道总快递费用：</label>
			<div class="controls">
				<form:input path="channelPostFee" htmlEscape="false" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">渠道发货时间：</label>
			<div class="controls">
				<input name="channelSendTime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${supOrder.channelSendTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">渠道实收总金额：</label>
			<div class="controls">
				<form:input path="channelTotalReceivedFee" htmlEscape="false" class="input-xlarge  number"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">审核人：</label>
			<div class="controls">
				<form:input path="confirmUserId" htmlEscape="false" maxlength="32" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">收货人所在省份：</label>
			<div class="controls">
				<form:input path="receiverState" htmlEscape="false" maxlength="32" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">收货人所在的城市：</label>
			<div class="controls">
				<form:input path="reveiverCity" htmlEscape="false" maxlength="16" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">收货人的所在地区：</label>
			<div class="controls">
				<form:input path="reveiverDistrict" htmlEscape="false" maxlength="16" class="input-xlarge required digits"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">收货人姓名：</label>
			<div class="controls">
				<form:input path="receiverName" htmlEscape="false" maxlength="64" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">收货人电话：</label>
			<div class="controls">
				<form:input path="receiverMobile" htmlEscape="false" maxlength="64" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">收货人地址：</label>
			<div class="controls">
				<form:input path="receiverAddress" htmlEscape="false" maxlength="128" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">快递单号：</label>
			<div class="controls">
				<form:input path="expressNo" htmlEscape="false" maxlength="128" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">订单发货快递：</label>
			<div class="controls">
				<form:input path="logisticsCompany" htmlEscape="false" maxlength="64" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">错误信息：</label>
			<div class="controls">
				<form:input path="errMsg" htmlEscape="false" maxlength="128" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">售后编号：</label>
			<div class="controls">
				<form:input path="customerServiceId" htmlEscape="false" maxlength="64" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">订单总价(不含邮费)：</label>
			<div class="controls">
				<form:input path="totalFee" htmlEscape="false" class="input-xlarge required number"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">订单状态  0:待付款，1:已付款，2:待审核，3:配货中，4:已发货，5:已取消，6:交易完成：</label>
			<div class="controls">
				<form:select path="orderStatus" class="input-xlarge required">
					<form:option value="" label=""/>
					<form:options items="${fns:getDictList('order_status')}" itemLabel="label" itemValue="value" htmlEscape="false"/>
				</form:select>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">交易佣金：</label>
			<div class="controls">
				<form:input path="commissionFee" htmlEscape="false" class="input-xlarge required number"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">买家留言：</label>
			<div class="controls">
				<form:input path="buyerMessage" htmlEscape="false" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">店铺ID：</label>
			<div class="controls">
				<form:input path="shopId" htmlEscape="false" maxlength="64" class="input-xlarge  digits"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">淘宝主订单号：</label>
			<div class="controls">
				<form:input path="tid" htmlEscape="false" maxlength="128" class="input-xlarge "/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">包装费：</label>
			<div class="controls">
				<form:input path="packageFee" htmlEscape="false" class="input-xlarge required number"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">订单来源 1淘宝  2京东  3自动：</label>
			<div class="controls">
				<form:input path="orderFrom" htmlEscape="false" maxlength="1" class="input-xlarge required"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">订单创建时间：</label>
			<div class="controls">
				<input name="createTime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate required"
					value="<fmt:formatDate value="${supOrder.createTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
				<span class="help-inline"><font color="red">*</font> </span>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">修改时间：</label>
			<div class="controls">
				<input name="updateTime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
					value="<fmt:formatDate value="${supOrder.updateTime}" pattern="yyyy-MM-dd HH:mm:ss"/>"
					onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
			</div>
		</div>
		<div class="control-group">
			<label class="control-label">备注：</label>
			<div class="controls">
				<form:textarea path="remarks" htmlEscape="false" rows="4" maxlength="255" class="input-xxlarge "/>
			</div>
		</div>
			<div class="control-group">
				<label class="control-label">订单子表：</label>
				<div class="controls">
					<table id="contentTable" class="table table-striped table-bordered table-condensed">
						<thead>
							<tr>
								<th class="hide"></th>
								<th>品牌ID</th>
								<th>商品数字ID</th>
								<th>外部自定义的sku</th>
								<th>货号</th>
								<th>内部尺码</th>
								<th>外部尺码</th>
								<th>吊牌价</th>
								<th>代理价</th>
								<th>代理折扣</th>
								<th>期望发货数量</th>
								<th>代理实付款</th>
								<th>渠道价格</th>
								<th>渠道折扣</th>
								<th>渠道实发数量</th>
								<th>佣金</th>
								<th>渠道收取金额</th>
								<th>创建时间</th>
								<th>修改时间</th>
								<th>备注</th>
								<shiro:hasPermission name="order:supOrder:edit"><th width="10">&nbsp;</th></shiro:hasPermission>
							</tr>
						</thead>
						<tbody id="supSubOrderList">
						</tbody>
						<shiro:hasPermission name="order:supOrder:edit"><tfoot>
							<tr><td colspan="21"><a href="javascript:" onclick="addRow('#supSubOrderList', supSubOrderRowIdx, supSubOrderTpl);supSubOrderRowIdx = supSubOrderRowIdx + 1;" class="btn">新增</a></td></tr>
						</tfoot></shiro:hasPermission>
					</table>
					<script type="text/template" id="supSubOrderTpl">//<!--
						<tr id="supSubOrderList{{idx}}">
							<td class="hide">
								<input id="supSubOrderList{{idx}}_id" name="supSubOrderList[{{idx}}].id" type="hidden" value="{{row.id}}"/>
								<input id="supSubOrderList{{idx}}_delFlag" name="supSubOrderList[{{idx}}].delFlag" type="hidden" value="0"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_bid" name="supSubOrderList[{{idx}}].bid" type="text" value="{{row.bid}}" maxlength="32" class="input-small required digits"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_numIid" name="supSubOrderList[{{idx}}].numIid" type="text" value="{{row.numIid}}" maxlength="128" class="input-small required"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_outerSkuId" name="supSubOrderList[{{idx}}].outerSkuId" type="text" value="{{row.outerSkuId}}" maxlength="128" class="input-small "/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_productNo" name="supSubOrderList[{{idx}}].productNo" type="text" value="{{row.productNo}}" maxlength="64" class="input-small required"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_innerSize" name="supSubOrderList[{{idx}}].innerSize" type="text" value="{{row.innerSize}}" maxlength="32" class="input-small required"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_outerSize" name="supSubOrderList[{{idx}}].outerSize" type="text" value="{{row.outerSize}}" maxlength="32" class="input-small "/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_tagPrice" name="supSubOrderList[{{idx}}].tagPrice" type="text" value="{{row.tagPrice}}" class="input-small required number"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_agentPrice" name="supSubOrderList[{{idx}}].agentPrice" type="text" value="{{row.agentPrice}}" class="input-small required number"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_agentAgio" name="supSubOrderList[{{idx}}].agentAgio" type="text" value="{{row.agentAgio}}" class="input-small required number"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_agentExpectNum" name="supSubOrderList[{{idx}}].agentExpectNum" type="text" value="{{row.agentExpectNum}}" maxlength="8" class="input-small required"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_agentPayment" name="supSubOrderList[{{idx}}].agentPayment" type="text" value="{{row.agentPayment}}" class="input-small required number"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_channelPrice" name="supSubOrderList[{{idx}}].channelPrice" type="text" value="{{row.channelPrice}}" class="input-small required number"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_channelAgio" name="supSubOrderList[{{idx}}].channelAgio" type="text" value="{{row.channelAgio}}" class="input-small required number"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_channelSendNum" name="supSubOrderList[{{idx}}].channelSendNum" type="text" value="{{row.channelSendNum}}" maxlength="8" class="input-small "/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_commissionFee" name="supSubOrderList[{{idx}}].commissionFee" type="text" value="{{row.commissionFee}}" maxlength="255" class="input-small "/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_channelReceivedFee" name="supSubOrderList[{{idx}}].channelReceivedFee" type="text" value="{{row.channelReceivedFee}}" class="input-small  number"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_createTime" name="supSubOrderList[{{idx}}].createTime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate required"
									value="{{row.createTime}}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
							</td>
							<td>
								<input id="supSubOrderList{{idx}}_updateTime" name="supSubOrderList[{{idx}}].updateTime" type="text" readonly="readonly" maxlength="20" class="input-medium Wdate "
									value="{{row.updateTime}}" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss',isShowClear:false});"/>
							</td>
							<td>
								<textarea id="supSubOrderList{{idx}}_remarks" name="supSubOrderList[{{idx}}].remarks" rows="4" maxlength="255" class="input-small ">{{row.remarks}}</textarea>
							</td>
							<shiro:hasPermission name="order:supOrder:edit"><td class="text-center" width="10">
								{{#delBtn}}<span class="close" onclick="delRow(this, '#supSubOrderList{{idx}}')" title="删除">&times;</span>{{/delBtn}}
							</td></shiro:hasPermission>
						</tr>//-->
					</script>
					<script type="text/javascript">
						var supSubOrderRowIdx = 0, supSubOrderTpl = $("#supSubOrderTpl").html().replace(/(\/\/\<!\-\-)|(\/\/\-\->)/g,"");
						$(document).ready(function() {
							var data = ${fns:toJson(supOrder.supSubOrderList)};
							for (var i=0; i<data.length; i++){
								addRow('#supSubOrderList', supSubOrderRowIdx, supSubOrderTpl, data[i]);
								supSubOrderRowIdx = supSubOrderRowIdx + 1;
							}
						});
					</script>
				</div>
			</div>
		<div class="form-actions">
			<shiro:hasPermission name="order:supOrder:edit"><input id="btnSubmit" class="btn btn-primary" type="submit" value="保 存"/>&nbsp;</shiro:hasPermission>
			<input id="btnCancel" class="btn" type="button" value="返 回" onclick="history.go(-1)"/>
		</div>
	</form:form>
</body>
</html>