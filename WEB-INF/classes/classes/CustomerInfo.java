/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
public class CustomerInfo implements java.io.Serializable {

  private String firstname;
  private String lastname;
  private String address1;
  private String address2;
  private String city;
  private String state;
  private String zipcode;
  private String phone;
  private String savePayment;
  private String IITID;

  public CustomerInfo() {
	firstname = "";
	lastname = "";
    address1 = "";
    address2 = "";
    city = "";
    state = "";
    zipcode = "";
    phone = "";
	savePayment = "-1";
	IITID = "A";
  }
  
	public CustomerInfo(String fn, String ln, String ad1, String ad2, String ct, String st, String zp, String ph, String IITID) {
	this.firstname = fn;
	this.lastname = ln;
    this.address1 = ad1;
    this.address2 = ad2;
    this.city = ct;
    this.state = st;
    this.zipcode = zp;
    this.phone = ph;
	this.IITID = IITID;
  }
  
    public CustomerInfo(String fn, String ln, String ad1, String ad2, String ct, String st, String zp, String ph,String savePayment, String IITID) {
	this.firstname = fn;
	this.lastname = ln;
    this.address1 = ad1;
    this.address2 = ad2;
    this.city = ct;
    this.state = st;
    this.zipcode = zp;
    this.phone = ph;
	this.savePayment = savePayment;
	this.IITID = IITID;
  }
  
  public void setNames(String fn, String ls) {
    this.firstname = fn;
	this.lastname = ls;
  }
    
  public void setAddress1(String a1) {
    this.address1 = a1;
  }
  
  public void setAddress2(String a2) {
    this.address2 = a2;
  }
  
  public void setCity(String c) {
    this.city = c;
  }
  
  public void setState(String s) {
    this.state = s;
  }
  
  public void setZipCode(String z) {
    this.zipcode = z;
  }
  
  public void setPhone(String p) {
    this.phone = p;
  }
  
  public void setSavePayment(String savePayment)
  {
	this.savePayment = savePayment;
  }
  
  public void setIITID(String IITID)
  {
	this.IITID = IITID;
  }
  
  public String getFirstname() {
	return(firstname);
  }
  
  public String getLastname() {
	return(lastname);
  }
 
  public String getA1() {
    return(address1);
  }
  
  public String getA2() {
	return(address2);
  }
  
  public String getCity() {
	return(city);
  }
  
  public String getState() {
	return(state);
  }
  
  public String getZipCode() {
	return(zipcode);
  }
  
  public String getPhone() {
	return(phone);
  }
  
  public String getSavePayment()
  {
	return (savePayment);
  }
  
  public String getIITID()
  {
	return (IITID);
  }
}
