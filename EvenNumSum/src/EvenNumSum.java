import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {

		int number, even_integer = 2, sum = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		number = input.nextInt();

		// if user enters a value less than 2, will ask user to choose another number
		if (number < 2) {
			System.out.print("Number must greater than or equal to 2" + "\nEnter a new number: ");
			number = input.nextInt();
		}

		while (even_integer <= number) {
			// sum will keep increasing by 2 until even_integer is greater than or equal to
			// input number.
			sum = even_integer + sum;
			// loops 2,4,6...etc until it reaches the users desired input number.
			even_integer = even_integer + 2;
		}

		System.out.println("Sum of all even numbers is: " + sum);

	}

}
