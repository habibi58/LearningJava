import java.util.Scanner;

public class loopsz {
    public static void main(String[]args){

        // for loop = execute some code a certain amount of times

        // instead of using this we can use another short method which is called loop

        /*#
        int i= 1;
        while (i <= 10){
            System.out.println(i + ". pizza");

            i++;
        }

        #*/



        // initialization means declaring a variable
        // condition must be true to proceed
        // for (initialization; condition; update)
        /*#

        for (int i = 1; i <= 10; i++) {
            // Prints the current number followed by ". pizza"
            System.out.println(i + ". pizza");
        }

        #*/

        /*Initialization
      ↓
        Check Condition ─── False ──► End Loop
      │
        True
      ↓
        Execute Code
      ↓
        Update
      ↓
        Back to Condition

         */

        // example 2

        Scanner scan = new Scanner(System.in);
        // Ask the user how many times the loop should run
        System.out.print("Enter how many you want to loop: ");
        int num = scan.nextInt();

        // Initialization: Start the counter at 1
        // Condition: Continue looping while i is less than or equal to num
        // Update: Increase i by 1 after each iteration
        for (int i = 1; i <= num; i++) {

            // Print the current value of the loop counter
            System.out.println(i);
        }
        scan.close();





    }
}
