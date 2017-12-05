import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addition = new JButton();
	JButton subtraction = new JButton();
	JButton multiplication = new JButton();
	JButton division = new JButton();
	JTextField textfield1 = new JTextField();
	JTextField textfield2 = new JTextField();
	JTextField textfield3 = new JTextField();

	public static void main(String[] args) {
		Calculator Calculator = new Calculator();
		Calculator.run();
	}

	public void run() {
		frame.add(panel);
		frame.setVisible(true);
		getClass();
		frame.setSize(1000, 1000);
		panel.add(addition);
		panel.add(subtraction);
		panel.add(multiplication);
		panel.add(division);
		addition.setText("+");
		subtraction.setText("-");
		multiplication.setText("*");
		division.setText("/");
		panel.add(textfield1);
		panel.add(textfield2);
		panel.add(textfield3);
		textfield1.setText("Number #1");
		textfield2.setText("Number #2");
		textfield3.setText("Answer");
		frame.pack();
		addition.addActionListener(this);
		subtraction.addActionListener(this);
		multiplication.addActionListener(this);
		division.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String string1 = textfield1.getText();
		String string2 = textfield2.getText();
		double number1 = Double.parseDouble(string1);
		double number2 = Double.parseDouble(string2);
		
		if (e.getSource() == addition) {
		double answer = number1 + number2;
		String Answer = Double.toString(answer);
		textfield3.setText(Answer);
		}
		else if (e.getSource() == subtraction) {
			double answer2 = number1 - number2;
			String Answer2 = Double.toString(answer2);
			textfield3.setText(Answer2);

		}
		else if (e.getSource() == multiplication) {
			double answer3 = number1 * number2;
			String Answer3 = Double.toString(answer3);
			textfield3.setText(Answer3);

		}
		else if (e.getSource() == division) {
			double answer4 = number1 / number2;
			String Answer4 = Double.toString(answer4);
			textfield3.setText(Answer4);

		}
	}
}
