package exercisefolder;
import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        // Ask how many students
        System.out.print("Enter number of students: ");
        int size = scan.nextInt();
        scan.nextLine();

        // Create arrays
        String[] studentNames = new String[size];
        double[] studentGrades = new double[size];

        // ==========================
        // INPUT STUDENT INFORMATION
        // ==========================
        int count = 0;

        for (int i = 0; i < size; i++) {
            System.out.println("\nStudent #" + (i + 1));

            System.out.print("Name: ");
            studentNames[i] = scan.nextLine();

            System.out.print("Grade: ");
            studentGrades[i] = scan.nextDouble();
            scan.nextLine();
        }

        // studentNames.length means the numbers of how many names were inserted

        // Loop through the studentNames array using the index
        for (int i = 0; i < studentNames.length; i++) {

            // Print the student number (i + 1) and the student's name
            // i starts at 0, so we add 1 to make the numbering start from 1
            System.out.println((i + 1)+ ". " + studentNames[i]);
        }

        // Assume the first grade in the array is the highest grade
        double highest = studentGrades[0];

        // studentGrades.length means it read the values in array inside the (studentGrades)
        // Loop through all grades in the studentGrades array
        for (int i = 0; i < studentGrades.length; i++) {

            // Check if the current grade is higher than the current highest grade
            if (studentGrades[i] > highest) {

                // If it is higher, update the highest variable
                highest = studentGrades[i];
            }
        }

        // Display the highest grade found
        System.out.println("Highest Grade: " + highest);


        // Set the first grade in the array as the starting lowest value
        // This gives us a value to compare the other grades against
        double lowest = studentGrades[0];

        // Loop through every grade in the array
        for (int i = 0; i < studentGrades.length; i++) {

            // Check if the current grade is smaller than the current lowest grade
            if (studentGrades[i] < lowest) {

                // If it is smaller, update lowest with the new value
                lowest = studentGrades[i];
            }
        }

        // Display the lowest grade found
        System.out.println("Lowest Grade: " + lowest);

        // ==========================
        // COMPUTE AVERAGE
        // ==========================

        // Variable to store the total of all grades
        double total = 0;

        // Loop through all grades and add them together
        for (int i = 0; i < studentGrades.length; i++) {
            total += studentGrades[i];
        }

        // Divide the total grades by the number of students to get the average
        double average = total / studentGrades.length;

        // Display the average grade
        System.out.println("Average Grade: " + average);


        // ==========================
        // COUNT PASS/FAIL
        // ==========================

        // Variables to count passed and failed students
        int passed = 0;
        int failed = 0;

        // Loop through all student grades
        for (int i = 0; i < studentGrades.length; i++) {

            // Check if the student grade is 75 or higher
            if (studentGrades[i] >= 75) {
                passed++; // Add 1 to passed count
            }
            else {
                failed++; // Add 1 to failed count
            }
        }

        // Display the number of passed and failed students
        System.out.println("Passed Students: " + passed);
        System.out.println("Failed Students: " + failed);


        // ==========================
        // SEARCH STUDENT
        // ==========================

        // Ask the user for a student name to search
        System.out.print("Enter student name to search: ");
        String search = scan.nextLine();

        // Variable to check if student is found
        boolean found = false;

        // Loop through the student names array
        // THIS MEANS IT IS GONNA READ ALL THE DATA FROM THE VARIBALES IN ARRAY
        for (int i = 0; i < studentNames.length; i++) {

            // Compare the searched name with names in the array
            if (studentNames[i].equalsIgnoreCase(search)) {

                // Display student information if found
                System.out.println("Student Found!");
                System.out.println("Name: " + studentNames[i]);
                System.out.println("Grade: " + studentGrades[i]);

                found = true; // Change found status to true
                break; // Stop searching once found
            }
        }

        // If no matching name was found
        if (!found) {
            System.out.println("Student not found.");
        }



    }
}
