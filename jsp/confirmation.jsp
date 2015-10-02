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
	SerializeUser sUser;
	ServletContext sc;
	String path;
	ArrayList<Order> orderList;
	ArrayList<Order> newOrderList;
	double sumPrice = 0;
	String text = "";
	String savePayment;
	String ID;
%>

<%
    synchronized(session) 
	{	
		cart = (ArrayList)session.getAttribute("shoppingCart");
		card = (CreditCard)session.getAttribute("creditCard");
		info = (CustomerInfo)session.getAttribute("customerInfo");
	}
	
%>	
<%-- Begin Content --%>
	<div class='list'>
<%	
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
				
		if(user != null)
		{	
			ID = info.getIITID();
			if(ID.length() == 9)
			{	
				if(ID.charAt(0) == ('A'))
				{
					sumPrice = sumPrice * 0.9;
					text = " (IIT price)";
				}
			}
		}	
		NumberFormat formatter = new DecimalFormat("#0.00");
		formatedSum = Double.parseDouble(formatter.format(sumPrice));

		%>
		<TR>
			
				 <td>Total </td>
				<td><%=formatedSum + text%></td>
        </tr>
	</tbody>
	</table>
	<%
      }	
		
		sc = getServletContext();
		confirmNum = randomGenerator.nextInt(200000 - 100000 + 1) + 100000;//Range
		Calendar cal = Calendar.getInstance();  
		int day = cal.get(cal.DAY_OF_MONTH); 
		int year = cal.get(cal.YEAR);  
		int month = cal.get(cal.MONTH)+1;
		String purDate = month+"/"+day+"/"+year;
		if(card == null)
		{
			if(user != null)
			{
				card = user.getCreditCard();
			}
		}
		String last4Digits = (card.getCCNumber()).substring(card.getCCNumber().length() - 4);
		newOrder = new Order(confirmNum, cart, purDate, formatedSum);

		if(user != null)
		{	
			savePayment = info.getSavePayment();
			orderList = user.getOrder();
			orderList.add(newOrder);
			user.setOrder(orderList);
			if(savePayment.equals("1"))
			{	
				user.setCreditCard(card);
				user.setCustomerInfo(info);
			}
			else if(savePayment.equals("-1"))
			{

			}
			path = sc.getRealPath("/Users/" + showUser + ".ser");
			sUser.serialize(user, path);
		}
		else
		{	
			ArrayList<Order> newOrderList = new ArrayList<Order>();
			newOrderList.add(newOrder);
			confirmNum = randomGenerator.nextInt(200000 - 100000 + 1) + 100000;//Range
			String userName = "" + confirmNum;
			User newGuest = new User(-1, userName, userName, "email", newOrderList, info, card);
			path = sc.getRealPath("/Users/" + userName + ".ser");
			sUser.serialize(newGuest, path);
		}
		synchronized(session) 
		{	
			cart = null;
			session.setAttribute("shoppingCart", cart);
		}
		sumPrice = 0;
		text = "";
%>
<ul class="user">
<li>Payment Info:</li>
<li>Your confirmation number is: <%=confirmNum%></li>
<li>Credit Card ending with: <%=last4Digits%></li>
<li>Date confirmed: <%=purDate%></li>
<li><a href="index.jsp" id="back">Return to Home</a></li>
</ul>
</div>
<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>
