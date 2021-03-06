import java.util.ArrayList;
/*Robert Jian
 * 4th
 * 2/5/20
 * interface practice with hobbit
 */
public class ThereAndBackAgain 
{

	public static void main(String[] args) 
	{
		
		Hobbit frodo = new Hobbit("Frodo");
		Hobbit sam = new Hobbit("Sam");
		Dwarf gimli = new Dwarf("Gimli");
		Wizard gandalf = new Wizard("Gandalf", "Grey");
		Hobbit bilbo = new Hobbit("Hobbit");
		// Create a traveling party called party1 by creating an array of Travelers 
		// and filling it with frodo, sam, and gimli
		Traveler[] party1 = {frodo, sam, gimli};
		// Then, use a loop to make all travelers go a distance of 50 miles
		for(Traveler character : party1) {
			character.travel(50);
			System.out.println(character.getName() + " has traveled " + character.getDistanceTraveled() + " miles.");
			
		}
	
		// Then, for each Traveler in the travelingParty, print their name and how far they've
		//    traveled in miles.  (In the next piece, you'll do this in methods, but 
		//    for a first pass, just do it in main and print to the console.)
		// Expected output:  Frodo has traveled 50 miles.
		//                   Sam has traveled 50 miles.
		//                   Gimli has traveled 50 miles.
		
		
		
		
		
		
		System.out.println();
		System.out.println("\n\n\nPART 2: \n");

		String[] dwarfNames = {"Fili", "Kili", "Dori", "Ori", "Nori", "Balin", "Dwalin",
		"Oin", "Gloin", "Bifur", "Bofur", "Bombur", "Thorin"};
		
		// Make a new ArrayList to hold a 2nd party of Travelers called party2:
		// Make a new Hobbit called "Bilbo" and add him to party2
		ArrayList<Traveler> party2 = new ArrayList<>();
		party2.add(gandalf);
		party2.add(bilbo);
		// Make a new Wizard called "Gandalf" and add him to party2.
		
		
		createParty(party2, dwarfNames);
		allTravel(party2,100);
		for(Traveler character : party2) {
			System.out.println(character.getName() + " has traveled " + character.getDistanceTraveled() + " miles.");
		}
	}	
		

		//write createParty
		// Call the createParty method and pass it party2 and the dwarfNames array.
		public static void createParty(ArrayList<Traveler> party, String[] nameDwarf) {
			for(String person : nameDwarf) {
				Dwarf shorty = new Dwarf(person);
				party.add(shorty);
			}
		}
		// create party should add all the new dwarves to party2,

		//Write allTravel
		// Finally, call the allTravel method passing it party2 and 100 (representing
		// the 100 miles that party2 has traveled together.
		public static void allTravel(ArrayList<Traveler> party, int distance) {
			for(Traveler partyMember : party) {
				partyMember.travel(distance);
			}
		}

		//Make sure your code prints out the name and distances party2 has traveled.
	}

	

