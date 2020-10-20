<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="pl">

<body>
<div style="margin: auto; width: 50%; background-color: #666666; color: white; text-align: center; font-size: 30px">
<h2>Podaj współrzędne</h2>
<form:form modelAttribute="coordinates" action="/nna-coordinates" method="post">
<div>
    <input type="text" name="xParameter" placeholder="x"/>
    <input type="text" name="yParameter" placeholder="y"/>
    <input type="text" name="name" placeholder="name"/>
</div>
<div>
    <button type="submit">Zatwierdź</button>
</div>
</form:form>
</div>
</body>
</html>