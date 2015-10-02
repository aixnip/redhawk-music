<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Sign Up";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>

<%-- Begin Content --%>
    <%-- import any packages needed by the page --%>
<%@ page import="classes.*, business.*, data.*, java.util.Date, java.io.*, java.io.FileInputStream" %>
	<%@ page import="java.io.*, javax.servlet.*, javax.servlet.http.*, java.util.*, java.text.*"%> 
    	
    <%!
        SerializeUser sUser;
		String userHello;
		String show;
		String showDate;
		String formURL;
		boolean isEmail;
		boolean isPassword;
		boolean userExist;
		String passwordMessage;
		int isIIT;
    %>
	
	<%!
		public boolean isValidEmailAddress(String email) 
		{
			String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
			java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
			java.util.regex.Matcher m = p.matcher(email);
			return m.matches();
		}
		
		public void checkPasswordStrength(String password)
		{
			if(password == null || password.trim().isEmpty())
			{
				passwordMessage = "Password cannot be empty";
				isPassword = false;
			}
			else if (password.length() < 8)
			{
				passwordMessage = "Password is too short. Must be at least 8 characters long.";
				isPassword = false;
			}
			else
			{
				isPassword = true;
			}
		}
	%>
    <%
		ArrayList<Order> order = new ArrayList<Order>();
		CustomerInfo userinfo = new CustomerInfo();
		CreditCard card = new CreditCard();
        String userName = request.getParameter("userName");
		isIIT = Integer.parseInt(request.getParameter("isIIT"));
        String passWord = request.getParameter("passWord1");
		String passWordIsEqual = request.getParameter("passWord2");
        String emailAddress = request.getParameter("emailAddress");

        ServletContext sc = getServletContext();
        String path = sc.getRealPath("/Users/" + userName + ".ser");
		
        User aUser = new User(isIIT, userName, passWord, emailAddress, order, userinfo, card);
		
		isEmail = this.isValidEmailAddress(emailAddress);
		this.checkPasswordStrength(passWord);
		
		userExist = false;
		File fi = new File(path);
		if(fi.exists() && !fi.isDirectory())
		{
			userExist = true;
		}
		
        // 
		if((userExist == false) && (passWord.equals(passWordIsEqual)) && (isEmail == true) && (isPassword == true) && (userName != null && !(userName.trim().isEmpty())))
		{
			sUser.serialize(aUser, path);
			userHello = aUser.getUserName();
			show = "Thanks for joining our members list, your username is: " + userHello;
			formURL = "index.jsp";
			showDate = "This username was added to our list on " + new Date();
		}
		else if(userExist == true)
		{
			show = "Username exists, please select a different username!";
			formURL = "sign-up.jsp";
			showDate = "";
		}
		else if(isEmail == false)
		{
			show = "Invalid email format, please press RETURN and re-enter email";
			formURL = "sign-up.jsp";
			showDate = "";
		}
		else if(isPassword == false)
		{
			show = passwordMessage;
			formURL = "sign-up.jsp";
			showDate = "";
		}
		else if(userName == null || (userName.trim().isEmpty()))
		{
			show = "Username cannot be empty";
			formURL = "sign-up.jsp";
			showDate = "";
		}
		else if(!passWord.equals(passWordIsEqual))
		{
			show = "The passwords that you entered cannot be mathed, please press RETURN and re-enter password";
			formURL = "sign-up.jsp";
			showDate = "";
		}
    %>
	
	
	<div class="list">
		<p><%= show %></p>


  <p>Click Return to return to home page.</p>
	<%	
		formURL = response.encodeURL(formURL);
		synchronized(session) 
		{
			session.setAttribute("user", aUser);
		}
	%>
          <FORM ACTION="<%=formURL%>" class="user">
          <INPUT TYPE="SUBMIT" VALUE="Return">
		  </FORM>

    <p>
        <%= showDate %><br>
    </p>
</div>

<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>