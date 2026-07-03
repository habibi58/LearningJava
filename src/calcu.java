import java.util.Scanner;

public class calcu {
    public static void main(String[] args){

        double num1;
        double num2;
        double result = 0;// if it cannot be read or initiliaze you ned to have zero
        char operator;
        boolean validOperation = false;


        Scanner calcu = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = calcu.nextDouble();

        System.out.println("Enter the operator(+, -, *, /, ^");
        operator = calcu.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = calcu.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> Math.pow(num1, num2);
        }
        if(validOperation){
            System.out.println(result);

        }
        calcu.close();
    }
}