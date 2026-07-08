package variablescoop;

public class variablescoop {
    static int x = 3;

    public static void main(String[]args){
        // variable scoop = where a variable can be accessed

        int x = 1; // this is a local variable

        System.out.println(x);
        doSomething();
    }
    static void doSomething(){
        int x = 2; // local
        System.out.println(x);

    }
}

