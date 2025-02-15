import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt for and input an integer
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();

        // Prompt for and input a double
        System.out.print("Enter a decimal number: ");
        double userDouble = input.nextDouble();

        // Consume newline and prompt for a string
        input.nextLine(); // Consume newline
        System.out.print("Enter a word or sentence: ");
        String userString = input.nextLine();

        // Output with Formatting (Integer)
        System.out.printf("Your integer: %d%n", userInt);

        // Output with Formatting (Double)
        System.out.printf("Your decimal number: %.2f%n", userDouble);

        // Output with Formatting (String)
        System.out.printf("Your string: %s%n", userString);

        // Close the scanner
        input.close();
    }
}
