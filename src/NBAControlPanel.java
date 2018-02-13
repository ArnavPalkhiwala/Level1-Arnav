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
	JPanel MAIN = new JPanel();
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
	JTextField homename = new JTextField();
	JTextField awayname = new JTextField();
	JLabel hpoints = new JLabel("Points:");
	JLabel vpoints = new JLabel("Points:");
	JButton haddpoints = new JButton("+1");
	JButton hminuspoints = new JButton("-1");
	JButton vaddpoints = new JButton("+1");
	JButton vminuspoints = new JButton("-1");
	JButton haddFouls = new JButton("+1");
	JButton hminusFouls = new JButton("-1");
	JButton vaddFouls = new JButton("+1");
	JButton vminusFouls = new JButton("-1");
	JLabel htimeouts = new JLabel("Timeouts:");
	JLabel vtimeouts = new JLabel("Timeouts:");
	JButton haddTimeouts = new JButton("+1");
	JButton hminusTimeouts = new JButton("-1");
	JButton vaddTimeouts = new JButton("+1");
	JButton vminusTimeouts = new JButton("-1");

	NBAScoreboard scoreboard = new NBAScoreboard();

	public static void main(String[] args) {

		NBAControlPanel cp = new NBAControlPanel();
		cp.panelRun();

	}

	void panelRun() {

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

		homename.setText("Home");
		awayname.setText("Visitors");
		homename.addActionListener(this);
		awayname.addActionListener(this);
		Home.add(homename);
		Away.add(awayname);

		Home.add(hpoints);
		Away.add(vpoints);
		haddpoints.addActionListener(this);
		hminuspoints.addActionListener(this);
		vaddpoints.addActionListener(this);
		vminuspoints.addActionListener(this);

		Home.add(haddpoints);
		Home.add(hminuspoints);
		Away.add(vaddpoints);
		Away.add(vminuspoints);

		Home.add(HomeFouls);
		Away.add(AwayFouls);
		haddFouls.addActionListener(this);
		vaddFouls.addActionListener(this);
		hminusFouls.addActionListener(this);
		vminusFouls.addActionListener(this);
		
		JLabel hfouls = new JLabel("Fouls:");
		JLabel vfouls = new JLabel("Fouls:");
		HomeFouls.add(hfouls, BorderLayout.NORTH);
		AwayFouls.add(vfouls, BorderLayout.NORTH);
		HomeFouls.add(haddFouls, BorderLayout.CENTER);
		HomeFouls.add(hminusFouls, BorderLayout.SOUTH);
		AwayFouls.add(vaddFouls, BorderLayout.CENTER);
		AwayFouls.add(vminusFouls, BorderLayout.SOUTH);

		Home.add(HomeTimeouts);
		Away.add(AwayTimeouts); 
		HomeTimeouts.add(htimeouts, BorderLayout.NORTH);
		AwayTimeouts.add(vtimeouts, BorderLayout.NORTH);
		HomeTimeouts.add(haddTimeouts, BorderLayout.CENTER);
		HomeTimeouts.add(hminusTimeouts, BorderLayout.SOUTH);
		AwayTimeouts.add(vaddTimeouts, BorderLayout.CENTER);
		AwayTimeouts.add(vminusTimeouts, BorderLayout.SOUTH);
		haddTimeouts.addActionListener(this);
		vaddTimeouts.addActionListener(this);
		hminusTimeouts.addActionListener(this);
		vminusTimeouts.addActionListener(this);
		
		Control.setVisible(true);
		Control.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == homename) {
			homename.setText(homename.getText());
		}

		if (e.getSource() == awayname) {
			awayname.setText(awayname.getText());
		}

		if (e.getSource() == haddpoints) {
			scoreboard.changehomePoints(1);
		}

		if (e.getSource() == vaddpoints) {
			scoreboard.changeawayPoints(1);
		}

		if (e.getSource() == hminuspoints) {
			scoreboard.changehomePoints(-1);
		}

		if (e.getSource() == vminuspoints) {
			scoreboard.changeawayPoints(-1);
		}

		if (e.getSource() == haddFouls) {
			scoreboard.changehomeFouls(1);
		}

		if (e.getSource() == vaddFouls) {
			scoreboard.changevisitorFouls(1);
		}
		
		if (e.getSource() == hminusFouls) {
			scoreboard.changehomeFouls(-1);
		}

		if (e.getSource() == vminusFouls) {
			scoreboard.changevisitorFouls(-1);
		}
		
		if (e.getSource() == haddTimeouts) {
			scoreboard.changehomeTO(1);
		}
		
		if (e.getSource() == vaddTimeouts) {
			scoreboard.changevisitorTO(1);
		}
		
		if (e.getSource() == hminusTimeouts) {
			scoreboard.changehomeTO(-1);
		}
		
		if (e.getSource() == vminusTimeouts) {
			scoreboard.changevisitorTO(-1);
		}

		
		
	}
}
