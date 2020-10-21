<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="pl">

<body>
<div style="margin: auto; width: 50%; background-color: #666666; color: white; text-align: center; font-size: 30px">
    <h2>droga</h2>
        ${road}
        <br>
    <h2>odległość między punktami</h2>
        ${length}
    <form action="/">
        <input type="submit" value="start">
    </form>
</div>
</body>
</html>