package com.travelapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.travelapp.model.Trip;

public interface TripRepository extends JpaRepository<Trip, Integer> {

}
