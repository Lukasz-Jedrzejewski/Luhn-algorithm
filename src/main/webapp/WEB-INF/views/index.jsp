<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="pl">

<body>
<div style="margin: auto; width: 50%; background-color: #666666; color: white; text-align: center; font-size: 30px">
<form:form modelAttribute="numbers" action="/" method="post">
    <input type="text" name="numbers" placeholder="ciąg cyfr"/>
    <button type="submit">Zatwierdź</button>
</form:form>
</div>
</body>
</html>