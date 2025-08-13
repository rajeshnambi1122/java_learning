import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        int min = 1;
        int max =10;
        int randomnumber = random.nextInt(min, max);

        System.out.println("Welcome to Number Guessing Game!");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.println("Enter your Guess: ");
            guess = scanner.nextInt();
            attempts++;
        }while(guess != randomnumber);

        System.out.println("WON");
        System.out.printf("Number of Attempts: %d", attempts);
    }
}
