package array;

public class CARAVANSARY {
    public static void main(String[]args){
        int[] num1 = {10,20,30};

        for (int i = 0; i < num1.length ; i++){
            System.out.println(num1[i]);
        }

        int highest = num1[0];


        for (int i = 0; i < num1.length; i++) {
            if (num1[i] > highest) {
                highest = num1[i];
            }
        }
        System.out.println("Highest number is: " + highest);
    }
}
