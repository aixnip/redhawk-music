<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%@ page import="java.io.*, javax.servlet.*, javax.servlet.http.*, java.util.*, java.text.*, classes.*"%> 
	<%
			User user;
			String showUser;
			boolean guest;
			
	 synchronized(session) 
		{
			user = (User)session.getAttribute("user");
		}	

		if(user != null)
		{	
			//use "showUser" to show user's name
			showUser = user.getUserName();
			guest = false;
		}
		else
		{
			showUser = "Guest";
			guest = true;
		}
		synchronized(session) 
		{
			session.setAttribute("user", user);
		}
	%>

<%-- Begin Header --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "DTD/xhtml1-transitional.dtd">

<html>
<head>
 	<title><%=title%></title>
 	<link rel="stylesheet" href="../src/stylesheet/main.css">
	<script type='text/javascript' src='../src/script/javascript.js'></script>
</head>
<body>
	<header>
		<div class="content">
		<a href="index.jsp"><h1>RedHawk Music</h1></a>
		<div id="menu">
			<%if(guest)
			{
				%>
				<a href='sign-in.jsp' >Sign In</a>/
				<a href='sign-up.jsp' >Sign Up</a>
			
				<%}else{%>
				<span><a href="ManageAccount.jsp">Hi, <%=showUser%></a></span>
				<small><a href="sign-out.jsp">Sign Out</a></small>
				<a href="music-list.jsp" >Music List</a>
				<%}%>
		</div>
		<form action="../AutoComplete"><input type="text" id="completion-field" onkeyup="doCompletion()" name="keyword"><input type="submit" value="Search"></form>
		<div id="suggestions"></div>
	</div>
	</header>

<%-- End Header --%>