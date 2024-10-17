package com.UberApp.strategies;

import com.UberApp.entities.Driver;
import com.UberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
