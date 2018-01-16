import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Scoreboard {

	JFrame Scoreboard = new JFrame();
	JPanel Main = new JPanel();
	JPanel TimeLeft = new JPanel();
	JPanel Home = new JPanel();
	JPanel Visitor = new JPanel();
	JLabel home = new JLabel();
	JLabel visitors = new JLabel();
	JLabel homePoints = new JLabel();
	JLabel visitorPoints = new JLabel();
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

	public static void main(String[] args) {
		Scoreboard scoreboard = new Scoreboard();
		scoreboard.run();

	}

	public Scoreboard() {

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
		Main.add(Home);
		Main.add(Visitor);
		Home.add(home);
		Visitor.add(visitors);
		Home.add(homePoints);
		Visitor.add(visitorPoints);
		Home.add(hometimeouts);
		Visitor.add(visitorsTimeouts);
		Home.add(homefouls);
		Visitor.add(visitorsfouls);
		home.setText("Home Score:");
		visitors.setText("Visitor Score:");
		hometimeouts.setText(" Timeouts : 3");
		visitorsTimeouts.setText(" Timeout : 3");
		homefouls.setText("Fouls : 0");
		visitorsfouls.setText("Fouls : 0");
		homePoints.setText("00");
		visitorPoints.setText("00");
		Scoreboard.setVisible(true);
		Scoreboard.pack();

	}

	public void ChangeHomeScore(int Num) {
		this.homeScore += Num;
		this.home.setText("Home Score: " + homeScore);
	}

	public void ChangeVisitorScore(int Num) {
		this.visitorScore += Num;
		this.visitors.setText("Visitors Score: " + visitorScore);
	}

}
