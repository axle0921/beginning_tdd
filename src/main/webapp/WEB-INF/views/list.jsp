<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>주소록</title>
<script>
function toRemove(id) {
	var form = document.listForm;
	
	if (confirm("정말 삭제하시겠습니까?")) {
		form.id.value = id;
		form.action = "/remove";
		form.submit();
	}
}

function toAdd() {
	var form = document.additionForm;
	form.action = "/add";
	form.submit();
}
</script>
</head>
<body>
<table width="400" border="1" cellspacing="0" cellpadding="0">
<form name="listForm" method="post">
<input type="hidden" name="id">
	<colgroup>
		<col width="200">
		<col width="100">
		<col width="100">
	</colgroup>
	<tr>
		<td align="center">이름</td>
		<td align="center">나이</td>
		<td align="center">삭제</td>
	</tr>
<c:forEach var="address" items="${addresses}" varStatus="loop">
	<tr>
		<td align="center">${address.name}</td>
		<td align="center">${address.age}</td>
		<td align="center"><input type="button" value="삭제" onclick="toRemove(${address.id})"></td>
	</tr>
</c:forEach>
<c:if test="${empty addresses}" >
	<tr>
		<td colspan="2" align="center">등록된 정보가 없습니다.</td>
	</tr>
</c:if>	
</form>
</table>
<br>
<table width="400" border="1" cellspacing="0" cellpadding="0">
<form name="additionForm" method="post">
	<tr>
		<td align="center">이름</td>
		<td align="center"><input type="text" name="name" style="width:180px"></td>
		<td align="center">나이</td>
		<td align="center"><input type="text" name="age" style="width:90px"></td>
	</tr>
	<tr>
		<td align="center" colspan="4" height="30">
			<input type="button" value="추가" style="width:100px;" onclick="toAdd()">
		</td>
	</tr>
</form>
</table>
</body>
</html>