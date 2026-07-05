package whileloop;

import java.util.Scanner;

public class practice12loop {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);



        //Create a Java program that counts down from a number down to 0 using a while loop.
        //1. Ask the user to enter a number.
        //2. Use a while loop to print all numbers from that number down to 0.
        //3. After reaching 0, the program stops.
        //4. If the user enters a negative number, print: Invalid input


        /*# exercise 1

        int num;


        System.out.print("Enter a number: ");
        num = scan.nextInt();

        if (num <= 0)
            System.out.println("invalid input");

        while (num >= 0){ // must be ture to get to 0
            System.out.println(num);
            num--;
        }

        #*/

        /*# Exercise 2


        Ask the user to enter a number.
        1. Keep adding all numbers using a while loop.
        2. Stop when the user enters 0.
        3. Display the total sum.


        // Variable to store the current input number
        int num;

        // Stores the total sum of all numbers
        int total = 0;

        // Counts how many numbers were entered
        int count = 0;

        // Ask for the first number before entering the loop
        System.out.print("Enter number: ");
        num = scan.nextInt();

        // Loop continues until user enters 0
        // while loop is like an entrance if number is not 0 it will enter the loop
        while (num != 0) {// if not 0 it will enter the loop

            // Add current number to total
            total += num;

            // Increase count of numbers entered
            count++;

            // Ask for next number
            System.out.print("Enter number: ");
            num = scan.nextInt();
        }

        // Display final results after loop ends
        System.out.println("Total: " + total);
        System.out.println("Count: " + count);

         */

        // Exercise 3

        /*#

        1. Ask the user to enter a number
        2. Keep  asking until the user enters 0.
        3. Count how many numbers are positive (> 0).
        4. Display the result at the end.
        int num;
        int count = 0;

        System.out.print("Enter number: ");
        num = scan.nextInt();

        while (num != 0) {

            // count only positive numbers
            if (num > 0) {
                count++;
            }

            System.out.print("Enter number: ");
            num = scan.nextInt();
        }

        System.out.println("Positive numbers: " + count);

        #*/

        /*#

        1.The correct password is: java123
        2.Keep asking the user until they enter the correct password
        3.If wrong → show “Wrong password”
        4.If correct → show “Access Granted”
        5.Use a while loop
        6.Use .equals() for string comparison

        // Variable to store user password input
        String pass;

        // Ask user for initial password input
        System.out.print("Enter password: ");
        pass = scan.nextLine();

        // Loop continues while password is NOT correct
        while (!pass.equals("java123")) {

            // Message for wrong password
            System.out.println("Wrong password\n");

            // Ask again for password
            System.out.print("Enter password: ");
            pass = scan.nextLine();
        }

        // When loop ends, password is correct
        System.out.println("Access Granted");

        #*/

        /* exercise 5

        give the number of table product


        int num;
        int i = 1;
        int total = 0;

        System.out.print("Enter number: ");
        num = scan.nextInt();

        while (i <= 100) {// remember that it always enter the loop if it true
            total = num * i;
            System.out.println(num + " x " + i + " = " + total);
            i++;
        }

         */


        int num;
        int largest;
        int count = 0;

        System.out.print("Enter number: ");
        num = scan.nextInt();

        // Initialize largest with the first input
        // (important so we don't assume wrong starting value like 0)
        largest = num;

        // Loop continues until user enters -1
        while (num >= 1) { // not zero

            // Check if current number is greater than the largest so far
            if (num > largest) {
                largest = num; // update largest
            }

            // Ask for next number
            System.out.print("Enter number: ");
            num = scan.nextInt();
            count++;
        }

        // Display the largest number after loop ends

        if (count == 1){
            System.out.println("\nYou have entered only one number");
        }
        else {
            System.out.println("\nLargest number: " + largest);
        }

        scan.close();



    }
}
