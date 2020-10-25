package com.cg.cig1;

public class Ride {

	private double distance;
	private int time;
	private CabRide cabRide;

	public Ride(CabRide cabRide, double distance, int time) {
		this.cabRide = cabRide;
		this.distance = distance;
		this.time = time;
	}

	public CabRide getCabRide() {
		return cabRide;
	}

	public double getDistance() {
		return distance;
	}

	public int getTime() {
		return time;
	}

}
