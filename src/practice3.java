public class practice3 {
    public static void main(String[] args){

        // Start the variable at 10.
        // This will be the first number printed.
        int number = 10;

        // Keep looping as long as 'number' is greater than or equal to 1.
        // The loop stops once the condition becomes false.
        while (number >= 1){

            // Print the current value of 'number'.
            System.out.println(number);

            // Decrease the value of 'number' by 1.
            // This allows the loop to count down: 10, 9, 8, ...
            number--;
        }

        // When 'number' becomes 0, the condition (number >= 1)
        // is false, so the while loop ends.
    }

}