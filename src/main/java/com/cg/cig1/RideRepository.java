package com.cg.cig1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RideRepository {
	Map<String, ArrayList<Ride>> rideMap;

	public RideRepository() {
		this.rideMap = new HashMap<>();
	}

	public void addUserRide(String userId, Ride[] rides) {
		ArrayList<Ride> userRides = new ArrayList<>(Arrays.asList(rides));
		if (rideMap.get(userId) == null)
			rideMap.put(userId, userRides);
		else
			rideMap.get(userId).addAll(userRides);

	}

	public Ride[] getUserRides(String userId) {
		if (rideMap.containsKey(userId))
			return rideMap.get(userId).toArray(new Ride[0]);
		return null;
	}
}