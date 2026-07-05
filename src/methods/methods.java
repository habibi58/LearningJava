package methods;
import java.util.Scanner;

public class methods {
    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        // method a block of reusable code that is executed when called ()

        // code for calling
        /*#
        String name = "jason";
        int age = 22;


        happybirthday(name, age);// call it here too
        happybirthday(name, age);
        happybirthday(name, age);

         */

    }
    // making a resuable code and calling it on our main
    // method are not familiar with the main
    // means you cant call a variable from the main

    static boolean ageCheck(int age){
        if (age >= 18){
            return true;
        }
        else {
            return false;
        }
        /*# code to use
        int age = 0;
        System.out.print("Enter your age: ");
        age = scan.nextInt();

        if (ageCheck(age)){
            System.out.println("You may sign up!");
        }
        else {
            System.out.println("you must be 18+ to sign up");
        }
        #*/
    }
    static void happybirthday(String name, int age){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear you %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
        // 👇 use this in the void main 👇
        //  String name = "Jason";
        //  int age = 22;
        //  happybirthday(name, age); happybirthday(name, age);
        // just repeat the happybirthday(name, age); to call it again and again without making a lot of println
    }

    static double square(double number){
        return number * number;
        // 👇 use this in the void main 👇
        // System.out.println(square(3));
        // means results= (3 * 3) = 9.0
    }

    static double cube(double number){
        return number * number * number;
        // 👇 use this in the void main 👇
        // System.out.println(cube(3));
        // means results= (3 * 3 * 3) = 27.0
    }

    static String getFullname(String first,String last, String age){
        return "Your name is " + first + last + " and your " + age + " years old";
        /*#
        String fullName = getFullname("Jason", "celoza", "22");
        System.out.println(fullName);
        #*/
    }
    //since our main is static our methods must be static too

}
