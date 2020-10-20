<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="pl">

<body>
<div style="margin: auto; width: 50%; background-color: #666666; color: white; text-align: center; font-size: 30px">
<div>
Cyfry:
<br>
${numbers}
</div>
<br>
<div>
Wynik:
<br>
<c:if test="${result == false}">Numer nieprawidłowy</c:if>
<c:if test="${result == true}">Numer prawidłowy</c:if>
</div>
<br>
<div>
Cyfra kontrolna:
<br>
${checkDigit}
</div>
</div>
</body>
</html>