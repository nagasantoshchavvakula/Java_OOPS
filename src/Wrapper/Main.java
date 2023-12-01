//Creating Wrapper Objects
package Wrapper;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Integer myInt = 5;
		    Double myDouble = 5.99;
		    Character myChar = 'A';
	/*
		    System.out.println(myInt);
		    System.out.println(myDouble);
		    System.out.println(myChar);
	*/	    
		    System.out.println(myInt.intValue());
		    System.out.println(myDouble.doubleValue());
		    System.out.println(myChar.charValue());
		    
		    //convert an Integer to a String, and use the length() method of the String class to output the length of the "string":
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the value of ch:");
		    Integer ch=sc.nextInt();
		    String myString=ch.toString();
		    System.out.print("The the length of the ch values is:"+myString.length());
	}

}
