<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a phone</title>
</head>
<body>
<jsp:useBean id="phone" class="com.example.servletdemo.domain.Phone" scope="session" />

<jsp:setProperty name="phone" property="*" /> 

<jsp:useBean id="storage" class="com.example.servletdemo.service.StorageService" scope="application" />

<% 
  storage.addToDatabase(phone);
%>

<p>Following phone has been added to storage: </p>
<p>Produecr: ${phone.producer} </p>
<p>Date of production: <jsp:getProperty name="phone" property="productionDate"></jsp:getProperty></p>
<p>
  <a href="showAllPhones">Show all phones</a>
</p>
</body>
</html>
