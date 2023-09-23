package mjavith.io;

public class SmartPhone {
	String Modelname;
	int price;
	String color;

	public SmartPhone(String modelname, int price, String color) {
		Modelname = modelname;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		// return "SmartPhone [Modelname=" + Modelname + ", price=" + price + ", color="
		// + color + "]";
		return this.Modelname + " " + this.color + " " + this.price;
	}

}
