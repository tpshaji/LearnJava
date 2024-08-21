import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the passing grade threshold
        final double PASSING_GRADE = 60.0;

        // Input grades for three subjects
        System.out.print("Enter the grade for Subject 1: ");
        double grade1 = scanner.nextDouble();

        System.out.print("Enter the grade for Subject 2: ");
        double grade2 = scanner.nextDouble();

        System.out.print("Enter the grade for Subject 3: ");
        double grade3 = scanner.nextDouble();

        // Calculate the average grade
        double average = (grade1 + grade2 + grade3) / 3;

        // Display the average grade
        System.out.println("Your average grade is: " + average);

        // Determine if the student has passed or failed
        if (average >= PASSING_GRADE) {
            System.out.println("Congratulations! You have passed.");
        } else {
            System.out.println("Sorry, you have failed. Better luck next time.");
        }

        // Close the scanner
        scanner.close();
    }
}
