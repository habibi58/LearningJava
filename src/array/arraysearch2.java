package array;

import java.util.Arrays;
import java.util.Scanner;

public class arraysearch2 {

    public static void main (String[]args){

        Scanner scan = new Scanner (System.in);
        // index              0         1         2
        String[] fruits = {"apple", "Orange", "Banana"};

        boolean isFound = false;
        String target;

        System.out.print("Enter the fruit you want to search for: ");
        target = scan.nextLine();

        for(int i = 0; i < fruits.length; i++) { // use for getting all the elements from array just suot(fruits[i]);

            // ".equal(👉value👈)" is use for string while "==" is use for Int
            if (fruits[i].equalsIgnoreCase(target)) {
                System.out.println("element found at " + i);
                isFound = true;
            }
        }
        if (!isFound){
            System.out.println("Element not found");
            System.out.println("*****The fruits available*****");

            int count = 1;
            for (String fruit : fruits) {
                System.out.println(count + ". " + fruit);
                count++;
            }
        }
    }
}
