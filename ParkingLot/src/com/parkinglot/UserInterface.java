package com.parkinglot;

import com.parkinglot.enums.ParkingSpotType;
import com.parkinglot.enums.VehicleType;
import com.parkinglot.parkingfloor.ParkingFloor;
import com.parkinglot.parkingspot.ParkingSpot;
import com.parkinglot.vehicle.Car;
import com.parkinglot.vehicle.MotorBike;
import com.parkinglot.vehicle.Truck;
import com.parkinglot.vehicle.Vehicle;

import java.util.Scanner;

public class UserInterface {
    private static Scanner sc;
    private ParkingLot parkingLot;

    UserInterface(){
        this.parkingLot = new ParkingLot();
    }

    // method to display menu
    public void displayMenu(){
        System.out.println(
                "**********************************************\n" +
                "*           " + parkingLot.getName() + " System        *\n" +
                "**********************************************");
        System.out.println(
                "1. Add Parking Floors \n" +
                "2. Add Parking Spots  \n" +
                "3. Assign Vehicle to Spots \n" +
                "4. Check Parking Lot Status \n" +
                "5. Exit \n" +
                "**********************************************");
        int choice = Integer.parseInt(sc.nextLine());
        this.chooseMenu(choice);
    }

    // UI to add parking floor
    public void addParkingFloor() {
        System.out.println("How many parking floors do you have?");
        int numberOfFloors = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < numberOfFloors; i++) {
            this.frame("Enter the details of "+ (i+1) +" floor");
            System.out.print("1. Enter the Name of "+ (i+1) +" floor:");
            String floorName = sc.nextLine();
            System.out.println();
            System.out.print("2. Enter the floor number of "+ (i+1) +" floor:");
            int floorNumber = Integer.parseInt(sc.nextLine());

            ParkingFloor parkingFloor = new ParkingFloor(floorName, floorNumber);
            parkingLot.addParkingFloor(parkingFloor);
        }
        this.displayMenu();
    }

    // UI to add spot in parking floor
    public void addParkingSpot() {
        System.out.println("Please Select the Parking Floor by floor number");
        System.out.println(parkingLot.getAllParkingFloors());
        int floorChoice = Integer.parseInt(sc.nextLine());
        //get the ParkingFloor based on choice
        ParkingFloor parkingFloor = parkingLot.getParkingFloorByNumber(floorChoice);
        //printing the count of different spots type in a floor
        parkingFloor.countOfAllSpots();

        // add a spot in selected parking floor
        this.frame(" Add Spots in "+ parkingFloor.getName());
        System.out.print("1. Select the Spot Type:");
        int spottype = Integer.parseInt(sc.nextLine());
        ParkingSpotType spotType = null;
        if(spottype == 1){
            spotType = ParkingSpotType.MOTORBIKE;
        }else if(spottype == 2){
            spotType = ParkingSpotType.COMPACT;
        }else if(spottype == 3){
            spotType = ParkingSpotType.LARGE;
        }else if(spottype == 4){
            spotType = ParkingSpotType.HANDICAPPED;
        }else {
            System.out.println("Invalid Choice");
        }
        System.out.println();

        System.out.print("2. Enter number of spots to add in "+ spotType.toString());
        int spotNumbers = Integer.parseInt(sc.nextLine());
        parkingFloor.addSpotsFaster(spotNumbers, spotType);
        parkingFloor.countOfAllSpots();
        System.out.println("Successfully added!");
        this.displayMenu();
    }

    public void addVehicle() {

        System.out.print("1. Enter the License Number:");
        String licenseNumber = sc.nextLine();
        System.out.println();
        System.out.println("2. Select the Vehicle Type");
        int counter = 0;
        // Iterating over enum Vehicle Type
        for(VehicleType vehicle : VehicleType.values()){
            counter++;
            System.out.println(counter+". "+ vehicle.name());
        }
        System.out.println(" --------------------- ");
        int vehicletype = Integer.parseInt(sc.nextLine());

        // --- *[ADD] check if spots available; if yes then allow to give ticket ---

        Vehicle vehicle = null;
        if(vehicletype == 1){
            vehicle = new Car(licenseNumber);
        }else if(vehicletype == 2){
            vehicle = new MotorBike(licenseNumber);
        }else if(vehicletype == 3){
            vehicle = new Truck(licenseNumber);
        }else {
            System.out.println("Invalid Choice");
        }

        System.out.println("3. Please Select the Parking Floor by floor number");
        System.out.println(parkingLot.getAllParkingFloors());
        int floorChoice = Integer.parseInt(sc.nextLine());
        //get the ParkingFloor based on choice
        ParkingFloor parkingFloor = parkingLot.getParkingFloorByNumber(floorChoice);
        //printing the count of different spots type in a floor
        parkingFloor.countOfAllSpots();

        // Select a spot in selected parking floor
        this.frame("4. Select the Spot in "+ parkingFloor.getName());
        int spottype = Integer.parseInt(sc.nextLine());
        ParkingSpotType spotType = null;
        ParkingSpot parkingSpot = null;

        if(spottype == 1){
            spotType = ParkingSpotType.MOTORBIKE;

        }else if(spottype == 2){
            spotType = ParkingSpotType.COMPACT;
        }else if(spottype == 3){
            spotType = ParkingSpotType.LARGE;
        }else if(spottype == 4){
            spotType = ParkingSpotType.HANDICAPPED;
        }else {
            System.out.println("Invalid Choice");
        }
        System.out.println();

        // get available parking spot from the choosen parking floor
        parkingSpot = parkingFloor.getAvailableParkingSpot(spotType);
        // assign a vehicle to spot
        parkingFloor.assignVehicleToParkingSpot(parkingSpot, vehicle);

        this.displayMenu();
    }

    public void frame(String text){
        System.out.println(
                "**********************************************\n" +
                "* "+ text +  "             *\n" +
                "**********************************************");
    }

    // go inside menu
    public void chooseMenu(int choice) {
        switch(choice) {
            case 1:
                this.frame("> Menu > 1. Add Parking Floors");
                this.addParkingFloor();
                break;
            case 2:
                this.frame("> Menu > 2. Add Parking Spots");
                this.addParkingSpot();
                break;
            case 3:
                this.frame("> Menu > 3. Assign Vehicle to Spots");
                this.addVehicle();
                break;
            case 4:
                this.frame("> Menu > 4. Check Parking Lot Status");
                break;
            case 5:
                System.exit(1);
                break;
            default:
                System.out.println("Invalid Choice!");

            this.displayMenu();
        }
    }

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        sc = new Scanner(System.in);
        userInterface.displayMenu();
    }
}
