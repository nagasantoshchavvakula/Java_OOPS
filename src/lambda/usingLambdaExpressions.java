//Lambda expressions are usually passed as parameters to a function:
package lambda;

import java.util.ArrayList;

public class usingLambdaExpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>numbers=new ArrayList<Integer>();
		 	numbers.add(5);
		    numbers.add(9);
		    numbers.add(8);
		    numbers.add(1);
		    numbers.forEach((n)->{System.out.println(n);});
	}

}
