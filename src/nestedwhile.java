import java.util.Scanner;

public class nestedwhile {
    public static void main (String[]args){

        // nested loop = A loop inside another loop
        //               Used often with matrices or DS&A

        /*#

        // a loop inside a loop
        for (int i = 1; i <= 3; i++ ){// means we gonnna process the inside for loops for 3 times
            for (int j = 1; j <= 9; j++){
                System.out.print(j + " ");

            }
            System.out.println();
        }

        #*/

        Scanner scan = new Scanner(System.in);

        int row;
        int column;
        char symbol;

        // Ask the user how many rows to print
        System.out.print("Enter the number of rows: ");
        row = scan.nextInt();

        // Ask the user how many columns to print
        System.out.print("Enter the number of columns: ");
        column = scan.nextInt();

        // Ask the user which symbol to use
        System.out.print("Enter the symbol to use: ");
        symbol = scan.next().charAt(0);

        // Outer loop: controls the number of rows
        for (int r = 0; r < row; r++) {

            // Inner loop: prints the symbol for each column
            for (int c = 0; c < column; c++) {
                System.out.print(symbol + " ");
            }

            // Move to the next line after one row is complete
            System.out.println();
        }
        scan.close();
    }
}
