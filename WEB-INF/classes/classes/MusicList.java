/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.util.List;
import java.util.*;

public class MusicList{
  private List<Order> listofOrders;
  private List<Items> itemlistcart;
  private DeliveryService delivery;

 
  public MusicList() {
    listofOrders = new ArrayList<Order>();
	itemlistcart = new ArrayList<Items>();
  }
  
  public List<Order> getlistofOrders() {
    return(listofOrders);
  }
  
  public List<Items> getlistofItems() {
    return(itemlistcart);
  }
  
  public void addOrder(Order o) {
   
  }
  
  public void addItem(Items i) {
  
  }

}