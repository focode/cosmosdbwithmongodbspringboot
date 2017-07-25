package com.azure.booking.booking.domain;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FlightSearch {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String source;
	
	private String destination;
	
	private int availableSeats;
	
	private Date date;

	
	public FlightSearch(String name, String source, String destination, int availableSeats, Date date) {
		super();
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.availableSeats = availableSeats;
		this.setDate(date);
	}
	
	public FlightSearch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FlightSearch(Long id, String name, String source, String destination, int availableSeats, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.availableSeats = availableSeats;
		this.setDate(date);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
