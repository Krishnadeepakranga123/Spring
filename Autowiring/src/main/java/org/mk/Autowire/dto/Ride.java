package org.mk.Autowire.dto;

public class  Ride{
	private Vehicle vehicle;
	
	public Ride() {
		
	}
	public Ride(Vehicle v) {
		this.vehicle=v;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	

}
