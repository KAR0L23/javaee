<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Survey</title>
</head>
<body>

<h1>Ankieta:</h1>
<form action="sign-survey">
    <label for="name">Imię:</label>
    <input type="text" name="name" id="name" required="required" value="${sess_news.name}"><br>
 <br><label>Daty uzytkowania telefonu:</label><br>
    <label for="from">Od daty:</label>
    <input type="text" name="from" id="from" required="required" value="${sess_news.from}"><br>

    <label for="to">Do daty:</label>
    <input type="text" name="to" id="to" required="required" value="${sess_news.to}"><br>

    <br><label>Częstotliwość korzystania:</label><br>
    <input type="radio" name="frequency" value="kazdego dnia">Codziennie<br>
    <input type="radio" name="frequency" value="co tydzien">Co tydzień<br>
    <input type="radio" name="frequency" value="co miesiac">Co miesiąc<br>

    <br><label >Twoja ulubiona marka telefonu to:</label><br>
    <input type="checkbox" name="subjects" value="Apple">Apple<br>
    <input type="checkbox" name="subjects" value="Samsung">Samsung<br>
    <input type="checkbox" name="subjects" value="Sony">Sony<br><br>

    <input type="submit" value="Zapisz ankietę">
</form>

</body>
</html>
