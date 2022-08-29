package com.aaa.homeworks._06designpattern.parkinglot;
import java.util.ArrayList;
public abstract class Vehicle {
    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;

    public int getSpotsNeeded(){
        return spotsNeeded;
    }

    public VehicleSize getSize(){
        return size;
    }

    public void parkinSpot(ParkingSpot s){
        parkingSpots.add(s);
    }

    public void clearSpots(){

    }

    public abstract boolean canFitinSpot(ParkingSpot spot);


}
