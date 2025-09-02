import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String[] questions = {"Who is the father of the Computer?",
                "What is the main function of the router?"};
        String[][] options = {{"1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage"},
                {"1.Storing Files", "2. Encrypting Data", "3. Directing Internet Traffic", "4. Managing Passwords"}};

        int[] answers = {4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("Welcome to Quiz Game!");
        System.out.println("*************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Enter ur Guess: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("CORRECT!");
                score++;
            } else {
                System.out.println("WRONG!");
            }
        }
        System.out.println("Your score is: " + score);
        scanner.close();
    }

}
