//iterator() method can be used to get an Iterator for any collection

// Import the ArrayList class and the Iterator class
package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>cars=new ArrayList<String>();
		   	cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    System.out.println(cars);
		    
		 // Get the iterator
		    Iterator<String>ch=cars.iterator();
		 // Print the first item
		    System.out.println(ch.next());
	}

}
