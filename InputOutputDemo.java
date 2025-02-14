import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt for an integer
        System.out.print("Enter an integer: ");
        int integerValue = scanner.nextInt();

        // Prompt for a decimal number
        System.out.print("Enter a decimal number: ");
        double decimalValue = scanner.nextDouble();
        
        // Consume the newline character left after nextDouble()
        scanner.nextLine();

        // Prompt for a string
        System.out.print("Enter a word or sentence: ");
        String stringValue = scanner.nextLine();

        // Display the values using formatted output
        System.out.println("\nYour integer: " + integerValue);
        System.out.printf("Your decimal number: %.2f%n", decimalValue);
        System.out.println("Your string: " + stringValue);

        // Close the scanner
        scanner.close();
    }
}
