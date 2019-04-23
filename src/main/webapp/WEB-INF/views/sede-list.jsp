<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <!--<meta http-equiv='X-UA-Compatible' content='IE=edge'>-->
    <title>Sedes</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <!--<script src='main.js'></script>-->
</head>
<body>

<h1>Lista de sedes existentes</h1>
<ul>
    <c:forEach var="sede" items="${sedes}">

        <li>[${sede.id}] ${sede.nome}: ${sede.cidade}</li>

    </c:forEach>
</ul>
    
</body>
</html>