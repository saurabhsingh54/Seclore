package com.seclore.application;

import com.seclore.pojo.MessengerType;

public class MessengerApp {
	private MessengerType messengerType;

	public MessengerApp(MessengerType message) {
		this.messengerType = message;
	}
	public void send(String to, String message) {
		this.messengerType.sendMessage(to, message);
	}
	
}
