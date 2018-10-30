import java.util.Set;

public class Calculator2 {

	int total = 0;
	String greeting;

	public static void main(String[] args) {

		Calculator2 c = new Calculator2(10, "Hello");
		int x = c.add(10, 5);
		int y = c.subtract(10, 5);
		int z = c.multiply(10, 5);
		int a = c.divide(10, 5);
		String s = c.getGreeting();
		System.out.println(s);
		System.out.println( "10" + " + " + "5" + " = " + x);
		System.out.println("10" + " - " + "5" + " = " + x);
		System.out.println("10" + " * " + "5" + " = " + x);
		System.out.println("10" + " / " + "5" + " = " + x);


	}

	void setGreeting (String greeting) {
		
		System.out.println("Hello human");
		
		
		
	}
	
	String getGreeting () {
		
		return greeting;
	}
	
	public Calculator2(int total, String greeting) {

		this.total = total;
		this.greeting = greeting;

	}

	int add(int one, int two) {

		total = one + two;
		int ao = one;
		int at = two;

		return total;

	}

	int subtract(int one, int two) {

		total = one - two;
		return total;

	}

	int multiply(int one, int two) {

		total = one * two;
		return total;

	}

	int divide(int one, int two) {

		total = one / two;
		return total;

	}

}
