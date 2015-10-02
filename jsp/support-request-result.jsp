<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Support Request";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>

<%-- Begin Content --%>

<!-- import packages and classes needed by the scripts -->
<%@ page import="java.io.*, java.util.Date" %>

    <%
        // get parameters from the request
        String name = request.getParameter("s_name");
        String email = request.getParameter("s_email");
        String phone = request.getParameter("s_phone");
		String location = request.getParameter("s_location");
        String userName = request.getParameter("s_username");
        String contactMethod = request.getParameter("s_contactmethod");
        String problem = request.getParameter("SSel");
        String comments = request.getParameter("s_comments");
		
		String fileName = "../Support/" + userName + "_support.txt";
		File fi = new File(fileName);
		if(fi.exists() && !fi.isDirectory())
		{
			fileName = "../Support/" + userName + "_1" + "_support.txt";
		}
		try 
		{	
			//instantiate output file
			FileWriter fileOut = new FileWriter(fileName);
			BufferedWriter output = new BufferedWriter(fileOut);
			output.write(name);output.newLine();
			output.write(email);output.newLine();
			output.write(phone);output.newLine();
			output.write(location);output.newLine();
			output.write(userName);output.newLine();
			output.write(contactMethod);output.newLine();
			output.write(problem);output.newLine();
			output.write(comments);
			output.close();
		}
		catch (IOException e) 
		{
            System.err.println("Problem writing to the file userName.txt");
        }
    %>
	
<div class="list">
    <h2>Your submission has been received!</h2>

    <p>You will get a response within one business day.</p>

    <p>To return our home page, click on the Return button shown <br>
    below.</p>

    <form action="index.jsp" method="get">
        <input type="submit" value="Return">
    </form>

    <p>This request was added to our support list on <%= new Date() %>.</p>
</div>


<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>