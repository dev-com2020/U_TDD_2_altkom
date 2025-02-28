package org.example.wzorce;

// Interfejs
interface Vehicle {
    void drive();
}

// Konkretne klasy
class Car implements Vehicle {
    public void drive() { System.out.println("Driving a car"); }
}

class Bike implements Vehicle {
    public void drive() { System.out.println("Riding a bike"); }
}

// Factory Method
abstract class VehicleFactory {
    abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {
    public Vehicle createVehicle() {
        return new Bike();
    }
}

