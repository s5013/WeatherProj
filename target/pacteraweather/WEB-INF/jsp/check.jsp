<%@include file="header.jsp" %>

<div id="nav">
Check Weather<br>
</div>
<div id="session">
<%--      <form:form method="post" action="check.html" modelAttribute="weatherInput">
        <table>
            <tr>
                <td>City: </td>
                    <form:select path="city">
                        <form:options items="${cityList}" />
                    </form:select>
            </tr>

            <tr>
                <td></td>
                <td><form:submit value="submit"/></td>
            </tr>
        </table>
    </form:form>--%>
            <form action="result.html" method="post">
            <p>City: <input type="text" name="city" /></p>
            <p>                    <form:select path="city">
                                       <form:options items="${cityList}" />
                                   </form:select></p>
            <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
        </form>
</div>
<%@include file="footer.jsp" %>