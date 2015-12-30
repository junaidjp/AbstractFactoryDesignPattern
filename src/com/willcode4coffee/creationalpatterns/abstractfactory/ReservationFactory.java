package com.willcode4coffee.creationalpatterns.abstractfactory;


/**
 * 
 * @author junaidpasha
 *
 */
public class ReservationFactory  extends TravelFactory {
	
	public Reservation createReservation(String reservationType) { 
		
		Reservation reservation = null;
		
		if(reservationType == "airline") { 
			reservation = new AirlineReservation();
		}
		else if(reservationType == "train") { 
			
			reservation = new TrainReservation();
		}
		else if (reservationType == "bus") { 
			reservation = new BusReservation();
		}
		
		return reservation;
	}

	

	@Override
	public Payments makePayments(String reservationTypes) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
