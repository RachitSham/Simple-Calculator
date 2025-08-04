import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // taking scanner class to read input
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {

            // show calculator menu
            System.out.println("Welcome to the Simple Calculator!");
            System.out.println("Please select an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Enter your choice (1 – 5):: ");

            System.out.println();

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 5 !! ");
                sc.nextLine(); // Clear invalid input
                continue;
            }

            // exit from the calculator
            if (choice == 5) {
                System.out.println("Exiting calculator. Thank you for using the application !! ");
                break;
            }

            // user take number input
            double num1, num2;
            try {
                System.out.print("Enter the first number: ");
                num1 = sc.nextDouble();

                System.out.print("Enter the second number: ");
                num2 = sc.nextDouble();
            } catch (InputMismatchException e) {

                System.out.println("Invalid input! Please enter valid numbers.");
                sc.nextLine();
                continue;
            }

            double result;
            switch (choice) {
                case 1:
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case 2:
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case 3:
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
            }
        }
        sc.close();
    }
}
