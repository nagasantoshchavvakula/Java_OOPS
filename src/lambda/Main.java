//Use Java's Consumer interface to store a lambda expression in a variable:
package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			 ArrayList<Integer> numbers = new ArrayList<Integer>();
			    numbers.add(5);
			    numbers.add(9);
			    numbers.add(8);
			    numbers.add(1);
			    Consumer method = (n) -> { System.out.println(n); };
			    numbers.forEach( method );
		}

	}



