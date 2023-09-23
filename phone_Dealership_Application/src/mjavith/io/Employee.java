package mjavith.io;

public class Employee {
	String name;
	int id;
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public void sellPhone(Customer cm, SmartPhone sm)
	{
		if(cm.cash>=sm.price) {
			System.out.println("Sold this Smartphone to Customer: " + cm);
		}
		else {
			emi(sm);
		}
	}
	public void emi(SmartPhone sm) {
		double emi = (sm.price*1.0)/12.0;
		System.out.println("The 12-month emi for buying this smartphone will be: "+emi);
	}
	

}
