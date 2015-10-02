<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Shopping Cart";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>
<%@ page import="classes.*, java.util.Date, java.io.*, java.io.File, java.io.FileInputStream, java.nio.file.*" %>
<%@ page import="java.io.*, javax.servlet.*, javax.servlet.http.*, java.util.*, java.text.*, java.util.Formatter"%> 

<%-- Begin Content --%>
<%!
	ArrayList cart;
	Items thisItem = null;
	Song thisSong;
	String songID;
	Song song;
	boolean isThere;
	String remove;
	String checkoutURL;
	double sumPrice = 0;
	double formatedSum;
	String pay;
%>
	<div class='list'>
<%
	Catalog catalog = new Catalog();
	ServletContext sc = getServletContext();
	String path = sc.getRealPath("catalog/catalog.ser");

	try{
		catalog = DeserializeCatalog.deserialize(catalog, path);	
	}catch(IOException ioe){
		System.out.println(ioe.getMessage());
	}
	//
    synchronized(session) 
	{	
		cart = (ArrayList)session.getAttribute("shoppingCart");
		thisItem = (Items)session.getAttribute("item");
		songID = request.getParameter("songId");
		remove = request.getParameter("remove");
		thisSong = catalog.getSong(songID);
		if(thisSong != null)
		{
		thisItem = thisSong;
		}
		
		if (cart == null && remove == null) 
		{	
			cart = new ArrayList();
			cart.add(thisItem);	
		}
		else if (cart != null && remove == null) 
		{	
			isThere = false;
			for(int i=0; i<cart.size(); i++)
			{	
				//check duplicated album
				if(thisItem instanceof Album)
				{
					Album aAlbum = (Album)thisItem;
					Items item = (Items)cart.get(i);
					if(item instanceof Album)
					{
						Album bAlbum = (Album)item;
						if((aAlbum.getidA()).equals((bAlbum.getidA())))
						{
							isThere = true;
						}
					}
				}
				
				//check duplicated video
				if(thisItem instanceof Video)
				{
					Video aVideo = (Video)thisItem;
					Items item = (Items)cart.get(i);
					if(item instanceof Video)
					{
						Video bVideo = (Video)item;
						if((aVideo.getidV()).equals((bVideo.getidV())))
						{
							isThere = true;
						}
					}
				}
				
				//check duplicated song
				if((Items)cart.get(i) instanceof Song)
				{
					Song song = (Song)cart.get(i);
					if(songID != null)
					{
						if(songID.equals(song.getidS()))
						{
							isThere = true;
						}
					}
				}
				
				//check duplicated song in purchased album
				if((Items)cart.get(i) instanceof Album)
				{
					Album sAlbum = (Album)cart.get(i);
					List<Song> songlist = sAlbum.getAlbum();
					ListIterator<Song> it = songlist.listIterator();
					while(it.hasNext())
					{
						Song aSong = it.next();
						if(songID != null)
						{
							if(songID.equals(aSong.getidS()))
							{
								isThere = true;
							}
						}
					}
				}
			}
			if(isThere == false)
			{
				cart.add(thisItem);
			}
		}	
		//remove item
			if(remove != null)
			{
				String removeID = request.getParameter("removeID");
				for(int i=0; i<cart.size(); i++)
				{	
					if((Items)cart.get(i) instanceof Album)
					{
						Album album = (Album)cart.get(i);
						if(removeID.equals(album.getidA()))
						{
							cart.remove(i);
							sumPrice -= album.getAprice();
						}
					}
					
					else if((Items)cart.get(i) instanceof Song)
					{
						Song song = (Song)cart.get(i);
						if(removeID.equals(song.getidS()))
						{
							cart.remove(i);
							sumPrice -= song.getSprice();
						}
					}
					
					else if((Items)cart.get(i) instanceof Video)
					{
						Video video = (Video)cart.get(i);
						if(removeID.equals(video.getidV()))
						{
							cart.remove(i);
							sumPrice -= video.getVprice();
						}
					}
				}
			}
		session.setAttribute("shoppingCart", cart);
		thisItem = null;
	}
    response.setContentType("text/html");
    String title = "Shopping Cart";
%>
<%
    synchronized(session) 
	{
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
				 <th>Action</th>
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
				 <td><%=thisAlbum.getAname()%></td>
				 <td><%=thisAlbum.getAartist()%></td>
				 <td><%=thisAlbum.getAprice()%></td>
				 <td>
				    <FORM>
				    <INPUT TYPE="HIDDEN" NAME="removeID" VALUE="<%=thisAlbum.getidA()%>">	
					<INPUT TYPE="HIDDEN" NAME="remove" SIZE=3 VALUE="0">
					<SMALL><INPUT TYPE="SUBMIT" VALUE="Remove"></SMALL>
					</FORM>
				</td>
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
	 				 <td>
	 				    <FORM>
	 				    <INPUT TYPE="HIDDEN" NAME="removeID" VALUE="<%=aSong.getidS()%>">	
	 					<INPUT TYPE="HIDDEN" NAME="remove" SIZE=3 VALUE="0">
	 					<SMALL><INPUT TYPE="SUBMIT" VALUE="Remove"></SMALL>
	 					</FORM>
	 				</td>
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
 				 <td>
 				    <FORM>
 				    <INPUT TYPE="HIDDEN" NAME="removeID" VALUE="<%=thisVideo.getidV()%>">	
 					<INPUT TYPE="HIDDEN" NAME="remove" SIZE=3 VALUE="0">
 					<SMALL><INPUT TYPE="SUBMIT" VALUE="Remove"></SMALL>
 					</FORM>
 				</td>
				</tr>
				<%
				sumPrice += thisVideo.getVprice();
			}
			thisItem = null;
        }
		NumberFormat formatter = new DecimalFormat("#0.00");
		formatedSum = Double.parseDouble(formatter.format(sumPrice));
		if(user != null)
		{
			if(user.getIsIIT() == 1)
			{
				formatedSum = formatedSum * 0.9;
			}
		}
		
		if(user != null)
		{	
			String pay =  user.getCustomerInfo().getSavePayment();
			if(pay.equals("1"))
			{
				checkoutURL = response.encodeURL("confirmation.jsp");
			}
			else
			{
				checkoutURL = response.encodeURL("check-out.jsp");
			}
		}
		else
		{
			checkoutURL = response.encodeURL("check-out.jsp");
		}
        // "Proceed to Checkout" button below table
		%>
        </TABLE>
		<FORM class="check-out" ACTION="<%=checkoutURL%>">
           <INPUT TYPE="SUBMIT" VALUE="Proceed to Checkout">
		   </FORM>
	   </div>
			   <%
      }
		 sumPrice = 0;
    }
%>
<%-- End Content --%>
<%@ include file="../global/footer.jsp"%>