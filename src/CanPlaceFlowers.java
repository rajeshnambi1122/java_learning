public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1}; // You can change this!
        int n = 2;                         // Number of flowers you want to plant

        boolean canPlant = canPlaceFlowers(flowerbed, n);
        System.out.println("Can plant " + n + " flowers? " + canPlant);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == len - 1) || (flowerbed[i + 1] == 0);

                if (emptyLeft && emptyRight) {
                    flowerbed[i] = 1;
                    n--;
                    if (n <= 0)
                        return true;
                }
            }
        }
        return n <= 0;
    }
}