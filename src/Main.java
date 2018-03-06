import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	JFrame frame = new JFrame();
	Painting painting = new Painting();
	
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}
	
	public void run() {
		
		frame.add(painting);
		frame.setVisible(true);
		
	}
}

