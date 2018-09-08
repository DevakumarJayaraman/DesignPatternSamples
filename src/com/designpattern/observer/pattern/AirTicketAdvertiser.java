package com.designpattern.observer.pattern;

import java.util.ArrayList;
import java.util.List;

public class AirTicketAdvertiser implements Advertiser {
	
	List<ChatRoomAdListener> chatRooms = new ArrayList<>();
	
	public void subscribe(ChatRoomAdListener observer) {
		chatRooms.add(observer);
	}

	public void unsubscribe(ChatRoomAdListener observer) {
		chatRooms.remove(observer);
	}

	public void publishAdvertisement(String str) {
		for (ChatRoomAdListener observer : chatRooms) {
			observer.listen(str);
		}
	}
}