package whileloop;

import java.util.Scanner;

public class practice11loop {
    public static void main(String[] args) {

        Scanner options = new Scanner(System.in);

        // Stores the current number input
        double num = 0;

        // Menu option selected by user
        int option = 0;

        // Counts how many numbers were entered
        int count = 0;

        // Stores sum of all numbers
        double total = 0;

        // Stores average of numbers
        double average = 0;

        // Stores largest and smallest numbers
        double largest = 0;
        double smallest = 0;

        // Used to check first input (important for min/max initialization)
        boolean firstInput = true;

        // Loop runs until user chooses option 4 (Exit)
        while (option != 4) {

            // Display menu
            System.out.println("\n1. Enter a number");
            System.out.println("2. Show statistics");
            System.out.println("3. Reset data");
            System.out.println("4. Exit");

            System.out.print("Your chosen option: ");
            option = options.nextInt();

            // OPTION 1: Enter number
            if (option == 1) {

                System.out.print("Enter Number: ");
                num = options.nextDouble();

                // Add number to total
                total += num;

                // Increase count
                count++;

                // Initialize or update largest/smallest
                if (firstInput) {
                    largest = num;
                    smallest = num;
                    firstInput = false;
                } else {
                    if (num > largest) {
                        largest = num;
                    }
                    if (num < smallest) {
                        smallest = num;
                    }
                }

                // Update average
                average = total / count;
            }

            // OPTION 2: Show statistics
            else if (option == 2) {

                // If no numbers entered yet
                if (count == 0) {
                    System.out.println("No data available");
                } else {
                    System.out.println("Total sum: " + total);
                    System.out.println("Count: " + count);
                    System.out.println("Average: " + average);
                    System.out.println("Largest number: " + largest);
                    System.out.println("Smallest number: " + smallest);
                }
            }

            // OPTION 3: Reset all data
            else if (option == 3) {

                total = 0;
                count = 0;
                average = 0;
                largest = 0;
                smallest = 0;

                // Reset flag so next input becomes first input again
                firstInput = true;
            }
        }

        // Exit message
        System.out.println("You exited the program");

        // Close scanner to free resources
        options.close();
    }
}