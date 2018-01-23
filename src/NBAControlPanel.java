import javax.swing.JFrame;
import javax.swing.JPanel;

public class NBAControlPanel {
	
	JFrame controlPanel = new JFrame();
	JPanel  MAIN = new JPanel();
	JPanel home = new JPanel();
	JPanel away = new JPanel();
	JPanel homeControls = new JPanel();
	JPanel awayControls = new JPanel();
	JPanel homePoints = new JPanel();
	JPanel awayPoints = new JPanel();
	JPanel homeFouls = new JPanel();
	JPanel awayFouls = new JPanel();
	JPanel homeTOS = new JPanel();
	JPanel awayTOS = new JPanel();

	
	
	
	public static void main(String[] args) {
		
		NBAScoreboard scoreboard = new NBAScoreboard();
		scoreboard.run();

	}

	void panelRun(){
		
		controlPanel.add(MAIN);
		MAIN.add(home);
		
	}
}
