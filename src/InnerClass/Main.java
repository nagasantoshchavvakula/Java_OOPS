package InnerClass;

public class Main extends outerClass{

	public static void main(String[] args) {
		
		//outerClass myOuter = new outerClass();
		outerClass.innerClass myInner = new outerClass.innerClass();
	    System.out.println(myInner.y);

	}

}
