<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Hip Hop";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>

<%!
	Catalog newCatalog = null;
%>

<%
	ServletContext sc = getServletContext();

    String path = sc.getRealPath("/catalog/catalog.ser");

	try
	{
		newCatalog = DeserializeCatalog.deserialize(newCatalog, path);	
	}
	
	catch(IOException ioe)
	{
		System.out.println(ioe.getMessage());
	}

	List<Album> albums = new ArrayList<Album>();
	
	albums = newCatalog.getSortedAlbumsbyDownload();
		
%>
	


<%-- Begin Content --%>

		<div class="grid">
					
			<h2>Hip Hop</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<albums.size(); i++)
				{
					if (albums.get(i).getAgenre().equals("hip hop"))
					{
					%>
					<li>
					<a href="item.jsp?album=<%=albums.get(i).getidA()%>"><div class="small">
					<img src= "<%=albums.get(i).getCoverImgPath()%>" title="<%=albums.get(i).getAname()%>"  /></div></a>
					</li>
					<%
					}
				}
				%>
			</ul>
			<h4><a href="GenrePage.jsp">go back..</a></h4>
			
		</div>
		
		
<%-- End Content --%>

<%@ include file="../global/footer.jsp"%>