package whileloop;

import java.util.Scanner;

public class practice9loop{
    public static void main(String[]args) {

        Scanner ex9 = new Scanner(System.in);

        int num;
        int total = 0;

        //ask first for the first number
        System.out.print("Enter number: ");
        num = ex9.nextInt();

        while (num != 0) {
            total += num;

            // ask for next number
            System.out.print("Enter number: ");
            num = ex9.nextInt();
        }

        // print result after loop ends
        System.out.println("Total = " + total);

        ex9.close();


    }
}
