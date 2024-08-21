import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        // Create an instance of Random
        Random random = new Random();
        
        // Define the range
        int min = 1;
        int max = 100;
        
        // Generate a random integer between min (inclusive) and max (inclusive)
        int randomNumber = random.nextInt(max - min + 1) + min;
        
        // Print the random number
        System.out.println("Random Number: " + randomNumber);
    }
}
