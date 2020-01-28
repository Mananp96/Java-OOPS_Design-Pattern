package com.parkinglot.parkingspot;

import com.parkinglot.enums.ParkingSpotType;

public class MotorbikeSpot extends ParkingSpot {
    public MotorbikeSpot(String spotNumber) {
        super(spotNumber, ParkingSpotType.MOTORBIKE);
    }
}
