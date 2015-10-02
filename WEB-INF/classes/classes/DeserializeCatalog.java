/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.io.*;

public class DeserializeCatalog
{
    public static Catalog deserialize(Catalog catalog, String filepath) throws IOException
			{	
				try
				{
					FileInputStream fileIn = new FileInputStream(filepath);
					ObjectInputStream in = new ObjectInputStream(fileIn);
					catalog = (Catalog) in.readObject();
					in.close();
					fileIn.close();
					return catalog;
				}
				catch(IOException i)
				{
					return null;
				}	
				catch(ClassNotFoundException c)
				{
					return null;
				}
			}
}
