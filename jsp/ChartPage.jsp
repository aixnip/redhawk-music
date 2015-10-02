<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Top Charts";%>
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
	List<Album> albums = new ArrayList<Album>();
	List<Video> videos = new ArrayList<Video>();
	
	songs = newCatalog.getSortedSongsbyDownload();
	albums = newCatalog.getSortedAlbumsbyDownload();
	videos = newCatalog.getSortedVideosbyDownload();
		
%>
	


<%-- Begin Content --%>

		<div class="grid">
			<h2><a href="TopSongs.jsp">Top Songs</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<4; i++)
				{
					
				%>
				<li>
				<a href="item.jsp?song=<%=songs.get(i).getidS()%>"><div class="small">
				<img src= "<%=songs.get(i).getImagePath()%>" title="<%=songs.get(i).getSname()%>" /></div></a>
				</li>
				<%
				}
				%>

			</ul>
			
			<h2><a href="TopVideos.jsp">Top Videos</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<4; i++)
				{

				%>
				<li>
				<a href="item.jsp?video=<%=videos.get(i).getidV()%>"><div class="small">
				<img src= "<%=videos.get(i).getImagePath()%>" title="<%=videos.get(i).getVname()%>" /></div></a>
				</li>
				<%
				}
				%>
			</ul>
			
			<h2><a href="TopAlbums.jsp">Top Albums</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<4; i++)
				{

				%>
				<li>
				<a href="item.jsp?album=<%=albums.get(i).getidA()%>"><div class="small">
				<img src= "<%=albums.get(i).getCoverImgPath()%>" title="<%=albums.get(i).getAname()%>" /></div></a>
				</li>
				<%
				}
				%>
			</ul>
			<h4><a href="index.jsp">go back..</a></h4>
		</div>
		
		
<%-- End Content --%>

<%@ include file="../global/footer.jsp"%>