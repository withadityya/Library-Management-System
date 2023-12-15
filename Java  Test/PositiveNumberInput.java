import java.util.Scanner;

public class PositiveNumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        
        while (true) {
            System.out.print("Enter a positive number: ");
            
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                
                if (number > 0) {
                    break; 
                } else {
                    System.out.println("Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        }
        System.out.println("You entered: " + number);
        scanner.close();
    }
}
