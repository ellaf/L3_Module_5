package data_structures;
import java.util.Random;

public class Randomness {

	static boolean tfrand() {
		Random rand = new Random();
		boolean tf = rand.nextBoolean();
		return tf;
	}
	static int randnum() {
		Random rand = new Random();
		int num = rand.nextInt(10) + 1;
		return num;
	}
	
	
}
