<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UFT-8">
<title>Insert title here</title>
<!-- 引入样式表 -->
<link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/index_work.css">
</head>
<body>
<h3 align="center">
	<c:if test="${empty emp.did}">添加员工</c:if>
	<c:if test="${not empty emp.did}">修改员工</c:if>
</h3>
	<form action="${pageContext.servletContext.contextPath }/toAdd" method="post">
		<table>
			<tr>
				<td>员工姓名</td>
				<td><input name=eName type="text"></td>
			</tr>
			<tr>
				<td>员工密码</td>
				<td><input name="password" type="password"></td>
			</tr>
			<tr>
				<td>员工电话</td>
				<td><input name="telephone" type="text"></td>
			</tr>
			<tr>
				<td>员工部门</td>
				<td>
					<select name="dept.did">
						<c:forEach items="${dList }" var="dept">
							<option value="${dept.did }">${dept.dName }</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit"></td>
			</tr>
		</table>
	
	</form>
</body>
</html>