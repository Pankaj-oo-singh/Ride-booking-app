package com.UberApp.repositories;

import com.UberApp.entities.Driver;
import com.UberApp.entities.Rating;
import com.UberApp.entities.Ride;
import com.UberApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    List<Rating> findByRider(Rider rider);
    List<Rating> findByDriver(Driver driver);

    Optional<Rating> findByRide(Ride ride);
}
