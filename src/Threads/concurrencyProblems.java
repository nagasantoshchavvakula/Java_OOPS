//A code example where the value of the variable amount is unpredictable:
package Threads;

public class concurrencyProblems extends Thread {
	  public static int amount = 0;

	  public static void main(String[] args) {
		  concurrencyProblems thread = new concurrencyProblems();
	    thread.start();
	    System.out.println(amount);
	    amount++;
	    System.out.println(amount);
	  }

	public void run() {
	    amount++;
	  }
}
