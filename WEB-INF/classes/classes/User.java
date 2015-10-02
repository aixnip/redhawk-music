/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.util.*;

public class User implements java.io.Serializable
{	
	public int idUser;
	private int isIIT;
    private String userName;
    private String passWord;
    private String emailAddress;
	private ArrayList<Order> order;
	private CustomerInfo userinfo;
	private CreditCard card;
    
    public User()
    {
		isIIT = -1;
    }
    
    public User(int isIIT, String userName, String passWord, String emailAddress, ArrayList<Order> order, CustomerInfo ui, CreditCard card)
    {	
		this.isIIT = isIIT;
        this.userName = userName;
        this.passWord = passWord;
        this.emailAddress = emailAddress;
		this.order = order;
		this.userinfo = ui;
		this.card = card;
    }
	
	public void setIsIIT(int isIIT)
    {
         this.isIIT = isIIT;
    }

    public int getIsIIT()
    { 
        return isIIT; 
    }
	
    public void setUserName(String userName)
    {
         this.userName = userName;
    }

    public String getUserName()
    { 
        return userName; 
    }
    
    public void setPassWord(String passWord)
    {
        this.passWord = passWord;
    }

    public String getPassWord()
    { 
        return passWord; 
    }
    
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress()
    { 
        return emailAddress; 
    }
	
	public void setOrder(ArrayList<Order> order)
    {
        this.order = order;
    }

    public ArrayList<Order> getOrder()
    { 	
		return order;
    }
	
	public CustomerInfo getCustomerInfo()
	{
		return userinfo;
	}
	
	public void setCustomerInfo(CustomerInfo userinfo)
	{
		this.userinfo = userinfo;
	}
	
	public CreditCard getCreditCard()
	{
		return card;
	}
	
	public void setCreditCard(CreditCard card)
	{
		this.card = card;
	}
}
