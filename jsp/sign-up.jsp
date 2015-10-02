<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Join RedHawk Music";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>

<%-- Begin Content --%>
<div class="list">
    <p>To join our members list, enter your email address and
     create your user account below. <br>
     Then, click on the Submit button.</p>

    <form action="DisplaySignedup.jsp" method="get">
    <ul class="user">
		<li>Email address<input type="email" name="emailAddress"></li>
        <li>Username<input type="text" name="userName"></li>
        <li>Password<input type="PASSWORD" name="passWord1"></li>
        <li>Re-enter Password<input type="PASSWORD" name="passWord2"></li>
		<li>IIT Student?<input type="RADIO" name="isIIT" value="1" CHECKED>Yes<input type="RADIO" name="isIIT" value="-1" CHECKED>No</li>
        <li><input type="submit" value="Submit"></li>
	</ul>
    </form>
</div>
<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>
