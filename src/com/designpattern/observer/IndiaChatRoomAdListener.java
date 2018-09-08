package com.designpattern.observer;

public class IndiaChatRoomAdListener extends ChatRoomAdListener {

	public IndiaChatRoomAdListener(Advertiser advertiser) {
		this.advertiser = advertiser;
		this.advertiser.subscribe(this);
	}

	@Override
	public void listen(String advertisement) {
		System.out.println("IndiaChatRoom : " + advertisement);
	}
}
