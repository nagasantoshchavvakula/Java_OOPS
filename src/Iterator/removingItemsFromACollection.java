//Use an iterator to remove numbers less than 10 from a collection:
package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class removingItemsFromACollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(11);
		numbers.add(13);
		numbers.add(15);
		numbers.add(17);
		Iterator<Integer>ch=numbers.iterator();
		
		while(ch.hasNext()) {
			Integer i=ch.next();
			if(i<10) {
				ch.remove();
			}
		}
		System.out.println(numbers);
	}

}
//Note:Trying to remove items using a for loop or a for-each loop would not work correctly because the collection is changing size at the same time that the code is trying to loop