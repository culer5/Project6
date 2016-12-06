package scott.dickinson.assignment6;

import java.util.Scanner;

/**
 * @author Scott Dickinson
 *
 */
public class GuessMyNumberModel {

	public GuessMyNumberModel(){
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		int myNumber = 1 + (int) (Math.random() * 1000);
		int myGuess = 0;

		System.out.println("I am thinking of a number from 1 to 1000"
				+ " ... guess what it is ?");

		while (myGuess != myNumber) {
			myGuess = keyboard.nextInt();
			count++;
			if (myGuess > myNumber) {
				System.out.println("lower!");
			} else if (myGuess < myNumber) {
				System.out.println("higher!");
			}
		}
		System.out.println("Congratulations. You guessed the number with "
				+ count + " tries!");
		keyboard.close();
	}
}


