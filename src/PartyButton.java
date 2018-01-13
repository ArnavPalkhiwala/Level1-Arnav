import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
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
	JLabel label = new JLabel();
	JLabel Label = new JLabel();
	Clip clip;
	boolean party = false;

	public static void main(String[] args) {
		PartyButton Party = new PartyButton();
		Party.run();

	}

	void run() {
		frame.setSize(2000, 2000);
		frame.add(panel);
		panel.add(Party);
		Party.setText("Party!!!!!");
		Party.addActionListener(this);
		frame.setVisible(true);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (party == false) {
			URL imageURL = getClass().getResource("party.png");
			Icon icon = new ImageIcon(imageURL);
			label = new JLabel(icon);
			panel.add(label);
			panel.remove(Label);
			party();
			frame.pack();
			party = true;

		}

		else {
			panel.remove(label);
			URL imageURL = getClass().getResource("download.png");
			Icon icon = new ImageIcon(imageURL);
			Label = new JLabel(icon);
			panel.add(Label);
			clip.stop();
			frame.pack();
			party = false;

		}
	}

	public void party() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("fireworks.wav").toURI().toURL());
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
