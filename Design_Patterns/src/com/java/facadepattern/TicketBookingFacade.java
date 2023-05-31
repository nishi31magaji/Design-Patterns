package com.java.facadepattern;

public class TicketBookingFacade {
public void createBooking() {
	MobileNumberValidator m = new MobileNumberValidator();
	if (m.isValidMobNum()) {
		TicketBookingClass t = new TicketBookingClass();
		t.bookTicket();
	}
	SendNotification sendNotification = new SendNotification();
	sendNotification.send();
}
}
