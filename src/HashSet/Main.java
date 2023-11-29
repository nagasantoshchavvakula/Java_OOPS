package HashSet;

import java.util.HashSet;

public class Main {

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
		System.out.println(cars);
		System.out.println(cars.size());
		
		System.out.println(cars.contains("Benz"));//To check whether an item exists in a HashSet, use the contains() method
		
		//displays objects after removal of an item
		//System.out.println(cars.remove("Audi"));
		//System.out.println(cars);
		cars.remove("Hyundai");
		System.out.println(cars);
		
		//To remove all items, use the clear() method:
		cars.clear();
		System.out.println(cars);
		
	}

}
