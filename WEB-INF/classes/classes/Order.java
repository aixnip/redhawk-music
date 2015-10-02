/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;

import java.util.*;

public class Order implements java.io.Serializable
{

  private int idOrder;
  private ArrayList<Items> item;
  private String purchaseDate;
  private DeliveryService delivery;
  private double totalamountord;

  public Order() {
    idOrder = 0;
    totalamountord = 0;
  }
  
  public Order(int or, ArrayList<Items> item, String pd, double tao) {
    this.idOrder = or;
	this.item = item;
    this.purchaseDate = pd;
    this.totalamountord = tao;
  }
    
  public int getIdOrder() {
    return(idOrder);
  }
  
  public String getPurDate() {
    return(purchaseDate);
  }
  
  public void delivery() {}
  
  public double getTotal() {
    return(totalamountord);
  } 
  
  public ArrayList<Items> getItem(){
	  return item;
  }
  
}