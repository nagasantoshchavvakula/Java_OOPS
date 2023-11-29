package HashMap;

//Import the HashMap class
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a HashMap object called capitalCities
		HashMap<String,String>capitalCities=new HashMap<String,String>();
		// Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    System.out.println(capitalCities.get("England")); //To access a value in the HashMap, use the get() method 
	   
	   // capitalCities.remove("England"); //To remove an item, use the remove() method
	    
	    System.out.println(capitalCities.size()); //To find out how many items there are, use the size() method
	    
	   // capitalCities.clear();//To remove all items, use the clear() method
	    
	    
	    
	}

}
