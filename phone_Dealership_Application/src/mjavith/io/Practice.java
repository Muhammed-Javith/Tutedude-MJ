package mjavith.io;

public class Practice {

	public static void main(String[] args) {
		
		SmartPhone sm1 = new SmartPhone("Oppo",75000,"gold");
		SmartPhone sm2 = new SmartPhone("Vivo",60000,"Blue");
		SmartPhone sm3 = new SmartPhone("Asus",85000,"Green");
		SmartPhone sm4 = new SmartPhone("Lava",150000,"Black");
		
		Employee e1 =  new Employee("John",1);
		Employee e2 =  new Employee("Abrar",2);
		Employee e3 =  new Employee("Mosh",3);		
		
		Customer cm1 = new Customer("A",80000);
		Customer cm2 = new Customer("B",90000);
		Customer cm3 = new Customer("C",40000);
//		cm1.buy(sm1);
//		e1.sellPhone(cm1, sm1);
//		
//		cm2.buy(sm4);
//		e3.sellPhone(cm2, sm4);
		
		cm3.buy(sm2);
		e2.sellPhone(cm3, sm2);
	}


}
