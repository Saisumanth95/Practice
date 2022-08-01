<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

    
<!DOCTYPE html>
<html>
<head>
<title>Shop</title>

</head>
<body>

<% 
if(session.getAttribute("username") == null){
	
	response.sendRedirect("Login.jsp");
	
}

%>


<br>

<form action="Details.jsp">
  <label for="Product">Choose product type:</label>
  <select name="type" id="type">
    <option value="all">All</option>
    <option value="Mobile">Mobiles</option>
    <option value="clothes">Clothes</option>
    <option value="laptop">Laptop</option>
    <option value="cars">Cars</option>
    <option value="bikes">Bikes</option>
  </select>
  <br><br>
  <input type="submit" value="Submit">
</form>



<form action = "logout">

<input type="submit" value="logout">

</form>

</body>
</html>