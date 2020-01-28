package com.parkinglot.vehicle;

import com.parkinglot.enums.VehicleType;

public class MotorBike extends Vehicle {

    public MotorBike(String licensePlate) {
        super(licensePlate, VehicleType.MOTORBIKE);
    }
}
