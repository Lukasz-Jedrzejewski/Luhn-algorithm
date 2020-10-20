<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pl">

<body>
<div style="margin: auto; width: 50%; background-color: #666666; color: white; text-align: center; font-size: 30px">
<h2>Wybierz punkt początkowy</h2>
<c:forEach items="${list}" var="item">
<div>
<form action="/nna-algorithm/${item.name}" modelAttribute="coordinates" method="get">
    <input type="submit" value="${item.name}">
</form>
</div>
</c:forEach>
<h2>Lub</h2>
<form action="/nna">
    <input type="submit" value="dodaj kolejny">
</form>
</div>
</body>
</html>