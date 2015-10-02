<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%@ page import="java.io.*, javax.servlet.*, javax.servlet.http.*, java.util.*, java.text.*, classes.*"%> 
	<%
			User userOut = null;	
		synchronized(session) 
		{
			session.setAttribute("user", userOut);
			session.setAttribute("customerInfo",null);
			session.setAttribute("creditCard",null);
		}
	%>

<%! String title = "RedHawk Music - Sign Out";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>

<%-- Begin Content --%>
<div class="list">
    <p>You have successfully signed out. </p>
	<FORM ACTION="index.jsp" class="user">
    <INPUT TYPE="SUBMIT" VALUE="Return">
	</FORM>
</div>
<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>