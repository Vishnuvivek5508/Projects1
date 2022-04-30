
public class Motors extends Vehicle {
	void carbrand()
	{System.out.println("The car brand is Audi");
	}
	void bikebrand()
	{
		System.out.println("The bike brand is Bajaj");
	}
	public static void main(String[] args) {
		Motors m1 = new Motors();
		m1.carbrand();
		m1.bikebrand();
		m1.car();
		m1.bike();
		m1.cycle();
	}
}
