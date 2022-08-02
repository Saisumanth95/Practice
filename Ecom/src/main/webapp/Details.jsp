<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="com.gap.Dao" %>

<%@ page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<%

String type = request.getParameter("type");

System.out.println("Test " + type);

Dao dao = new Dao();


ResultSet resultSet = dao.getDetails(type);

%>


<TABLE BORDER="1">
      <TR>
      <TH>Product Name</TH>
      <TH>Product ID</TH>
      <TH>Product type</TH>
      <TH>Price</TH>
      
      </TR>
      <% while(resultSet.next()){ %>
      <TR>
       <TD> <%= resultSet.getString(1) %></td>
       <TD> <%= resultSet.getString(2) %></TD>
       <TD> <%= resultSet.getString(3) %></TD>
       <TD> <%= resultSet.getString(4) %></TD>
      </TR>
      <% } %>
     </TABLE>



</body>
</html>