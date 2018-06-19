<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Person Information</title>
</head>
<body bgcolor="pink">
<center><h1> <font color="red"> Output Page </font> </h1>
<br>
<table>
<tr><td><font color="purple">================Person Information: ==================</font><br><br></td></tr>
<tr><td><font color="green">First Name: </font><%=session.getAttribute("firstName") %> </br></td></tr>
<tr><td><font color="green">Last Name: </font><%=session.getAttribute("lastName") %></br></td></tr>
<tr><td><font color="green">Middle Name: </font><%=session.getAttribute("middleName") %></br></td></tr>
<tr><td><font color="green">Gender: </font><%=session.getAttribute("gender")%> </br></td></tr>
<br>
<br>
<tr><td><font color="purple">================ Contact Information: ==================</font><br><br></td></tr>
<tr><td><font color="green">Address: </font><%=session.getAttribute("address")%> </br></td></tr>
<tr><td><font color="green">City: </font><%=session.getAttribute("city")%> </br></td></tr>
<tr><td><font color="green">State: </font><%=session.getAttribute("state")%> </br></td></tr>
<tr><td><font color="green">Country: </font><%=session.getAttribute("country")%> </br></td></tr>
<tr><td><font color="green">Phone: </font><%=session.getAttribute("phone")%> </br></td></tr>
<br>
<br>
<tr><td><font color="purple">================ Bank Information: ==================</font><br><br></td></tr>
<tr><td><font color="green">Bank Name: </font><%=session.getAttribute("bankName")%> </br></td></tr>
<tr><td><font color="green">Bank Account: </font><%=session.getAttribute("account")%> </br></td></tr>
<tr><td><font color="green">SSN: </font><%=session.getAttribute("ssn")%> </br>
</table>
<br>
<br>
</center>
</body>
</html>