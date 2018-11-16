<%--
  Created by IntelliJ IDEA.
  User: ktomczyk
  Date: 16/11/2018
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dziekuje!</title>
</head>
<body>
<jsp:useBean id="sess_news" class="pl.ktomczyk.javaee.kolokwium1.domain.Survey" scope="session" />

<h1>Dziękujemy za wypelnienie ankiety ${sess_news.name} </h1>


<a href="survey.jsp"><button>Ustawienia</button></a>
<a href="surveys"><button>Ankiety</button></a>

</body>
</html>
