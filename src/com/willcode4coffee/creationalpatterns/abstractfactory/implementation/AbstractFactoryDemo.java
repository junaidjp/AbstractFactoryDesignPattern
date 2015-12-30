package com.willcode4coffee.creationalpatterns.abstractfactory.implementation;

import com.willcode4coffee.creationalpatterns.abstractfactory.Payments;
import com.willcode4coffee.creationalpatterns.abstractfactory.Reservation;
import com.willcode4coffee.creationalpatterns.abstractfactory.TravelFactory;

public class AbstractFactoryDemo {
	
	public static void main(String args[]) { 
		System.out.println("**From the FactoryProduce  get the  Reservation Factory ** "); 
		System.out.println("                           ");
		TravelFactory travelFactory = FactoryProducer.getFactory("reservation");
		System.out.println("**From this Reservation Factory get the Airline Reservation Type **"); 
		System.out.println("                           ");
		Reservation reservation = travelFactory.createReservation("airline");
		System.out.println("**Print things to do for this Reservation **");
		System.out.println("                           ");
		System.out.println(reservation.thingsTodo());
		 
		System.out.println("                           ");
		System.out.println("                           ");
		
		System.out.println("**From the FactoryProducer  get the  Payment Factory ** "); 
		System.out.println("                           ");
		travelFactory = FactoryProducer.getFactory("payments");
		System.out.println("**From this Payment Factory get the  Payments  Type **"); 
		System.out.println("                           ");
		Payments payments  = travelFactory.makePayments("airline");
		System.out.println("**Print payments accepted for this Payments Type **");
		System.out.println("                           ");
		System.out.println(payments.paymentTypes());
		
		
		
	}

}
