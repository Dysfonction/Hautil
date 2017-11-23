<%--
  Created by IntelliJ IDEA.
  User: Christophe
  Date: 07/11/2017
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<h1>Entrez vos informations : </h1>
<form action="/BDD" method="post">
  <div>
    <label for="nom">Nom :</label>
    <input type="text" id="nom" name="nom" />
  </div>
  <div>
    <label for="age">Age :</label>
    <input type="text" id="age" name="age" />
  </div>
  <div>
    <input type="submit" name="submit" value="Envoyer" />
  </div>
</form>
</body>
</html>
