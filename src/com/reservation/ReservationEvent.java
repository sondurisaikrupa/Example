package com.reservation;

public class ReservationEvent {

	private String reservationId;
	private String pnrNumber;
	private String eventSubType;
	public String getReservationId() {
		return reservationId;
	}
	public void setReservationId(String reservationId) {
		this.reservationId = reservationId;
	}
	public String getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getEventSubType() {
		return eventSubType;
	}
	public void setEventSubType(String eventSubType) {
		this.eventSubType = eventSubType;
	}
	@Override
	public String toString() {
		return "ReservationEvent [reservationId=" + reservationId + ", pnrNumber=" + pnrNumber + ", eventSubType="
				+ eventSubType + "]";
	}
	
	
	
	
}
