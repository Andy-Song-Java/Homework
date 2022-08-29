package com.aaa.homeworks._06designpattern.parkinglot;

public class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int row;
    private int spotNumber;
    private int level;

    public ParkingSpot(int lvl, int r, int n, VehicleSize s){
        this.level = lvl;
        this.row = r;
        this.spotNumber = n;
        this.spotSize = s;
    }

    public boolean isAvailable(){
        return vehicle == null;
    }

    public boolean park(Vehicle v){
        if (isAvailable()) {
            this.vehicle = v;
            return true;
        } else {
            return false;
        }
    }

    public int getRow(){
        return row;
    }

    public int getSpotNumber(){
        return spotNumber;
    }

    public VehicleSize getSpotSize(){
        return spotSize;
    }

    public void removeVehicle(){
        this.vehicle = null;
    }


}
