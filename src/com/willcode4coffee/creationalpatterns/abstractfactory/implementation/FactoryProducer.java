package com.willcode4coffee.creationalpatterns.abstractfactory.implementation;

import com.willcode4coffee.creationalpatterns.abstractfactory.PaymentFactory;
import com.willcode4coffee.creationalpatterns.abstractfactory.ReservationFactory;
import com.willcode4coffee.creationalpatterns.abstractfactory.TravelFactory;

public class FactoryProducer {

	//If there are 2 booking Steps 
	// One during Reservation and other during payment. WE need to get the appropriate factories to work for that booking. 
	
    public static TravelFactory getFactory(String bookingStep) { 
		
		 if(bookingStep.equalsIgnoreCase("reservation")) { 
			 return new ReservationFactory();
		 }
		 
		 if(bookingStep.equalsIgnoreCase("payments")) { 
			 return new PaymentFactory();
		 }
		
		  return null;
		
	}

}
