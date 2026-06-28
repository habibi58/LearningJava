import java.util.Scanner;

public class Plus {
    public static void main(String[] args){

        //Arithmetic Operators

        Scanner Arith = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int total;

        System.out.print("Enter the value of num1: ");
        num1 = Arith.nextInt();

        System.out.print("Enter the value of num2: ");
        num2 = Arith.nextInt();

        System.out.print("Enter the value of num3: ");
        num3 = Arith.nextInt();

        total = num1 + num2 + num3;

        System.out.println("The sum of the 3 numbers is: " + total);



        Arith.close();

    }
}
