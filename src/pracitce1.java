import java.util.Scanner;

public class pracitce1 {
    public static void main(String[]args){

        Scanner login = new Scanner(System.in);

        String email;
        String password;
        String username;
        char address = '"';

        System.out.print("Enter your email: ");
        email = login.nextLine();

        System.out.print("Enter your password: ");
        password = login.nextLine();



        if (email.contains("@")){

            username = email.substring(0, email.indexOf("@"));

            if (email.equals("jasonceloza90@gmail.com")){
                if(password.equals("Gabgab0102@")){
                System.out.println("Hello, " + username);
                System.out.println("Welcome to Java Fundamentals");
                }
                else {
                System.out.println("Please enter the correct password");
                }
            }
            else {
                System.out.println("Enter a valid credentials");
            }
        }
        else {
            System.out.println("Your email must contain " + address + "@" +address);

        }


    }
}
