<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Статистика опрошенных</title>
</head>
<body>
<h2>Статистика опрошенных</h2>
<br>
<table border="1">
    <tr>
        <td>Количество опрошенных:</td>
        <td> ${totalResponders}</td>
    </tr>
    <tr>
        <td>Средний возраст Опрошенных:</td>
        <td>${averageAge}</td>
    </tr>
    <tr>
        <td>Количество атомов во вселенной</td>
        <td>Нормальное: ${question1Answer1}
            (<%= (int) (((float) (int) request.getAttribute("question1Answer1") / (float) (int) request.getAttribute("totalResponders")) * 100) %>
            %)
        </td>
    </tr>
    <tr>
        <td></td>
        <td>Приемлемое: ${question1Answer2}
            (<%= (int) (((float) (int) request.getAttribute("question1Answer2") / (float) (int) request.getAttribute("totalResponders")) * 100) %>
            %)
        </td>
    </tr>
    <tr>
        <td>Температура солнца</td>
        <td>Средняя: ${question2Answer1}
            (<%= (int) (((float) (int) request.getAttribute("question2Answer1") / (float) (int) request.getAttribute("totalResponders")) * 100) %>
            %)
        </td>
    </tr>
    <tr>
        <td></td>
        <td>Положительная: ${question2Answer2}
            (<%= (int) (((float) (int) request.getAttribute("question2Answer2") / (float) (int) request.getAttribute("totalResponders")) * 100) %>
            %)
        </td>
    </tr>
</table>
</body>
</html>