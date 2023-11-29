//Create a HashMap object called people that will store String keys and Integer values
package HashMap;

import java.util.HashMap;

public class otherTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>people=new HashMap<String,Integer>();
		people.put("JohnCena", 25);
		people.put("RandyOrton", 35);
		people.put("TripleH", 45);
		people.put("BigShow", 55);
		
		for(String i : people.keySet()){
			System.out.println("keys:"+i+" "+"value:"+ people.get(i));
		}
	}

}
