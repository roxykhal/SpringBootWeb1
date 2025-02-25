<%-- create HTML project here, IN MVV, Index.jsp is a view and request goes to controller, so we need to create a
controller to send this to --%>

<%@page language="java" %>

<html>
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