//Another way to create a thread is to implement the Runnable interface:
package Threads;

public class runnableClass implements Runnable{
	public void run() {
		System.out.println("This code is running in a thread");
	}
}
