<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - New Arrivals";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>
<%@ page import="java.util.Date"%>
<%@ page import="java.util.Calendar"%>

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
	
	Calendar ifdatemonth = Calendar.getInstance();
	Calendar itemadded = Calendar.getInstance();
	
	ifdatemonth.add(Calendar.DATE, -30);
	
	songs = newCatalog.getSortedSongsbyDateAdded();
	albums = newCatalog.getSortedAlbumsbyDateAdded();
	videos = newCatalog.getSortedVideosbyDateAdded();
		
%>
	


<%-- Begin Content --%>

		<div class="grid">
			<h2>New Songs</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<songs.size(); i++)
				{
					itemadded.setTime(songs.get(i).getItemDateAdded());
					
					if ((ifdatemonth.before(itemadded) == true) && (songs.get(i).getNumberDownloads() != 0))
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
			
			<h2>New Albums</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<albums.size(); i++)
				{
					itemadded.setTime(albums.get(i).getItemDateAdded());
					
					if ((ifdatemonth.before(itemadded) == true) && (albums.get(i).getNumberDownloads() != 0))
					{
					%>
					<li>
					<a href="item.jsp?album=<%=albums.get(i).getidA()%>"><div class="small">
					<img src= "<%=albums.get(i).getCoverImgPath()%>" title="<%=albums.get(i).getAname()%>" /></div></a>
					</li>
					<%
					}
				}
				%>
			</ul>
			
			<h2>New Videos</a></h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<videos.size(); i++)
				{
					itemadded.setTime(videos.get(i).getItemDateAdded());
					
					if ((ifdatemonth.before(itemadded) == true) && (videos.get(i).getNumberDownloads() != 0))
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
			<h4><a href="index.jsp">go back..</a></h4>
		</div>
		
		
<%-- End Content --%>

<%@ include file="../global/footer.jsp"%>