<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%! String title = "RedHawk Music - Home";%>
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
	
	ifdatemonth.add(Calendar.DATE, -7);
	
	songs = newCatalog.getSortedSongsbyDateAdded();
	albums = newCatalog.getSortedAlbumsbyRatings();
	videos = newCatalog.getSortedVideosbyDateAdded();
		
%>


<%-- Begin Content --%>

		<div class="grid">
			<h2>Today's Hot</h2>
			<div>
			<a href="item.jsp?album=<%=albums.get(0).getidA()%>"><div class="big"><img src= "<%=albums.get(0).getCoverImgPath()%>" title="<%=albums.get(0).getAname()%>" /></div></a>
			</div>
			<ul class="image-grid">
				<li>
				<a href="item.jsp?album=<%=albums.get(1).getidA()%>"><div class="small"><img src= "<%=albums.get(1).getCoverImgPath()%>" title="<%=albums.get(1).getAname()%>" /></div></a>
				</li>
				<li> 
				<a href="item.jsp?album=<%=albums.get(2).getidA()%>"><div class="small"><img src= "<%=albums.get(2).getCoverImgPath()%>" title="<%=albums.get(2).getAname()%>" /></div></a>
				</li>
				<li>
				<a href="item.jsp?album=<%=albums.get(3).getidA()%>"><div class="small"><img src= "<%=albums.get(3).getCoverImgPath()%>" title="<%=albums.get(3).getAname()%>" /></div></a>
				</li>
				<li>
				<a href="item.jsp?album=<%=albums.get(4).getidA()%>"><div class="small"><img src= "<%=albums.get(4).getCoverImgPath()%>" title="<%=albums.get(4).getAname()%>" /></div></a>
				</li>
			</ul>
		
			<h2>New Arrivals</h2>
			<ul class="image-grid">
				<%
				for (int i=0; i<songs.size(); i++)
				{
					itemadded.setTime(songs.get(i).getItemDateAdded());
					
					if ((ifdatemonth.before(itemadded) == true) && (songs.get(i).getNumberDownloads() != 0))
					{
					%>
					<li>
					<a href="item.jsp?song=<%=songs.get(i).getidS()%>"><div class="big">
					<img src= "<%=songs.get(i).getImagePath()%>" title="<%=songs.get(i).getSname()%>" /></div></a>
					</li>
					<%
					break;
					}
				}
				%>
				<li>
				<a href="item.jsp?video=<%=videos.get(0).getidV()%>"><div class="big">
				<img src= "<%=videos.get(0).getImagePath()%>" title="<%=videos.get(0).getVname()%>" /></div></a>
				</li>
			</ul>
		</div>

<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>