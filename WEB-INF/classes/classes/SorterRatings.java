/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.util.List;
import java.util.*;

public class SorterRatings implements Comparator<Items> {

	public int compare(Items i1, Items i2) {
    
		return i2.getRatings() - i1.getRatings();
    }

}