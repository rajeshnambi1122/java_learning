public class Methods {
    public static void main(String[] args){

        String name = "Rajesh Nambi";
        int age = 22;

        happyBirthday(name,age);
        String result = pizza("Thin Crust","Panner");
        System.out.println(result);
    }
    static void happyBirthday(String name, int age){
        System.out.println("Happy Birthday to You!");
        System.out.printf("Happy Birthday to %s!\n", name);
        System.out.println("Happy Birthday to You!");
        System.out.printf("You are %d years old\n", age);
    }
    static String pizza(String bread){
       return bread + " Pizaa";
    }
    static String pizza(String bread, String chesse){
        return bread +" "+ chesse + " Pizaa";
    }
}
