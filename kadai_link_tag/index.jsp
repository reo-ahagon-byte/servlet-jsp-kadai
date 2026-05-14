<%@ page contentType="text/html; charset=UTF-8" %>
<html>
	<head>
	   <title>Servlet/JSPの基礎を学ぼう</title>
	</head>
	<body>
	   <a href="<%= request.getContextPath() %>/index?name=Servletからデータを受信しました:侍太郎さん、こんにちは！">名前「侍太郎」をServletに送信</a>
	   <p>${name}</p>
	</body>
</html>