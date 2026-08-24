package exercisefolder;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {

        // Creates a Scanner object to read user input
        Scanner scan = new Scanner(System.in);

        // Ask the user how many cars they want to enter
        System.out.print("How many cars do you want to enter?: ");
        int quan = scan.nextInt();

        // Consumes the leftover newline character after nextInt()
        scan.nextLine();

        // Creates a String array with the size entered by the user
        String[] cars = new String[quan];

        // Loop to get each car name from the user
        for (int i = 0; i < cars.length; i++) {
            System.out.print("Enter the car name: ");
            cars[i] = scan.nextLine();
        }

        // Prints a heading before displaying the list
        System.out.println("\n***** Car List *****");

        // Loop through the array and display each car with a number
        for (int i = 0; i < cars.length; i++) {
            // (i + 1) is used so the numbering starts at 1 instead of 0
            System.out.println((i + 1) + ". " + cars[i]);
        }

        // Closes the Scanner to free system resources
        scan.close();
    }
}