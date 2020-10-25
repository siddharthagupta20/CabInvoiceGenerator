package com.cg.cig1;

public enum CabRide {

	NORMAL(10.0, 1, 5), PREMIUM(15.0, 2, 20);

	public double costPerKm;
	public int costPerMin;
	public double minFare;

	private CabRide(double costPerKm, int costPerMin, double minFare) {
		this.costPerKm = costPerKm;
		this.costPerMin = costPerMin;
		this.minFare = minFare;
	}

	public double calcFare(Ride ride) {
		double totalFare = costPerKm * ride.getDistance() + costPerMin * ride.getTime();
		return Math.max(totalFare, minFare);
	}

}