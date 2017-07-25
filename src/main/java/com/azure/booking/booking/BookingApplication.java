package com.azure.booking.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingApplication {

	public static void main(String[] args) {
		   /* System.setProperty("http.proxyHost", "pun-proxy");
	        System.setProperty("http.proxyPort", "3128");
	        System.setProperty("https.proxyHost", "pun-proxy");
	        System.setProperty("https.proxyPort", "3128");
	        System.setProperty("http.proxyUser", "edn3vs");
	        System.setProperty("http.proxyPassword", "Arun&123");*/
		SpringApplication.run(BookingApplication.class, args);
	}
}
