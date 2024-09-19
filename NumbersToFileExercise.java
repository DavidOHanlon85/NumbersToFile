/**
 * 
 */
package slideDeckExercises;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * 
 */
public class NumbersToFileExercise {

	/**
	 * @param args
	 */
	
	// constants
	
	public static final int AMOUNT_OF_NUMBERS_TO_GENERATE = 10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare and Initialise Variables
		
		int[] randomNumber = new int[AMOUNT_OF_NUMBERS_TO_GENERATE];
		
		// Instantiate Random Generator
		
		Random myRand = new Random();
		
		for (int i = 0; i < randomNumber.length; i++) {
			randomNumber[i] = myRand.nextInt(1, 1001);
		}
		
		System.out.println(Arrays.toString(randomNumber));
		
		Arrays.sort(randomNumber);
		
		System.out.println(Arrays.toString(randomNumber));
		
		File file = new File("Ordered Random Numbers.txt");
		
		try {
			if (!file.exists()) {
				file.createNewFile();
				System.out.println("File created");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem with creating file");
			e.printStackTrace();
		}
		
		try {
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0; i < randomNumber.length; i++) {
				int number = randomNumber[i];
				String stringValueOfNumber = String.valueOf(number);
				bw.write(stringValueOfNumber);
				bw.newLine();
			}
			
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Problem with File Write");
			e.printStackTrace();
		}
		

	}

}
