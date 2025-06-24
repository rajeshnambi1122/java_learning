public class fun {

    public static void main(String[] args) {
        int sum = 0;
        int k = 1;

        while (sum < 12 || k < 4) {
            sum += k;
            k++;

        }

        System.out.println(sum);
        System.out.println("k: " + k + " | sum: " + sum);

        main1(null);
    }

    public static void main1(String[] args) {
        int num = 2574;
        int result = 0;
        while (num > 0) {
            result = result * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed: " + result);

    }
}


