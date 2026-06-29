import java.util.Scanner;
//importing this to read input from the keyboard

public class User_input {
    public static void main(String[] args){

        /*#

        Scanner text = new Scanner(System.in);
        // Create a Scanner object named "text"
        // This tells Java to read input from the keyboard (System.in)

        System.out.print("enter your name: ");// scanner.nextLine(); is use for inputting text
        String name = text.nextLine(); // declaring the input text as a variable name
        // String name = text.next(); doesnt read next line of your String like "Md jason" Result: Md

        System.out.print("enter your age: ");
        int age = text.nextInt();
        // text.nextInt(); reads number while text.nextLine() reads words and letters with spaces
        // int age = text.nextInt(); only reads single number prior the first number

        System.out.print("What is your GPA: ");
        double gpa = text.nextDouble();
        //text.nextDouble(); is used for double value with decimal numbers


        System.out.print("Are you a student? (true/false)");
        boolean isStudent = text.nextBoolean();

        String welcome = " Welcome to Java fundementals!";

        System.out.println("Hello, " + name + "\n" + welcome); // \n is use for adding to the next line
        System.out.println("Your " + age + " years old");
        System.out.println("Your GPA is: " + gpa);

        if (isStudent){
            System.out.println("You are enrolled as a student");
        }
        else {
            System.out.println("You are NOT enroll");
        }


        #*/




        /*#


        // COMMON ISSUES

        Scanner text = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = text.nextInt();
        text.nextLine(); // using nextInt(); before nextLine(); causing issue the next input questions wont appear

        System.out.print("Enter your favourite color: ");
        String color = text.nextLine();

        System.out.println("You are " + " years old");
        System.out.println("You like the color " + color);

        text.close();// (name of the object - from Scanner text = new Scanner(System.in);) .close()
        // end of using scanner
        // always practice closing your scanner or else a problem might cause


        #*/



        // Calculate area of rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner Calculate = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width = Calculate.nextDouble();

        System.out.print("Enter the height: ");
        height = Calculate.nextDouble();

        area = width * height;

        System.out.println("The area is: " + area + "cm^2");

        Calculate.close();


    }
}
