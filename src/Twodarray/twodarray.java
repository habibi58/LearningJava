package Twodarray;

public class twodarray {
    public static void main(String[]args){
        // 2d array = An array where each element is an array
        //            Useful for storing a matrix of data

        /*#

        String[] fruits = {"apple", "orange", "banana"};
        String[] vegetables = {"potota", "onion", "carrot"};
        String[] meats = {"Chicken", "beef", "Fish"};

        #*/
                       // column    0        1         2
        String[][] groceries = {{"apple", "orange", "banana"}, // row 0 = groceries[2][👉column👈]
                         // column    0        1       2
                                {"potato", "onion", "carrot"}, // row 1 = groceries[2][👉column👈]
                         // column    0        1       2
                                {"Chicken", "beef", "Fish"}};// row 2 = groceries[2][👉column👈]


        // replacing values of a 2d array
        //  groceries[👉row👈][👉column👈] = "👉values👈";
        //# groceries[1][2] = "Pineapple";

        for (String[] foods : groceries){// for getting values of row
            for (String food : foods){ // for getting the column
                System.out.print(food + " ");
            }
            System.out.println();
        }

    }
}
