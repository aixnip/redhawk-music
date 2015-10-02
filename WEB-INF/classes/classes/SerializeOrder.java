/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.io.*;

public class SerializeOrder
{
    public static void serialize(Order order, String filepath) throws IOException
    {
	  
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream(filepath);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(order);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved as order.ser");
      }
	  catch(IOException i)
      {
          i.printStackTrace();
      }
	}
}
