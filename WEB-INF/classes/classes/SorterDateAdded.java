/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.util.List;
import java.util.*;
import java.util.Date;

public class SorterDateAdded implements Comparator<Items> {

	public int compare(Items i1, Items i2) {
		
		int dateComparison = i2.getItemDateAdded().compareTo(i1.getItemDateAdded());
    
		return dateComparison == 0 ? i2.getItemDateAdded().compareTo(i1.getItemDateAdded()) : dateComparison;
    }

}