import javax.swing.JOptionPane;

public class WordPyramidArrow {
	
	public static void main(String[] args) {
		
		WordPyramidArrow wpa = new WordPyramidArrow();
		wpa.askAndDo();
	}
	
	public WordPyramidArrow () {
		
	}
	
	void askAndDo () {
		
		String word = JOptionPane.showInputDialog("Give me a word...");
		String y = JOptionPane.showInputDialog("Give me a positive number displayed on middle line...");
		int value = Integer.parseInt(y);
		
		for (int i = 0; i < value + 1; i++) {
			
			System.out.println(word);
			
		}
		}

}
