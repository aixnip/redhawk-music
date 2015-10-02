<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Payment Info";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>
<%@ page import="java.io.*, javax.servlet.*, javax.servlet.http.*, java.util.*, java.text.*, classes.*"%> 
	
<%!
	ArrayList cart;
	User aUser;
%>

<%
    synchronized(session) 
	{	
		cart = (ArrayList)session.getAttribute("shoppingCart");
		session.setAttribute("shoppingCart", cart);
		aUser = (User) session.getAttribute("user");
	}
	
	if (aUser == null)
	{
		aUser = new User();
	}
%>	

<%-- Begin Content --%>
<div class="list">
    <H2>Payment method <br></H2>

    <form action="review.jsp" method="get">
    <ul class="user">
		<li>Please select a payment method<BR><select name="cardType">
		<option value="Visa">Visa</option>
		<option value="MasterCard">MasterCard</option>
		<option value="American Express">American Express</option>
		<option value="Discover">Discover</option>
		<option value="JCB">JCB</option></select></li>
		<%
		if (aUser.getCreditCard() != null)
		{
		%>
		<li>Card Number<INPUT TYPE="TEXT" NAME="cardNum" value="<%=aUser.getCreditCard().getCCNumber()%>" maxlength="16"><BR></li>
		<%
		}
		else 
		{
		%>
		<li>Card Number<INPUT TYPE="TEXT" NAME="cardNum" maxlength="16">
		<%
		}
		%>
        <li>Expiration date and security code<BR><select name="expiredMonth">
		<%
		if (aUser.getCreditCard() != null)
		{
		%>
		<option value="<%=aUser.getCreditCard().getMonth()%>"><%=aUser.getCreditCard().getMonth()%></option>
		<%
		}
		else 
		{
		%>
		<option value="-1">--</option>
		<%
		}
		%>
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		<option value="6">6</option>
		<option value="7">7</option>
		<option value="8">8</option>
		<option value="9">9</option>
		<option value="10">10</option>
		<option value="11">11</option>
		<option value="12">12</option>
		</select>
		<select name="expiredYear">
		<%
		if (aUser.getCreditCard() != null)
		{
		%>
		<option value="<%=aUser.getCreditCard().getYear()%>"><%=aUser.getCreditCard().getYear()%></option>
		<%
		}
		
		else 
		{
		%>
		<option value="-1">----</option>
		<%
		}
		%>
		<option value="2014">2014</option>
		<option value="2015">2015</option>
		<option value="2016">2016</option>
		<option value="2017">2017</option>
		<option value="2018">2018</option>
		<option value="2019">2019</option>
		<option value="2020">2020</option>
		<option value="2021">2021</option>
		<option value="2022">2022</option>
		<option value="2023">2023</option>
		<option value="2024">2024</option>
		<option value="2025">2025</option>
		</select>
		<%
		if (aUser.getCreditCard() != null)
		{
		%>
		<INPUT TYPE="TEXT" NAME="CSC" style="width: 20px;" value="<%=aUser.getCreditCard().getCCCode()%>" maxlength="3">
		<%
		}
		else 
		{
		%>
		<INPUT TYPE="TEXT" NAME="CSC" style="width: 20px;" maxlength="3">
		<%
		}
		%>
			<br>
		</li>
		<H2>Billing information</H2>
		<%
		if (aUser.getCustomerInfo() != null)
		{
		%>
        <li>First Name<INPUT TYPE="TEXT" NAME="firstName" value="<%=aUser.getCustomerInfo().getFirstname()%>"></li>
		<li>Last Name<INPUT TYPE="TEXT" NAME="lastName" value="<%=aUser.getCustomerInfo().getLastname()%>"></li>
		<li>City<INPUT TYPE="TEXT" NAME="city" value="<%=aUser.getCustomerInfo().getCity()%>"></li>
		<li>Billing Address</li>
		<li>line 1<INPUT TYPE="TEXT" NAME="addressOne" value="<%=aUser.getCustomerInfo().getA1()%>"></li>
		<li>line 2<INPUT TYPE="TEXT" NAME="addressTwo" value="<%=aUser.getCustomerInfo().getA2()%>"></li>
		<%
		}
		else 
		{
		%>
		<li>First Name<INPUT TYPE="TEXT" NAME="firstName"></li>
		<li>Last Name<INPUT TYPE="TEXT" NAME="lastName"></li>
		<li>City<INPUT TYPE="TEXT" NAME="city"></li>
		<li>Billing Address</li>
		<li>line 1<INPUT TYPE="TEXT" NAME="addressOne"></li>
		<li>line 2<INPUT TYPE="TEXT" NAME="addressTwo"></li>
		<%
		}
		%>
		<li>State
			<select name="state">
			<%
			if (aUser.getCustomerInfo() != null)
			{
			%>
			<option value="<%=aUser.getCustomerInfo().getState()%>"><%=aUser.getCustomerInfo().getState()%></option>
			<%
			}
			%>
			<option value="AL">Alabama</option>
			<option value="AK">Alaska</option>
			<option value="AZ">Arizona</option>
			<option value="AR">Arkansas</option>
			<option value="CA">California</option>
			<option value="CO">Colorado</option>
			<option value="CT">Connecticut</option>
			<option value="DE">Delaware</option>
			<option value="DC">District Of Columbia</option>
			<option value="FL">Florida</option>
			<option value="GA">Georgia</option>
			<option value="HI">Hawaii</option>
			<option value="ID">Idaho</option>
			<option value="IL">Illinois</option>
			<option value="IN">Indiana</option>
			<option value="IA">Iowa</option>
			<option value="KS">Kansas</option>
			<option value="KY">Kentucky</option>
			<option value="LA">Louisiana</option>
			<option value="ME">Maine</option>
			<option value="MD">Maryland</option>
			<option value="MA">Massachusetts</option>
			<option value="MI">Michigan</option>
			<option value="MN">Minnesota</option>
			<option value="MS">Mississippi</option>
			<option value="MO">Missouri</option>
			<option value="MT">Montana</option>
			<option value="NE">Nebraska</option>
			<option value="NV">Nevada</option>
			<option value="NH">New Hampshire</option>
			<option value="NJ">New Jersey</option>
			<option value="NM">New Mexico</option>
			<option value="NY">New York</option>
			<option value="NC">North Carolina</option>
			<option value="ND">North Dakota</option>
			<option value="OH">Ohio</option>
			<option value="OK">Oklahoma</option>
			<option value="OR">Oregon</option>
			<option value="PA">Pennsylvania</option>
			<option value="RI">Rhode Island</option>
			<option value="SC">South Carolina</option>
			<option value="SD">South Dakota</option>
			<option value="TN">Tennessee</option>
			<option value="TX">Texas</option>
			<option value="UT">Utah</option>
			<option value="VT">Vermont</option>
			<option value="VA">Virginia</option>
			<option value="WA">Washington</option>
			<option value="WV">West Virginia</option>
			<option value="WI">Wisconsin</option>
			<option value="WY">Wyoming</option>
		</select></li>
		
		<%
		if (aUser.getCustomerInfo() != null)
		{
		%>
		<li>Zip or postal code<INPUT TYPE="TEXT" NAME="zip" value="<%=aUser.getCustomerInfo().getZipCode()%>" maxlength="5"></li>
		<li>Phone number<INPUT TYPE="TEXT" NAME="phoneNumber" value="<%=aUser.getCustomerInfo().getPhone()%>" maxlength="12"></li>
		<%
		}
		else 
		{
		%>
		<li>Zip or postal code<INPUT TYPE="TEXT" NAME="zip" maxlength="5"></li>
		<li>Phone number<INPUT TYPE="TEXT" NAME="phoneNumber" maxlength="12"></li>
		<%
		}
		%>
		
		<%if(user != null)
		{
			if(user.getIsIIT() == 1)
			{
				if (aUser.getCustomerInfo().getIITID().equals(""))
				{
			%>
				<li>IIT ID number<INPUT TYPE="TEXT" NAME="IITID" maxlength="9"></li>
				<%
				}
				else 
				{
				%>
				<li>IIT ID number<INPUT TYPE="TEXT" NAME="IITID" maxlength="9" value="<%=aUser.getCustomerInfo().getIITID()%>"></li>
			<%}%>
			<%}%>
			<li>Save my payment information so checkout is easy next time?
			<input type="RADIO" name="savePayment" value="100" CHECKED>Yes
			<input type="RADIO" name="savePayment" value="-1" CHECKED>No
			</li>
			<input type="hidden" name="savePayment" value="100" >
		<%}%>

		<P>You'll have a chance to review your order before it's placed.</P>
        <li><input type="submit" value="Continue"></li>
	</ul>
    </form>
</div>

<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>
