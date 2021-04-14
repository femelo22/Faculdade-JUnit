package util;

import java.util.Random;

public class RandomNumbers {

	public static int getRandomNumberInts(int min, int max){
	    Random random = new Random();
	    return random.ints(min,(max+1)).findFirst().getAsInt();
	}
	
}
