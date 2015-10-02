/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.util.*;


public class Catalog implements java.io.Serializable
{
    // Hard coded 3 albums for try.
  
	private Items [] inventory;
	private List<Items> sortedinventory;
	private List<Song> songs;
	private List<Album> albums;
	private List<Video> videos;
	private List<Song> songsSortedbyDownloads;
	private List<Album> albumsSortedbyDownloads;
	private List<Video> videosSortedbyDownloads;
	private HashMap<Integer, Items> map = new HashMap<Integer, Items>();

	private int [] id;
 
    //default constructor
	public Catalog()
	{
	}
	
    //non-default constructor
	public Catalog(Items [] inventory, int [] id)
	{
		this.inventory = inventory;
		this.id = id;
		fillAlbumwithSongs();
		fillHashMapContainer();
	}
	
  //method getID in array
  public int getID(int i) 
  {
	return id[i];
  }
  
  //get the type code for [i]
  public int getidI(String id){
	  int index = -1;
	  try{
		  index = Integer.parseInt(id);
	  }catch(NumberFormatException nfe){
		  return index;
	  }
	  if(index > 0 && index < inventory.length){
		  return (inventory[index].getidI());
	  }else{
		  return index;
	  }
  }
  
  //get the Items object at position [i]
  public Items getItem(String pos){
	  int i = -1;
	  try{
		  i = Integer.parseInt(pos);
	  }catch(NumberFormatException nfe){
		  return null;
	  }
	  if(i > 0 && i < inventory.length)
		  return inventory[i];
	  else
		  return null;
  }
  
  //get inventory length 
  public int getLength(){
	  return inventory.length;
  }
  
  //fills set of songs that belongs to an albums
  public void fillAlbumwithSongs()
  {
	List<Song> Albumsongs = new ArrayList<Song>();
	albums = new ArrayList<Album>();
	
	for(int i=0; i<inventory.length; i++) 
	{
		if (inventory[i].getidI() == 1) 
		{	
			albums.add((Album) inventory [i]);
		}
    }
	
	for(int j=0; j<albums.size(); j++)
	{
		String AName = albums.get(j).getAname();
		Albumsongs = getallsongsofalbum(AName);
		albums.get(j).setListofSongsIntoAlbum(Albumsongs);
	}
		
  }
  //fills HashMap for search purposes
  public void fillHashMapContainer()
  {
	for(int i=0; i<inventory.length; i++) 
	{
		if (inventory[i].getidI() == 1)
		{
			Album aAlbum = (Album) inventory[i];
			map.put(i, new Items(""+i,""+ aAlbum.getAname(),""+ aAlbum.getAartist()));
		}
		
		else if (inventory[i].getidI() == 2)
		{
			Song aSong = (Song) inventory[i];
			map.put(i, new Items(""+i,"" + aSong.getSname(),""+ aSong.getSartist()));
		}
		
		else if (inventory[i].getidI() == 3)
		{
			Video aVideo = (Video) inventory[i];
			map.put(i, new Items(""+i,""+ aVideo.getVname(),""+ aVideo.getVartist()));
		}
	}
	
  }
  
  //get HashMap
  public HashMap getMap() {
        return map;
    }
  
  //search and add all songs of a given album
  public List<Song> getallsongsofalbum(String Aname)
  {
	List<Song> Asongs = new ArrayList<Song>();
	
	for(int i=0; i<inventory.length; i++) 
	{
		if (inventory[i].getidI() == 2) 
		{	
			Song aSong = (Song) inventory[i];
			if(aSong.getSAlbum().equals(Aname))
			{
				Asongs.add((Song) aSong);
			}
		}
    }
	return Asongs;
  }
	
  //method getSong in array
  public Song getSong(String songID) 
  {
    if (songID == null) 
	{
      return(null);
    }
    for(int i=0; i<inventory.length; i++) 
	{
		if (inventory[i].getidI() == 2) 
		{	
			Song aSong = (Song) inventory[i];
			
			if (songID.equals(aSong.getidS())) 
			{
				return(aSong);
			}
		}
    }
    return(null);
  }
  
   //method getAlbum in array  
  public Album getAlbum(String albumID) 
  {	
    if (albumID == null) 
	{
      return(null);
    }
    for(int i=0; i<albums.size(); i++) 
	{
		if (albums.get(i).getidI() == 1) 
		{	
			Album aAlbum = (Album) albums.get(i);
			
			if (albumID.equals(aAlbum.getidA())) 
			{
				return(aAlbum);
			}
		}
    }
    return(null);
  }
  
