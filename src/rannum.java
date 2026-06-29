import java.util.Random;
import java.util.Scanner;

public class rannum {
    public static void main(String[] args){

        Random rannum = new Random();

        int number;
        double numdouble;
        boolean isHeads;

        number = rannum.nextInt(1, 101); // number is our declared int // rannum is our object name of Random
        //(1, 7) means it will give us a random number from 1 to 6, bound number is excluded

        numdouble = rannum.nextDouble(1, 2); // random number with decimals

        isHeads = rannum.nextBoolean(); // random boolean of heads and tail using true or false


        System.out.println(number);
        System.out.println(numdouble);
        System.out.println(isHeads);

        if(isHeads) {
            System.out.println("You got heads");
        }
        else {
            System.out.println("You got a tail");
        }







    }
}
