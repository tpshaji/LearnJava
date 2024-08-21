import java.util.Scanner;

public class EnhancedGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define grade boundaries and corresponding letter grades
        final double PASSING_GRADE = 60.0;
        final double A_GRADE = 90.0;
        final double B_GRADE = 80.0;
        final double C_GRADE = 70.0;
        final double D_GRADE = 60.0;

        // Input grades for three subjects
        System.out.print("Enter the grade for Subject 1: ");
        double grade1 = scanner.nextDouble();

        System.out.print("Enter the grade for Subject 2: ");
        double grade2 = scanner.nextDouble();

        System.out.print("Enter the grade for Subject 3: ");
        double grade3 = scanner.nextDouble();

        // Calculate the average grade
        double average = (grade1 + grade2 + grade3) / 3;

        // Determine the letter grade
        String letterGrade;
        if (average >= A_GRADE) {
            letterGrade = "A";
        } else if (average >= B_GRADE) {
            letterGrade = "B";
        } else if (average >= C_GRADE) {
            letterGrade = "C";
        } else if (average >= D_GRADE) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        // Calculate GPA
        double gpa;
        switch (letterGrade) {
            case "A":
                gpa = 4.0;
                break;
            case "B":
                gpa = 3.0;
                break;
            case "C":
                gpa = 2.0;
                break;
            case "D":
                gpa = 1.0;
              
