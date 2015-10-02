<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Payment Info";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>
<%@ page import="java.io.*, javax.servlet.*, javax.servlet.http.*, java.util.*, java.text.*, java.util.Random, classes.*"%> 
	
<%!
	ArrayList cart;
	Items thisItem = null;
	String URL = "";
	double formatedSum;
	Random randomGenerator = new Random();
	int confirmNum;
	Order newOrder;
	CreditCard card;
	CustomerInfo info;
	String text = "";
	String button;
	String savePayment;
	String IITID = "A";
%>

<%
    synchronized(session) 
	{	
		cart = (ArrayList)session.getAttribute("shoppingCart");
		session.setAttribute("shoppingCart", cart);
	}
	if(request.getParameter("IITID") != "" && request.getParameter("IITID") != null)
	{
		IITID = request.getParameter("IITID");
	}
	if(IITID != "")
	{
		if(IITID.length() == 9)
		{
			if(IITID.charAt(0) == ('A'))
			{
				text = "Red Hawk member. You got 10% off";
			}
			else
			{
				text = "If you are IIT student, please make sure you input your student IID to get 10% off";
			}
		}
	}
%>	
<%-- Begin Content --%>
	
	<div class='list'>
	<P>Please review your order. <%=text%></P>
<%	
	  double sumPrice = 0;
      if (cart.size() == 0) 
	  {
          %>
  			<H2>No items in your cart...</H2>
  		<%
       } else
	  {
        // If there is at least one item in cart, show table
        // of items ordered.
		%>
        <TABLE class="song-list" >
			<thead> 
           	 <tr>
				 <th>Item Name</th>
				 <th>Artist</th>
				 <th>Price</th>
				 
			 </tr>
		 </thead>
	 </tbody>
			   <%
        for(int i=0; i<cart.size(); i++) 
		{
			thisItem = (Items)cart.get(i);
			if(thisItem instanceof Album)
			{
				Album thisAlbum = (Album)thisItem;
				%>
				<tr>
				 <TD><%=thisAlbum.getAname()%></td>
				 <td><%=thisAlbum.getAartist()%></td>
				 <td><%=thisAlbum.getAprice()%></td>
			 </tr>
				  <%
				 sumPrice += thisAlbum.getAprice();
			}
			
			else if(thisItem instanceof Song)
			{
				Song aSong = (Song)thisItem;
				%>
				<tr>
				 <td><%=aSong.getSname()%></td>
				 <td><%=aSong.getSartist()%></td>
				 <td><%=aSong.getSprice()%></td>
			 </tr>
 			<%
				 sumPrice += aSong.getSprice();
			}
			
			else if(thisItem instanceof Video)
			{
				Video thisVideo = (Video)thisItem;
				%>
				<tr>
				 <td><%=thisVideo.getVname()%></td>
				 <td><%=thisVideo.getVartist()%></td>
				 <td><%=thisVideo.getVprice()%></td>
			 </tr>
				 <%
				 sumPrice += thisVideo.getVprice();
			}
			thisItem = null;
        }
		if(IITID != "")
		{	
			if(IITID.length() == 9)
			{
				if(IITID.charAt(0) == ('A'))
				{
					sumPrice = 0.9 * sumPrice;
				}
			}
		}
		NumberFormat formatter = new DecimalFormat("#0.00");
		formatedSum = Double.parseDouble(formatter.format(sumPrice));
		%>
		<TR>
			
				 <td>Total </td>
				<td><%=formatedSum%></td>
        </tr>
	</tbody>
	</table>
	<%
      }
	  String cardNum = request.getParameter("cardNum");
	  String expiredMonth = request.getParameter("expiredMonth");
	  String expiredYear = request.getParameter("expiredYear");
	  String CSC = request.getParameter("CSC");
	  String cardType = request.getParameter("cardType");
	  String firstName = request.getParameter("firstName");
	  String lastName = request.getParameter("lastName");
	  String city = request.getParameter("city");
	  String state = request.getParameter("state");
	  String addressOne = request.getParameter("addressOne");
	  String addressTwo = request.getParameter("addressOne");
	  String phoneNumber = request.getParameter("phoneNumber");
	  String zip = request.getParameter("zip");
		if(user != null)
		{
			savePayment = request.getParameter("savePayment");
		}
		card = new CreditCard(cardNum, expiredMonth, expiredYear, CSC);
		info = new CustomerInfo(firstName, lastName, addressOne, addressTwo, city, state, zip, phoneNumber, savePayment, IITID);
		
		synchronized(session) 
		{	
			session.setAttribute("customerInfo", info);
			session.setAttribute("creditCard", card);
			session.setAttribute("formatedSum", formatedSum);
		}
		
	  if(cardNum.length() == 16 && CSC.length() == 3 && expiredMonth.length() > 0 && expiredYear.length() == 4 &&
		cardType.length() > 0 && firstName.length() > 0 && lastName.length() > 0 && city.length() > 0 && 
		addressOne.length() > 0 && zip.length() > 0)
	  {	
			button = "Submit Order";
			URL = response.encodeURL("confirmation.jsp");
	  }
	  else
	  {	
	    button = "Return";
		URL = response.encodeURL("check-out.jsp");%>
		<CENTER><p>Payment or billing information is not complete or incorrect! Please click Return button to return to last page.<p></CENTER>
	  <%}
	  sumPrice = 0;
%>


<FORM ACTION = "<%=URL%>" ><center><INPUT TYPE= "SUBMIT" VALUE="<%=button%>"></center></FORM>
		   
<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>
