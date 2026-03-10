// Abstract base class
abstract class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }


    abstract void start();
    abstract void stop();

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    int doors;

    Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    void start() {
        System.out.println(brand + " car engine started with a key.");
    }

    @Override
    void stop() {
        System.out.println(brand + " car has stopped using disc brakes.");
    }

    void showCarDetails() {
        System.out.println("This car has " + doors + " doors.");
    }
}

// Derived class: Bike
class Bike extends Vehicle {
    boolean hasGear;

    Bike(String brand, int speed, boolean hasGear) {
        super(brand, speed);
        this.hasGear = hasGear;
    }

    @Override
    void start() {
        System.out.println(brand + " bike started with a self-start button.");
    }

    @Override
    void stop() {
        System.out.println(brand + " bike has stopped safely.");
    }

    void showBikeDetails() {
        if (hasGear)
            System.out.println("This bike has gears.");
        else
            System.out.println("This is a gearless bike.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", 180, 4);
        Vehicle bike = new Bike("Honda", 120, true);

        System.out.println("---- Car Details ----");
        car.displayInfo();
        car.start();
        car.stop();
        ((Car) car).showCarDetails(); // downcasting to access Car method

        System.out.println("\n---- Bike Details ----");
        bike.displayInfo();
        bike.start();
        bike.stop();
        ((Bike) bike).showBikeDetails();
    }
}
