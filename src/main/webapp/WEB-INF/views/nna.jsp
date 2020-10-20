<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="pl">

<body>
<div style="margin: auto; width: 50%; background-color: #666666; color: white; text-align: center; font-size: 30px">
<h2>${coordinates.quantity}</h2>
<form:form modelAttribute="coordinates" action="/nna-coordinates" method="post">
<div class="nna-container-x" style="float: left; width: 33%">
<script>
    var containerX = document.querySelector(".nna-container-x");
    for (var i = 0; i < ${coordinates.quantity}; i++) {
            var newInputX = document.createElement("input");
            newInputX.setAttribute("type", "text");
            newInputX.setAttribute("name", "xParameter");
            newInputX.setAttribute("id", "formX"+i);
            newInputX.placeholder="x";
            containerX.appendChild(newInputX);
            containerX.appendChild(document.createElement("br"));
        }
</script>
</div>
<div class="nna-container-y" style="float: left; width: 33%">
<script>
    var containerY = document.querySelector(".nna-container-y");
    for (var i = 0; i < ${coordinates.quantity}; i++) {
            var newInputY = document.createElement("input");
            newInputY.setAttribute("type", "text");
            newInputY.setAttribute("name", "yParameter");
            newInputY.setAttribute("id", "formY"+i);
            newInputY.placeholder="y";
            containerY.appendChild(newInputY);
            containerY.appendChild(document.createElement("br"));
        }
</script>
</div>
<div class="nna-container-name" style="float: left; width: 33%">
<script>
    var containerName = document.querySelector(".nna-container-name");
    for (var i = 0; i < ${coordinates.quantity}; i++) {
            var newInputName = document.createElement("input");
            newInputName.setAttribute("type", "text");
            newInputName.setAttribute("name", "name");
            newInputName.setAttribute("id", "formName"+i);
            newInputName.placeholder="name";
            containerName.appendChild(newInputName);
            containerName.appendChild(document.createElement("br"));
        }
</script>
</div>
<div style="clear: both">
    <button type="submit">Zatwierdź</button>
</div>
</form:form>
</div>
</body>
</html>