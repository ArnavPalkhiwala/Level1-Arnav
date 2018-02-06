import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NBAControlPanel implements ActionListener {
	
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
	
	NBAScoreboard scoreboard = new NBAScoreboard();
	
	public static void main(String[] args) {
		
		NBAControlPanel cp = new NBAControlPanel();
		cp.panelRun();

	}
		
		

	void panelRun(){
		
		scoreboard.run();
		JFrame Control = new JFrame();
		JPanel Main = new JPanel();
		Main.setLayout(new BorderLayout());
		Control.add(Main);
		Control.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		JPanel Home = new JPanel();
		JPanel Away = new JPanel();
		Home.setLayout(new BoxLayout(Home, BoxLayout.PAGE_AXIS));

		Away.setLayout(new BoxLayout(Away, BoxLayout.PAGE_AXIS));
		
		Main.add(Home, BorderLayout.WEST);
		Main.add(Away, BorderLayout.EAST);

		JPanel HomeFouls = new JPanel();
		HomeFouls.setLayout(new BorderLayout());
		JPanel AwayFouls = new JPanel();
		AwayFouls.setLayout(new BorderLayout());
		
		
		JPanel HomeTimeouts = new JPanel();
		HomeTimeouts.setLayout(new BorderLayout());
		JPanel AwayTimeouts = new JPanel();
		AwayTimeouts.setLayout(new BorderLayout());
		
		JTextField home = new JTextField();	
		JTextField away = new JTextField();	
		home.setText("Home");
		away.setText("Visitors");
		Home.add(home);
		Away.add(away);
		
		JLabel hpoints = new JLabel("Points:");
		JLabel vpoints = new JLabel("Points:");
		Home.add(hpoints);
		Away.add(vpoints);
		JButton haddpoints = new JButton("+1");
		haddpoints.addActionListener(this);
		JButton hminuspoints = new JButton("-1");
		hminuspoints.addActionListener(this);
		JButton vaddpoints = new JButton("+1");
		vaddpoints.addActionListener(this);
		JButton vminuspoints = new JButton("-1");
		vminuspoints.addActionListener(this);
		Home.add(haddpoints);
		Home.add(hminuspoints);
		Away.add(vaddpoints);
		Away.add(vminuspoints);
		
		Home.add(HomeFouls);
		Away.add(AwayFouls);
		JLabel hfouls = new JLabel("Fouls:");
		JLabel vfouls = new JLabel("Fouls:");
		HomeFouls.add(hfouls, BorderLayout.NORTH);
		AwayFouls.add(vfouls, BorderLayout.NORTH);
		JButton haddFouls = new JButton("+1");
		JButton hminusFouls = new JButton("-1");
		JButton vaddFouls = new JButton("+1");
		JButton vminusFouls = new JButton("-1");
		HomeFouls.add(haddFouls, BorderLayout.CENTER);
		HomeFouls.add(hminusFouls, BorderLayout.SOUTH);
		AwayFouls.add(vaddFouls, BorderLayout.CENTER);
		AwayFouls.add(vminusFouls, BorderLayout.SOUTH);
		
		Home.add(HomeTimeouts);
		Away.add(AwayTimeouts);
		JLabel htimeouts = new JLabel("Timeouts:");
		JLabel vtimeouts = new JLabel("Timeouts:");
		HomeTimeouts.add(htimeouts, BorderLayout.NORTH);
		AwayTimeouts.add(vtimeouts, BorderLayout.NORTH);
		JButton haddTimeouts = new JButton("+1");
		JButton hminusTimeouts = new JButton("-1");
		JButton vaddTimeouts = new JButton("+1");
		JButton vminusTimeouts = new JButton("-1");
		HomeTimeouts.add(haddTimeouts, BorderLayout.CENTER);
		HomeTimeouts.add(hminusTimeouts, BorderLayout.SOUTH);
		AwayTimeouts.add(vaddTimeouts, BorderLayout.CENTER);
		AwayTimeouts.add(vminusTimeouts, BorderLayout.SOUTH);
		
		Control.setVisible(true);
		Control.pack(); 
		}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
