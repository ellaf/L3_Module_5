package data_structures;

import java.util.ArrayList;

public class Plane {
	
	static Randomness rand = new Randomness();
	
	public static void main(String[] args) {
	int totalVenom = 0;
	int chanceOfDeath = 0;
	int numberOfPassengers = 416;
		ArrayList<Snake> planeSnakes = new ArrayList<Snake>();

		
		for (int i = 0; i < 100; i++) {
			planeSnakes.add(new Snake(rand.randnum(), rand.tfrand()));
		}
		
		for (int i = 0; i < 100; i++) {

		if (planeSnakes.get(i).getVen() == true) {
			
		totalVenom += planeSnakes.get(i).getVic();
			
		}
		}
		
		chanceOfDeath = (totalVenom*10)/numberOfPassengers;
		System.out.println(chanceOfDeath + "%");
		
	}
	
}
