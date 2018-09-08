package com.designpattern.observer.pattern;

/**
 * 
 * @author Gayu
 *
 */
public class TestAdvertisement {
	public static void main(String[] args) {
		Advertiser ticketAdvertiser = new AirTicketAdvertiser();

		ChatRoomAdListener indiaChatRoom = new IndiaChatRoomAdListener(ticketAdvertiser);
		ChatRoomAdListener chinaChatRoom = new ChinaChatRoomAdListener(ticketAdvertiser);

		ticketAdvertiser.publishAdvertisement("Air India Ticket Available for Cheap Rate");

		ticketAdvertiser.unsubscribe(indiaChatRoom);
		ticketAdvertiser.publishAdvertisement("Air France Ticket Available for Cheap Rate");
		
		indiaChatRoom = new IndiaChatRoomAdListener(ticketAdvertiser);
		ticketAdvertiser.unsubscribe(chinaChatRoom);
		ticketAdvertiser.publishAdvertisement("Air Asia Ticket Available for Cheap Rate");
		
	}
}