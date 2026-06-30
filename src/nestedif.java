import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {

        // using nestedif
        // used if 2 boolean value is true

        boolean isStudent = true;
        boolean isSenior = true;
        double price = 9.99;
        char pesos = '₱';

        Scanner ticket = new Scanner(System.in);

        System.out.println("the price of the ticket is " + pesos + price);

        System.out.print("Are you a student? (true/false): ");
        isStudent = ticket.nextBoolean();;

        System.out.print("Are you a Senior? (true/false): ");
        isSenior = ticket.nextBoolean();

        if(isStudent){// if student is true it will print the else
            if(isSenior){ // means if senior and student is true
                System.out.println("you get a senior discount of 20% and");
                System.out.println("you get a student discount of 10%");
                price *= 0.7;
            }
            else {
                System.out.println("you get a student discount of 10%");
                price *= 0.9;
            }

        }
        else {
            if(isSenior) { // if senior is only true
                System.out.println("you get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                System.out.println("You don't get a discount");
            }
        }

        System.out.printf("The price of the ticket is: %c%.2f",pesos ,price);

        ticket.close();
    }

}
