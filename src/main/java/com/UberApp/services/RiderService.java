package com.UberApp.services;

import com.UberApp.dto.DriverDto;
import com.UberApp.dto.RideDto;
import com.UberApp.dto.RideRequestDto;
import com.UberApp.dto.RiderDto;
import com.UberApp.entities.Rider;
import com.UberApp.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    Page<RideDto> getAllMyRides(PageRequest pageRequest);

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
