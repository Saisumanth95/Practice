<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%


response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

response.setHeader("Pragma", "no-cache");

response.setDateHeader("Expires", 0); 

if(session.getAttribute("username") == null){
	
	response.sendRedirect("Login.jsp");
	
}


%>


Welcome ${username}

<a href = "videos.jsp"> Videos link </a>

<br>


<form action = "logout">

<input type="submit" value="logout">

</form>







</body>
</html>