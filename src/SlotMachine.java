import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.PrimitiveIterator.OfDouble;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	public static void main(String[] args) {
		SlotMachine slotMachine = new SlotMachine();
		slotMachine.run();
		
	}
	public void run() { 
		frame.add(panel);
		panel.add(reel1);
		panel.add(reel2);
		panel.add(reel3);
		panel.add(label);
		panel.add(button);
		button.addActionListener(this);
		frame.setVisible(true);
		frame.setSize(500, 500);
		button.setText("Spin");
		
		
		}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel reel1 = new JLabel();
	JLabel reel2 = new JLabel();
	JLabel reel3 = new JLabel();
	JButton button = new JButton();
	JLabel label = new JLabel();
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Random random1 = new Random();
		int y = random1.nextInt(3);
		System.out.println(y);
		String one = Integer.toString(y);
		reel1.setText(one);
		int x = random1.nextInt(3);
		System.out.println(x);
		String two = Integer.toString(y);
		reel2.setText(two);
		int z = random1.nextInt(3);
		System.out.println(z);
		String three = Integer.toString(z);
		reel3.setText(three);
		if (y == x && y == z) {
		label.setText("Congrats, you won!");
		}
		else label.setText("Sorry, you lost. Try again");
		frame.pack();
		
	}
	
}
