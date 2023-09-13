package factory;

public class Client {

	public static void main(String[] args) {
		Creator creatorA = new ConcreteCreatorA();
		Product productA = creatorA.factoryMethod();
		productA.create();
		
		Creator creatorB = new ConcreteCreatorB();
		Product productB = creatorB.factoryMethod();
		productB.create();

	}

}
