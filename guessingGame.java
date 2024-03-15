import java.util.Random;
import java.util.Scanner;

public class guessingGame {
    /**
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Guessing Game!");
        
        while (!hasGuessedCorrectly) {
            System.out.println("Please enter your guess:");
            int userGuess = scanner.nextInt();
            numberOfTries++;
            
            if (userGuess < numberToGuess) {
                System.out.println("The number is higher. Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("The number is lower. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the correct number in " + numberOfTries + " tries.");
            }
        }
    }
}
