import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        // Declare Variables
        double balance = 10;
        boolean isRunning = true;
        int choice;

        // User Menu
        while(isRunning){
            System.out.println("****************");
            System.out.println("Banking Program");
            System.out.println("****************");
            System.out.println("SELECT ONE OPTIONS");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit Amount");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Exit");

            // Process it
            System.out.print("Please Enter your Choice(1-4): ");
            choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> System.out.println("Withdraw");
                case 4 -> isRunning = false;
            }
        }

        //deposit()

        //withdraw()

        //exit()
    }
    static void showBalance(double balance){
        System.out.println("****************");
        System.out.println(balance);
    }

    static double deposit(){
        double amount;
        System.out.println("Enter the Amount you Want to Deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0){
            System.out.println("Amount Can't be Negative");
            return 0;
        }else{
            return amount;
        }
    }
}
