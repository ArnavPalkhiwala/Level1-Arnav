public class Pizza {
	private double price;
	private int tastiness;
	private int calories;
	private String size;

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza(7.95, 10, 250, "Large");
		Pizza pizza2 = new Pizza(10.50, 6, 110, "Small");
		Pizza pizza3 = new Pizza(3.00, 4, 300, "Medium");
		Pizza pizza4 = new Pizza(5.50, 8, 430, "Extra Large");
		System.out.println(pizza1.getTastiness());
		pizza1.setTastiness(8);
		int secondTasty = pizza1.getTastiness();
		System.out.println(secondTasty);
		System.out.println(pizza2.getPrice());
		pizza2.setPrice(11.50);
		double secondPrice = pizza2.getPrice();
		System.out.println(secondPrice);

	}

	public Pizza(double price, int tastiness, int calories, String size) {
		this.price = price;
		this.tastiness = tastiness;
		this.calories = calories;
		this.size = size;
	}

	public double getPrice() {
		return this.price;
	}

	public int getTastiness() {
		return this.tastiness;
	}

	public int getCalories() {
		return this.calories;
	}

	public String getSize() {
		return this.size;
	}

	public void setTastiness(int tastiness) {
		this.tastiness = tastiness;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
