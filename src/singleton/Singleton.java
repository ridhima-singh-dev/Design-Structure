package singleton;

public class Singleton {
	
	private volatile static Singleton uniqueInstance;
	
	private Singleton() {
		//private constructor to prevent instantiation
	}
	
	public static Singleton getInstance() {
		if(uniqueInstance == null) {
			synchronized(Singleton.class) {
				//Double-checking locking to ensure safety
				if(uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
	public void showMessage() {
		System.out.println("I am a singleton");
	}

}
