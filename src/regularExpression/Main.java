//Find out if there are any occurrences of the word "w3schools" in a sentence:
package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
		    Matcher matcher = pattern.matcher("Visit W3Schools!");
		    boolean matchFound = matcher.find();
		    if(matchFound) {
		      System.out.println("Match found");
		    } else {
		      System.out.println("Match not found");
		    }
	}

}
