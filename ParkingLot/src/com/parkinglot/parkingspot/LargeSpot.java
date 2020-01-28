package com.parkinglot.parkingspot;

import com.parkinglot.enums.ParkingSpotType;

public class LargeSpot extends ParkingSpot {
    public LargeSpot(String spotNumber) {
        super(spotNumber,ParkingSpotType.LARGE);
    }
}
