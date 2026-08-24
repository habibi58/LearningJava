package Twodarray;

public class part3 {
    public static void main(String[]args){

        // Challenge: Display students' grades using a 2D array


        // 1D array that stores the names of students
        String[] Students = {"Jason", "Gabriel", "Leah"};


        // 2D array that stores the grades of each student
        // Each row represents one student
        // Each column represents a subject grade
        //
        // Jason   -> 98 Math, 90 English, 85 Science
        // Gabriel -> 95 Math, 90 English, 77 Science
        // Leah    -> 91 Math, 76 English, 82 Science
        int[][] Grades = {
                {98, 90, 85},
                {95, 90, 77},
                {91, 76, 82}
        };


        // 1D array that stores the subject names
        // Index position matches the grade column
        //
        // subjects[0] = Math
        // subjects[1] = English
        // subjects[2] = Science
        String[] subjects = {"Math", "English", "Science"};


        // Outer loop: goes through each student
        // i represents the row number in the Grades 2D array
        for (int i = 0; i < Students.length; i++){

            // Display the current student's name
            System.out.println(Students[i]);


            // Variable used to store the total grade
            // (You can use this later to calculate the average)
            int total = 0;


            // Inner loop: goes through each subject of the current student
            // j represents the column number in the Grades array
            for (int j = 0; j < Grades[i].length; j++){

                // Display the subject name and the student's grade
                // Grades[i][j] gets the grade of the current student
                // i = student index
                // j = subject index
                System.out.println(subjects[j] + ": " + Grades[i][j]);


                // Add the current grade to the total
                total += Grades[i][j];
            }


            // Display the total grade of the student
            System.out.println("Total: " + total);

            double average = (double) total / Grades[i].length;

            System.out.printf("Average: %.2f\n", average);
            System.out.println("He got an "+ getLetterGrade(average));

            // Add an empty line for better formatting
            System.out.println();
            System.out.println();
        }

    }
    public static char getLetterGrade(double average) {
        if (average >= 95)
            return 'A';
        else if (average >= 90)
            return 'B';
        else if (average >= 85)
            return 'C';
        else if (average >= 75)
            return 'D';
        else
            return 'F';
    }

}