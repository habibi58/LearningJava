import java.util.Scanner;

public class usingif {
    public static void main(String[] args) {
        Scanner ifelse = new Scanner(System.in);


        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = ifelse.nextLine();

        System.out.print("Enter your age: ");
        age = ifelse.nextInt();

        System.out.print("Are you a student?");
        isStudent = ifelse.nextBoolean();

        // GROUP 1
        if (name.isEmpty()){
            System.out.println("You didn't enter your name. 🤦");
        }
        else {
            System.out.println("Hello, " + name + " Welcome to Java Fundamental! 👨‍💻");
        }

        // GROUP 2
        if (age >= 60) {
            System.out.println("You are a Senior! 👴");
        }
        else if (age >= 18){
            System.out.println("Your an adult! 🧑");
        }

        /* else if (age >= 60){
            System.out.println("You are a Senior");

         */ // it never reaches the "Senior" condition because the first IF already executed.


        else if (age < 0){
            System.out.println("You haven't been born yet!👻");
        }
        else if (age == 0){
            System.out.println("You are a baby! 👶");
        }
        else{
            System.out.println("Your an Child! 👧");
        }

        // GROUP 3

        // in Boolean value you can use if (object) default for true for using in if statement
        if (isStudent){
            System.out.println("Your a student! 🧑‍🎓");
        }
        else{
            System.out.println("Your NOT a student! 🙍");
        }
        ifelse.close();
    }
}

