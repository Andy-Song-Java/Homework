package com.aaa.homeworks._06designpattern.parkinglot;

public class Car extends Vehicle{
    public Car(){
        spotsNeeded = 1;
        size = VehicleSize.Compact;
    }

    public boolean canFitinSpot(ParkingSpot spot){
        return spot.getSpotSize() == VehicleSize.Compact;
    }

}
