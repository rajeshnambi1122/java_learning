import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String[] playAgain;

        System.out.println("************************");
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐ ");
        System.out.println("************************");

        while (balance > 0) {
            System.out.println("your current balance: $" + balance);
            System.out.println("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (balance <= 0) {
                System.out.println("You have not enough balance");
            }

            if (bet > balance) {
                System.out.println("You have not enough balance");
            } else if (bet <= 0) {
                System.out.println("Bet amount must be greater than zero");
            } else {
                balance = balance - bet;
                System.out.println("Your current balance is $" + balance);
                System.out.println("Spinning.................");
                row = spinRow();
                printRow(row);
                payout = getPayout(row, bet);
                if (payout > 0) {
                    System.out.println("Your payout is $" + payout);
                    balance = balance + payout;
                } else {
                    System.out.println("Sorry you lost this Round");
                }
                System.out.println("Do you want to Play Again? (Y?N): ");
                playAgain = new String[]{scanner.nextLine().toUpperCase()};

                if (!playAgain[0].equals("Y")) {
                    break;
                }
                System.out.println("GAME OVER! your final balance is $" + balance);
            }
        }
    }

    static String[] spinRow() {

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] row) {
        System.out.println(" " + String.join(" | ", row));
    }

    static int getPayout(String[] row, int bet) {
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> throw new IllegalStateException("Unexpected value: " + row[0]);
            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> throw new IllegalStateException("Unexpected value: " + row[0]);
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> throw new IllegalStateException("Unexpected value: " + row[0]);
            };
        }
        return 0;
    }
}
