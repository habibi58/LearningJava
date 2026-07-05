package whileloop;

import java.util.Scanner;
public class practice10loop {
    public static void main(String[]args){
        Scanner Scan = new Scanner(System.in);

        double amount = 0;
        double total = 0;
        int numdep = 0;
        double average = 0;

        System.out.print("Enter deposit amount (0 to stop): ");
        amount = Scan.nextDouble();

        while (!(amount == 0)){

            total += amount;
            numdep++;

            System.out.print("Enter deposit amount (0 to stop): ");
            amount = Scan.nextDouble();

        }

        average = total / numdep;

        if (numdep > 0){
            System.out.println(total);
            System.out.println(numdep);
            System.out.println(average);

        }else{
            System.out.println("No deposits were entered");
        }




        Scan.close();
    }
}
