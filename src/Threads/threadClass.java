//can be created by extending the Thread class and overriding its run() method:
package Threads;

public class threadClass extends Thread {

	public void run() {
		System.out.println("This code is running in a thread");
	}

}
