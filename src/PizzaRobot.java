import javax.print.DocFlavor.STRING;

public class PizzaRobot {
	private boolean isOnDiet;
	private double allowance;
	private String name;
	private int tasteLevel;

	public PizzaRobot(boolean isOnDiet, double allowance, String name, int tasteLevel) {
		this.isOnDiet = isOnDiet;
		this.allowance = allowance;
		this.name = name;
		this.tasteLevel = tasteLevel;
	}

	public boolean getisOnDiet() {
		return this.isOnDiet;
	}

	public double getallowance() {
		return this.allowance;
	}

	public String getname() {
		return this.name;
	}

	public int gettastelevel() {
		return this.tasteLevel;
	}



	public void isOnDiet(boolean isOnDiet) {
		this.isOnDiet = isOnDiet;
	}
	
	public void allowance(double allowance) {
		this.allowance = allowance;
	}
	
	public void isOnDiet(int tasteLevel) {
		this.tasteLevel = tasteLevel;
	}

}