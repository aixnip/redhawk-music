/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.io.*;

public class SerializeCatalog
{
    public static void serialize(Catalog catalog, String filepath) throws IOException
    {
	  
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream(filepath);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(catalog);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved as catalog.ser");
      }
	  catch(IOException i)
      {
          i.printStackTrace();
      }
	}
}
