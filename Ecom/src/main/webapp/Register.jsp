<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Customer</title>
</head>
<body>

<form action = "register" method = "post">

Enter username : <input type = "text" name = "uname" required><br>
Enter password : <input type = "password" name = "pass" required><br>
Re Enter password : <input type = "password" name = "repass" required><br>
Enter Full name : <input type = "text" name = "fullname" required><br>
Enter Email : <input type = "email" name = "email" required><br>
Re Enter Email : <input type = "email" name = "reemail" required><br>
Enter Phone no : <input type = "tel" name = "phone" required><br>
Enter Address : <input type = "text" name = "address" required><br>

<input type = "submit" value = "submit">



<%

            if(session.getAttribute("errorRegister")!= null){%>



                <div class= "alert alert-danger"><strong>Error!</strong>Enter same Email or Password</div>
                
                
                <%session.removeAttribute("errorResgister"); %>

            <% }

        %>
        
        
        <%

            if(session.getAttribute("errorUsername")!= null){%>



                <div class= "alert alert-danger"><strong>Error!</strong>Re Enter another User name</div>
                
                
                <%session.removeAttribute("errorUsername"); %>

            <% }

        %> 




</body>
</html>