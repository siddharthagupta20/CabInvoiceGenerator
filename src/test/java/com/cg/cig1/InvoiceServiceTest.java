package com.cg.cig1;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

public class InvoiceServiceTest {

	InvoiceService invoiceService = null;
	Ride[] rides = null;
	RideRepository rideRepo = null;
	InvoiceSummary expectedInvoiceSummary = null;

	@Before
	public void setUp() {
		invoiceService = new InvoiceService();
		rides = new Ride[] { new Ride(CabRide.NORMAL, 5.0, 2), new Ride(CabRide.PREMIUM, 6.0, 3) };
		expectedInvoiceSummary = new InvoiceSummary(2, 148.0);

	}

	@Test
	public void givenRides_ShouldReturnTotalFare() {

		InvoiceSummary summary = invoiceService.calcFare(rides);
		assertEquals(expectedInvoiceSummary, summary);
	}

	@Test
	public void givenUserIdReturnInvoiceSummary() {
		String userId = "sid";
		invoiceService.addRides(userId, rides);
		InvoiceSummary summary = invoiceService.getInvoiceSummary(userId);
		assertEquals(expectedInvoiceSummary, summary);
	}
}
