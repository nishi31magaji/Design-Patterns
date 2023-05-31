package com.java.facadepattern;

public class TicketBookingClient {
	public static void main(String[] args) {
// verify mobile no
// ticket booking
// send notification
//instead of having this logic in client class main method we can have it in facade class
	
	/*	MobileNumberValidator m = new MobileNumberValidator();
		if (m.isValidMobNum()) {
			TicketBookingClass t = new TicketBookingClass();
			t.bookTicket();
		}
		SendNotification sendNotification = new SendNotification();
		sendNotification.send();*/
		TicketBookingFacade tbf = new TicketBookingFacade();
		tbf.createBooking();

	}
}
