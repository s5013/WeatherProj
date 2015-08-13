<%@include file="header.jsp" %>

<div id="main-wrap">
    <div id="sidebar">  Please select city </div>
    <div id="content-wrap">

              <form:form action="result.html" method="post" commandName="weather">
                <p><form:select path="city" items="${cityList}" /> </p>
                <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
            </form:form>
    </div>
</div>
<%@include file="footer.jsp" %>