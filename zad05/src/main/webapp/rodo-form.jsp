<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RODO</title>
</head>
<body>
<form action="rodo-check">
    <p>If you want to get to my shop, you have to accept privacy policy.</p>
    <label for="firstName">First name:</label>
    <input type="text" name="firstName" id="firstName" required="required"><br>

    <label for="lastName">Last name:</label>
    <input type="text" name="lastName" id="lastName" required="required"><br>

    <label for="email">E-mail:</label>
    <input type="text" name="email" id="email" required="required"><br>

    <label for="rodo">I accept privacy policy:</label>
    <input type="checkbox" name="rodo" id="rodo" required="required"><br>

    <input type="submit" value="Send">
</form>
</body>
</html>
