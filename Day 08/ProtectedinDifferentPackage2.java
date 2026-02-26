package Package2;
import Package1.Vehicle;

public class Bike extends Vehicle {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();   // Accessible (because subclass)
    }
}
