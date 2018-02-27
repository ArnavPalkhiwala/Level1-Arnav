import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1Exam implements ActionListener {

	JFrame frame = new JFrame("Color Teacher");
	JPanel panel = new JPanel();
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();

	public static void main(String[] args) {
		Level1Exam exam = new Level1Exam();
		exam.run();
	}

	void run() {
		frame.add(panel);
		panel.add(yellow);
		panel.add(red);
		panel.add(blue);
		panel.add(green);

		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);

		yellow.setBackground(Color.YELLOW);
		yellow.setOpaque(true);
		red.setBackground(Color.RED);
		red.setOpaque(true);
		blue.setBackground(Color.BLUE);
		blue.setOpaque(true);
		green.setBackground(Color.GREEN);
		green.setOpaque(true);

		frame.setVisible(true);
		frame.pack();

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == yellow) {
			speak("Yellow");
		}

		if (e.getSource() == red) {
			speak("Red");
		}

		if (e.getSource() == blue) {
			speak("Blue");
		}

		if (e.getSource() == green) {
			speak("Green");
		}
	}

}
