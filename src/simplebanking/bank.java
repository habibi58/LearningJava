package simplebanking;

import java.util.Scanner;

public class bank {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[]args){
        // JAVA BANKING PROGRAM FOR BEGINNERS

        // DECLARE A VARIABLE


        double balance = 0;
        boolean isRunning = true;
        int choice = 0;


        while(isRunning){
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = scan.nextInt();

            switch(choice){
                case 1 -> showbalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 ->{
                    isRunning = false;
                    System.out.println("Thank you for using the Banking Program!");
                }
                default -> System.out.println("INVALID CHOICE");

            }
        }

        // showBalance()

        // Deposit()

        // withdraw()

        // EXIT MESSAGE

        scan.close();

    }
    static void showbalance(double balance){
        System.out.println("***************");
        System.out.printf("Your balanace is ₱%.2f\n", balance);
    }
    static double deposit(){
        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scan.nextDouble();

        if(amount < 0){
            System.out.println("Amount cannot be less than 0");
            return 0;
        }
        else {
            return amount;
        }
    }
    static double withdraw(double balance){
        double amount;

        System.out.print("Enter the amount you want to withdraw: ");
        amount = scan.nextDouble();

        if (amount > balance){
            System.out.println("You do not have sufficient balance to make this withdrawal.");
            System.out.println("Your total balance is ₱" + balance);
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            System.out.printf("You have successfully withdraw an amount of: ₱%.2f\n", amount);
            return amount;
        }
    }
}
