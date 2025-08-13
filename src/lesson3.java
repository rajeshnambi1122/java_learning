import java.util.Random;

public class lesson3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        int number1;
        double result;

        number = random.nextInt(1, 22);
        number1 = random.nextInt(1, 100);
        result = Math.pow(12, 3);

        System.out.printf("%d",number);
        System.out.println(number1);
        System.out.println(result);

    }
}
