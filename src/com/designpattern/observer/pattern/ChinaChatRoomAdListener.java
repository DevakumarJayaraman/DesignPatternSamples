package com.designpattern.observer.pattern;

public class ChinaChatRoomAdListener extends ChatRoomAdListener {
	
	public ChinaChatRoomAdListener(Advertiser advertiser) {
		this.advertiser = advertiser;
		this.advertiser.subscribe(this);
	}
	
	@Override
	public void listen(String advertisement) {
		System.out.println("ChinaChatRoom : " + advertisement);
	}
}
