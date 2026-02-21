package com.kafka.cab_book_user.service;

import com.kafka.cab_book_user.dto.LocationDTO;
import com.kafka.cab_book_user.entity.Location;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    private volatile LocationDTO currentLocation;

//    @KafkaListener(topics = "cab-location", groupId = "user-group")
//    public void cabLocation(Location location){
//        currentLocation = location;
//        System.out.println(location.getAddress());
//    }

    @KafkaListener(topics = "cab-location", groupId = "user-group")
    public void cabLocation(LocationDTO location){
        currentLocation = location;
        System.out.println(location.getAddress());
    }

    public LocationDTO getCurrentLocation() {
        return currentLocation;
    }
}
