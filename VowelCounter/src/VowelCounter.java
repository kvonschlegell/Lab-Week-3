import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {

		int a_count = 0, e_count = 0, i_count = 0, o_count = 0, u_count = 0, consonant = 0;
		Scanner input = new Scanner(System.in);

		// Ask user to type a complete sentence
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		// converts sentence to lower case to read all the upper case vowels
		sentence = sentence.toLowerCase();

		// Determines length of the sentence and will keep a count of each letter. Loop
		// will continue to run sentence completed
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch == 'a') {
				a_count++;
			} else if (ch == 'e') {
				e_count++;
			} else if (ch == 'i') {
				i_count++;
			} else if (ch == 'o') {
				o_count++;
			}

			else if (ch == 'u') {
				u_count++;
			}
			// reads all remaining non vowel characters in the string
			else if (Character.isLetter(ch)) {
				consonant++;
			}
		}

		System.out.println("Number of A's in the sentence: " + a_count);
		System.out.println("Number of E's in the sentence: " + e_count);
		System.out.println("Number of I's in the sentence: " + i_count);
		System.out.println("Number of O's in the sentence: " + o_count);
		System.out.println("Number of U's in the sentence: " + u_count);
		System.out.println("Number of consonants in the sentence: " + consonant);

	}

}
