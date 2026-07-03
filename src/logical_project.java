import java.util.Scanner;

public class logical_project {
    public static void main(String[] args) {

        Scanner logical = new Scanner(System.in);

        // username must be between 4-12 characters
        // username must contain space not or underscore

        String username;

        while (true) {

            System.out.print("Enter your username: ");
            username = logical.nextLine();

            if (username.length() < 4 || username.length() > 12) {
                System.out.println("username must be between 4-12 characters and username must not contain space");
            } else if (username.contains(" ") || username.contains("_")) {
                System.out.println("username must contain space not or underscore");
            } else {
                System.out.println("Welcome, " + username);
                break;
            }




        }
    }
}
