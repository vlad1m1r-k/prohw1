<%@ page contentType="text/html; charset=UTF-8" %>
<html lang="ru">
<head>
    <meta contentType="text/html"; charset="UTF-8">
    <title>Простая анкета</title>
</head>
<body>
<center><h2>Заполните анкету!</h2></center>
<form action="anketa" method="post" target="_self">
<table>
    <tr>
        <td>Имя: </td><td><input type="text" maxlength="15" minlength="2" required name="firstname"></td>
        <td> Фамилия: </td><td><input type="text" maxlength="15" minlength="2" required name="lastname"></td>
        <td> Возраст: </td><td><input type="number" max="100" min="2" required name="age"></td>
    </tr>
</table>
    1. Количество атомов во вселенной?
    <br>
    <input type="radio" name="question1" value="RESPONSE1" required> Нормальное. <br>
    <input type="radio" name="question1" value="RESPONSE2" required> Приемлемое. <br>
    2. Температура солнца?
    <br>
    <input type="radio" name="question2" value="RESPONSE1" required> Средняя. <br>
    <input type="radio" name="question2" value="RESPONSE2" required> Положительная. <br> <br>
    <input type="submit" value="Отправить">
</form>
</body>
</html>
