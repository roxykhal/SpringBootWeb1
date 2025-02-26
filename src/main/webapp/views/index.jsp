<%-- landing page of initial entry of app, when controller method home() is called it returns index, the controller will
 render index.jsp which may have a form like below to add numbers

--%>

<%@page language="java" %>

<html>
<head>
<head>
  <link rel="stylesheet" href="style.css">
</head>

</head>
    </body>
        <h2>Roxy calculator</h2>

          <form action="add">
                <label for="num1">Enter 1st Number: :</label>
                <input type="text" id="num1" name="num1"><br><br>

                <label for="num2">Enter 2nd Number:</label>
                <input type="text" id="num2" name="num2"><br><br>

                <input type="submit" value="Submit">
            </form>

</body>
    </html>