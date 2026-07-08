package overloadedmethod;

public class overloadedmethods {

    public static void main(String[] args) {

        // overloaded method = methods that are share the same name,
        //                     but different parameters
        //                     signature = name + parameters

        System.out.println(add(1, 2, 3, 4));
    }

    // methods can share name but different parameters
    static double add(double a, double b) {
        return a + b; // 3.0
    }

    static double add(double a, double b, double c) {
        return a + b + c; // result 6.0
    }

    static double add(double a, double b, double c, double d) {
        return a + b + c + d; // result 10.0
    }
}
