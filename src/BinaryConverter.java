import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter{
	public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField answer = new JTextField(20);
	JTextField answer2 = new JTextField(20);
	JButton button = new JButton();
	button.setName("Convert");
	panel.add(answer);
	panel.add(answer2);
	panel.add(button);
	
	
	
	
	
	
	
	}
	public BinaryConverter() {
	}
//
//	We’re going to make an application that converts binary codes (8-bits) into letters.
//
//	You’ll need a JFrame and a JPanel.
//
//	On the panel, put two text fields and a button. A text field is made like this:
//	JTextField answer = new JTextField(20);
//
//	It may look like this or you might have a better layout in mind.
//
//
//	Here is a method that will do the conversion for you.
	public int convert(String binary) {
			if(binary.length() != 8){
				JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
				return 0;
			}
			 if(!Pattern.matches("\2", binary)) {
				 JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
					return 0;
			 }
			try {
				int asciiValue = Integer.parseInt(binary, 2);
				return asciiValue;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
				//question.setText("");
				return 0;
			}
	}
	
	
}








