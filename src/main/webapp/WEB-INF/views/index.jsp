<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="pl">

<body>
<form:form modelAttribute="numbers" action="/" method="post">
    <input type="text" name="numbers" placeholder="ciąg cyfr"/>
    <button type="submit">Zatwierdź</button>
</form:form>
</body>
</html>