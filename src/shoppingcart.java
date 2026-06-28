import java.util.Scanner;

public class shoppingcart {
    public static void main(String[] args){

        Scanner shop = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double total;
        char currency = '₱';

        System.out.print("What item would you like to buy?: ");
        item = shop.nextLine();

        System.out.print("What is the price for each?: ");
        price = shop.nextDouble();

        System.out.print("How many would you like yo buy? ");
        quantity = shop.nextInt();

        total = quantity * price;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is "+ currency + total);



        shop.close();
    }
}
