import java.util.Scanner;

public class math {
    public static void main(String[]args){
        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        /*#

        double result;
        double result1;
        double result2;
        double result3;
        double result4;
        double result5;
        double result6;
        double result7;

        result = Math.pow(7, 3); // use for solving like 7³ (7x7x7 = 343)
        result1 = Math.abs(-50); // for getting absolute number
        result2 = Math.sqrt(25); // for getting square root (25 = 5) a number can is self multiplied
        result3 = Math.round(3.49); // for getting the round number like 3.1 = 3.0 / 3.50 = 4.0
        result4 = Math.ceil(3.01); // rounding up even with smallest decimal number (3.01 = 4.0)
        result5 = Math.floor(3.99); // rounding down even with the smallest decimal number (3.99 = 3.0)
        result6 = Math.max(10, 20);  // get the highest number (10-20 = 20)
        result7 = Math.min(10, 20);  // get the lowest number (10-20 = 10)

        System.out.println("Power number: " + result);
        System.out.println("Absolute number: " + result1);
        System.out.println("Square root number: " + result2);
        System.out.println("Round numbers: " + result3);
        System.out.println("Ceiling number: " + result4);
        System.out.println("floor number: " + result5);
        System.out.println("Highest number: " + result6);
        System.out.println("Lowest number: " + result7);

         #*/

        // HYPOTENUSE c = Math.sqrt(a² + b²)

        /*#

        Scanner math =  new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter Length of side A: ");
        a = math.nextDouble();

        System.out.print("Enter Length of side B: ");
        b = math.nextDouble();

        c = Math.ceil(Math.sqrt(Math.pow(a , 2) + Math.pow(b, 2)));

        System.out.println("The hypotenuse of the side(c): " + c + "cm");

        math.close();

        #*/

        // Circumference

        Scanner Circum = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double  volume;

        System.out.print("Enter the radius: ");
        radius = Circum.nextDouble();

        circumference = 2 * Math.PI * radius;

        area = Math.PI * Math.pow(radius, 2);

        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3); // division must be always inside the bracket like (4.0 / 3.0)
        // and since we are using double must have decimal point

        // System.out.printf() is used for printing value into raw
        // EXAMPLE 👇👇👇
        // double pi = 3.14159;
        // System.out.printf("Pi: %.2f", pi);
        // (%.1f if one decimal place)(and "," is used, instead of "+" for calling a variables)
        // RESULT: 3.14
        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("The area is: %.1fcm²\n", area );
        System.out.printf("The volume is: %.1fcm³\n", volume);

        Circum.close();




    }
}
