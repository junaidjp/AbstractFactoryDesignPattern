package com.willcode4coffee.creationalpatterns.abstractfactory;

public class PaymentFactory extends TravelFactory {

	@Override
	public Reservation createReservation(String reservationType) {
		// TODO Auto-generated method stub
		return null;
	}

	public Payments makePayments(String reservationType) {

		Payments reservationPayments = null;

		if (reservationType == "airline") {
			reservationPayments = new AirlineTicketPayment();
		} else if (reservationType == "train") {

			reservationPayments = new TrainTicketPayment();
		} else if (reservationType == "bus") {
			reservationPayments = new BusTicketPayments();
		}

		return reservationPayments;
	}

}
