import java.util.Scanner;

public class switchs {
    public static void main(String[]agrs){

        // Enchanced switch = A replacement to many else if statements

        // instead of using this
        /*#

         String day = "Friday";

        if(day.equals("Monday") ) {
            System.out.println("It is a weekday");
        }
        else if(day.equals("Tuesday") ) {
            System.out.println("It is a weekday");
        }
        else if(day.equals("Wednesday") ) {
            System.out.println("It is a weekday");
        }
        else if(day.equals("Thursday") ) {
            System.out.println("It is a weekday");
        }
        else if(day.equals("Friday")) {
            System.out.println("It is a weekday");
        }
        else if(day.equals("Saturday")){
            System.out.println("It is the weekend");
        }
        else if(day.equals("Sunday")){
            System.out.println("It is the weekend");
        }
        else {
            System.out.println(day + " is not a day");
        }

         #*/

        String day;

        Scanner days = new Scanner(System.in);

        System.out.print("Enter the day of the week: ");
        day = days.nextLine();


        /*#
        switch(day){
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            case "Sunday" -> System.out.println("It is a weekday");
            default -> System.out.println(day + " is not a day");
        }
         */

        // better version
        // used for different value but same output
        switch(day){ // only (if) as (case) and (else) as (default)

            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It is a weekday"); //ifor true

            case "Saturday", "Sunday" -> System.out.println("It is a weekday"); // if or true

            default -> System.out.println(day + " is not a day"); // else or false
        }


        days.close();
    }
}
