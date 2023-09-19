/*
//Creating Constructor
public class Main {

	int x;
	public Main() {
		x=5;
	}
	public static void main(String[] args) {
		Main myObj=new Main();
		System.out.println(myObj.x);

	}

}
*/

//Constructors can also take parameters, which is used to initialize attributes.
public class Main {
	  int x;

	  public Main(int y) {
	    x = y;
	  }

	  public static void main(String[] args) {
	    Main myObj = new Main(50);
	    System.out.println(myObj.x);
	  }
	}
