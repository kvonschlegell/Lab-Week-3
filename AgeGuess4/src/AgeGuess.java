import java.util.Scanner;
import java.util.Random;

public class AgeGuess {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int ageGuess;
		String firstname;

		System.out.print("What is your first name?");
		firstname = input.next();

		Random gen = new Random();
		int age;
		age = gen.nextInt(101);

		System.out.print("Hey " + firstname + "!" + " Guess my Age! Enter Guess: ");

		// User will keep guessing the age and give hints if the guess is high or low
		while ((ageGuess = input.nextInt()) != age) {
			System.out.print("You guessed wrong!!");

			if (ageGuess > age) {
				System.out.println(" Younger!");

			}
			if (ageGuess < age) {
				System.out.println(" Older!");
			}
		}
		// User guesses correct age
		System.out.println("Congrats! You guessed my age!");
	}

}
