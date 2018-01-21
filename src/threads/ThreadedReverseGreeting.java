package threads;


public class ThreadedReverseGreeting {
	public static void main(String[] args) {
		 Thread thread1 = new Thread(()-> doStuff(0));
thread1.start();

		
	}
 
  public static void doStuff(int counter) {
	  if(counter != 51) {
	 Thread nextThread = new Thread(()-> doStuff(counter+1));
	 nextThread.start();
	 try {
		nextThread.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.println("Hello from Thread " + counter);
  }
	  else {
		  
	  }
}}
//Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
//Thread 2 creates Thread 3; and so on, up to Thread 50. 
//Each thread should print "Hello from Thread <num>!", 
//but you should structure your program such that the threads print their greetings in reverse order.