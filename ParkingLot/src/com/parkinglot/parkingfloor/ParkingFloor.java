package com.parkinglot.parkingfloor;

import com.parkinglot.enums.ParkingSpotType;
import com.parkinglot.parkingspot.*;
import com.parkinglot.vehicle.Vehicle;

import java.util.HashMap;

public class ParkingFloor {
    private String name;
    private int floorNumber;
    private int spotsNumberCount;

    private HashMap<String, ParkingSpot> motorbikeSpots;
    private HashMap<String, ParkingSpot> compactSpots;
    private HashMap<String, ParkingSpot> largeSpots;
    private HashMap<String, ParkingSpot> handicappedSpots;

    public ParkingFloor(String name, int floorNumber) {
        this.name = name;
        this.floorNumber = floorNumber;
        this.spotsNumberCount = 0;
        this.motorbikeSpots = new HashMap<>();
        this.compactSpots = new HashMap<>();
        this.largeSpots = new HashMap<>();
        this.handicappedSpots = new HashMap<>();
    }

    // method to add Parking Spots
    public void addParkingSpot(ParkingSpot parkingSpot) {
        switch (parkingSpot.getType()){
            case MOTORBIKE:
                motorbikeSpots.put(parkingSpot.getSpotNumber(), parkingSpot);
                break;
            case COMPACT:
                compactSpots.put(parkingSpot.getSpotNumber(), parkingSpot);
                break;
            case  LARGE:
                largeSpots.put(parkingSpot.getSpotNumber(), parkingSpot);
                break;
            case HANDICAPPED:
                handicappedSpots.put(parkingSpot.getSpotNumber(), parkingSpot);
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
    }

    //method to assign a Vehicle to Parking Spot
    public void assignVehicleToParkingSpot(ParkingSpot parkingSpot, Vehicle vehicle) {
        String parkingSpotNumber = parkingSpot.getSpotNumber();
        String vehicleLicensePlate = vehicle.getLicensePlate();
        System.out.println("----- Assigning a Parking Spot "+ parkingSpotNumber +" to Vehicle "+ vehicleLicensePlate +" -----");

        boolean isVehicleAssigned = parkingSpot.assignVehicle(vehicle);
        if(isVehicleAssigned){
            System.out.println("Success! Vehicle has assigned to Parking Spot "+parkingSpotNumber);
        }else {
            System.out.println("Failed! Parking Spot "+ parkingSpotNumber +" is not available!");
        }
    }

    // method to add spots faster based on Number of Spots needed and it's type
    public void addSpotsFaster(int numberOfSpots, ParkingSpotType parkingSpotType) {
        for(int i = 0; i < numberOfSpots; i++) {
            switch (parkingSpotType){
                case MOTORBIKE:
                    ParkingSpot parkingSpot = new MotorbikeSpot(String.valueOf(++spotsNumberCount));
                    this.addParkingSpot(parkingSpot);
                    break;
                case COMPACT:
                    ParkingSpot parkingSpot1 = new CompactSpot(String.valueOf(++spotsNumberCount));
                    this.addParkingSpot(parkingSpot1);
                    break;
                case  LARGE:
                    ParkingSpot parkingSpot2 = new LargeSpot(String.valueOf(++spotsNumberCount));
                    this.addParkingSpot(parkingSpot2);
                    break;
                case HANDICAPPED:
                    ParkingSpot parkingSpot3 = new HandicappedSpot(String.valueOf(++spotsNumberCount));
                    this.addParkingSpot(parkingSpot3);
                    break;
                default:
                    System.out.println("Wrong parking spot type!");
            }
        }
    }

    // method to check if parking floor full
    public boolean isFull() {
        return false;
    }

    private ParkingSpot getParkingSpot(HashMap<String, ParkingSpot> map) {
        ParkingSpot parkingSpot = null;
        for(String key : map.keySet()) {
            if(map.get(key).isSpotAvailable()){
                parkingSpot = map.get(key);
            }
        }
        return parkingSpot;
    }

    // method that returns first available spot
    public ParkingSpot getAvailableParkingSpot(ParkingSpotType parkingSpotType) {
        ParkingSpot parkingSpot = null;
        switch (parkingSpotType){
            case MOTORBIKE:
                parkingSpot = this.getParkingSpot(motorbikeSpots);
                break;
            case COMPACT:
                parkingSpot = this.getParkingSpot(compactSpots);
                break;
            case  LARGE:
                parkingSpot = this.getParkingSpot(largeSpots);
                break;
            case HANDICAPPED:
                parkingSpot = this.getParkingSpot(handicappedSpots);
                break;
            default:
                System.out.println("Wrong parking spot type!");
        }
        return parkingSpot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getSpotsNumberCount() {
        return spotsNumberCount;
    }

    public HashMap<String, ParkingSpot> getMotorbikeSpots() {
        return motorbikeSpots;
    }

    public HashMap<String, ParkingSpot> getCompactSpots() {
        return compactSpots;
    }

    public HashMap<String, ParkingSpot> getLargeSpots() {
        return largeSpots;
    }

    public HashMap<String, ParkingSpot> getHandicappedSpots() {
        return handicappedSpots;
    }

    public void countOfAllSpots() {
        System.out.println("  SPOT TYPE    COUNT ");
        System.out.println(" --------------------- ");
        System.out.println(" 1. MotorBikes    "+motorbikeSpots.size());
        System.out.println(" 2. Compact       "+compactSpots.size());
        System.out.println(" 3. Large         "+largeSpots.size());
        System.out.println(" 4. Handicape     "+handicappedSpots.size());
        System.out.println(" --------------------- ");
        System.out.println(" TOTAL SPOTS: "+ this.spotsNumberCount);
    }

    @Override
    public String toString() {
        return "ParkingFloor{" +
                "name='" + name + '\'' +
                ", floorNumber=" + floorNumber +
                ", motorbikeSpots=" + motorbikeSpots +
                ", compactSpots=" + compactSpots +
                ", largeSpots=" + largeSpots +
                ", handicappedSpots=" + handicappedSpots +
                '}';
    }

}
