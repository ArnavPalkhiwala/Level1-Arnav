
public class NetflixRunner {
	public static void main(String[] args) {
		Movie MissionImpossible2 = new Movie("MissionImpossible2", 5, 123);	
		Movie FindingDory = new Movie("FindingDory", 3, 105);	
		Movie CivilWar = new Movie("CivilWar", 2, 148);	
		Movie MrBean = new Movie("MrBean", 4, 90);	
		Movie Moana = new Movie("Moana", 1, 107);	
		String priceMI2 = MissionImpossible2.getTicketPrice();
		System.out.println(priceMI2);
		String priceFindingDory = FindingDory.getTicketPrice();
		System.out.println(priceFindingDory);
		String priceCivilWar = CivilWar.getTicketPrice();
		System.out.println(priceCivilWar);
		String priceMrBean = MrBean.getTicketPrice();
		System.out.println(priceMrBean);
		String priceMoana = Moana.getTicketPrice();
		System.out.println(priceMoana);
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(MissionImpossible2);
		queue.addMovie(FindingDory);
		queue.addMovie(CivilWar);
		queue.addMovie(MrBean);
		queue.addMovie(Moana);
		queue.printMovies();
		queue.getBestMovie();
		Movie best = queue.getBestMovie();
		System.out.println(best);
	
		
	}

}
