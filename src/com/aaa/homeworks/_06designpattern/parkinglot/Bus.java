package com.aaa.homeworks._06designpattern.parkinglot;

public class Bus extends Vehicle{
    public Bus(){
        spotsNeeded = 5;
        size = VehicleSize.Large;
    }

    public boolean canFitinSpot(ParkingSpot spot){
        return spot.getSpotSize() == VehicleSize.Large;
    }

    

}
