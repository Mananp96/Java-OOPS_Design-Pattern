package com.parkinglot.parkingspot;

import com.parkinglot.enums.ParkingSpotType;

public class HandicappedSpot extends ParkingSpot {
    public HandicappedSpot(String spotNumber) {
        super(spotNumber, ParkingSpotType.HANDICAPPED);
    }
}
