import java.util.Scanner;

public class length {
    public static void main(String[]args){

        Scanner pass = new Scanner(System.in);

        // using length
        //# String name = "jasoon";
        String name;

        System.out.print("Enter your password: ");
        name = pass.nextLine();

        // Get the length of the string (number of characters in the name)
        // REMEMBER it reads from 0 1 2 3 4
        // 0 1 2 3 4 5
        // J a s o o n
        int length = name.length();

        // Get the character at a specific index in the string
        // So charAt(5) would cause an error because it is out of range
        // REMEMBER it reads from 0 1 2 3 4
        // 0 1 2 3 4 5
        // J a s o o n
        char letter = name.charAt(0);

        // using this gonna find the letter o from the String ="Jason";
        //  if the String value is Jasoon it is just gonna read the first one
        // REMEMBER it reads from 0 1 2 3 4
        // 0 1 2 3 4 5
        // J a s o o n
        int index = name.indexOf("o"); // RESULT: 3

        // now this will give you the last letter
        // String = Jasoon it is gonna read the last one which is 4
        // REMEMBER it reads from 0 1 2 3 4
        // 0 1 2 3 4 5
        // J a s o o n
        int lastindex = name.lastIndexOf("o"); // RESULT: 4

        //# name = name.toUpperCase(); // makes your String data all uppercase
        //# name = name.toLowerCase(); // makes your String data all lowercase
        //# name  = name.trim(); // remove space from your String data like "     jasoon    "  ( result = "jasoon")
        //# name = name.replace("o", "a"); // replace the char ("old char", "new char")

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastindex);
        System.out.println(name);
        System.out.println(name.isEmpty()); // use to know if my String data is empty / btw it is a boolean

        /*#

        if(name.isEmpty()){ //
            System.out.println("You don't have a name");
        }
        else {
            System.out.println("Hello, " + name);
        }

        #*/


        // Note: In an if-else-if-else ladder, conditions are checked from top to bottom.
        // The first TRUE condition will execute, and the rest will be ignored.
        // So always prioritize the most important condition first,
        // followed by else if, and finally else as the default case.
        // String = "Jasoon";

        if(name.contains(" ")){
            if(name.contains("a")){ // if it contains "Space" first and with "a"
            System.out.println("you have a space on you name");
            System.out.println("you have a a on your name");
            }

            else{ // if it contains only "space"
                System.out.println("you have a space on your name");
            }
        }
        else if(name.contains("j")){ // if it doesn't have "Space" and it contains J
            System.out.println("Your name contains a J");
        }

        else { // if and else if doesn't match it, it'll print this
            System.out.println("you don't have a space on your name");

        }

        // Now this is useful for making password


        // code runs if the value of name is exactly "jasoon"
        // Use like using to match it with your exact password
        // it is case-sensitive using equal not ideal for real password
        // name.equalsIgnoreCase using this would ignore case-sensitive
        if(name.equals("jasoon")){
            System.out.println("Hello, " + name + " Welcome to Java Fundemental!");
        }
        else {
            System.out.println("WARNING: Your not jasoon, your do not permission to login");
            System.out.println("Please, enter the correct password");
        }

        pass.close();

    }
}
