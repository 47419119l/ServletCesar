<%--
  Created by IntelliJ IDEA.
  User: 47419119l
  Date: 12/04/16
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cesar Servlet</title>
</head>
<body>
<h1>Tots som el Cesar</h1>
<p>Introdueix la frase de la qual vols fer Cesar</p>
<form action="Cesar" method="POST">
    <input name="value" type="text"/>
    <input type="submit" value="OK"/>
</form>
</body>
</html>
