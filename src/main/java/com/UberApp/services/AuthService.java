package com.UberApp.services;

import com.UberApp.dto.DriverDto;
import com.UberApp.dto.SignupDto;
import com.UberApp.dto.UserDto;

public interface AuthService {

    String[] login(String email, String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId, String vehicleId);

    String refreshToken(String refreshToken);
}
