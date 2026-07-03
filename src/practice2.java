import java.util.Scanner;

public class practice2 {
    public static void main(String[] args){

        //  Student Grade Calculator

        Scanner student = new Scanner(System.in);

        String name; // name won't work if String name has no value
        double Math;
        double English;
        double Science;
        double average;
        char percent = '%';

        System.out.println("Grade Computation");
        System.out.println("Hey user, give me data before I continue");
        // name won't work if String name has no value

        System.out.print("Student name: ");
        name = student.nextLine();

        System.out.print("Math: ");
        Math = student.nextDouble();

        System.out.print("English: ");
        English = student.nextDouble();

        System.out.print("Science: ");
        Science = student.nextDouble();

        average = (Math + English + Science) / 3;

        if (average >= 75){
            System.out.println("Hello, " + name + " Congratulations!");
            System.out.printf("You passed with an average of %.2f%c\n",average, percent);
        }
        else {
            System.out.println("Hello, " + name +  " Your average is below the passing mark.");
            System.out.printf("you got an average of %.2f%c\n",average, percent);
        }

        if (average >= 90){
            System.out.println("You got an A, Very high performance!");
        }
        else if (average >= 80){
            System.out.println("You got an B, Above average!");
        }
        else if (average >= 75) {
            System.out.println("You got an C, Passing but just enough!");
        }
        else if (average >= 70) {
            System.out.println("You got an D, Weak performance!");
        }
        else{
            System.out.println("You got an F, FAILED!");
        }


        student.close();
    }
}
