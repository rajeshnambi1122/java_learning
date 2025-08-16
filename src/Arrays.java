public class Arrays {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Kiwi"};

        System.out.println(fruits[2]);
        // Array Sorting
        java.util.Arrays.sort(fruits);

        java.util.Arrays.fill(fruits, "Banana");


        // Enhanced loop
        for (String fruit : fruits) {
            System.out.println(fruit);
            java.util.Arrays.fill(fruits, "Banana");
        }
    }
}
