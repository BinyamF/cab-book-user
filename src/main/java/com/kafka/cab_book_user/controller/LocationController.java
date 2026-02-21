package com.kafka.cab_book_user.controller;

import com.kafka.cab_book_user.dto.LocationDTO;
import com.kafka.cab_book_user.entity.Location;
import com.kafka.cab_book_user.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class LocationController {

    @Autowired
    public LocationService locationService;

    public Location location;

    @GetMapping("/location")
    public LocationDTO getLocation(){
        return locationService.getCurrentLocation();
    }
}
