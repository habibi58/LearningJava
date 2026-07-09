package array;
import java.util.Arrays;

public class arrays {
    public static void main(String[]args){
        // array = a collection of values of the same data types
        //         * think of it as a variable that can store more than 1 value

        //                   0         1         2          3
        String[] fruits ={"apple" , "orange", "banana", "coconut"};

        //fruits[0] = "pineapple";// more specify or like more priority
        //int numOFruits= fruits.length; // to know how many elements are there with ini the array

        //System.out.println(fruits[2]);

        // getting all the elements using for loop
        // for(int i = 0; i < fruits.length; i++){
        // System.out.print(fruits[i] + " ");
        // }

        // Enhanced for loop (a.k.a. "for-each loop")
        // Reads: "for each String in fruits, call it 'fruit', do the following"
        // No index needed — Java walks through the array automatically,
        // one element at a time, from index 0 to the last index.


        //# Arrays.sort(fruits); // it will sort your values in alphabetical order
        //# Arrays.fill(fruits,  "Pineapple"); // will fill your array of value with banana

        for (String fruit : fruits) {
            // "fruit" holds the current element for this pass:
            // apple, then orange, then banana, then coconut
            System.out.print(fruit + " ");
        }
    }
}
