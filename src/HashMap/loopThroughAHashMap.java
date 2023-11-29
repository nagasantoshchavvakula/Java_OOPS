package HashMap;

import java.util.HashMap;

public class loopThroughAHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    
		    //Loop through the items of a HashMap with a for-each loop.
		    
		    for (String i : capitalCities.keySet()) {    //returns keys
		      System.out.println(i);
		    }
		    for (String i : capitalCities.values()) {    //returns values
			      System.out.println(i);
			    }
		    for (String i : capitalCities.keySet()) { 	//returns keys and values
		    	  System.out.println("key: " + i + " value: " + capitalCities.get(i));
		    	}
	}	

}
