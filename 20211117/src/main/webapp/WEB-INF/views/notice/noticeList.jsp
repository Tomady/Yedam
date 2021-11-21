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
	$(function() {
		$('tr').click(function() {
			var no = $(this).children(':nth-child(1)').text()
			console.log(no);

			$.ajax({
				url : "ajaxNoticeLookUp.do",
				type : "post",
				data : {
					no : no
				},
				dataType : "text",
				success : tr_clickFncCallback,
				error : function() {
					console.log("ajax = error");
				}
			});
		});

		function tr_clickFncCallback(data) {
			console.log(data);
			var ary = [];
			ary = data.split(',');

			var ck = $('#selTable');
			if(Object.keys(ck) != 0) {
				ck.parent().remove();
				console.log('not null');
			}
			
			var div = $('<div />');
			div.appendTo($('body').children(':nth-child(5)'));

			var h2 = $('<h2 />');
			h2.text('세부내용 조회');
			h2.appendTo(div);
			
			var table = $('<table />');
			table.attr('border', '1');
			table.attr('id','selTable');
			table.appendTo(div);

			var fields = ['No','아이디','작성자','작성일자','제 목','내 용','원본파일','물리파일'];
			for(var field of fields) {
				var tr = $('<tr />');
				tr.appendTo(table);
				var th = $('<th />');
				th.text(field);
				th.appendTo(tr);
			}
			
			console.log(ary.length);

			for(var i=1; i<=ary.length; i++) {
				var str = ':nth-child(' + i + ')';
				var tr = $('#selTable').children(str);
				var td = $('<td />');
				td.text(ary[i-1]);
				td.appendTo(tr);
			}
		}
	});
</script>
</head>
<body>
	<jsp:include page="../home/header.jsp" />
	<div align="center">
		<div>
			<h1>공지사항 리스트</h1>
		</div>
		<div>
			<table border="1">
				<tr>
					<th width="70">No</th>
					<th width="100">작성자</th>
					<th width="200">제 목</th>
					<th width="100">작성일자</th>
					<th width="200">첨부파일</th>
				</tr>
				<c:forEach items="${notices }" var="notice">
					<tr>
						<td align="center">${notice.no }</td>
						<td align="center">${notice.name }</td>
						<td align="center">${notice.title }</td>
						<td align="center">${notice.wdate }</td>
						<td align="center">${notice.fileName }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<br>
		<div>
			<c:if test="${not empty id }">
				<button type="button" onclick="location.href='noticeForm.do'">글쓰기</button>
			</c:if>
		</div>
		<br>
	</div>
</body>
</html>