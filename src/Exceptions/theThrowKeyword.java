//Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted":
package Exceptions;

public class theThrowKeyword {
	 static void checkAge(int age) {
		    if (age < 18) {
		      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		    }
		    else {
		      System.out.println("Access granted - You are old enough!");
		    }
		  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   //	checkAge(15); // Set age to 15 (which is below 18...)
		checkAge(20);
	}

}
