/*If the class implements the Runnable interface, the thread can be run by passing an instance
of the class to a Thread object's constructor and then calling the thread's start() method: */
package Threads;

public class runnableInterface implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runnableInterface obj = new runnableInterface();
		    Thread thread = new Thread(obj);
		    thread.start();
		    System.out.println("This code is outside of the thread");
		  }
		  public void run() {
		    System.out.println("This code is running in a thread");
		  }
	}


