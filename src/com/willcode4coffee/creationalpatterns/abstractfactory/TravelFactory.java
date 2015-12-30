package com.willcode4coffee.creationalpatterns.abstractfactory;

public abstract class TravelFactory {
	
	public abstract Reservation createReservation(String reservationType);
	
	public abstract Payments  makePayments(String reservationType);

}
