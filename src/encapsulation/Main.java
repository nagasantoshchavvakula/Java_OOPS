package encapsulation;

public class Main {

	 //private String name;

	public static void main(String[] args) {
		    Peron myObj = new Peron();
		    myObj.setName("John");  // error
		    System.out.println(myObj.getName()); // error 
		  }
}
