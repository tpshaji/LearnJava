import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Create instances of Random and Scanner
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Define the range for the random number
        int min = 1;
        int max = 100;

        // Generate a random number between min and max (inclusive)
        int numberToGuess = random.nextInt(max - min + 1) + min;

        // Initialize variables for the game
        int userGuess = 0;
        int numberOfAttempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + min + " and " + max + ". Try to guess it!");

        // Game loop
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            
            // Take user input
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                numberOfAttempts++;

                // Check if the guess is correct, too high, or too low
                if (userGuess < min || userGuess > max) {
                    System.out.println("Please enter a number between " + min + " and " + max + ".");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You've guessed the number in " + numberOfAttempts + " attempts.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Close the scanner
        scanner.close();
    }
}
