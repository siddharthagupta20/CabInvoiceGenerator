package com.cg.cig1;

import org.junit.Test;
import static org.junit.Assert.*;

public class InvoiceServiceTest {
	@Test
	public void givenDistanceAndTime_ShouldReturnFare() {
		InvoiceService invoiceService = new InvoiceService();
		double distance = 5;
		int time = 2;
		double fare = invoiceService.calcFare(distance, time);
		assertEquals(52, fare, 0.0);

	}

	@Test
	public void givenDistanceAndTime_ShouldReturnMinFare() {
		InvoiceService invoiceService = new InvoiceService();
		double distance = .1;
		int time = 0;
		double fare = invoiceService.calcFare(distance, time);
		assertEquals(5, fare, 0.0);
	}

	@Test
	public void givenRides_ShouldReturnTotalFare() {
		InvoiceService invoiceService = new InvoiceService();
		Ride[] rides = { new Ride(5.0, 2), new Ride(6.0, 3) };
		double fare = invoiceService.calcFare(rides);
		assertEquals(115, fare, 0.0);
	}
}
