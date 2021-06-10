<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/10/2021
  Time: 4:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Translation</title>
</head>
<body>
<form method="post">
    <center>
        <h1>Ứng dụng dịch</h1>
        <label>Từ muốn dịch</label>
        <input type="text" name="word" style="margin-bottom: 20px">
        <button type="submit">Dịch</button>
        <h3>Từ Tiếng Việt: ${result}</h3>
        <h4 style="color: red">${error}</h4>
    </center>
</form>
</body>
</html>
