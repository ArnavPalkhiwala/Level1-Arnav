import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		NBAControlPanel cp = new NBAControlPanel();
		cp.panelRun();

	}
		
		

	void panelRun(){
		
		JFrame Control = new JFrame();
		JPanel Main = new JPanel();
		Control.add(Main);
		Control.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel Home = new JPanel();
		JPanel Away = new JPanel();
		Home.setLayout(new BorderLayout());
		Away.setLayout(new BorderLayout());
		JPanel HomeFouls = new JPanel();
		HomeFouls.setLayout(new BorderLayout());
		JPanel AwayFouls = new JPanel();
		AwayFouls.setLayout(new BorderLayout());
		Home.setLayout(new BorderLayout());
		Home.add(HomeFouls, BorderLayout.NORTH);
		Away.add(AwayFouls, BorderLayout.NORTH);
		JPanel HomeTimeouts = new JPanel();
		HomeTimeouts.setLayout(new BorderLayout());
		JPanel AwayTimeouts = new JPanel();
		AwayTimeouts.setLayout(new BorderLayout());
		Main.add(Home, BorderLayout.WEST);
		Main.add(Away, BorderLayout.EAST);
		Main.add(HomeTimeouts, BorderLayout.CENTER);
		Main.add(AwayTimeouts, BorderLayout.CENTER);
		JTextField home = new JTextField();	
		JTextField away = new JTextField();	
		home.setText("Home");
		away.setText("Visitors");
		Home.add(home, BorderLayout.NORTH);
		Away.add(away, BorderLayout.NORTH);
		JLabel hpoints = new JLabel("Points:");
		JLabel vpoints = new JLabel("Points:");
		Home.add(hpoints, BorderLayout.CENTER);
		Away.add(vpoints, BorderLayout.CENTER);
		JButton addpoints = new JButton("+1");
		Home.add(addpoints, BorderLayout.SOUTH);
		JButton minuspoints = new JButton("-1");
		Home.add(minuspoints, BorderLayout.SOUTH);
		Away.add(addpoints);
		Away.add(minuspoints);
		JLabel hfouls = new JLabel("Fouls:");
		JLabel vfouls = new JLabel("Fouls:");
		HomeFouls.add(hfouls, BorderLayout.NORTH);
		AwayFouls.add(vfouls, BorderLayout.NORTH);
		JButton addFouls = new JButton("+1");
		JButton minusFouls = new JButton("-1");
		HomeFouls.add(addFouls);
		HomeFouls.add(minusFouls);
		AwayFouls.add(addFouls);
		AwayFouls.add(minusFouls);
		JLabel htimeouts = new JLabel("Timeouts:");
		JLabel vtimeouts = new JLabel("Timeouts:");
		HomeTimeouts.add(htimeouts);
		AwayTimeouts.add(vtimeouts);
		JButton addTimeouts = new JButton("+1");
		JButton minusTimeouts = new JButton("-1");
		HomeTimeouts.add(addTimeouts);
		HomeTimeouts.add(minusTimeouts);
		Control.setVisible(true);
		Control.pack();
		
		
		
		
		
	}
}
