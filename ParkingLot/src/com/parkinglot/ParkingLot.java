package com.parkinglot;

import com.parkinglot.panel.EntrancePanel;
import com.parkinglot.panel.ExitPanel;
import com.parkinglot.parkingfloor.ParkingFloor;

import javax.xml.stream.Location;
import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
    private String name;
    private Location Address;

    private int compactSpotCount;
    private int largeSpotCount;
    private int motorbikeSpotCount;
    private int handicappedSpotCount;
    private final int totalCompactSpots;
    private final int totalLargeSpots;
    private final int totalMotorBikeSpots;
    private final int totalHandicappedSpots;

    // Map for Parking Floors
    private Map<Integer, ParkingFloor> parkingFloors = new HashMap<>();
    // Map for Entrance
    private Map<Integer, EntrancePanel> entrancePanels = new HashMap<>();
    // Map for Exit
    private Map<Integer, ExitPanel> exitPanels = new HashMap<>();

    //singleton ParkingLot to ensure only one object of ParkingLot in the system,
    private static ParkingLot parkingLot = null;

    // private constructor to restrict for singleton
    protected ParkingLot() {
        this.name = "Parking Station NY";
        this.totalCompactSpots = 5;
        this.totalLargeSpots = 5;
        this.totalMotorBikeSpots = 10;
        this.totalHandicappedSpots = 4;
    }

    // static method to get the singleton instance of ParkingLot
    public static ParkingLot getInstance() {
        if(parkingLot == null){
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    //method to add Parking Floor
    public void addParkingFloor(ParkingFloor parkingFloor) {
        String parkingFloorName = parkingFloor.getName();
        int parkingFloorNumber = parkingFloor.getFloorNumber();

        if(!parkingFloors.containsKey(parkingFloorNumber)){
            parkingFloors.put(parkingFloorNumber, parkingFloor);
            System.out.println("Success! Parking floor with the name "+parkingFloor.getName()+" and floor number "+parkingFloorNumber+ " successfully added!");
        }else {
            System.out.println("Failed! Parking floor with the name " + parkingFloor.getName() + " and floor number " + parkingFloorNumber + " already exist!");
        }
    }

    //method to add Entrance
    public void addEntrancePanel(EntrancePanel entrancePanel){

    }

    //method to add Exit
    public void addExitPanel(ExitPanel exitPanel){

    }

    // method to check is parking lot full
    public boolean isParkingLotFull() {

        for(int parkingFloorNumber : parkingFloors.keySet()) {
            if(!parkingFloors.get(parkingFloorNumber).isFull()){
                return false;
            }
        }
        return true;
    }

//    public synchronized ParkingTicket getNewParkingTicket(Vehicle vehicle) throws ParkingFullException {
//        if (this.isFull(vehicle.getType())) {
//            throw new ParkingFullException();
//        }
//        ParkingTicket ticket = new ParkingTicket();
//        vehicle.assignTicket(ticket);
//        ticket.save();
//        // if the ticket is successfully saved in the database, we can increment the parking spot count
//        this.incrementSpotCount(vehicle.getType());
//        this.activeTickets.put(ticket.getTicketNumber(), ticket);
//        return ticket;
//    }

    public int getTotalCompactSpots() {
        return totalCompactSpots;
    }

    public int getTotalLargeSpots() {
        return totalLargeSpots;
    }

    public int getTotalMotorBikeSpots() {
        return totalMotorBikeSpots;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getAddress() {
        return Address;
    }

    public void setAddress(Location address) {
        Address = address;
    }

    public int getCompactSpotCount() {
        return compactSpotCount;
    }

    public void setCompactSpotCount(int compactSpotCount) {
        this.compactSpotCount = compactSpotCount;
    }

    public int getLargeSpotCount() {
        return largeSpotCount;
    }

    public void setLargeSpotCount(int largeSpotCount) {
        this.largeSpotCount = largeSpotCount;
    }

    public int getMotorbikeSpotCount() {
        return motorbikeSpotCount;
    }

    public void setMotorbikeSpotCount(int motorbikeSpotCount) {
        this.motorbikeSpotCount = motorbikeSpotCount;
    }

    public int getHandicappedSpotCount() {
        return handicappedSpotCount;
    }

    public int getTotalHandicappedSpots() {
        return totalHandicappedSpots;
    }

    // return the object of Parking Floor by floor number
    public ParkingFloor getParkingFloorByNumber(int floorNumber) {
        return parkingFloors.get(floorNumber);
    }

    // return the list of all parking floors
    public String getAllParkingFloors() {
        StringBuilder builder  = new StringBuilder();
        builder.append("Number Name\n");
        for(int key : parkingFloors.keySet()) {
            builder.append(parkingFloors.get(key).getFloorNumber() + ".      " + parkingFloors.get(key).getName()+"\n");
        }
        return builder.toString();
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "name='" + name + '\'' +
                ", Address=" + Address +
                ", compactSpotCount=" + compactSpotCount +
                ", largeSpotCount=" + largeSpotCount +
                ", motorbikeSpotCount=" + motorbikeSpotCount +
                ", handicappedSpotCount=" + handicappedSpotCount +
                ", totalCompactSpots=" + totalCompactSpots +
                ", totalLargeSpots=" + totalLargeSpots +
                ", totalMotorBikeSpots=" + totalMotorBikeSpots +
                ", totalHandicappedSpots=" + totalHandicappedSpots +
                ", parkingFloors=" + parkingFloors +
                ", entrancePanels=" + entrancePanels +
                ", exitPanels=" + exitPanels +
                '}';
    }
}
