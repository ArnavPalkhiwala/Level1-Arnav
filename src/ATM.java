import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ATM implements ActionListener {
	JFrame frame = new JFrame("ATM");
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JButton deposit = new JButton();
	JButton withdraw = new JButton();
	JTextField amountdep = new JTextField();
	JTextField available = new JTextField();
	double amount = 100.00;
	JTextField amountwith = new JTextField();

	public static void main(String[] args) {
		ATM ATM = new ATM();
		ATM.run();
	}

	void run() {
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		frame.add(panel);
		deposit.setText("Deposit:");
		withdraw.setText("Withdraw:");
		amountdep.setText("Amount");
		amountwith.setText("Amount");
		available.setText("Available: $" + amount);
		panel1.add(deposit);
		panel1.add(amountdep);
		panel2.add(withdraw);
		panel2.add(amountwith);
		panel3.add(available);
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		deposit.addActionListener(this);
		withdraw.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		e.getSource();

		if (e.getSource() == deposit) {
			String depositvalue = amountdep.getText();
			double valuedeposit = Double.parseDouble(depositvalue);
			amount = amount + valuedeposit;
			available.setText("Available: $" + amount);

		}

		if (e.getSource() == withdraw) {

			String withdrawvalue = amountwith.getText();
			double valuewithdraw = Double.parseDouble(withdrawvalue);

			if (valuewithdraw <= amount) {
				amount = amount - valuewithdraw;
				available.setText("Available: $" + amount);
			}

			else if (valuewithdraw > amount) {

				JOptionPane.showMessageDialog(null, "Sorry, you do not have enough money to complete this transaction");
			}
		}

	}
}
