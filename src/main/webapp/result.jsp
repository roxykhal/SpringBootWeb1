<%-- create HTML project here, IN MVV, Index.jsp is a view and request goes to controller, so we need to create a
controller to send this to --%>

<%@page language="java" %>

<html>
<head>
<head>
  <link rel="stylesheet" href="style.css">
</head>

</head>
    </body>
        <h2> Result is : <%= session.getAttribute("result") %>  </h2>



</body>
    </html>