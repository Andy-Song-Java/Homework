package com.aaa.homeworks._06designpattern.parkinglot;

public class Main {

    public static void main(String[] args) {
        //create a parking spot
        ParkingSpot ps1 = new ParkingSpot(1,1,1,VehicleSize.Compact);
        //create a car
        Car car1 = new Car();

        //check availability
        System.out.println("the parking spot is currently available: " + ps1.isAvailable());
        //check whether the car can fit in the spot
        System.out.println("the car can fit in the spot: " + car1.canFitinSpot(ps1));
        //park the car into the spot
        ps1.park(car1);
        System.out.println("the car parked in the spot!");
        //check availability
        System.out.println("the parking spot is currently available: " + ps1.isAvailable());
        //remove the car
        ps1.removeVehicle();
        System.out.println("the car drove away!");
        //check availability
        System.out.println("the parking spot is currently available: " + ps1.isAvailable());
    }
}
