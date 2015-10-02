<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Genre";%>
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

	List<Song> songs = new ArrayList<Song>();
	
	songs = newCatalog.getSortedSongsbyDownload();

%>
		<div class="grid">
			<h2><a href="Country.jsp">Country</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<songs.size(); i++)
				{
					if ((songs.get(i).getNumberDownloads() != 0) && (songs.get(i).getSgenre().equals("country")))
					{
					
					%>
					<li>
					<a href="item.jsp?song=<%=songs.get(i).getidS()%>"><div class="small">
					<img src= "<%=songs.get(i).getImagePath()%>" title="<%=songs.get(i).getSname()%>" /></div></a>
					</li>
					<%
					}
				}
				%>
			</ul>
			
			<h2><a href="Electronic.jsp">Electronic</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<songs.size(); i++)
				{
					if ((songs.get(i).getNumberDownloads() != 0) && (songs.get(i).getSgenre().equals("electronic")))
					{
					
					%>
					<li>
					<a href="item.jsp?song=<%=songs.get(i).getidS()%>"><div class="small">
					<img src= "<%=songs.get(i).getImagePath()%>" title="<%=songs.get(i).getSname()%>" /></div></a>
					</li>
					<%
					}
				}
				%>
			</ul>
			
			<h2><a href="HipHop.jsp">Hip Hop</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<songs.size(); i++)
				{
					if ((songs.get(i).getNumberDownloads() != 0) && (songs.get(i).getSgenre().equals("hip hop")))
					{
					
					%>
					<li>
					<a href="item.jsp?song=<%=songs.get(i).getidS()%>"><div class="small">
					<img src= "<%=songs.get(i).getImagePath()%>" title="<%=songs.get(i).getSname()%>" /></div></a>
					</li>
					<%
					}
				}
				%>

			</ul>
			
			<h2><a href="Pop.jsp">Pop</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<songs.size(); i++)
				{
					if ((songs.get(i).getNumberDownloads() != 0) && (songs.get(i).getSgenre().equals("pop")))
					{
					
					%>
					<li>
					<a href="item.jsp?song=<%=songs.get(i).getidS()%>"><div class="small">
					<img src= "<%=songs.get(i).getImagePath()%>" title="<%=songs.get(i).getSname()%>" /></div></a>
					</li>
					<%
					}
				}
				%>

			</ul>
			
			<h2><a href="Rock.jsp">Rock</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<songs.size(); i++)
				{
					if ((songs.get(i).getNumberDownloads() != 0) && (songs.get(i).getSgenre().equals("rock")))
					{
					
					%>
					<li>
					<a href="item.jsp?song=<%=songs.get(i).getidS()%>"><div class="small">
					<img src= "<%=songs.get(i).getImagePath()%>" title="<%=songs.get(i).getSname()%>" /></div></a>
					</li>
					<%
					}
				}
				%>

			</ul>
			
			<h2><a href="Other.jsp">Others</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<songs.size(); i++)
				{
					if ((songs.get(i).getNumberDownloads() != 0) && (songs.get(i).getSgenre().equals("others")))
					{
					
					%>
					<li>
					<a href="item.jsp?song=<%=songs.get(i).getidS()%>"><div class="small">
					<img src= "<%=songs.get(i).getImagePath()%>" title="<%=songs.get(i).getSname()%>" /></div></a>
					</li>
					<%
					}
				}
				%>
			</ul>
			<h4><a href="index.jsp">go back..</a></h4>
		</div>
		
<%@ include file="../global/footer.jsp"%>