//Use a HashSet that stores Integer objects:
package HashSet;

import java.util.HashSet;

public class otherTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>number=new HashSet<Integer>();
		//Initiating values
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		number.add(6);
		number.add(7);
		number.add(8);
		//number.add(9);
		//number.add(10);
		
		System.out.println(number);
	// Show which numbers between 1 and 10 are in the set
		for(int i=1;i<=10;i++) {
			if(number.contains(i)) {
				System.out.println(i+" "+"was found in the set");
			}else {
				System.out.println(i+" "+"was not found in the set");
			}
		}
	}

}
