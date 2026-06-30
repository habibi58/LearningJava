import java.util.Scanner;

public class substring {
    public static void main(String[]args){
        // .substring() =  A method used to extract a portion of a String
        //                 string.substring(start, end)

        Scanner login = new Scanner(System.in);

        // REMEMBER: index start from 0
        // 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22
        // j a s o n c e l o z a  9  0  @  g  m  a  i  l  .  c  o  m
        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = login.nextLine();

        if (email.contains("@")){
            //# username = email.substring(0, 13);// Extracts characters from index 0 up to (but NOT including) index 13.
            username = email.substring(0, email.indexOf("@"));

            //# domain = email.substring(14); // Starts at index 14 and continues until the last character.
            domain = email.substring(email.indexOf("@") + 1);// using +1 to get the char after the @ if data is unpredictable


            System.out.println("Your user name is: " + username);
            System.out.println("Your domain is: " + domain);
        }
        else {
            System.out.println("Your email is not valid must contains @");
        }

        login.close();
    }
}
