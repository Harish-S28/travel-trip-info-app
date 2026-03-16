package com.travelapp.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.travelapp.model.Trip;

@RestController
@RequestMapping("/api/trips")
public class TripController {

    List<Trip> trips = new ArrayList<>();

    @GetMapping
    public List<Trip> getAllTrips() {
        return trips;
    }

    @PostMapping
    public String addTrip(@RequestBody Trip trip) {
        trips.add(trip);
        return "Trip added successfully";
    }
}
