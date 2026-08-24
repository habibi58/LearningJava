package Twodarray;

public class part2 {
    public static void main (String[]args){
        // making a dial pad 2 array

        // we cant use emojis in char
        char[][] num = {{'1', '2','3'},
                        {'4', '5', '6'},
                        {'7', '8', '9'},
                        {'*', '0', '#'},
                        };

        System.out.println("Phone dial");
        for (char[] nums : num){
            for (char telephone : nums){
                System.out.print(telephone + " ");
            }
            System.out.println();
        }
    }
}
