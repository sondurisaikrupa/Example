package com.reservation;

import java.util.Iterator;
import java.util.List;

public class ReservationEventsCollection {
	
	private List<ReservationEvent> reservationEvent;

	public List<ReservationEvent> getReservationEvent() {
		return reservationEvent;
	}

	public void setReservationEvent(List<ReservationEvent> reservationEvent) {
		this.reservationEvent = reservationEvent;
	}
	
	public void display(){
		
		System.out.println("Reservation Events are");
		Iterator<ReservationEvent> i=reservationEvent.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}
}
