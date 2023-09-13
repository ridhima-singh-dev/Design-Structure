package adapter;

public class Client {
	//In this example, the OldSystemAdapter acts as a bridge between the OldSystem and the NewSystem interfaces, 
	//allowing the old system to work seamlessly with the new system.
	//Adapter comes under structural design pattern
	//Stream classes and Array.asList(array) are some example of adapter design pattern
	public static void main(String[] args) {
		 OldSystem oldSystem = new OldSystem();
	        NewSystem adapter = new OldSystemAdapter(oldSystem);

	        // Using the adapted oldSystem with the new system
	        adapter.doSomethingNew(); // This will call doSomethingOld()
	}

}
