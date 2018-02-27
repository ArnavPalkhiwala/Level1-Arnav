import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


public class ColorTimerGame implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Timer timer = new Timer(5000, this);


	public static void main(String[] args) {

		ColorTimerGame ctg = new ColorTimerGame();
		ctg.run();
	}

	void run() {

		frame.add(panel);
		timer.start();
		
		frame.pack();
		frame.setVisible(true);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
