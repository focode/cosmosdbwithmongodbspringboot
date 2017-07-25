package com.azure.booking.booking.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.azure.booking.booking.domain.FlightSearch;

public interface CosMosRepo extends MongoRepository<FlightSearch, String>{

}
