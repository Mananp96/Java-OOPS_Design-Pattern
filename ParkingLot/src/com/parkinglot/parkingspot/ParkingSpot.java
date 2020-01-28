package com.parkinglot.parkingspot;

import com.parkinglot.enums.ParkingSpotType;
import com.parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {
    private int row;
    private String spotNumber;
    private boolean spotAvailable;

    private Vehicle vehicle;
    private final ParkingSpotType type;

    public ParkingSpot(String spotNumber, ParkingSpotType type){
        this.spotNumber = spotNumber;
        this.type = type;
        this.spotAvailable = true;
    }

    public boolean assignVehicle(Vehicle vehicle){
        if(this.spotAvailable){
            this.vehicle = vehicle;
            this.spotAvailable = false;
            return true;
        }
        return false;
    }

    public boolean removeVehicle(Vehicle vehicle){
        this.vehicle = null;
        this.spotAvailable = true;
        return true;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(String spotNumber) {
        this.spotNumber = spotNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpotType getType() {
        return type;
    }

    public boolean isSpotAvailable() {
        return spotAvailable;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "row=" + row +
                ", spotNumber='" + spotNumber + '\'' +
                ", spotAvailable=" + spotAvailable +
                ", vehicle=" + vehicle +
                ", type=" + type +
                '}';
    }
}
