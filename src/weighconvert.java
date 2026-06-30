import java.util.Scanner;

public class weighconvert {
    public static void main(String[] args){

        Scanner convert =  new Scanner(System.in);

        double amount;
        int option;


        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert Kilograms to Grams");
        System.out.println("2. Convert Grams to Kilograms");
        System.out.println("3. Convert Kilograms to Pounds (lb)");
        System.out.println("4. Convert Pounds (lb) to Kilograms");
        System.out.println("5. Convert Pounds (lb) to Ounces (oz)");
        System.out.println("6. Convert Ounces (oz) to Pounds (lb)");

        System.out.print("Choose an option (1-6): ");
        option = convert.nextInt();


        // for double variable we cant use amount.equals instead we use amount == 1
        if(option == 1){
            System.out.print("Enter the amount of kg: ");
            amount = convert.nextDouble();

            double total = amount * 1000;

            System.out.println("The amount of " + amount + "kg is equal to " + total + "g");
        }
        else if(option == 2){
            System.out.print("Enter the amount of g: ");
            amount = convert.nextDouble();

            double total = amount / 1000;

            System.out.println("The amount of " + amount + "g is equal to " + total + "kg");
        }
        else if(option == 3){
            System.out.print("Enter the amount of kg: ");
            amount = convert.nextDouble();

            double total = amount * 2.20462;

            System.out.println("The amount of " + amount + "kg is equal to " + total + "lbs");
        }
        else if(option == 4){
            System.out.print("Enter the amount of lbs: ");
            amount = convert.nextDouble();

            double total = amount / 2.20462;

            System.out.println("The amount of " + amount + "lbs is equal to " + total + "kg");
        }
        else if(option == 5){
            System.out.print("Enter the amount of lbs: ");
            amount = convert.nextDouble();

            double total = amount * 16;

            System.out.println("The amount of " + amount + "lbs is equal to " + total + "oz");
        }
        else if(option == 6){
            System.out.print("Enter the amount of oz: ");
            amount = convert.nextDouble();

            double total = amount * 16;

            System.out.println("The amount of " + amount + "oz is equal to " + total + "lbs");
        }
        else{
            System.out.println("Please choose from the option that is given");
        }
        convert.close();

        /*# from bro code version

        import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }
        else if(choice == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        }
        else{
            System.out.println("That was not a valid choice");
        }

        scanner.close();
    }
}


         */

    }
}
