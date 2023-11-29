package HashSet;

import java.util.HashSet;

public class loopThroughAHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String>cars=new HashSet<String>();
		
		//to add items to it, use the add() method:
		cars.add("volvo");
		cars.add("Audi");
		cars.add("Benz");
		cars.add("Kia");
		cars.add("Hyundai");
		cars.add("Benz");
		
		//Loop through the items of an HashSet with a for-each loop:
		for(String i:cars) {
			System.out.println(i);
		}
		
	}

}
