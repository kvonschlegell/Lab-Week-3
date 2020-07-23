
public class Box {
	int size = 0;

	public static void main(String[] args) {

		Box box = new Box();
		box.size = 5;
		// Box will be a 5x5
		box.printBox();
	}

	public void printBox() {

		for (int column = 1; column <= size; column++) {
			// Will print each * in the row
			for (int row = 1; row <= size; row++) {
				System.out.print("*");
			}
			// Once the row is <= to the size the loop will begin again in the next row
			// until column <= size
			System.out.println("");

		}
	}
}
