//Create a method which takes a lambda expression as a parameter:
package lambda;

interface StringFunction {
	  String run(String str);
	}
public class lambdaExpressionAsParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    StringFunction exclaim = (s) -> s + "!";
	    StringFunction ask = (s) -> s + "?";
	    printFormatted("Hello", exclaim);
	    printFormatted("Hello", ask);
	}

	private static void printFormatted(String str, StringFunction format) {
		// TODO Auto-generated method stub
	    String result = format.run(str);
	    System.out.println(result);
	}

}
