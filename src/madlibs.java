import java.util.Scanner;

public class madlibs {
    public static void main(String[] args){

        //MADLIBS

        Scanner mad = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        // Java executes from top to bottom (first code, first served).
        // The user's answer to this first prompt is stored in noun1.
        // noun1 stores the user's input from the first System.out.print() prompt
        System.out.print("Enter an adjective (description: ");
        noun1 = mad.nextLine();

        // adjective1 stores the user's input from the second System.out.print() prompt
        System.out.print("Enter a noun (animal or person): ");
        adjective1 = mad.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = mad.nextLine();

        System.out.print("Enter a verb end with -ing (action): ");
        verb1 = mad.nextLine();

        System.out.print("Enter an adjective (description: ");
        adjective3 = mad.nextLine();

        System.out.println("\nToday i went to a " + adjective1 + "zoo.");
        System.out.println("In an exibit, i saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        mad.close();

    }
}
