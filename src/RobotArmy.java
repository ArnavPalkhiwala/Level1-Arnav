public class RobotArmy {
	public static void main(String[] asd) {
		// 1. create a new human

		Human human = new Human();
		human.name = "John";

		// 2. create a new Robot army of good and evil robots.

		String Bob = "Bob";
		Robot robot = new Robot(Bob, true);
		String Jack = "Jack";
		Robot robot2 = new Robot(Jack, false);
		String Jim = "Jim";
		Robot robot3 = new Robot(Jim, true);
		String Joe = "Joe";
		Robot robot4 = new Robot(Joe, false);
		String Rachet = "Rachet";
		Robot robot5 = new Robot(Rachet, true);

		// 3. command your robot army to destroy a human
		robot.destroy(human);
		robot2.destroy(human);
		robot3.destroy(human);
		robot4.destroy(human);
		robot5.destroy(human);

	}
}

/**
 * Human Class
 */
class Human {
	String name;
	boolean isAlive;

	public Human(String name) {
		this.name = name;
		this.isAlive = true;
	}

	public Human() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void die() {
		isAlive = false;
	}
}

/**
 * Robot Class
 */
class Robot {
	boolean isEvil;
	String name;

	public Robot(String name, boolean isEvil) {
		this.name = name;
		this.isEvil = isEvil;
	}

	public void destroy(Human man) {
		if (isEvil) {
			System.out
					.println("Beep Boop Pew! Oh no! the robot " + name + " blasted " + man.getName() + "'s head off!");
			man.die();
		} else {
			System.out.println("No!! The robot " + name + " loves " + man.getName());
		}
	}
}
