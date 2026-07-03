import java.util.Scanner;

public class whileloop {
    public static void main(String[]args){

        // While loop = repeat some cod forever
        //              while some condition remains true


        /*#     EXAMPLE 1


        Scanner whileloop = new Scanner(System.in);

        String name = "";

        // using while if the name is still empty it'll continue
        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = whileloop.nextLine();
        }

        System.out.println("Hello " + name);


        whileloop.close();

         */

        /*#
        // (1 == 1) is always true, so the condition never becomes false.
        // Because of this, the loop runs forever unless it is stopped with `break`
        // or the program is terminated manually.

        while (1 == 1){

             System.out.println("HELP IM STUCK in a loop");
         }

        #*/


        /*#    EXAMPLE 2

        String response = "";

        Scanner exwhile2 = new Scanner(System.in);

        // if he hasn't enters the Q he won't leave the game
        //!response.equals("Q") MEAN IF THE response is not equal to "Q"
        while(!response.equals("Q")){
            System.out.println("You are playing a game");

            System.out.print("Press Q to quit: ");
            response = exwhile2.next().toUpperCase(); // HE'LL TYPE HERE  if the value iss not q he'll need to enter again
        }
        System.out.println("You have quit the game");

        #*/


        // EXAMPLE 3

        /*#

        Scanner eg3 = new Scanner(System.in);

        int age;

        //prompt
        System.out.print("Enter your age: ");
        age = eg3.nextInt();

        do{ // DO  means it'll print the code first
            System.out.println("Your age must not have negative number or start with 0");
            System.out.print("Enter your age again: ");
            age = eg3.nextInt();
        }while(age <= 0 || age >= 100); // if age is less than 0 it will go back to do


        // if age is not less than 0 it will escape the while loop
        System.out.println("Your are " + age + " years old");

        # */

        Scanner ex4 = new Scanner(System.in);

        int number = 0;

       do {
            System.out.print("Enter a number between 1 - 10: ");
            number = ex4.nextInt();
        }while (number < 1 || number > 10);

        System.out.println("You picked " + number);


    }
}