  //method getVideo in array  
  public Video getVideo(String videoID) 
  {
    if (videoID == null) 
	{
      return(null);
    }
    for(int i=0; i<inventory.length; i++) 
	{
		if (inventory[i].getidI() == 3) 
		{	
			Video aVideo = (Video) inventory[i];
			
			if (videoID.equals(aVideo.getidV())) 
			{
				return(aVideo);
			}
		}
    }
    return(null);
  }
  
  //method getAllSongs gives you all songs contained in inventory array  
  public List<Song> getAllSongs ()
  {
	songs = new ArrayList<Song>();
	
	for(int i=0; i<inventory.length; i++) 
	{
		if (inventory[i].getidI() == 2) 
		{	
			songs.add((Song) inventory [i]);
		}
    }
	
	return songs;
  }
  
  //method getAllAlbums gives you all albums contained in inventory array  
  public List<Album> getAllAlbums ()
  {
	return albums;	
  }
  
  //method getAllVideos gives you all videos contained in inventory array  
  public List<Video> getAllVideos ()
  {
	videos = new ArrayList<Video>();
	
	for(int i=0; i<inventory.length; i++) 
	{
		if (inventory[i].getidI() == 3) 
		{	
			videos.add((Video) inventory [i]);
		}
    }
	return videos;
  }
  
  //method getSortedSongsbyDownload gives you all songs contained in inventory array sorted by number of downloads 
  public List<Song> getSortedSongsbyDownload()
  {
	sortedinventory = new ArrayList<Items>();
	List<Song> songsSortedbyDownloads = new ArrayList<Song>();
	
	for(int i=0; i<inventory.length; i++) {sortedinventory.add((Items) inventory [i]);}

	Collections.sort(sortedinventory, new SorterNumberDownloads());
	
	for (int i=0; i<sortedinventory.size(); i++)
	{
		if( sortedinventory.get(i).getidI() == 2)
		{
			songsSortedbyDownloads.add((Song) sortedinventory.get(i));
		}
	}
	
	return songsSortedbyDownloads;
  }
  
  //method getSortedAlbumsbyDownload gives you all albums contained in inventory array sorted by number of downloads   
  public List<Album> getSortedAlbumsbyDownload()
  {
		sortedinventory = new ArrayList<Items>();
		List<Album> albumsSortedbyDownloads = new ArrayList<Album>();
		
		for(int i=0; i<inventory.length; i++) {sortedinventory.add((Items) inventory [i]);}

		Collections.sort(sortedinventory, new SorterNumberDownloads());
		
		for (int i=0; i<sortedinventory.size(); i++)
		{
			if( sortedinventory.get(i).getidI() == 1)
			{
				albumsSortedbyDownloads.add((Album) sortedinventory.get(i));
			}
		}
		
		return albumsSortedbyDownloads;
	
  }
  
   //method getSortedVideosbyDownload gives you all videos contained in inventory array sorted by number of downloads 
  public List<Video> getSortedVideosbyDownload()
  {
		sortedinventory = new ArrayList<Items>();
		List <Video> videosSortedbyDownloads = new ArrayList<Video>();
		
		for(int i=0; i<inventory.length; i++) {sortedinventory.add((Items) inventory [i]);}

		Collections.sort(sortedinventory, new SorterNumberDownloads());
		
		for (int i=0; i<sortedinventory.size(); i++)
		{
			if( sortedinventory.get(i).getidI() == 3)
			{
				videosSortedbyDownloads.add((Video) sortedinventory.get(i));
			}
		}
		
		return videosSortedbyDownloads;
  }
  
  //method getSortedSongsbyRatings gives you all songs contained in inventory array sorted by ratings
  public List<Song> getSortedSongsbyRatings()
  {
	sortedinventory = new ArrayList<Items>();
	List<Song> songsSortedbyRatings = new ArrayList<Song>();
	
	for(int i=0; i<inventory.length; i++) {sortedinventory.add((Items) inventory [i]);}

	Collections.sort(sortedinventory, new SorterRatings());
	
	for (int i=0; i<sortedinventory.size(); i++)
	{
		if( sortedinventory.get(i).getidI() == 2)
		{
			songsSortedbyRatings.add((Song) sortedinventory.get(i));
		}
	}
	
	return songsSortedbyRatings;
  }
  
