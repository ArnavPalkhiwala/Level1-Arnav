import java.awt.Color;

/* 
	 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
	 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
	 * 
	 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
	 * 6. Make a Smurfette and print her name, hat color and girl or boy. */

	public class Smurf {public static void main(String[] args) {
		Smurf HandySmurf = new Smurf("HandySmurf");
		HandySmurf.eat();
		System.out.println("HandySmurf");
		Smurf PapaSmurf = new Smurf("PapaSmurf");
		System.out.println("PapaSmurf");
		PapaSmurf.getHatColor(Color.red);
		Smurf Smurfette = new Smurf("Smurfette");
		System.out.println("Smurfette");
		Smurfette.getHatColor(Color.white);
		
	}

		private String name;

		Smurf(String name) {
			this.name = name;
		}

		public String getName() {
			return "My name is " + name + " Smurf.";
		}

		public String showName() {
			return this.name;
		
			
			
		}
		public void eat() {
			System.out.println(name + " Smurf is eating Smurfberries.");
		}

		/* Papa Smurf wears a red hat, all the others are white. */
		public String getHatColor(Color white) {
			// 3. Fill in this method
			if (this.showName().equals("PapaSmurf")){
			
			
			return "red";
			}
			else 
			return "white";	
			}
		
			
			
			
			

		/* Smurfette is the only female Smurf. */
		public String isGirlOrBoy() {
			// 4. Fill in this method
			return "";
		}

	}


