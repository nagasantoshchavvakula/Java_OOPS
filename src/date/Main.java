package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		
	    LocalDate myObj = LocalDate.now(); // Create a date object
	    System.out.println(myObj); // Display the current date
	    
	    LocalTime time = LocalTime.now();
	    System.out.println(time);// Display the current time
	    
	    LocalDateTime dateTime = LocalDateTime.now();
	    //System.out.println(dateTime);//Display the current date and time
	    System.out.println("Before formatting: " + dateTime);
	    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	    String formattedDate = dateTime.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate); //Displaying formatted date
	    
	}
}

