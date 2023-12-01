//To loop through a collection, use the hasNext() and next() methods of the Iterator:
package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class loopingThroughACollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>cars=new ArrayList<String>();
	   	cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	   // System.out.println(cars);
	    
	 // Get the iterator
	    Iterator<String>ch=cars.iterator();
	 // Loop through a collection
	    while(ch.hasNext()) {
	    	System.out.println(ch.next());
	    }
	}

}
