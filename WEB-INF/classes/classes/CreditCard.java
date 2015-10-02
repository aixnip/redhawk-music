/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.util.Date;

public class CreditCard implements java.io.Serializable {

  private String crecardNumber;
  private String crecardCode;
  private String cMonth;
  private String cYear;
 
 public CreditCard() {
    crecardNumber= "";
    crecardCode = "";
	cMonth = "";
	cYear = "";
  }
  
  public CreditCard(String crecardNumber, String month, String year, String crecardCode) {
	this.crecardNumber = crecardNumber;
	this.crecardCode = crecardCode;
	this.cMonth = month;
	this.cYear = year;
  }
  
  public void setcreCardN(String n) {
    this.crecardNumber = n;
  }
  
  public void setcreCardC(String c) {
    this.crecardCode = c;
  }
  
  public void setMonth(String cm) {
    this.cMonth = cm;
  }
  
    public void setYear(String cy) {
    this.cYear = cy;
  }

  public String getCCNumber() {
	return(crecardNumber);
  }
  
  public String getCCCode() {
	return(crecardCode);
  }
  
  public String getMonth() {
    return (cMonth);
  }
  
  public String getYear() {
    return (cYear);
  }
}
