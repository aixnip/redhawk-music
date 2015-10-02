<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Top Recommended Videos";%>
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

	List<Video> videos = new ArrayList<Video>();
	
	videos = newCatalog.getSortedVideosbyRatings();
		
%>
	


<%-- Begin Content --%>

		<div class="grid">
					
			<h2>Top Recommended Videos</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<videos.size(); i++)
				{
					if (videos.get(i).getRatings() != 0) 
					{
					%>
					<li>
					<a href="item.jsp?video=<%=videos.get(i).getidV()%>"><div class="small">
					<img src= "<%=videos.get(i).getImagePath()%>" title="<%=videos.get(i).getVname()%>"  /></div></a>
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