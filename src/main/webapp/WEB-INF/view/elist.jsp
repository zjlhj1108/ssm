<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UFT-8">
<title>Insert title here</title>
<!-- 引入外部的css文件 -->
<link rel="stylesheet" type="text/css" href="${pageContext.servletContext.contextPath}/css/index_work.css">
<!-- 这个标签只是为了引入外部标签，里面不能写内容 -->
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery-1.8.2.min.js"></script>
<!-- 写js的代码 -->
<script type="text/javascript">
	<!--页面加载实现全选和全不选-->
	$(function(){
		<!--实现全选或者全不选-->
		$("#topCheck").click(function(){
			$(".ids").prop("checked",$(this).prop("checked"));
		});
		
		<!--实现批量删除-->
		$("#checkedDelete").click(function () {
			$("form").attr("action", $(this).attr("href")).submit();
			return false;
		});
		
		<!--实现批量删除-->
		$(".deleteOne").click(function () {
			$("form").attr("action", $(this).attr("href")).submit();
			return false;
		});
		
	});	
</script>

</head>
<body>
	<h3 align="center">员工列表展示</h3>
<form id="delete"  method="post" >
	<input type="hidden" name="_method" value="delete">	
	<table>
		<tr>
			<th><input id="topCheck" type="checkbox"></th>
<!-- 			<th>员工编号</th> -->
			<th>员工姓名</th>
			<th>员工密码</th>
			<th>员工电话</th>
			<th>员工性别</th>
			<th>员工部门</th>
			<th>操作(OPTION)<a href="${pageContext.servletContext.contextPath }/toAdd">添加员工</a></th>
		</tr>
		<c:forEach items="${pageInfo.list }" var="emp">
			<tr align="center">
			<td><input class="ids" name="eid" type="checkbox" value="${emp.eid }"></td>
				<%-- <td>${emp.eid}</td> --%>
				<td>${emp.eName}</td>
				<td>${emp.password}</td>
				<td>${emp.telephone}</td>
				<td>
					${emp.gender==0 ? '男':'女'}
				</td>
				<td>
					${emp.dept.dName}
				</td>
				<td><a href="${pageContext.servletContext.contextPath }/toUpdate/${emp.eid}">编辑</a>|<a class="deleteOne" href="${pageContext.servletContext.contextPath }/emp/${emp.eid}">删除</a></td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="7">${pages}&nbsp;&nbsp;&nbsp;<a id="checkedDelete" href="${pageContext.servletContext.contextPath }/emp">批量删除</a></td>
		</tr>
	</table>
</form>
</body>
</html>