import javax.swing.JOptionPane;

public class MethodPractice {
	static int squared(String number) {
		int x = Integer.parseInt(number);
		int y = x * x;
		return y;


	}

	public static void main(String[] args) {
		String number = JOptionPane.showInputDialog("Please type a number...");
		int x = squared(number);	
		System.out.println(x);
	}
}
