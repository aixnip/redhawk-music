/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Song extends Items implements java.io.Serializable
{
  private String idSong;
  private String Sname;
  private String Slabel;
  private String Sartist;
  private String SAlbum;
  private String Sgenre;
  private String Stime;
  private double Sprice;
  private String ImagePath;

  public Song() {
    idItem = 2;
	idSong = "";
    Sname = "";
    Slabel = "";
    Sartist = "";
	SAlbum = "";
    Sgenre = "";
	Stime = "";
    Sprice = 0.0;
	ImagePath = "";
	//----New Inherited Attributes----//
	purchased = false;
    numberDownloads = 0;
    rating = 0;
	itemdateadded = new Date();
  }
  
  public Song(String ids, String sn, String sl, String sa, String album, String sg, String st, double sp, int nd, int rt, String path, String ida) {
	idItem = 2;
	this.idSong = ids;
    this.Sname = sn;
    this.Slabel = sl;
    this.Sartist = sa;
	this.SAlbum = album;
    this.Sgenre = sg;
	this.Stime = st;
    this.Sprice = sp;
	this.ImagePath = path;
	//----New Inherited Attributes
	HashMName = sn;
	HashMArtist = sa;
	numberDownloads = nd;
	rating = rt;
	try {
		itemdateadded = new SimpleDateFormat("MM/dd/yyyy").parse(ida);
	}
	catch (ParseException e) {
		e.printStackTrace();
	}
  }
  
   //----Hash Map Constructor----//
  
  public Song(String HMid, String HMN, String HMA)
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
  
  public void setSprice(double p) {
    this.Sprice = p;
  }
  
  public void setImgPath(String img) {
    this.ImagePath = img;
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
  
  public String getItemDateAddedStringSong() {
	return (""+itemdateadded);
  }
    
  public String getidS() {
    return(idSong);
  }
  
  public String getSname() {
	return(Sname);
  }
  
  public String getSlabel() {
	return(Slabel);
  }
  
  public String getSartist() {
	return(Sartist);
  }
  
  public String getSAlbum() {
	return (SAlbum);
  }
  
  public String getSgenre() {
	return(Sgenre);
  }
  
  public String getStime() {
  return(Stime);
  }
  
  public double getSprice() {
	return(Sprice);
  }
  
  public String getImagePath() {
	return(ImagePath);
  }
}