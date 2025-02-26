<%-- page is used to display the result of an action/calculcation such as adding 2 numbers
 After user submits form on index.jsp the controller receives the data, performs additions and redirects to the
 'result' view. Controller method add is triggered when user submits form and it calculates the result, the result
 is then passed to the model and displayed on result.jsp page. Essentially result.jsp displays outcome of operation--%>

<%@page language="java" %>

<html>
<head>
<head>
  <link rel="stylesheet" href="style.css">
</head>

</head>
    </body>
        <h2> Result is : ${result} </h2>



</body>
    </html>