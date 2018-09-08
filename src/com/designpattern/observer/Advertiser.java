package com.designpattern.observer;

public interface Advertiser {

	public void subscribe(ChatRoomAdListener observer);

	public void unsubscribe(ChatRoomAdListener observer);

	public void publishAdvertisement(String str);
}