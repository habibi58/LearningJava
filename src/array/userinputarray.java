package array;

import java.util.Scanner;

public class userinputarray {
    public static void main(String[] args){


        Scanner scan = new Scanner(System.in);

        // the size of this array is 3 elements
        //String[] foods = {"Abodo", "Tinola", "MDCO"};

        /*#
        String[] foods = new String[4]; // elements means (1-4) while in index it is (0-3)


        foods[0] = "Abodo";
        foods[1] = "Tinola";
        foods[2] = "MCDO";
        foods[3] = "Inasal";

        /System.out.println(foods.length);

        #*/

        String[] foods;

        int size;
        System.out.print("How many food you want to list: ");
        size = scan.nextInt();
        scan.nextLine();// since there is not nextLine in nextInt it won't continue

        foods = new String[size];

        for (int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scan.nextLine();
        }
        System.out.println("\n****Foods list****");

        for (int ii = 0; ii < foods.length; ii++){
            System.out.println((ii + 1) + ". " + foods[ii]); // food[index] counts from 0-4 which means 1-5
        }


        scan.close();
    }
}
