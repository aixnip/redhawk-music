/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Video extends Items implements java.io.Serializable {
  private String idVideo;
  private String Vname;
  private String Vlabel;
  private String Vartist;
  private String Vgenre;
  private double Vprice;
  private int numberViews;
  private String ImagePath;

  public Video() {
    idItem = 3;
	idVideo = "";
    Vname = "";
    Vlabel = "";
    Vartist = "";
    Vgenre = "";
    Vprice = 0.0;
	numberViews = 0;
	ImagePath = "";
	//----New Inherited Attributes----//
	purchased = false;
    numberDownloads = 0;
    rating = 0;
	itemdateadded = new Date();
  }
  
  public Video(String idv, String vn, String vl, String va, String vg, double vp, int nd, int rt, String path, String ida, int nvs) {
	idItem = 3;
	this.idVideo = idv;
    this.Vname = vn;
    this.Vlabel = vl;
    this.Vartist = va;
    this.Vgenre = vg;
    this.Vprice = vp;
	this.ImagePath = path;
	this.numberViews = nvs;
	//----New Inherited Attributes
	HashMName = vn;
	HashMArtist = va;
	numberDownloads = nd;
	rating = rt;
	try {
		itemdateadded = new SimpleDateFormat("MM/dd/yyyy").parse(ida);
	}
	catch (ParseException e){
		e.printStackTrace();
	}
  }
  
   //----Hash Map Constructor----//
  
  public Video(String HMid, String HMN, String HMA)
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
  
  public void setVprice(double p) {
    this.Vprice = p;
  }

  public void setImgPath(String img) {
    this.ImagePath = img;
  }  
  
  public void setNumberViews(int nvs){
	this.numberViews = nvs;
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

  public String getItemDateAddedStringVideo() {
	return (""+itemdateadded);
  }  
  
  public String getidV() {
    return(idVideo);
  }
  
  public String getVname() {
	return(Vname);
  }
  
  public String getVlabel() {
	return(Vlabel);
  }
  
  public String getVartist() {
	return(Vartist);
  }
  
  public String getVgenre() {
	return(Vgenre);
  }
  
  public double getVprice() {
	return(Vprice);
  }
  
  public String getImagePath() {
	return(ImagePath);
  }
  
  public int getNumberViews() {
	return(numberViews);
  }
}
