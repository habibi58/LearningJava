public class logical_operator {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // !  = NOT

         double temp = 41;
         boolean isSunny = false;
         String name = "Jason";
         boolean isCold = true;

         // using 👉&&👈 means both value must be true
         if (temp <=  30 && temp >= 13 && isSunny && name.equals("Jason")){
             System.out.println("The weather is good 😀");
             System.out.println("You can have  a jogging outside.");
         }
         // using 👉!👈 at the leftside of the variable make the value NOT
         // basically it gives you the opposite value of true
         else if (temp >= 31 && temp <= 40 && !isSunny && !name.equals("Jason")){
             System.out.println("The weather is not good 👎");
             System.out.println("Stay at home");
         }
         // using || atleast or any condition is true
         else if (temp <= 12 || isCold){
             System.out.println("The weather is cold!❄️☃️");
         }
         else {
             System.out.println("nothing");
         }



    }
}
