/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.io.*;

public class SerializeUser
{
    public static void serialize(User user, String filepath) throws IOException
    {
	  
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream(filepath);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(user);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved as user.ser");
      }
	  catch(IOException i)
      {
          i.printStackTrace();
      }
	}
}
