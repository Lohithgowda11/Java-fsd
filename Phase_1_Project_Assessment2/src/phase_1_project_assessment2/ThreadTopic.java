package phase_1_project_assessment2;

//Creating a thread by extending the 'Thread' class
class MyThread extends Thread {
 public void run() {
     System.out.println("Thread created by extending 'Thread' class");
     // Thread logic goes here
 }
}

//Creating a thread by implementing the 'Runnable' interface
class MyRunnable implements Runnable {
 public void run() {
     System.out.println("Thread created by implementing 'Runnable' interface");
     // Thread logic goes here
 }
}

public class ThreadTopic {
	public static void main(String[] args) {
	     // Creating a thread by extending 'Thread' class
	     MyThread thread1 = new MyThread();
	     thread1.start();

	     // Creating a thread by implementing 'Runnable' interface
	     MyRunnable runnable = new MyRunnable();
	     Thread thread2 = new Thread(runnable);
	     thread2.start();
	 }

}
