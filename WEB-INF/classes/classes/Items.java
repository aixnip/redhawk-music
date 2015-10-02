/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.util.Date;

public class Items implements java.io.Serializable {
  public int idItem;
  public String idHashMap;
  public boolean purchased;
  public int numberDownloads;
  public int rating;
  public Date itemdateadded;
  public String HashMName;
  public String HashMArtist;

  public Items() {
    idItem = 0;
	idHashMap = new String();
    purchased = false;
    numberDownloads = 0;
    rating = 0;
	itemdateadded = new Date();
	idHashMap = new String();
	HashMName = new String();
	HashMArtist = new String();
  }
  
  public Items(String HMid, String HMN, String HMA) 
  {
	this.idHashMap = HMid;
	this.HashMName = HMN;
	this.HashMArtist = HMA;
  }
  
  public String getidHashMap() {
	return (idHashMap);
  }
  
  public String getHashMName() {
    return(HashMName);
  }
  
  public String getHashMArtist() {
    return(HashMArtist);
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
  
  public Date getItemDateAdded() {
	return(itemdateadded);
  }
  
   public int getRatings() {
	return(rating);
  }
  
  public void playAll() {
	
  }
  
  public void playSample() {
	
  }
  
  public String toString() {
  	return "Items [idItem=" + idItem + ", idHashMap=" + idHashMap
  			+ ", purchased=" + purchased + ", numberDownloads="
  			+ numberDownloads + ", rating=" + rating + ", itemdateadded="
  			+ itemdateadded + ", HashMName=" + HashMName + ", HashMArtist="
  			+ HashMArtist + "]";
  }
  
}
