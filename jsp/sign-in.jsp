<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Sign In";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>

<%-- Begin Content --%>
<div class="list">
    <p>We are happy to see you again! Please sign in to enjoy music. </p>
	<form action="UserVerification.jsp" method="get">
    <ul class="user">
		<li>Username<br><input type="text" name="userName"></td></li>
		<li>Password<br><input type="PASSWORD" name="passWord1"></td></li>
		<li><input type="submit" value="Sign In"></li>
    </form>
</div>
<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>