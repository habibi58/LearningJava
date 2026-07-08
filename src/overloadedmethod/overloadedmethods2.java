package overloadedmethod;

import java.util.concurrent.ScheduledExecutorService;

public class overloadedmethods2 {
    public static void main(String[]args){
    // overloaded method = methods that are share the same name,
    //                     but different parameters
    //                     signature = name + parameters
    String pizza = bakePizza("Flat bread","Mozzarella");
        System.out.println(pizza);
    }
    //instead of using this method we can use a overload method
    //String cheese = "Mozzarella";
    //String bread = "Thick with cheese";

    //    System.out.println(bread + " Pizza with " + cheese);
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return bread + " pizza with " + cheese;
    }

}
