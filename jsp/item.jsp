<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%@ page import="classes.*" %> 
<%! String title = "RedHawk Music - Item";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>
<%@ page import="java.io.*, javax.servlet.*, javax.servlet.http.*, java.util.*, java.text.*, java.util.Formatter"%>
<%


String stringID;
Catalog catalog = new Catalog();
ServletContext sc = getServletContext();
String path = sc.getRealPath("catalog/catalog.ser");

try{
	catalog = DeserializeCatalog.deserialize(catalog, path);	
}catch(IOException ioe){
	System.out.println(ioe.getMessage());
}

String pos = request.getParameter("pos");
String albumID = request.getParameter("album");
String songID = request.getParameter("song");
String videoID = request.getParameter("video");

Items thisItem = null;
	if(pos!= null){ 
		thisItem = catalog.getItem(pos);
	}

	if(albumID != null){ 
		thisItem = catalog.getAlbum(albumID);
	}

	if(songID != null){ 
		thisItem = catalog.getSong(songID);
	}	

	if(videoID != null){ 
		thisItem = catalog.getVideo(videoID);
	}
	
if(thisItem!=null){
%>
<%-- Begin Content --%>
	
		
		<div class="list">
			
			<%if(thisItem instanceof Album){
				Album thisAlbum = (Album)thisItem; //displays the album layout when it's an album
				synchronized(session) 
				{
					session.setAttribute("item", thisAlbum);
				}
			%>
				
			<div class="small">
				<img src="<%=thisAlbum.getImagePath()%>">
			</div>
			<div class="des">
				<h2><%=thisAlbum.getAname()%></h2>
				<span><%=thisAlbum.getAartist()%></span><br>
				<span>genre: <%=thisAlbum.getAgenre()%></span><br>
				<span>rating: <%=thisAlbum.getRatings()%>/5</span><br>
				<span><%=thisAlbum.getNumberDownloads()%> downloads</span>
			</div>
			<a href="OrderPage.jsp"><div id="dl-button-album">$<%=thisAlbum.getAprice()%> add album to cart</div></a>
			<table class="song-list">
			<thead>
				<tr>
					<th>No.</th>
					<th>Title</th>
					<th>Length</th>
					<th>Price</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
					<%	List<Song> songlist = thisAlbum.getAlbum();
						ListIterator<Song> it = songlist.listIterator();
						int num = 1;
						while(it.hasNext()){
						Song aSong = it.next();
						String songId = aSong.getidS();
						int initial = 0;
						try{
							initial = (Integer.parseInt(songId)) / 100;
						}catch(NumberFormatException nfe){
							System.out.println(nfe.getMessage());
						}
						%>
					<tr>
						<td><%=num%>.</td>
						<td><%=aSong.getSname()%></td>
						<td><%=aSong.getStime()%></td>
						<td>$<%=aSong.getSprice()%></td>
					<td><a href="../soundStream/<%=initial%>00/<%=songId%>.mp3"><div id="dl-button-song">Listen</div></a></td>					
					<td><a href="OrderPage.jsp?songId=<%=songId%>"><div id="dl-button-song">Add to cart</div></a></td>
					</tr>
					<%
						num ++;
						}//end of while loop
					%>
			</tbody>
		</table>
		<%} //end of album page
		else if(thisItem instanceof Song){
			Song thisSong = (Song)thisItem;
			String songId = thisSong.getidS();
			int initial = 0;
			try{
				initial = (Integer.parseInt(songId)) / 100;
			}catch(NumberFormatException nfe){
				System.out.println(nfe.getMessage());
			}
			synchronized(session) 
			{
				session.setAttribute("item",thisSong);
			}
			%>
					<div class="small">
						<img src="<%=thisSong.getImagePath()%>">
					</div>
			
					<div class="des">
						<h2><%=thisSong.getSname()%></h2>
						<span><%=thisSong.getSartist()%> (<%=thisSong.getSAlbum()%>)</span><br>
						<span>genre: <%=thisSong.getSgenre()%></span><br>
						<span>rating: <%=thisSong.getRatings()%>/5</span><br>
						<span><%=thisSong.getNumberDownloads()%> downloads</span>
					</div>
			

					<table class="song-list">
					<thead>
						<tr>
							<th>Length</th>
							<th>Price</th>
							<th></th>
							<th></th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td><%=thisSong.getStime()%></td>
							<td>$<%=thisSong.getSprice()%></td>
							<td><a href="../soundStream/<%=initial%>00/<%=songId%>.mp3"><div id="dl-button-song">Listen</div></a></td>
							<td><a href="OrderPage.jsp?songId=<%=songId%>"><div id="dl-button-song">Add to cart</div></a></td>
						</tr>
					</tbody>
				</table>
				
				<%
		}else if(thisItem instanceof Video){
			Video thisVideo = (Video)thisItem;
			synchronized(session) 
			{
				session.setAttribute("item", thisVideo);
			}
		 %>
			<div class="small">
				<img src="<%=thisVideo.getImagePath()%>">
			</div>
	
			<div class="des">
				<h2><%=thisVideo.getVname()%></h2>
				<span><%=thisVideo.getVartist()%> </span><br>
				<span>genre: <%=thisVideo.getVgenre()%></span><br>
				<span>rating: <%=thisVideo.getRatings()%>/5</span><br>
				<span><%=thisVideo.getNumberDownloads()%> downloads</span>
			</div>
	

			<table class="song-list">
			<thead>
				<tr>
					<th>Price</th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>$<%=thisVideo.getVprice()%></td>
					<td><a href="OrderPage.jsp"><div id="dl-button-song">Add to cart</div></a></td>
				</tr>
			</tbody>
		</table>
		<%}
		}else{ //when the object does not exsit
			%>
					<p>The Item ID is not valid... The Item can not be found.</p>
			<%	}%>
		<div id='back'><a href="<%= request.getHeader("referer") %>">go back</a></div>
		</div>
		
<%-- End Content --%>
	
	
<%@ include file="../global/footer.jsp"%>