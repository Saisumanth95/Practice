<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<form action = "login" method = "post">

Enter username : <input type = "text" name = "uname"><br>
Enter password : <input type = "password" name = "pass"><br>
<input type = "submit" value = "Login">

<br> 
<a href = 'Register.jsp'>Not yet Registered?</a>


</form>


<%

            if(session.getAttribute("error")!= null){%>



                <div class= "alert alert-danger"><strong>Error!</strong>Invalid User Name or Password.</div>
                
                
                <%session.removeAttribute("error"); %>
                

            <% }

        %>


</body>
</html>