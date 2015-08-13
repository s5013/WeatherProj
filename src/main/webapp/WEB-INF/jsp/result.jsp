<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="header.jsp" %>

<div id="main-wrap">
    <div id="sidebar">  City Weather </div>
        <table>
        <div id="content-wrap"
        <tr><th>City</td><td>${result.city}</td></tr>
        <tr><th>Update Time</td><td>${result.date}</td></tr>
        <tr><th>Weather</td><td>${result.desc}</td></tr>
        <tr><th>Tempature</td><td>${result.tempInC}&#8451; / ${result.tempInF}&#8457;</td></tr>
        <tr><th>Wind</td><td>${result.wind} km/h</td></tr>
        </div>
        </table >

        <form:form action="check.html" method="post" commandName="weather">
            <p><input type="submit" value="Check Another City" /></p>
        </form:form>

</div>
<%@include file="footer.jsp" %>