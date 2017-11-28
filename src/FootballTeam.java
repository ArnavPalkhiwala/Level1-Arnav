public class FootballTeam {
	public static void main(String[] args) {
	populationCount();	
	FootballTeam();
	
	}
	
	String name, jerseyColor;
	int numberOfWins;
	static int populationCount = 0;
	
	public FootballTeam(String name, String jerseyColor, int numberOfWins){
		this.name = name;
		this.jerseyColor = jerseyColor;
		this.numberOfWins = numberOfWins;
		populationCount ++;
		
	}
	
	public static void populationCount(){
		System.out.println("There are " + populationCount + " teams to start.");
		
	}
	
	public static void FootballTeam(){
		FootballTeam Patriots = new FootballTeam("Patriots", "blue", 16);
		System.out.println("The name is " + Patriots.name + ".");
		System.out.println("The main jersey color is " + Patriots.jerseyColor + ".");
		System.out.println("They have " + Patriots.numberOfWins + " wins.");
		FootballTeam Eagles = new FootballTeam("Eagles", "green", 14);
		System.out.println("The name is " + Eagles.name + ".");
		System.out.println("The main jersey color is " + Eagles.jerseyColor + ".");
		System.out.println("They have " + Eagles.numberOfWins + " wins.");
		System.out.println("Now there are " + populationCount + " team(s)");
		FootballTeam Steelers = new FootballTeam("Steelers", "yellow", 12);
		System.out.println("The name is " + Steelers.name + ".");
		System.out.println("The main jersey color is " + Steelers.jerseyColor + ".");
		System.out.println("They have " + Steelers.numberOfWins + " wins.");
		System.out.println("Now there are " + populationCount + " team(s)");

	}

}

