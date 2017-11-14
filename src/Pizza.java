public class Pizza {
	private double price;
	private int tastiness;
	private int calories;
	private String size;

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza(7.95, 10, 1882, "large");
		Pizza pizza2 = new Pizza(10.50, 6, 483, "small");
		Pizza pizza3 = new Pizza(3.00, 4, 966, "medium");
		Pizza pizza4 = new Pizza(5.50, 8, 2010, "extra large");
		System.out.println(pizza1.getTastiness());
		pizza1.setTastiness(8);
		int secondTasty = pizza1.getTastiness();
		System.out.println(secondTasty);
		System.out.println("$" + pizza2.getPrice());
		pizza2.setPrice(11.50);
		double secondPrice = pizza2.getPrice();
		System.out.println("$" + secondPrice);

	}

	public Pizza(double price, int tastiness, int calories, String size) {
		this.price = price;
		this.tastiness = tastiness;
		this.calories = calories;
		this.size = size;

	}

	public boolean isHealthy() {
		if (this.size == "small") {
			if (this.calories < 500) {
				return true;
			} else {
				return false;

			}
		}

		else if (this.size == "medium") {
			if (this.calories < 1000) {
				return true;
			} else {
				return false;

			}
		}

		else if (this.size == "large") {
			if (this.calories < 1500) {
				return true;
			} else {
				return false;

			}
		}

		else if (this.size == "extra large") {
			if (this.calories < 2000) {
				return true;
			} else {
				return false;

			}
		}

		return false;
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
