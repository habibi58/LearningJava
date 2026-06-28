public class Main {
    public static void main(String[] args) {
        // THIS IS MY FIRST JAVA PROGRAM
        // This is used for single line comment

    /*
    This is the introduction of Java fundamentals
    This comment is used for multi-line comments
    */
    /*Remove comment to make the code works

        System.out.println("I like Pizza!");
        System.out.println("I like Pizza its really good!");
        System.out.println("Buy me Pizza!");

    Remove comment to make the code works*/

        // 2 steps to creating a variable
        //--------------------------------

        // 1. Declaration
        // 2. Assignment

        int age = 30;
        int cars = 50;
        int tables = 50;
        // int is used for number without decimals and only a single number
        //# System.out.println(age);

        double money = 30.50;
        //double is used for numbers with decimals
        //# System.out.println(money);

        //# System.out.println("My age is " + age);
        //To print a text + data that depends on the value
        //Text must be in the double quote while the declared value must not have double quote

        char grade = 'A';
        char symbol = '!';
        char currency = '₱';
        // Char is used for a single character or letter
        // The value must be inside a single quote
        //# System.out.println(grade);

        boolean isStudent = false;
        boolean forsale = false;
        boolean isOnline = false;
        // boolean is used for true or false
        // Must start with lower case letter
        //# System.out.println(forsale);

        // using boolean with if else
        /*#

        if (isStudent){
            System.out.println("You are a student!");
            // if the value is "true" it'll print this
        }
        else{
            System.out.println("You are a NOT student!");
            // // if the value is "false" it'll print this
        }

        #*/

        //------------------------------------------------------------------------------------------------

        String name = "Mohamad jason Labis Celoza";
        String love = "I love you";
        String email = "jasonceloza90@gmail.com";
        // String is use for sentences like full name, letter or messages
        // String can contain letters, numbers or even special characters
        // must use double quote for the value
        //# System.out.println("Your name is " + name);
        //# System.out.println(love + ", " + name);

        // ❎ variable = A reusable container for a value.
        //                          A variable behaves as if it was the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        //    ---------                      ---------
        //    int                           string
        //    double                    array
        //    char                        object
        //    boolean

        int age1 = 21;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        char grade1 = 'A';
        char symbol1 = '!';
        char currency1 = '$';

        boolean isStudent1 = true;
        boolean forSale = false;
        boolean isOnline1 = true;

        String name1 = "Bro Code";
        String food = "pizza";
        String email1 = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if (forSale) {
            System.out.println("There is a " + car + " for sale");
        } else {
            System.out.println("The " + car + " is not for sale");

            // ================================
            // 1. Creating and initializing an array
            // ================================

            // This is an array of integers (multiple int values in one variable)
            // must use with [] after the variables the values {value0, value1, value2, value3}
            int[] scores = {90, 85, 78, 95};

            // ================================
            // 2. Accessing array elements
            // ================================

            // Array index starts at 0
            // scores[0] means the first element
            System.out.println("First score: " + scores[0]); // 90

            // scores[2] means the third element
            System.out.println("Third score: " + scores[2]); // 78

            // ================================
            // 3. Changing array values
            // ================================

            // We can replace a value using its index
            scores[1] = 100; // changes 85 → 100

            System.out.println("Updated second score: " + scores[1]); // 100

            // ================================
            // 4. Looping through the array
            // ================================

            // .length gives the size of the array
            for (int i = 0; i < scores.length; i++) {
                System.out.println("Score at index " + i + ": " + scores[i]);
            }

            // ================================
            // 5. Creating an empty array
            // ================================

            // This creates an array with 5 empty slots (default value = 0)
            int[] numbers = new int[5];

            // Assigning values manually
            numbers[0] = 10;
            numbers[1] = 20;
            numbers[2] = 30;

            // Printing values
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Number at index " + i + ": " + numbers[i]);
            }

            // ================================
            // 6. String array example
            // ================================

            String[] names = {"Jason", "John", "Anna"};

            System.out.println("First name: " + names[0]);

            // Loop through names
            for (int i = 0; i < names.length; i++) {
                System.out.println("Name: " + names[i]);
            }
        }
    }
}