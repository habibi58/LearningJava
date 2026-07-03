import java.util.Scanner;

public class practice7loop {
    public static void main(String[] args) {

        Scanner jason = new Scanner(System.in);

        String name = "";

        // Loop runs until the user types "stop"
        while (!name.equals("stop")) {

            // Ask the user to enter a name
            System.out.print("Enter your name: ");
            name = jason.nextLine();

            // Check if the input is NOT "stop"
            // This prevents printing "Hello stop"
            if (!name.equals("stop")) {
                System.out.println("Hello " + name);
            }
        }

        // This runs when the loop ends
        System.out.println("Program ended.");

        jason.close(); // Close scanner to free resources
    }
}