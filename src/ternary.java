public class ternary {
    public static void main(String[] args) {

        // instead of using this
        /*#

        int score = 60;

         if (score >= 60){
             System.out.println("PASS!");
         }
         else{
             System.out.println("FAILED!");
         }

         #*/

        int score = 60;

        // short form of using if else with only 2 values like (pass/fail)
        // String passOrFail = (score >= 60) ? "true" : "false";
        // 👉(score >= 60) ?👈 This is like the question
        // 👉"pass" : "Fail"👈 this is the evaluator like "(true)" : "(false)" or "(if)" : "(else)"
        // "PASS" : "FAIL" represents the two possible outcomes.
        // Similar to how a condition chooses between:
        // (condition) ? "PASS" : "FAIL"
        // If the condition is true, it returns "PASS"; otherwise, it returns "FAIL".
        String passOrFail = (score >= 60) ? "Pass" : "Fail";


        System.out.println(passOrFail);

        int number = 2;

        // use to evaluate even or odd using
        // (condition) ? value_if_true : value_if_false
        // If the number is divisible by 2, return "Even"; otherwise, return "Odd".
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println(evenOrOdd);

        // example 2

        int hours = 13;

        String timeOfday = (hours < 12) ? "A.M" : "P.M";

        System.out.println(timeOfday);


        // example 3

        int income = 60000;

        double taxrate = (income >= 40000) ? 0.25 : 0.15;


        System.out.println(taxrate);




    }
}
