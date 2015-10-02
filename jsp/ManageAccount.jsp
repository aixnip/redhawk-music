<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - User Account";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>
<%
User aUser;
CustomerInfo CI;
CreditCard CC;

synchronized(session)
{
	aUser = (User) session.getAttribute("user");
	CI = (CustomerInfo) session.getAttribute("customerInfo");
	CC = (CreditCard) session.getAttribute("creditCard");
}

if (CI != null)
{
	aUser.setCustomerInfo(CI);
}

if (CC != null)
{
	aUser.setCreditCard(CC);
}

%>

<%-- Begin Content --%>

<table class="list">
	
	<form action="UpdatedUserData.jsp" method="post">
	<tbody class="user">

	<tr><td><h2>Account Settings:</a></h2></td></tr>
	<tr><td><h3>Login Settings:</h3></td></tr>
	<tr><td>Email address</td><td><input type="email" name="emailAddress" value="<%=aUser.getEmailAddress()%>"></td></tr>
	<tr><td>Username</td><td><input type="text" name="userName" value="<%=aUser.getUserName()%>" disabled="true"></td></tr>
	<tr><td>Password</td><td><input type="PASSWORD" name="passWord1" value="<%=aUser.getPassWord()%>"></td></tr>
	<tr><td>Re-enter Password</td><td><input type="PASSWORD" name="passWord2" value="<%=aUser.getPassWord()%>"></td></tr>
	<tr><td>IIT Student?</td><td>
		<% if (aUser.getIsIIT() == 1)
		{
		%>
		<input type="RADIO" name="isIIT" value="1"  CHECKED>Yes<input type="RADIO" name="isIIT" value="-1" >No
		<%
		}

		else if (aUser.getIsIIT() == -1)
		{
		%>
		<input type="RADIO" name="isIIT" value="-1"  CHECKED>No <input type="RADIO" name="isIIT" value="1" >Yes</li>
		<%
		}
		%>
	</td></tr>
	<tr><td><input type="submit" value="Update"></td></tr>
	
	<tr><td><h3>User Information:</a></h3></td></tr>
	<tr><td>First Name</td><td><input type="text" name="firstName" value="<%=aUser.getCustomerInfo().getFirstname()%>"></td></tr>
	<tr><td>Last Name</td><td><input type="text" name="lastName" value="<%=aUser.getCustomerInfo().getLastname()%>"></td></tr>
	<tr><td>Address 1</td><td><input type="text" name="addressOne" value="<%=aUser.getCustomerInfo().getA1()%>"></td></tr>
	<tr><td>Address 2</td><td><input type="text" name="addressTwo" value="<%=aUser.getCustomerInfo().getA2()%>"></td></tr>
	<tr><td>City</td><td><input type="text" name="city" value="<%=aUser.getCustomerInfo().getCity()%>"></td></tr>
	<tr>
		<td>State</td>
		<td>
			<select name="state">
				<option value="<%=aUser.getCustomerInfo().getState()%>"><%=aUser.getCustomerInfo().getState()%></option>
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
			</select>
		</td>
	</tr>
	<tr><td>Zip Code</td><td><input type="text" name="zip" value="<%=aUser.getCustomerInfo().getZipCode()%>" maxlength="5"></td></tr>
	<tr><td>Phone</td><td><input type="text" name="phoneNumber" value="<%=aUser.getCustomerInfo().getPhone()%>" maxlength="12"></td></tr>
	<% if (aUser.getIsIIT() == 1)
		{
		%>
	<tr><td>Student ID</td><td><input type="text" name="IITID" value="<%=aUser.getCustomerInfo().getIITID()%>" maxlength="9"></td></tr>
	<%}%>
	<tr><td><input type="submit" value="Update"></td></tr>
	<tr><td><h3>Payment Information:</a></h3></td></tr>
	<tr><td>Credit Card Number</td><td><input type="text" name="cardNum" value="<%=aUser.getCreditCard().getCCNumber()%>" maxlength="16"></td></tr>
	<tr><td>Security Code</td><td><input type="text" name="CSC" value="<%=aUser.getCreditCard().getCCCode()%>" maxlength="3"></td></tr>
	<tr><td>Expiration Date</td></tr>
	<tr>
	<td>Month</td>
	<td>
	<select name="expiredMonth">
		<option value="<%=aUser.getCreditCard().getMonth()%>"><%=aUser.getCreditCard().getMonth()%></option>
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
	</td>
	</tr>
	<tr>
	<td>Year</td>
	<td>
	<select name="expiredYear">
		<option value="<%=aUser.getCreditCard().getYear()%>"><%=aUser.getCreditCard().getYear()%></option>
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
	</td>
	</tr>
	<tr><td><input type="submit" value="Update"></td></tr>
	</form>
	
	<form action="index.jsp" method="post">
	<tr><td>Click Return to return to home page.</tr></td>
	<tr><td><input type="submit" value="Return"></td></tr>
	</form>
	
	</tbody>
	
</table>

<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>