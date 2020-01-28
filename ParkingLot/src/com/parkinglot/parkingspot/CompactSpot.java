package com.parkinglot.parkingspot;

import com.parkinglot.enums.ParkingSpotType;

public class CompactSpot extends ParkingSpot {
    public CompactSpot(String spotNumber) {
        super(spotNumber, ParkingSpotType.COMPACT);
    }
}
