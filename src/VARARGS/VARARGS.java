package VARARGS;

public class VARARGS {
    public static void main (String[]args){
        // varargs = allow a method to accept a varying # of arguments
        //           makes method more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)


        //System.out.println(add(5,5)); // result
        System.out.println("total average: " + average()); // 15

    }
    static int add(int... numbers){
        int sum = 0;

        for (int number : numbers){
            sum += number;
        }

        return sum;
    }

    static double average (double... numbers){
        //declare the local variable
        double sum = 0;
        double average = 0;

        if (numbers.length == 0){
             return 0; // if no value is inserted it will be 0 instead of Nan
        }

        System.out.println("the numbers are ");
        for (double number : numbers){// holds all the numbers in (number)
            System.out.println(number);
            sum += number; // adds all the numbers
        }

        return sum / numbers.length; // numbers.length is the count of numbers

    }
}
