/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.util.List;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Album extends Items implements java.io.Serializable{
  private String idAlbum;
  private String Aname;
  private String Alabel;
  private String Aartist;
  private String Agenre;
  private double Aprice;
  private List<Song> AsongsList = new ArrayList<Song>();
  private String ImagePath;
  private String CoverImagePath;

  public Album() {
    idItem = 1;
	idAlbum = "";
    Aname = "";
    Alabel = "";
    Aartist = "";
    Agenre = "";
    Aprice = 0.0;
	ImagePath = "";
	CoverImagePath = "";
	//----New Inherited Attributes----//
	purchased = false;
    numberDownloads = 0;
    rating = 0;
	itemdateadded = new Date();
  }
  
  public Album(String ida, String an, String al, String aa, String ag, double ap, int nd, int rt, String path, String idaA, String coverpath) {
	idItem = 1;
	this.idAlbum = ida;
    this.Aname = an;
    this.Alabel = al;
    this.Aartist = aa;
    this.Agenre = ag;
    this.Aprice = ap;
	this.ImagePath = path;
	this.CoverImagePath = coverpath;
	//----New Inherited Attributes----//
	HashMName = an;
	HashMArtist = aa;
	numberDownloads = nd;
	rating = rt;
	try {
		itemdateadded = new SimpleDateFormat("MM/dd/yyyy").parse(idaA);
	}
	catch (ParseException e) {
		e.printStackTrace();
	}
  }
  
  //----Hash Map Constructor----//
  
  public Album(String HMid, String HMN, String HMA)
  {
	idHashMap = HMid;
	HashMName = HMN;
	HashMArtist = HMA;
  }
  
  //----Hash Map (getters)----//
  
  public String getidHashMap() {return (idHashMap);}
  
  public String getHashMName() { return (HashMName);}
  
  public String getHashMArtist() { return (HashMArtist);}
  
  //----Hash Map (getters) END----//
  
  public void setAprice(double p) {
    this.Aprice = p;
  }
  
  public void setImgPath(String img) {
    this.ImagePath = img;
  }  
  
  public void setCoverImgPath(String coverpath) {
    this.CoverImagePath = coverpath;
  }
  
  public void setSongIntoAlbum (Song s){
	Iterator iterator = AsongsList.iterator();
	boolean songexists = false;
	
	for (int i=0; i<AsongsList.size(); i++){
	
		if (AsongsList.get(i).getSname().equals(s.getSname())){
			songexists = true; 
		}		
	}
	
	if (songexists == false){AsongsList.add(s);}
  }
  
  public void setListofSongsIntoAlbum (List<Song> AsongsList){
	this.AsongsList = AsongsList;
  }
    
  //----(Start)added 11/17/14----//
  public void setPurchasedValue(boolean pd) {
	purchased = pd;
  }
  
  public void setNumberDownloads(int nd) {
	numberDownloads = nd;
  }
  
  public void setRating(int rt) {
	rating = rt;
  }
  
  public int getidI() {
    return(idItem);
  }
  
  public boolean getPurchasedValue() {
	return(purchased);
  }
  
  public int getNumberDownloads() {
	return(numberDownloads);
  }
  
  public int getRatings() {
	return(rating);
  }
  
  public Date getItemDateAdded() {
	return(itemdateadded);
  }
  //----(End)added 11/17/14----//
  
  public String getItemDateAddedStringAlbum() {
	return (""+itemdateadded);
  }
  
  public String getidA() {
    return(idAlbum);
  }
  
  public String getAname() {
	return(Aname);
  }
  
  public String getAlabel() {
	return(Alabel);
  }
  
  public String getAartist() {
	return(Aartist);
  }
  
  public String getAgenre() {
	return(Agenre);
  }
  
  public double getAprice() {
	return(Aprice);
  }
  
  public List<Song> getAlbum() {
	return(AsongsList);
  }
  
  public String getImagePath() {
	return(ImagePath);
  }
  
  public String getCoverImgPath() {
    return (CoverImagePath);
  }
}