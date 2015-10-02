/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import classes.*;

public class AutoComplete extends HttpServlet {

    private Catalog catalog = new Catalog();
    private HashMap<Integer, Items> map;

   
   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
	
	//get the Hashmap ready for use.
	ServletContext sc = getServletContext();
	String path = sc.getRealPath("catalog/catalog.ser");
	catalog = DeserializeCatalog.deserialize(catalog, path);	
	catalog.fillAlbumwithSongs();
	catalog.fillHashMapContainer();
	map = catalog.getMap();

	//collects parameters
        String action = request.getParameter("action");
        String pos = request.getParameter("pos");
		String keyword = request.getParameter("keyword");

		StringBuffer sb = new StringBuffer();
      
	    if (keyword != null) {
            keyword = keyword.trim().toLowerCase();
		} else {
            sc.getRequestDispatcher("error.jsp").forward(request, response);
        }
		
        boolean Added = false;
		String posList = "";
       

            // check if user sent empty string
            if (!keyword.equals("")) {

                Iterator it = map.keySet().iterator();

                while (it.hasNext()) {
                    int id = (int) it.next();
                    Items item = (Items) map.get(id);
					String name = item.getHashMName().trim();
					String artist = item.getHashMArtist().trim();

                    if ( //matches to Items name
                         name.toLowerCase().startsWith(keyword) ||
							 //mathces to artist name
                         artist.toLowerCase().startsWith(keyword) ||
							 //mathces to both
                         name.toLowerCase().concat(" ")
                            .concat(artist.toLowerCase()).startsWith(keyword)) {
						
						 		
								//trim the String name and String artist for front-end display
								if(name.length() > 25){
									name = name.substring(0, 20) + "...";
								}
								
								if(artist.length() > 18){
									artist = artist.substring(0,15) + "...";
								}
								
								//escape & charactor for XML
								if(name.contains("&")){
									name = name.replaceAll("&", "&amp;");
								}
								if(artist.contains("&")){
									artist = artist.replaceAll("&", "&amp;");
								}

                        sb.append("<item>");
                        sb.append("<hashID>" + item.getidHashMap() + "</hashID>");
                        sb.append("<hashName>" + name + "</hashName>");
                        sb.append("<hashArtist>" + artist + "</hashArtist>");
                        sb.append("</item>");
						posList+=item.getidHashMap() + ",";
                        Added = true;
                    }
                }
            } 
			if (action != null && action.equals("complete")) { //auto-completion
           	 	if (Added) {
                	response.setContentType("text/xml");
                	response.setHeader("Cache-Control", "no-cache");
                	response.getWriter().write("<items>" + sb.toString() + "</items>");
           	 	} else {
                	//nothing to show
                	response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            	}
       	 	}else{ //send search result to search page
				response.sendRedirect(request.getContextPath() + "/jsp/search.jsp?list=" + posList);
       	 	}

    }
}
