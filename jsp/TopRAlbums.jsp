<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Top Recommended Albums";%>
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
	
	albums = newCatalog.getSortedAlbumsbyRatings();
		
%>
	


<%-- Begin Content --%>

		<div class="grid">
					
			<h2>Top Recommended Albums</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<albums.size(); i++)
				{
					if (albums.get(i).getRatings() != 0) 
					{
					%>
					<li>
					<a href="item.jsp?album=<%=albums.get(i).getidA()%>"><div class="small">
					<img src= "<%=albums.get(i).getCoverImgPath()%>"  title="<%=albums.get(i).getAname()%>" /></div></a>
					</li>
					<%
					}
				}
				%>
			</ul>
			<h4><a href="RecommendationsPage.jsp">go back..</a></h4>
		</div>
		
		
<%-- End Content --%>

<%@ include file="../global/footer.jsp"%>