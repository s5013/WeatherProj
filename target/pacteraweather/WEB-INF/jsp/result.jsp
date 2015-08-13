<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="header.jsp" %>

<div id="nav">
Result<br>
</div>
<h2>${result.city}</h2>
<div id="section">
<table>
<tr><td>City</td><td>${result.city}</td></tr>
<tr><td>Update Time</td><td>${result.date}</td></tr>
<tr><td>Weather</td><td>${result.desc}</td></tr>
<tr><td>Tempature</td><td>${result.tempInC}&#8451; / ${result.tempInF}&#8457;</td></tr>
<tr><td>Wind</td><td>${result.wind}</td></tr>
</table>

<I></h2>
</div>

<%@include file="footer.jsp" %>