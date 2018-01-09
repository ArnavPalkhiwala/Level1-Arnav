import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PartyButton implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton Party = new JButton();

	public static void main(String[] args) {
		PartyButton Party = new PartyButton();
		Party.run();

	}

	void run() {
		URL imageURL = getClass().getResource("party.png");
		Icon icon = new ImageIcon(imageURL);
		frame.setSize(2000, 2000);
		frame.add(panel);
		panel.add(Party);
		Party.setText("Party!!!!!");
		Party.addActionListener(this);
		panel.add(new JLabel(icon));
		frame.setVisible(true);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
