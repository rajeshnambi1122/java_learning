public class Car {
    String make;
    String model;
    int year;
    boolean running;


    Car(String make, String model, int year, boolean running){
        this.make = make;
        this.model = model;
        this.year =year;
        this.running = running;
    }
    void start() {
        System.out.println("VROOOOMMMMM!");
    }


}
