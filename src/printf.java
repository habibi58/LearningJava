public class printf {
    public static void main(String[] args){

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]


        /*#


        String name = "Jason";
        char firstLetter = 'J';
        int age = 22;
        double height = 165.5;
        boolean isEmployed = true;

        // instead of using "+" like from our println we will be using ","
        // using %s for String variable without it, string data won't appear
        // use \n to enter in a new line
        // remember using the format specifier like (%s %c %d %f %b) is where you place your data in the sentence
        // EXAMPLE:
        // String = "Jason";
        // System.out.printf("Hello %s\n", name); RESULT: hello, Jason

        System.out.printf("Hello %s\n", name); // %s used for String
        System.out.printf("Your name starts with a %c\n", firstLetter); // %c used for char
        System.out.printf("You are %d years old\n", age); // %d used for int
        System.out.printf("You are %.1f cm tall\n", height); // %f used for double
        System.out.printf("Empolyed: %b\n", isEmployed);  // %b used for boolean

        System.out.printf("%s is %d years old\n", name, age); // like this placing your format specifier on the sentence


        double price1 = 99.9;
        double price2 = 1010202002.093848;
        double price3 = -670000000.67;
        double price4 = -557577.50;
        char pesos = '₱';


        // using (%👉.1👈f) to display a decimal number with only 1 decimal place.
        // Adjust to 2,3,4 or more if you want more decimal number
        System.out.printf("%c %+.1f\n",pesos , price1); // (%👉+👈.1f) it will display a + sign on your number
        System.out.printf("%c %,.3f\n",pesos , price2); // (%👉,👈.3f) comma grouping separator for your number like 1,000,000
        System.out.printf("%c %(.4f\n",pesos , price3); // (%👉(👈.4f) left parenthesis puts on the negative number inside a parenthesis
        System.out.printf("%c % .1f\n",pesos , price4); /* (%👉 👈.1f) Space add "space" before the number if positive and display
        a "-" if negative

        #*/

        // width
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        // ("%👉04👈d\n", id1); how many digits you want to display
        // EXAMPLE 1 = 0001
        /* if you want to justified number
        ("%👉-4👈d\n", id1)
        RESULT
        1
        23
        234
        1233
         */
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);



    }
}
