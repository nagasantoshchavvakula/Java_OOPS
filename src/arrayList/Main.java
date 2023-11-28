package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		ArrayList<String>cars=new ArrayList<String>();
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	   // System.out.println(cars);//Prints all data
	    //System.out.println(cars.get(0));//Prints data related to index value
	   // cars.set(1, "Opel");//modifies array
	    //System.out.println(cars);//prints the modified array
	    //cars.remove(1);//removes the element
	   // System.out.println(cars);//prints the array after the removal of element
	   // cars.clear();
	   // System.out.println(cars);//removes all the elements in the ArrayList
	   
	    System.out.println( cars.size());
 */ 
	    //Loop through Array List
	    
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    System.out.println(cars);
	    for (int i = 0; i < cars.size(); i++) {
	      System.out.println(cars. get(i));
	    }
	    
	    //loop through an ArrayList with the for-each loop:
	    Collections.sort(cars);  // Sort cars

	    for (String i : cars) {
	      System.out.println(i);
	    }
	    
	    //ArrayList to store numbers (add elements of type Integer):
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(20);
	    myNumbers.add(10);
	    myNumbers.add(25);
	    myNumbers.add(15);
	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	    
	    //Sort an ArrayList of Integers:
	    Collections.sort(myNumbers);  // Sort myNumbers

	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	}

}
