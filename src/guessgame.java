import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main (String[] args){
        // number guessing game

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1); // gives random number of 1-100
        // must add +1 because the second number is exclusive means 100 is equal to 99
        System.out.println(randomNumber); // print the random number

        //  just the headline not in the loop
        System.out.println("Number Guessing game");
        System.out.printf("Guess a number between %d-%d: ", min, max);

        do { // do means enter the loop

            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess > randomNumber){// if the input is too high
                System.out.println("\nTOO HIGH! try again");
            }
            else if(guess < randomNumber){// if the input is too low
                System.out.println("\nTOO LOW! try again");
            }
            else {// if you have guess the correct number
                System.out.println("\nYou have won! The number was " + randomNumber);
                System.out.println("number of attempt: " + attempts);
            }

        }while(guess != randomNumber);// if guess is not equal to correct number

        scanner.close();

    }
}
