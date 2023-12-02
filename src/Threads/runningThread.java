package Threads;

import abstraction.Main;

public class runningThread extends Thread {
	  public static void main(String[] args) {
	    runningThread thread = new runningThread();
	    thread.start();
	    System.out.println("This code is outside of the thread");
	  }
	  public void run() {
	    System.out.println("This code is running in a thread");
	  }
	}
