<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Sign Up";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>

<%-- Begin Content --%>
    <%-- import any packages needed by the page --%>
	<%@ page import="java.io.*, javax.servlet.*, javax.servlet.http.*, java.util.*, java.text.*, java.util.Formatter, classes.*"%> 
   
   <%! 
        // declare an instance variable for the page
        int globalCount = 0;  // this is not thread-safe
		boolean userExist;
		String userHello;
		String formURL;
    %>
    <%!	
			String show = "";
			User signUser = null;
			String passWordForVerify;
        // declare a method for the page
            public void deserialize(String filepath) throws IOException
			{	
				try
				{
					FileInputStream fileIn = new FileInputStream(filepath);
					ObjectInputStream in = new ObjectInputStream(fileIn);
					signUser = (User) in.readObject();
					in.close();
					fileIn.close();
				}
				catch(IOException i)
				{
					return;
				}	
				catch(ClassNotFoundException c)
				{
					return;
				}
			}
			
    %>
    <%
		String userName = request.getParameter("userName");
		passWordForVerify = request.getParameter("passWord1");
        ServletContext sc = getServletContext();
        String path = sc.getRealPath("/Users/" + userName + ".ser");
		
		userExist = false;
		File fi = new File(path);
		if(fi.exists() && !fi.isDirectory())
		{
			// use the declared method
			this.deserialize(path);
			userExist = true;
		}
		else
		{
			userExist = false;
		}
		
        // update the instance variable
        globalCount++;  // this is not thread-safe

    %>
	
	<%!
					
		//verify password
			public boolean verifyPassWord()
			{
				return ((signUser.getPassWord()).equals(passWordForVerify));
			}
	%>
	
	<% 	if(userExist == true)
		{
			if(this.verifyPassWord())
			{
			if(signUser.getIsIIT() == 1)
				{
				show = "Signed in successfully! Welcome back to Hawk!";
				}
			else
				{
				show = "Signed in successfully!";
				}
			userHello = signUser.getEmailAddress();
			formURL = "index.jsp";
			}
			else
			{
			show = "Error! Invalid password! Please re-enter your password";
			formURL = "sign-in.jsp";
			userHello = "N/A";
			}
		}
		else
		{
			show = "Error! User doesn't exist!";
			formURL = "sign-in.jsp";
			userHello = "N/A";
		}
	%>
	

<div class="list">
	<p><%=show%></p>
    <p>Click Return to return to home page.</p>
	<%	
		formURL = response.encodeURL(formURL);
		synchronized(session) 
		{
			session.setAttribute("user", signUser);
		}
	%>
          <FORM ACTION="<%=formURL%>" class="user">
          <INPUT TYPE="SUBMIT" VALUE="Return">
		  </FORM>
</div>
<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>