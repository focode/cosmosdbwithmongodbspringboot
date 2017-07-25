package com.azure.booking.booking.cntrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.azure.booking.booking.repo.CosMosRepo;

@RestController
public class BookingController {
	
	
	@Autowired
	CosMosRepo cosMosRepo;
	
	@GetMapping("/booking")
	public String doBooking(){
		cosMosRepo.findAll();
		return "booking done";
	}

}
