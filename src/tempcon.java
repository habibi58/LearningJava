import java.util.Scanner;

public class tempcon {
    public static void main(String[]args){
       Scanner tempcon = new Scanner(System.in);

       double temp;
       double newTemp;
       String unit;

        System.out.print("Enter the temperature: ");
        temp = tempcon.nextDouble();

        System.out.print("Convert to celsius or fahrenheit? (C or F): ");
        unit = tempcon.next().toUpperCase();

        // (Condition) ? true : false
        newTemp = (unit.equals("C")) ?
                (temp - 32) * 5 / 9
                : (temp * 9 / 5) + 32;


        System.out.printf("%.1f° %s", newTemp, unit);




       tempcon.close();
    }

}
