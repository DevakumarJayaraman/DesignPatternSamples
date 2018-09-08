package com.designpattern.observer.pattern;

abstract class ChatRoomAdListener {
	protected Advertiser advertiser;
	abstract public void listen(String advertisement);
}