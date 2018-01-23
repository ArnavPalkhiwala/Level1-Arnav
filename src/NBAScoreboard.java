import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NBAScoreboard {

	JFrame Scoreboard = new JFrame();
	JPanel Main = new JPanel();
	JPanel TimeLeft = new JPanel();
	JPanel Home = new JPanel();
	JPanel hometofouls = new JPanel();
	JPanel visitorstofouls = new JPanel();
	JPanel Visitor = new JPanel();
	JButton home = new JButton();
	JButton visitors = new JButton();
	JButton homePoints = new JButton();
	JButton visitorPoints = new JButton();
	JLabel hometimeouts = new JLabel();
	JLabel visitorsTimeouts = new JLabel();
	JLabel homefouls = new JLabel();
	JLabel visitorsfouls = new JLabel();

	String homeName;
	String visitorName;
	int homeScore;
	int visitorScore;
	int homeFouls;
	int visitorFouls;
	int homeTimeouts;
	int visitorTimeouts;


	public NBAScoreboard() {

		this.homeName = "Home";
		this.visitorName = "Visitors";
		this.homeScore = 00;
		this.visitorScore = 00;
		this.homeFouls = 0;
		this.visitorFouls = 0;
		this.homeTimeouts = 3;
		this.visitorTimeouts = 3;

	}

	void run() {
		Scoreboard.add(Main);
		Scoreboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Home.setLayout(new BorderLayout());
		Visitor.setLayout(new BorderLayout());
		Main.setLayout(new BorderLayout());
		Main.add(Home, BorderLayout.WEST);
		Main.add(Visitor, BorderLayout.EAST);
		Home.add(hometofouls, BorderLayout.SOUTH);
		Visitor.add(visitorstofouls, BorderLayout.SOUTH);
		Home.add(home, BorderLayout.NORTH);
		home.setText("Home");
		Visitor.add(visitors, BorderLayout.NORTH);
		visitors.setText("Visitors");
		Home.add(homePoints, BorderLayout.CENTER);
		Visitor.add(visitorPoints, BorderLayout.CENTER);
		hometofouls.add(homefouls);
		visitorstofouls.add(visitorsfouls);
		home.setText("Home Score:");
		visitors.setText("Visitor Score:");
		hometofouls.add(hometimeouts);
		visitorstofouls.add(visitorsTimeouts);
		hometimeouts.setText(" Timeouts : 3");
		visitorsTimeouts.setText(" Timeout : 3");
		homefouls.setText("Fouls : 0");
		visitorsfouls.setText("Fouls : 0");
		homePoints.setText("00");
		visitorPoints.setText("00");
		Scoreboard.setVisible(true);
		Scoreboard.setSize(1000, 75);
		Scoreboard.pack();

	}


	public void changehomePoints(int homepoints) {
		this.homeScore = homepoints;
		this.home.setText("Home Score: " + homeScore);

	}

	public void changeawayPoints(int visitorspoints) {
		this.visitorScore = visitorspoints;
		this.visitors.setText("Visitors Score: " + visitorScore);

	}

	public void changehomeFouls(int homefouls) {
		this.homeFouls = homefouls;
	}
	
	public void changevisitorFouls(int visitorsfouls) {
		this.visitorFouls = visitorsfouls;
	}
	
	public void changehomeTO(int hometimeouts) {
		this.homeTimeouts = hometimeouts;
	}
	
	public void changevisitorTO(int visitortimeouts) {
		this.visitorTimeouts = visitortimeouts;
	}

}
