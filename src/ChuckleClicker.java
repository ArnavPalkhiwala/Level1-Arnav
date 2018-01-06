import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();

	public static void main(String[] args) {
		ChuckleClicker ChuckleClicker = new ChuckleClicker();
		ChuckleClicker.makeButtons();
	}

	void makeButtons() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(200, 100);
		panel.add(button1);
		panel.add(button2);
		button1.setText("Joke");
		button2.setText("Punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Hi");

		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "Why did the football player go to the bank?       Because he wanted to get his quarter back!!");
		}
		
		if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "This is  my punchline");;
		}

	}

}

// Make a ChuckleClicker class, a main method and a makeButtons method. Put a
// pop-up in the makeButtons method and get it working. You will need to
// instantiate your class and call method an instance of it.
//
// Make a JFrame in makeButtons() method and get it to show.
//
// Add a JPanel and two JButtons and get them to show up like this:
//
// *[Optional] Customize your GUI with setText, setSize, etc.
//
// Make a pop-up that says “hi” when either of the buttons are pressed. You will
// need to add listeners to the buttons for this to work.
//
// Check if the ActionEvent came from the joke button or the punchline button.
// if(arg0.getSource() == jokeButton)
// You might need to move the declaration of your buttons above the the
// makeButtons() method.
//
// Use JOptionPane to print the joke or the punchline depending on which button
// was clicked.
