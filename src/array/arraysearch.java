package array;

import java.util.Scanner;

public class arraysearch {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        // index         0  1  2  3  4  5
        int [] numbers ={1, 2, 3, 5, 6, 9};


        int target;
        boolean isFound = false;

        System.out.print("Enter the number you want to search: ");
        target = scan.nextInt();

            // for (int i = 0; i < numbers.length;i++) it is use for getting the values of array
        for (int i = 0; i < numbers.length;i++){
            if (target == numbers[i]){
                    System.out.println("Element found at index: " + i);
                    isFound = true;
                    break;
            }
        }
        if (!isFound){
                System.out.println("Element is not found");
        }


        scan.close();
    }
}