  //method getSortedAlbumsbyRatings gives you all albums contained in inventory array sorted by ratings  
  public List<Album> getSortedAlbumsbyRatings()
  {
		sortedinventory = new ArrayList<Items>();
		List <Album> albumsSortedbyRatings= new ArrayList<Album>();
		
		for(int i=0; i<inventory.length; i++) {sortedinventory.add((Items) inventory [i]);}

		Collections.sort(sortedinventory, new SorterRatings());
		
		for (int i=0; i<sortedinventory.size(); i++)
		{
			if( sortedinventory.get(i).getidI() == 1)
			{
				albumsSortedbyRatings.add((Album) sortedinventory.get(i));
			}
		}
		
		return albumsSortedbyRatings;
	
  }
  
  //method getSortedVideosbyRatings gives you all videos contained in inventory array sorted by ratings 
  public List<Video> getSortedVideosbyRatings()
  {
		sortedinventory = new ArrayList<Items>();
		List<Video> videosSortedbyRatings = new ArrayList<Video>();
		
		for(int i=0; i<inventory.length; i++) {sortedinventory.add((Items) inventory [i]);}

		Collections.sort(sortedinventory, new SorterRatings());
		
		for (int i=0; i<sortedinventory.size(); i++)
		{
			if( sortedinventory.get(i).getidI() == 3)
			{
				videosSortedbyRatings.add((Video) sortedinventory.get(i));
			}
		}
		
		return videosSortedbyRatings;
  }
  
   //method getSortedSongsbyDateAdded gives you all songs contained in inventory array sorted by date added
  public List<Song> getSortedSongsbyDateAdded()
  {
	sortedinventory = new ArrayList<Items>();
	List<Song> songsSortedbyDateAdded = new ArrayList<Song>();
	
	for(int i=0; i<inventory.length; i++) {sortedinventory.add((Items) inventory [i]);}

	Collections.sort(sortedinventory, new SorterDateAdded());
	
	for (int i=0; i<sortedinventory.size(); i++)
	{
		if( sortedinventory.get(i).getidI() == 2)
		{
			songsSortedbyDateAdded.add((Song) sortedinventory.get(i));
		}
	}
	
	return songsSortedbyDateAdded;
  }
  
  //method getSortedAlbumsbyDateAdded gives you all albums contained in inventory array sorted by date added 
  public List<Album> getSortedAlbumsbyDateAdded()
  {
		sortedinventory = new ArrayList<Items>();
		List <Album> albumsSortedbyDateAdded= new ArrayList<Album>();
		
		for(int i=0; i<inventory.length; i++) {sortedinventory.add((Items) inventory [i]);}

		Collections.sort(sortedinventory, new SorterDateAdded());
		
		for (int i=0; i<sortedinventory.size(); i++)
		{
			if( sortedinventory.get(i).getidI() == 1)
			{
				albumsSortedbyDateAdded.add((Album) sortedinventory.get(i));
			}
		}
		
		return albumsSortedbyDateAdded;
	
  }
  
  //method getSortedVideosbyDateAdded gives you all videos contained in inventory array sorted by date added
  public List<Video> getSortedVideosbyDateAdded()
  {
		sortedinventory = new ArrayList<Items>();
		List<Video> videosSortedbyDateAdded = new ArrayList<Video>();
		
		for(int i=0; i<inventory.length; i++) {sortedinventory.add((Items) inventory [i]);}

		Collections.sort(sortedinventory, new SorterDateAdded());
		
		for (int i=0; i<sortedinventory.size(); i++)
		{
			if( sortedinventory.get(i).getidI() == 3)
			{
				videosSortedbyDateAdded.add((Video) sortedinventory.get(i));
			}
		}
		
		return videosSortedbyDateAdded;
  }
  
  //method getSortedVideosbyViews gives you all videos contained in inventory array sorted by views
  public List<Video> getSortedVideosbyViews()
  {
		List<Video> videosSortedbyViews = new ArrayList<Video>();
		
		for(int i=0; i<inventory.length; i++) 
		{
			if (inventory[i].getidI() == 3)
			{
				videosSortedbyViews.add((Video) inventory [i]);
			}
		}

		Collections.sort(videosSortedbyViews, new SorterNumberViews());
		
		return videosSortedbyViews;
  }
  
	public String toString() {
		return "Catalog [inventory=" + Arrays.toString(inventory)
				+ ", sortedinventory=" + sortedinventory + ", songs=" + songs
				+ ", albums=" + albums + ", videos=" + videos
				+ ", songsSortedbyDownloads=" + songsSortedbyDownloads
				+ ", albumsSortedbyDownloads=" + albumsSortedbyDownloads
				+ ", videosSortedbyDownloads=" + videosSortedbyDownloads
				+ ", map=" + map + ", id=" + Arrays.toString(id) + "]";
	}
  
}
               
