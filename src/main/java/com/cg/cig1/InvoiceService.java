package com.cg.cig1;

public class InvoiceService {

	private RideRepository rideRepository = null;

	public InvoiceService() {
		rideRepository = new RideRepository();
	}

	public InvoiceService(RideRepository rideRepo) {
		rideRepository = rideRepo;
	}

	public InvoiceSummary calcFare(Ride[] rides) {
		double totalFare = 0;
		for (Ride ride : rides) {
			totalFare += ride.getCabRide().calcFare(ride);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}

	public InvoiceSummary getInvoiceSummary(String userId) {
		return this.calcFare(rideRepository.getUserRides(userId));
	}

	public void addRides(String userId, Ride[] rides) {
		rideRepository.addUserRide(userId, rides);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to cab invoice generator.");
	}

}
