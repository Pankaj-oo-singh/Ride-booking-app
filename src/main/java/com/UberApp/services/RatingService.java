package com.UberApp.services;

import com.UberApp.dto.DriverDto;
import com.UberApp.dto.RiderDto;
import com.UberApp.entities.Ride;

public interface RatingService {

    DriverDto rateDriver(Ride ride, Integer rating);
    RiderDto rateRider(Ride ride, Integer rating);

    void createNewRating(Ride ride);
}
