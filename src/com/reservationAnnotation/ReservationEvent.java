package com.reservationAnnotation;

public class ReservationEvent {

	private String reservationId;

	public String getReservationId() {
		return reservationId;
	}

	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}

	@Override
	public String toString() {
		return "ReservationEvent [reservationId=" + reservationId + "]";
	}
	
	
	
}
