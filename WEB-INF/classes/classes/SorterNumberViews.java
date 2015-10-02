/* CSP - 595
final project - RedHawk Music Retailer
Lei Ling, Jorge Nieto, Pinxia Ye

*/

package classes;
import java.util.List;
import java.util.*;

public class SorterNumberViews implements Comparator<Video> {

	public int compare(Video i1, Video i2) {
    
		return i2.getNumberViews() - i1.getNumberViews();
    }

}
