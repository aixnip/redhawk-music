<%-- CPS 595 Final project: Lei Ling, Jorge Nieto, Pinxia Ye --%>
<%@ page import="classes.*" %> 
<%! String title = "RedHawk Music - Item";%>
<%@ include file="../global/header.jsp"%>
<%@ include file="../global/left.jsp"%>
<%

Catalog catalog = new Catalog();
ServletContext sc = getServletContext();
String path = sc.getRealPath("catalog/catalog.ser");

try{
	catalog = DeserializeCatalog.deserialize(catalog, path);	
}catch(IOException ioe){
	System.out.println(ioe.getMessage());
}

String list = request.getParameter("list");

if(list == null){
	%>
	<div class="list"><p>Sorry, there's no songs or albums matches to your search.</p><div>
	<%
}else{
	String [] items = list.split(",");
	
	
	%>
	<%-- Begin Content --%>
		
		
		<div class="grid">
			<h2><%=items.length%> Search Results</h2>
			
			
				<%	for (int i = 0; i < items.length ; i++){
					Items thisItem = catalog.getItem(items[i]);
					if(thisItem instanceof Album){
					Album thisAlbum = (Album)thisItem; //displays the album layout when it's an album
				%>
				<a href="item.jsp?pos=<%=items[i]%>">
				<div class="search-list">
				<div class="tiny">
					<img src="<%=thisAlbum.getImagePath()%>">
				</div>
				<div class="des">
					<h3><%=thisAlbum.getAname()%> (Album)</h3>
					<span><%=thisAlbum.getAartist()%></span><br>
					<span>genre: <%=thisAlbum.getAgenre()%></span><br>
					<span>rating: <%=thisAlbum.getRatings()%>/5</span><br>
					<span><%=thisAlbum.getNumberDownloads()%> downloads</span>
				</div>
			</div>
			</a>
			<%} //end of album page
			else if(thisItem instanceof Song){
				Song thisSong = (Song)thisItem;
				%>
					<a href="item.jsp?pos=<%=items[i]%>">
					<div class="search-list">
						<div class="tiny">
							<img src="<%=thisSong.getImagePath()%>">
						</div>
			
						<div class="des">
							<h3><%=thisSong.getSname()%> (Song)</h3>
							<span><%=thisSong.getSartist()%> (<%=thisSong.getSAlbum()%>)</span><br>
							<span>genre: <%=thisSong.getSgenre()%></span><br>
							<span>rating: <%=thisSong.getRatings()%>/5</span><br>
							<span><%=thisSong.getNumberDownloads()%> downloads</span>
						</div>
					</div>
				</a>
					<%
			}else if(thisItem instanceof Video){
				Video thisVideo = (Video)thisItem;
			 %>
				 <a href="item.jsp?pos=<%=items[i]%>">
			 <div class="search-list">
				<div class="tiny">
					<img src="<%=thisVideo.getImagePath()%>">
				</div>
					<div class="des">
					<h3><%=thisVideo.getVname()%> (Video)</h3>
					<span><%=thisVideo.getVartist()%> </span><br>
					<span>genre: <%=thisVideo.getVgenre()%></span><br>
					<span>rating: <%=thisVideo.getRatings()%>/5</span><br>
					<span><%=thisVideo.getNumberDownloads()%> downloads</span>
				</div></div></a>
			<%}
		}//end of for loop to display search results
		
				%>
		</div>				
				
			
			<div id='back'><a href="<%= request.getHeader("referer") %>">go back</a></div>
			</div>
			
	<%-- End Content --%>


	<%}

%>


	
	
<%@ include file="../global/footer.jsp"%>