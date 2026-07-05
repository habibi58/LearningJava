package whileloop;

import java.util.Scanner;

public class practice6loop {
    public static void main(String[]args){

        Scanner jason = new Scanner(System.in);

        String name = "";
        int num = 1;

        System.out.print("Enter your name: ");
        name = jason.nextLine();

        while (num <= 10){
            System.out.println(num + ". " + name);
            num++;
        }
        jason.close();
    }
}
