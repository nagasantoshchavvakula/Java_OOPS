//Use isAlive() to prevent concurrency problems:
package Threads;

public class isAlive extends Thread {
	  public static int amount = 0;

	  public static void main(String[] args) {
		  isAlive thread = new isAlive();
	    thread.start();
	    // Wait for the thread to finish
	    while(thread.isAlive()) {
	    System.out.println("Waiting...");
	  }
	  // Update amount and print its value
	  System.out.println("Main: " + amount);
	  amount++;
	  System.out.println("Main: " + amount);
	  }
	  public void run() {
	    amount++;
	  }
}
