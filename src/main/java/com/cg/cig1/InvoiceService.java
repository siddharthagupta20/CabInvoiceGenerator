package com.cg.cig1;

public class InvoiceService {
	
	
   
    private static final double COST_PER_KM = 10;
	private static final int COST_PER_MIN = 1;
	private static final double MIN_FARE = 5;
	public static void main(String [] args) {
    	System.out.println("Welcome to cab invoice generator.");
    }
	public double calcFare(double distance, int time) {
		double totalFare=COST_PER_KM*distance+COST_PER_MIN*time;
		return Math.max(MIN_FARE, totalFare);
		
	}
}
