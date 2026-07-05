import java.util.Scanner;

public class draft {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

        int i = 1;
        int max; //20

        System.out.print("enter how many times you to loop: ");
        max = scan.nextInt();


        while (i <= max){// true to stop anf false to start
            System.out.println(max);
            max-=4;
        }
    }
}
