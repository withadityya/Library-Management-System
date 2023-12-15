import java.util.Scanner;

// Create a class for the Library
class Library {
	String bookName;
	String author;
	int pages;
	float price;
}

// Main class for the driver code
public class ELibrary {

	public static void main(String[] args) {
		// Create an array of Library objects
		Library[] library = new Library[100];

		String arNm;

		// Keep track of the number of books available in the library
		int i, input, count;

		i = input = count = 0;

		// Initialize the array with Library objects
		for (int j = 0; j < library.length; j++) {
			library[j] = new Library();
		}

		// Scanner to take input from the user
		Scanner scanner = new Scanner(System.in);

		// Iterate the loop
		while (input != 5) {
			System.out.println("\n\n********###### WELCOME TO E-LIBRARY #####********");
			System.out.println("1. Add book information\n2. Display book information");
			System.out.println("3. List all books of given author\n4. List the count of books in the library");
			System.out.println("5. Exit");

			// Enter the book details
			System.out.print("\n\nEnter one of the above: ");
			input = scanner.nextInt();

			// Process the input
			switch (input) {

				// Add book
				case 1:
					System.out.print("Enter book name = ");
					library[i].bookName = scanner.next();

					System.out.print("Enter author name = ");
					library[i].author = scanner.next();

					System.out.print("Enter pages = ");
					library[i].pages = scanner.nextInt();

					System.out.print("Enter price = ");
					library[i].price = scanner.nextFloat();
					count++;
					i++;
					break;

				// Print book information
				case 2:
					System.out.println("You have entered the following information");
					for (int j = 0; j < count; j++) {
						System.out.println("Book name = " + library[j].bookName +
								"\t Author name = " + library[j].author +
								"\t Pages = " + library[j].pages +
								"\t Price = " + library[j].price);
					}
					break;

				// Take the author name as input
				case 3:
					System.out.print("Enter author name: ");
					arNm = scanner.next();
					for (int j = 0; j < count; j++) {
						if (arNm.equals(library[j].author)) {
							System.out.println(library[j].bookName + " " +
									library[j].author + " " +
									library[j].pages + " " +
									library[j].price);
						}
					}
					break;

				// Print total count
				case 4:
					System.out.println("\nNo of books in library: " + count);
					break;
				case 5:
					System.exit(0);
			}
		}
	}
}
