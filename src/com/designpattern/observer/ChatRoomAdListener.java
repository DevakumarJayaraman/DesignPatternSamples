package com.designpattern.observer;

abstract class ChatRoomAdListener {
	protected Advertiser advertiser;
	abstract public void listen(String advertisement);
}