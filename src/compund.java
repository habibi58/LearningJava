import java.sql.SQLOutput;
import java.util.Scanner;

public class compund {
    public static void main(String[] args){

        // compound interest calculator

        Scanner compound = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;
        char pesos = '₱';

        System.out.print("Enter your principal amount: ");
        principal = compound.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = compound.nextDouble() / 100;

        System.out.print("Enter the number of times compounded per year: ");
        timesCompound = compound.nextInt();

        System.out.print("Enter the number years: ");
        years = compound.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompound, timesCompound * years);

        /* FORMULA
         * Compound Interest
         * A = P[1 + r/n]^nt
         */

        System.out.printf("The amount after %d years is %c%.2f", years, pesos, amount);



        compound.close();

    }
}
