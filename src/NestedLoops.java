import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of Rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the # of the Columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the Char: ");
        symbol = scanner.next().charAt(0);

        for(int i=0; i < rows; i++){
            for(int j=0; j < columns; j++ ){
                System.out.print(symbol);
            }
            System.out.println(" ");
        }

    }
}
