package com.seclore.pojo;

public class Email extends MessengerType{
	@Override
	public void sendMessage(String to , String message)
	{
		System.out.println("sending SMS Message to :: "+ to);
		System.out.println("Message :: "+ message);
	}
}
