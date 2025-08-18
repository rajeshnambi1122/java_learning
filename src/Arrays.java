public class Arrays {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Kiwi"};
        String[] vegetables = {"Potato", "Cabbage", "Onion"};
        String[] meats = {"Pork", "Beef", "Chicken"};

//        System.out.println(fruits[2]);
//        // Array Sorting
//        java.util.Arrays.sort(fruits);
//
//        java.util.Arrays.fill(fruits, "Banana");
//
//
//        // Enhanced loop
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//            java.util.Arrays.fill(fruits, "Banana");
//        }
        String[][] groceries ={fruits, vegetables, meats};
        groceries[2][1] = "Fizz";
         for(String[] foods : groceries){
           for(String food : foods){
               System.out.print(food + " ");
           }
           System.out.println(" ");
         }

    }
}
