package userInput;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//System.out.print("Enter age and name of the employee:");
		System.out.println("Enter age of the employee:");
		System.out.println("Enter name of the employee:");
		int age=sc.nextInt();
		
		//System.out.print("Enter name:");
		String name=sc.nextLine();
		
		//System.out.print("The age and name of the employee is "+age+name);
		System.out.println("The age of the employee is:"+age);
		System.out.println("The name of the employee is:"+name);

	}

}
