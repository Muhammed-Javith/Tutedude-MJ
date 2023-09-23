package mjavith.io;

public class Customer {
	String name;
	int cash;
	public Customer(String name, int cash) {
		this.name = name;
		this.cash = cash;
	}
	@Override
	public String toString() {
		//return "Customer [name=" + name + ", cash=" + cash + "]";
		return this.name;
	}
	public void buy(SmartPhone sm1) {
		System.out.println("Trying to buy the SmartPhone: " + sm1);
		
	}
	
}
