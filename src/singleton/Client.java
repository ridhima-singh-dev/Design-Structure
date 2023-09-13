package singleton;

public class Client {

	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		singleton.showMessage();

	}
	
	/*1.The Singleton class has a private constructor to prevent direct instantiation.

2.The uniqueInstance variable is declared as volatile to ensure that changes made by one 
thread are visible to all other threads.

3.In the getInstance method, there's a double-checked locking mechanism. It first checks if 
uniqueInstance is null (outside the synchronized block) to avoid the overhead of synchronization 
once the instance is created. Then, it enters a synchronized block to ensure thread safety and 
checks again if uniqueInstance is still null. If it is, a new instance is created.*/

}
