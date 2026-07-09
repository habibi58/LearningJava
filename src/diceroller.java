import java.util.Random;
import java.util.Scanner;

public class diceroller {
    public static void main(String[]args) {
        // JAVA DICE ROLLER PROGRAM

        Scanner scan = new Scanner(System.in);
        // Scanner = the thing that lets us read what the user types

        Random random = new Random();
        // Random = the thing that lets us generate random numbers, like rolling real dice

        int numOfDice;
        // this will hold HOW MANY dice the user wants to roll

        int total = 0;
        // this adds up all the dice rolls together, starts at 0 because nothing's been rolled yet

        System.out.print("Enter the # number of dice to roll: ");
        numOfDice = scan.nextInt();
        // reads the number the user types and stores it in numOfDice

        if (numOfDice > 0) {
            // only roll dice if the user asked for at least 1 die
            // (rolling 0 or negative dice doesn't make sense)

            for (int i = 0; i < numOfDice; i++){
                // this loop repeats once for EACH die the user asked for
                // example: if numOfDice is 3, this loop runs 3 times (i = 0, 1, 2)

                int roll = random.nextInt(1, 7);// means 1-7 7 is always exclusive
                // this generates ONE random number between 1 and 6
                // (7 is the "ceiling" but it's never actually picked, so max is 6)

                printDice(roll);
                // sends the roll number to printDice() so it can draw the dice picture

                System.out.println("You rolled: " + roll);
                // just tells the user what number they rolled, in plain text

                total += roll;
                // adds this roll to the running total
                // same as writing: total = total + roll
            }
            System.out.println("total: " + total);
            // after the loop finishes (all dice rolled), show the grand total

        } else {
            // this runs ONLY if numOfDice was 0 or negative
            System.out.println("Number of dice must be great than 0");
        }
        scan.close();
        // we're done reading input, so we close the Scanner to free up resources

        // display some ascii of dice or like a 1d dice
    }

    static void printDice(int roll){
        // this method's ONLY job is: take a number (roll), print a picture of that dice face
        // it doesn't return anything (void) because it just prints directly, nothing to hand back

        String dice1 = """
               ----------
               |        |
               |   💠   |
               |        |
               ----------
                """;
        // this is a "text block" (triple quotes """) — lets us write
        // a multi-line string without needing \n everywhere
        // this one is the picture for when roll = 1

        String dice2 = """
               ----------
               |💠      |
               |        |
               |      💠|
               ----------
                """;
        // picture for roll = 2

        String dice3 = """
               -----------
               |💠       |
               |   💠    |
               |      💠 |
               -----------
                """;
        // picture for roll = 3

        String dice4 ="""
               -----------
               |💠     💠|
               |          |
               |💠     💠|
               -----------
                """;
        // picture for roll = 4

        String dice5 ="""
               ------------
               |💠     💠 |
               |    💠    |
               |💠     💠 |
               ------------
                """;
        // picture for roll = 5

        String dice6 ="""
               -----------
               |💠     💠|
               |💠     💠|
               |💠     💠|
               -----------
                """;
        // picture for roll = 6

        switch(roll){
            // switch = "look at the roll number, then pick the matching case below"

            case 1-> System.out.println(dice1);
            // if roll is 1, print the dice1 picture

            case 2-> System.out.println(dice2);
            case 3-> System.out.println(dice3);
            case 4-> System.out.println(dice4);
            case 5-> System.out.println(dice5);
            case 6-> System.out.println(dice6);
            // same idea repeats for 2 through 6

            default -> System.out.println("Invalid roll");
            // this ONLY runs if roll is somehow not 1-6
            // (shouldn't happen here since random.nextInt(1,7) only gives 1-6,
            // but it's good practice to have a fallback "just in case")
        }

    }
}