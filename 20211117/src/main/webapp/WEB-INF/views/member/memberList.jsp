<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
	function authorEdit(str, button) {
		var id = str;
		var author = $(button).parent().parent().children(':nth-child(5)').children().val();
		//console.log($(button).parent().parent().children(':nth-child(5)').children().val());
		
		alert(id + "를 선택하셨습니다." + author);
		
		// ajax로 처리 해야 하는 부분
		$.ajax({
			url: "ajaxAuthorUpdate.do",
			type: "post",
			data: {id: id, author: author},
			dataType: "text",
			success: function(data) {
				if(data == "yes") {
					alert(id + '님의 권한이 변경했습니다.');
				} else {
					alert(id + '님의 권한변경이 실패했습니다.');
				}
			}
		});
	}
</script>
</head>
<body>
	<jsp:include page="../home/header.jsp" />
	<div align="center">
		<div>
			<h1>멤 버 목 록</h1>
		</div>
		<div>
			<table border="1">
				<tr>
					<th width="150">아 이 디</th>
					<th width="150">이 름</th>
					<th width="150">전화번호</th>
					<th width="400">주 소</th>
					<th width="100">권 한</th>
					<th width="100">권한수정</th>
				</tr>
				<c:forEach items="${members }" var="member">
					<tr>
						<td align="center">${member.id }</td>
						<td align="center">${member.name }</td>
						<td align="center">${member.tel }</td>
						<td>&nbsp;${member.address }</td>
						<td align="center">
							<select id="author" name="author">
								<c:if test="${member.author eq 'ADMIN' }">
									<option value="ADMIN" selected="selected">ADMIN</option>
									<option value="USER">USER</option>
								</c:if>
								<c:if test="${member.author eq 'USER' }">
									<option value="ADMIN">ADMIN</option>
									<option value="USER" selected="selected">USER</option>
								</c:if>
							</select>
						</td>
						<td align="center">
							<button type="button" onclick="authorEdit('${member.id }', this)">변경</button>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<br>
		<button type="button" onclick="location.href='home.do'">홈으로</button>
	</div>
</body>
</html>