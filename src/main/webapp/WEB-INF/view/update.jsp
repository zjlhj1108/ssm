<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
	<c:if test="${empty emp.eid}">添加员工</c:if>
	<c:if test="${not empty emp.eid}">修改员工</c:if>
</h3>
	<form:form action="${pageContext.servletContext.contextPath }/emp" method="post" modelAttribute="emp">
		<c:if test="${not empty emp.eid}">
			<input type="hidden" name="_method" value="put">
			<form:hidden path="eid"/>
		</c:if>
		<table>
			<tr>
				<td>员工姓名</td>
				<td><form:input path="eName" /></td>
			</tr>
			<tr>
				<td>员工密码</td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td>员工电话</td>
				<td><form:input path="telephone"/></td>
			</tr>
			<tr>
				<td>员工性别</td>
				<td><form:radiobuttons path="gender" items="${genderMap }"/></td>
			</tr>
			<tr>
				<td>员工部门</td>
				<td>
				<form:select path="dept.did" items="${ dList}" itemLabel="dName" itemValue="did">
				</form:select>	
					<%-- 	<select>
						<c:forEach items="${dList }" var="dept">
							<option value="${dept.did }">${dept.dName }</option>
						</c:forEach>
					</select> --%>
				</td>
			</tr>
			<tr>
				<td colspan="2">
				
				<c:if test="${empty emp.eid}"><input type="submit" value="添加"></c:if>
				<c:if test="${not empty emp.eid}"><input type="submit" value="修改"></c:if>				
				</td>
			</tr>
		</table>
	</form:form>
	<%-- <form action="${pageContext.servletContext.contextPath }/emp" method="post">
		<table>
			<tr>
				<td>员工姓名</td>
				<td><input name="eName" type="text"></td>
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
	
	</form> --%>
</body>
</html>