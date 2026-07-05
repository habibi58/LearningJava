import java.util.Scanner;

public class loopsz {
    public static void main(String[]args) throws InterruptedException { //throws InterruptedException for implementing Thread.sleep()

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
        /*#
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

        # */
        // we'll need this before the sleep countdown start
        // public static void main(String[]args) throws InterruptedException { //throws InterruptedException for implementing Thread.sleep()

        System.out.print("How many seconds to count down from: ");
        int start = scan.nextInt();

        for (int i = start; i > 0 ;i--){
            System.out.println(i);
            Thread.sleep(1000); // used to wait for amount for millisecond before printing again
            // 1000 millisecond is equal to 1 second
        }
        System.out.println("Happy new year!");
        scan.close();





    }
}
